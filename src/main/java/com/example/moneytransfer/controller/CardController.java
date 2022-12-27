package com.example.moneytransfer.controller;

import com.example.moneytransfer.model.Cards;
import com.example.moneytransfer.model.Operation;
import com.example.moneytransfer.service.TransferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@AllArgsConstructor
@RequestMapping("/bank")
public class CardController {
    private final TransferService transferService;

    @GetMapping("/{accountId}")
    public BigDecimal getBalance(@PathVariable Long accountId){
        return transferService.getBalance(accountId);
    }

    @PostMapping("/add")
    public BigDecimal addMoney(@RequestBody Cards cards){
        return transferService.addMoney(cards.getNumberCardTransfer(), cards.getAmount());
    }

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody Cards cards) {
        transferService.makeTransfer(cards);
    }
    @PostMapping("/confirm")
    public void confirm(@RequestBody Operation operation) {
        transferService.confirmOperation(operation);
    }

}

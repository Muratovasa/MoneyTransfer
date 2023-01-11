package com.example.moneytransfer.controller;

import com.example.moneytransfer.model.Cards;
import com.example.moneytransfer.model.ConfirmOperation;
import com.example.moneytransfer.service.TransferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Класс контроллер с 2 операциями <b>transferMoney</b> <b>confirmOperation</b>
 *
 * @author svetlanamuratova
 * @version 1.1
 */
@RestController
@AllArgsConstructor
@RequestMapping("/bank")
public class CardController {
    /**
     * создаем объект класса <b>transferService</b>
     */
    private final TransferService transferService;

    /**
     * метод перевода денег
     *
     * @param cards - карта
     */
    @PostMapping("/transfer")
    public void transferMoney(@RequestBody Cards cards) {
    }

    /**
     * метод определения статуса проведения операции
     *
     * @param confirmOperation - статус
     */
    @PostMapping("/confirm")
    public void confirmOperation(@RequestBody ConfirmOperation confirmOperation) {
    }

}

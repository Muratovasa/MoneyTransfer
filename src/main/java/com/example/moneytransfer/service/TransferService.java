package com.example.moneytransfer.service;


import com.example.moneytransfer.advice.InternalServer;
import com.example.moneytransfer.advice.InvalidCredentials;
import com.example.moneytransfer.model.Cards;
import com.example.moneytransfer.model.Operation;
import com.example.moneytransfer.repository.TransfersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class TransferService {
    private final TransfersRepository repository;

    public BigDecimal getBalance(Long accountId) {
       var balance = repository.getBalanceForId(accountId);
        if(balance == null) {
            throw new InternalServer("Dont have this Client");
        }
        return balance;
    }

    public void makeTransfer(Cards cards) {
        var fromBalance = repository.getBalanceForId((long) cards.getNumberMyCard());
        var toBalance = repository.getBalanceForId((long) cards.getNumberCardTransfer());
        if (fromBalance == null || toBalance == null) throw new InvalidCredentials("not card for transfer");
        if (cards.getAmount().compareTo(fromBalance) > 0) throw new InvalidCredentials("no money");

        var upDateFromBalance = fromBalance.subtract(cards.getAmount());
        var upDateToBalance = toBalance.add(cards.getAmount());
        repository.save(cards.getNumberMyCard(), upDateFromBalance);
        repository.save(cards.getNumberCardTransfer(), upDateToBalance);
    }
    public BigDecimal addMoney(int numberCardTransfer, BigDecimal amount) {
        var currentBalance = repository.getBalanceForId((long) numberCardTransfer);
        if (currentBalance == null) {
            repository.save(numberCardTransfer, amount);
            return amount;
        } else {
            var upDatedBalance = currentBalance.add(amount);
            repository.save(numberCardTransfer, upDatedBalance);
            return upDatedBalance;
        }
    }

    public void confirmOperation(Operation operation) {
        repository.confirmFromRepo(operation);
    }
}

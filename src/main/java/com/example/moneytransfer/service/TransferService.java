package com.example.moneytransfer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class TransferService {
    /** на данном этапе данный класс будет пустой и не использоваться*/
    /*private final TransfersRepository repository;

    public BigDecimal getBalance(String accountId) {
       var balance = repository.getBalanceForId(accountId);
        if(balance == null) {
            throw new InternalServer("Dont have this Client");
        }
        return balance;
    }

    public void makeTransfer(Cards cards) {
        var fromBalance = repository.getBalanceForId(cards.getCardFromNumber());
        var toBalance = repository.getBalanceForId(cards.getCardToNumber());
        if (fromBalance == null || toBalance == null) throw new InvalidCredentials("not card for transfer");

        var upDateFromBalance = fromBalance.subtract((BigDecimal) cards.getAmount());
        var upDateToBalance = toBalance.add((BigDecimal) cards.getAmount());
        repository.save(cards.getCardFromNumber(), upDateFromBalance);
        repository.save(cards.getCardToNumber(), upDateToBalance);
    }
    public BigDecimal addMoney(String numberCardTransfer, Object amount) {
        var currentBalance = repository.getBalanceForId(numberCardTransfer);
        if (currentBalance == null) {
            repository.save(numberCardTransfer, amount);
            return (BigDecimal) amount;
        } else {
            var upDatedBalance = currentBalance.add((BigDecimal) amount);
            repository.save(numberCardTransfer, upDatedBalance);
            return upDatedBalance;
        }
    }

    public void confirmOperation(ConfirmOperation confirmOperation) {
        repository.confirmFromRepo(confirmOperation);
    }*/
}

package com.example.moneytransfer.repository;

import com.example.moneytransfer.model.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

@Repository
@Slf4j
public class TransfersRepository {

    private final ConcurrentHashMap<Integer, BigDecimal> listOTransfers = new ConcurrentHashMap<>();

    public BigDecimal getBalanceForId(Long accountId) {
        return listOTransfers.get(accountId);
    }

    public void save (int id, BigDecimal amount){
        listOTransfers.put(id, amount);
    }

    public void confirmFromRepo(Operation operation) {
    }
}

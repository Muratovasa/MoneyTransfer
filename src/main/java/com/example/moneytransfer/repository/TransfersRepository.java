package com.example.moneytransfer.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class TransfersRepository {
    /** на данном этапе данный класс будет пустой и не использоваться*/

    /*private final ConcurrentHashMap<String, Object> listOTransfers = new ConcurrentHashMap<>();

    public BigDecimal getBalanceForId(String accountId) {
        return (BigDecimal) listOTransfers.get(accountId);
    }

    public void save (String id, Object amount){
        listOTransfers.put(id, amount);
    }

    public void confirmFromRepo(ConfirmOperation confirmOperation) {
    }*/
}

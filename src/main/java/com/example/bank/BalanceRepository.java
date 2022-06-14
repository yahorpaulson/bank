package com.example.bank;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
@Repository
public class BalanceRepository {

    private final Map<Long, BigDecimal> storage = new HashMap<>(Map.of(1L, BigDecimal.TEN));

    public BigDecimal getBalanceForId(Long accountId){
        return storage.get(accountId);
    }



}

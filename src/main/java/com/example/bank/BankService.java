package com.example.bank;

import com.example.bank.model.TransferBalance;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */

@Service
@AllArgsConstructor
public class BankService {

    private final BalanceRepository repository;

    public BigDecimal getBalance(Long accountId){
        BigDecimal balance =  repository.getBalanceForId(accountId);
        if(balance == null){
            throw new IllegalArgumentException();
        }
        return balance;
    }

    public BigDecimal addMoney(Long to, BigDecimal amount){
        return null;
    }

    public void makeTransfer(TransferBalance transferBalance){

    }

}

package com.example.bank;

import com.example.bank.model.TransferBalance;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
@Slf4j
@RestController("/balance")
@AllArgsConstructor
public class BalanceController {

    private BankService bankService;

    @GetMapping("/{accountId}")
    public BigDecimal getBalance(@PathVariable Long accountId){
        return bankService.getBalance(accountId);
    }

    @PostMapping("/add")
    public BigDecimal addMoney(@RequestBody TransferBalance transferBalance){
        return bankService.addMoney(transferBalance.getTo(), transferBalance.getAmount());
    }

    @PostMapping("/transfer")
    public void transfer(@RequestBody TransferBalance transferBalance){
        bankService.makeTransfer(transferBalance);

    }

    @ExceptionHandler
    public String handle(IllegalArgumentException e){
        log.error(e.getMessage());
        return "I'm broken";
    }
}

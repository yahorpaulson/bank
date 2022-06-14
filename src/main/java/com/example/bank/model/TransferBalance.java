package com.example.bank.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
@Data
public class TransferBalance {

    private Long from;
    private Long to;
    private BigDecimal amount;
}

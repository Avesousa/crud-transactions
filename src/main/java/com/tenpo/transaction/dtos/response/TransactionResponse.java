package com.tenpo.transaction.dtos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {

    private Integer id;
    private TypeTransactionResponse type;
    private Date date;
    private Date dateConciliation;
    private Double amountEntry;
    private Double amountLoss;
    private Double difTypeExchange;
    private Double commissionPrePaid;
    private Double commissionCollector;
    private Double amountBalance;
    private TypeClientResponse typeClient;
    private String fileName;

}

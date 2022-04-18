package com.tenpo.transaction.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Transaction")
@Getter
@Setter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Transaction {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TypeTransaction type;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConciliation;

    @Column
    private Double amountEntry;

    @Column
    private Double amountLoss;

    @Column
    private Double difTypeExchange;

    @Column
    private Double commissionPrePaid;

    @Column
    private Double commissionCollector;

    @Column
    private Double amountBalance;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TypeClient typeClient;

    @Column
    private String fileName;

}

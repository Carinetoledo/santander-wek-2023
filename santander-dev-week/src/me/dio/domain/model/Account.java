package me.dio.domain.model;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTIFY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column( scale = 13, precision = 2)
    private BigDecimal balance;

    @Column( scale = 13, precision = 2)
    private BigDecimal limit;

    public Long getId() {return id;}
    public void setId (Long id) {this.id = id;}
    public String getNumber (){return number;}
    public void setNumber(String number){this.number = number;}
    public String getAgency (){ return  agency;}

    public void setAgency (String agency) {this.agency = agency}
    public BigDecimal getBalance(){return balance;}
    public void setBallance(BigDecimal balance) {this.balance = balance;}
    public BigDecimal getLimit(){ return limit;}
    public void setLimit (bigDecimal limit) {this.limit = limit;}
    }
}

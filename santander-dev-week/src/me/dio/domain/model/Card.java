package me.dio.domain.model;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTIFY)
    private Long id;

    @Column(unique = true)
    private String number;
    @Column( scale = 13, precision = 2)
    private BigDecimal limit;
    public Long getId(return id;)

    public void setId(Long id) {this.id = id;}
    public setId (Long id){this.id=id;}
    public String getNumber (){return number;}
    public void setNumber (String number) {this.number=number;}
    public BigDecimal getLimit(){ return limit;}
    public void setLimit(BigDecimal limit){this.limit = limit;}
}

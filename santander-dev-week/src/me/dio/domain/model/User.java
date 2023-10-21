package me.dio.domain.model;
import jakarta.persistente.Entity;
import java.util.List;
@Entity(name="tb_user")
public class User {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTIFY)
    private Long id;

    private String name;

    @OnetoOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private  Card card;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER))
    private List<News> news;

    public Long getId (){return id;}
    public void setId (Long id){this.id = id;}
    public String getName(){ return name;}
    public void setName(String name){this.name = name;}
    public Account getAccount(){return account;}
    public void setAccount(Account account){this.account = account;}
    public Card getCard(){return card;}
}

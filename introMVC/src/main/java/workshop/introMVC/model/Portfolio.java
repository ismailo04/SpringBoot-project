package workshop.introMVC.model;

import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Portfolio {

    private List<Stock> stocks;

    private String id;

    private double balance;

    public Portfolio() {
        this.id = UUID.randomUUID().toString();
    }

    public Portfolio(List<Stock> stocks, double balance) {
        this.stocks = stocks;
        this.balance = balance;
        this.id = UUID.randomUUID().toString();
    }
}

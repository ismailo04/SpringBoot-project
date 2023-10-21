package workshop.introMVC.model;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Transaction {

    @Getter
    @Setter
    private double purchasePrice;

    @Getter
    @Setter
    private int numberOfShares;

    @Getter
    @Setter
    private Date date;

    @Getter
    @Setter
    private String stockTicker;

    @Getter
    @Setter
    private String portfolioId;

    @Getter
    @Setter
    private String id;

    public Transaction() {
        this.id = UUID.randomUUID().toString();
    }

    public Transaction(double purchasePrice, int numberOfShares, Date date, String stockTicker, String portfolioId) {
        this.purchasePrice = purchasePrice;
        this.numberOfShares = numberOfShares;
        this.date = date;
        this.stockTicker = stockTicker;
        this.portfolioId = portfolioId;
        this.id = UUID.randomUUID().toString();
    }
}

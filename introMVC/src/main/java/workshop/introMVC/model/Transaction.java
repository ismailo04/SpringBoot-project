package workshop.introMVC.model;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
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
    private Stock stock;

    @Getter
    @Setter
    private Portfolio portfolio;

    @Getter
    @Setter
    private String id;

    public Transaction() {
        this.id = UUID.randomUUID().toString();
    }
}

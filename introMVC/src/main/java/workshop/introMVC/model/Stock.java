package workshop.introMVC.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor     // Lombok annotation that will create a constructor with all fields in the class
@NoArgsConstructor      // Lombok annotation that will create a constructor with no fields in the class (Necessary when declaring all args constructor)
public class Stock {
    
    @Getter
    @Setter
    private double price;

    @Getter
    @Setter
    private double open;

    @Getter
    @Setter
    private double close;

    @Getter
    @Setter
    private long volume;

    @Getter
    @Setter
    private String ticker;      // No need for id in stock as ticker is unique

    @Getter
    @Setter
    private String name;
}

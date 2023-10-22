package workshop.introMVC.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor     // Lombok annotation that will create a constructor with all fields in the class
@NoArgsConstructor      // Lombok annotation that will create a constructor with no fields in the class (Necessary when declaring all args constructor)
@Getter
@Setter
public class Stock {

    private String ticker;      // No need for id in stock as ticker is unique

    private String name;
    
    private double price;

    private double open;

    private long volume;
}

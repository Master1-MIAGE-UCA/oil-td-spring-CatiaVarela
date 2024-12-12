package miage.td1.dice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Dice {

    private int roll;

    public Dice() {
        this.roll = 0;
    }

    public int roll() {
        return (int) (Math.random() * 6) + 1;
    }

}

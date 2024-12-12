package miage.td1.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dice")
public class DiceController {

    private DiceService diceService;

    @Autowired
    public DiceController(DiceService diceService) {
        this.diceService = diceService;
    }

    @GetMapping("/rollDice")
    public List<String> rollDice() {
        return diceService.rollDices(1);  // Lancer 1 dé
    }

    @GetMapping("/rollDices/{X}")
    public List<String> rollDices(@PathVariable int X) {
        return diceService.rollDices(X);  // Lancer X dés
    }
}

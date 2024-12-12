package miage.td1.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dice")
public class DiceController2 {

    @Autowired
    private Repository repository;

    @GetMapping("/diceLogs")
    public List<DiceRollLog> getDiceLogs() {
        return repository.findAll();
    }


}

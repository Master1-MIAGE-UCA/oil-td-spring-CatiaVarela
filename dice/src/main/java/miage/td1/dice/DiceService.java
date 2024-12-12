package miage.td1.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DiceService {

    @Autowired
    private Repository repository;  // Injection du Repository

    public List<String> rollDices(int X) {
        List<String> results = new ArrayList<>();

        for (int i = 0; i < X; i++) {
            int roll = (int) (Math.random() * 6) + 1;
            results.add(String.valueOf(roll));
        }

        DiceRollLog log = new DiceRollLog();
        log.setDiceCount(X);
        log.setResults(results);
        log.setTimestamp(new Date());

        repository.save(log);

        return results;
    }
}

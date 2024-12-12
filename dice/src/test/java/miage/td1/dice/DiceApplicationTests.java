package miage.td1.dice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testDice() {
		Dice dice = new Dice();
		int roll = dice.getRole();
		assert(roll >= 1 && roll <= 6);
		System.out.println("Roll: " + roll);
	}

}

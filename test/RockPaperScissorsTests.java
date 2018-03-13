import static org.junit.Assert.*;

import org.junit.Test;

public class RockPaperScissorsTests {

	@Test
	public void rockBluntsScissors() {
		assertEquals(1, new RockPaperScissors().play("Rock", "Scissors"));
	}
	
	@Test
	public void scissorsBluntedByRock() {
		assertEquals(2, new RockPaperScissors().play("Scissors", "Rock"));
	}
	
	@Test
	public void paperWrapsRock() {
		assertEquals(1, new RockPaperScissors().play("Paper", "Rock"));
	}
	
	@Test
	public void rockWrappedByPaper() {
		assertEquals(2, new RockPaperScissors().play("Rock", "Paper"));
	}
	
	@Test
	public void scissorsCutPaper() {
		assertEquals(1, new RockPaperScissors().play("Scissors", "Paper"));
	}
	
	@Test
	public void paperCutByScissors() {
		assertEquals(2, new RockPaperScissors().play("Paper", "Scissors"));
	}
	
	@Test
	public void rockDrawsWithRock() {
		assertEquals(0, new RockPaperScissors().play("Rock", "Rock"));
	}

	@Test
	public void scissorsDrawWithScissors() {
		assertEquals(0, new RockPaperScissors().play("Scissors", "Scissors"));
	}
	
	@Test
	public void paperDrawsWithPaper() {
		assertEquals(0, new RockPaperScissors().play("Paper", "Paper"));
	}
	
	@Test
	public void invalidPlaysScoreMinusOne() {
		assertEquals(-1, new RockPaperScissors().play("", ""));
	}
}

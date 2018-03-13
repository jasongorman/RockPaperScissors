import static org.junit.Assert.*;

import org.junit.Test;

public class RockPaperScissorsTests {

	@Test
	public void rockBluntsScissors() {
		assertEquals(RockPaperScissors.PLAYER_ONE_WINS, 
				playGame(RockPaperScissors.ROCK, RockPaperScissors.SCISSORS));
	}
	
	@Test
	public void scissorsBluntedByRock() {
		assertEquals(RockPaperScissors.PLAYER_TWO_WINS, 
				playGame(RockPaperScissors.SCISSORS, RockPaperScissors.ROCK));
	}
	
	@Test
	public void paperWrapsRock() {
		assertEquals(RockPaperScissors.PLAYER_ONE_WINS, 
				playGame(RockPaperScissors.PAPER, RockPaperScissors.ROCK));
	}
	
	@Test
	public void rockWrappedByPaper() {
		assertEquals(RockPaperScissors.PLAYER_TWO_WINS, 
				playGame(RockPaperScissors.ROCK, RockPaperScissors.PAPER));
	}
	
	@Test
	public void scissorsCutPaper() {
		assertEquals(RockPaperScissors.PLAYER_ONE_WINS, 
				playGame(RockPaperScissors.SCISSORS, RockPaperScissors.PAPER));
	}
	
	@Test
	public void paperCutByScissors() {
		assertEquals(RockPaperScissors.PLAYER_TWO_WINS, 
				playGame(RockPaperScissors.PAPER, RockPaperScissors.SCISSORS));
	}
	
	@Test
	public void rockDrawsWithRock() {
		assertEquals(RockPaperScissors.DRAW, 
				playGame(RockPaperScissors.ROCK, RockPaperScissors.ROCK));
	}

	@Test
	public void scissorsDrawWithScissors() {
		assertEquals(RockPaperScissors.DRAW, 
				playGame(RockPaperScissors.SCISSORS, RockPaperScissors.SCISSORS));
	}
	
	@Test
	public void paperDrawsWithPaper() {
		assertEquals(RockPaperScissors.DRAW, 
				playGame(RockPaperScissors.PAPER, RockPaperScissors.PAPER));
	}
	
	@Test
	public void invalidPlaysScoreMinusOne() {
		assertEquals(RockPaperScissors.INVALID_PLAY, 
				playGame(null, null));
	}
	
	private int playGame(Player player1, Player player2) {
		return new RockPaperScissors().play(player1, player2);
	}
}

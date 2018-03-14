
public class RockPaperScissors {

	static Player SCISSORS;
	static Player PAPER;
	static Player ROCK;
	
	static final int PLAYER_TWO_WINS = 2;
	static final int PLAYER_ONE_WINS = 1;
	static final int DRAW = 0;
	static final int INVALID_PLAY = -1;
	
	public RockPaperScissors(){
		SCISSORS = new Player();
		PAPER = new Player();
		ROCK = new Player();
		SCISSORS.setBeats(PAPER);
		PAPER.setBeats(ROCK);
		ROCK.setBeats(SCISSORS);
	}

	public int play(Player player1, Player player2) {
		if(player1 == null || player2 == null)
			return INVALID_PLAY;
		return player1.play(player2);
	}

}

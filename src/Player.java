
class Player {

	private Player beats;

	int play(Player opponent) {
		if(opponent == this)
			return RockPaperScissors.DRAW;
		if (opponent == beats)
			return RockPaperScissors.PLAYER_ONE_WINS;
		return RockPaperScissors.PLAYER_TWO_WINS;
	}

	public void setBeats(Player beats) {
		this.beats = beats;
	}
}
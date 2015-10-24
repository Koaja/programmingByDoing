package blackjack;

public class Player {

	private String player;
	private String dealer;
	
	boolean playerTurn = true;

	public Player(String dealer) {
		this.dealer = dealer;

	}

	public String getplayerName() {
		return player;
	}

	public void setPlayerName(String playerOne) {
		this.player = playerOne;
	}

	public String getDealername() {
		return dealer;
	}

	public boolean isPlayersTurn() {

		if (playerTurn == true) {
			System.out.println(player + "'s turn to play");
			System.out.println("Would you like to 'hit' or 'stay' ?");

			return playerTurn = false;
		} else {
			System.out.println(dealer + "'s turn to play");
			return playerTurn = true;
		}
	}
}
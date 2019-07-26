package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece() {
		// TODO Auto-generated constructor stub
	}

	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
	
	
}

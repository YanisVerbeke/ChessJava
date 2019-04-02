package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

public class Tray {

	private Piece[][] table = new Piece[8][8];
	public Tray() {

		table[4][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KING);

	}

	public Piece getPiece(IChess.ChessPosition pos) {
		return table[pos.x][pos.y];
	}
}

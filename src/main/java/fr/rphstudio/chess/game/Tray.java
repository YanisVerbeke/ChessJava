package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

public class Tray {

	private Piece[][] table = new Piece[8][8];
	public Tray() {

		table[0][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_ROOK);
		table[1][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KNIGHT);
		table[2][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_BISHOP);
		table[3][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_QUEEN);
		table[4][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KING);
		table[5][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_BISHOP);
		table[6][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KNIGHT);
		table[7][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_ROOK);
		table[0][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN);
		table[1][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN);
		table[2][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN);
		table[3][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN);
		table[4][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN);
		table[5][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN);
		table[6][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN);
		table[7][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN);
		table[0][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_ROOK);
		table[1][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_KNIGHT);
		table[2][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_BISHOP);
		table[3][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_QUEEN);
		table[4][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_KING);
		table[5][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_BISHOP);
		table[6][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_KNIGHT);
		table[7][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_ROOK);
		table[0][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN);
		table[1][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN);
		table[2][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN);
		table[3][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN);
		table[4][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN);
		table[5][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN);
		table[6][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN);
		table[7][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN);


	}

	public Piece getPiece(IChess.ChessPosition pos) {
		return table[pos.x][pos.y];
	}
}

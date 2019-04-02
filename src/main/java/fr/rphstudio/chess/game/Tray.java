package fr.rphstudio.chess.game;

public class Table implements Piece {
	Piece[][] table = new Piece[8][8];

	table[0][0] = new Piece(CLR_BLACK, TYP_KING);
}

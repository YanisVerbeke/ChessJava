package fr.rphstudio.chess.game;

import fr.rphstudio.chess.game.pieces.*;
import fr.rphstudio.chess.interf.IChess;

public class Tray {

    private Piece[][] table;

    public Tray() {
        // Table
        this.table = new Piece[8][8];

        // Piece Black
        this.table[0][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_ROOK, new Rook());
        this.table[1][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KNIGHT, new Knight());
        this.table[2][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_BISHOP, new Bishop());
        this.table[3][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KING, new King());
        this.table[4][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_QUEEN, new Queen());
        this.table[5][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_BISHOP, new Bishop());
        this.table[6][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KNIGHT, new Knight());
        this.table[7][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_ROOK, new Rook());

        this.table[0][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[1][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[2][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[3][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[4][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[5][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[6][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[7][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());

        // Piece White
        this.table[0][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[1][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[2][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[3][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[4][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[5][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[6][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[7][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());

        this.table[0][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_ROOK, new Rook());
        this.table[1][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_KNIGHT, new Knight());
        this.table[2][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_BISHOP, new Bishop());
        this.table[3][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_KING, new King());
        this.table[4][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_QUEEN, new Queen());
        this.table[5][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_BISHOP, new Bishop());
        this.table[6][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_KNIGHT, new Knight());
        this.table[7][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_ROOK, new Rook());
    }

    //PUBLIC PIECE
    public Piece getPiece(IChess.ChessPosition pos) {
        return table[pos.x][pos.y];
    }

    public void Movemnt(IChess.ChessPosition pos0, IChess.ChessPosition pos1) {
        table[pos1.x][pos1.y] = table[pos0.x][pos0.y];
        table[pos0.x][pos0.y] = null;
    }

}

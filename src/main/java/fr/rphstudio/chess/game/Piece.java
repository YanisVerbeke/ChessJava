package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.List;

//--------------------------------------------------------------------
// PIECE
//--------------------------------------------------------------------

/**
 * Creating the Piece class
 */

public class Piece {

    /**
     * Initialization of variables
     * @param color
     * @param type
     * @param move
     */

    private IChess.ChessColor c;
    private IChess.ChessType t;
    private IMove m;

    public Piece(IChess.ChessColor color, IChess.ChessType type, IMove move) {
        this.c = color;
        this.t = type;
        this.m = move;
    }

    /**
     * Recovery of the color of the piece
     * @return c
     */

    public IChess.ChessColor getChessColor() {
        return this.c;
    }

    public IChess.ChessType getChessType() {
        return this.t;
    }

    public IMove getMoveType() {
        return m;
    }

    public List<IChess.ChessPosition> getMove(IChess.ChessPosition pos, Tray tray) {
        return this.m.getPossibleMoves(pos, tray);
    }

    public Piece clone(IChess.ChessColor color, IChess.ChessType type, IMove move) {
        Piece piece = new Piece(color, type, move);
        return piece;
    }
}

package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.List;

public class Piece {

    private IChess.ChessColor c;
    private IChess.ChessType t;
    private IMove m;

    public Piece(IChess.ChessColor color, IChess.ChessType type, IMove move) {
        this.c = color;
        this.t = type;
        this.m = move;
    }

    public IChess.ChessColor getChessColor() {
        return this.c;
    }

    public IChess.ChessType getChessType() {
        return this.t;
    }

    public List<IChess.ChessPosition> getMove(IChess.ChessPosition pos, Tray tray) {
        return this.m.getPossibleMoves(pos, tray);
    }

}

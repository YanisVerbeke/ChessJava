package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.List;

public class Piece {

    private IMove m;
    private IChess.ChessColor c;
    private IChess.ChessType t;

    public Piece(IChess.ChessColor color, IChess.ChessType type, IMove move) {

        this.c=color;
        this.t=type;
        this.m=move;

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

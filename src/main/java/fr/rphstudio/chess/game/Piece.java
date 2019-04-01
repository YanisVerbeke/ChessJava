package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

public class Piece {
    private IChess.ChessColor c;
    private IChess.ChessType t;
    public Piece(IChess.ChessColor color, IChess.ChessType type) {
        this.c=color;
        this.t=type;
    }
    public IChess.ChessColor getChessColor() {
        return this.c;
    }
    public IChess.ChessType getChessType() {
        return this.t;
    }
}

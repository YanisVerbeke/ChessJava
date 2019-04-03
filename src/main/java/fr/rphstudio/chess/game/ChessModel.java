package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.EmptyCellException;
import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.OutOfBoardException;

import java.util.ArrayList;
import java.util.List;

public class ChessModel implements IChess {

    private static ChessModel instance;
    private Tray tray;

    private ChessModel() {

    }

    public static IChess getInstance() {
        if (ChessModel.instance == null) {
            ChessModel.instance = new ChessModel();
        }
        return ChessModel.instance;
    }



    @Override
    public void reinit() {
        tray = new Tray();
    }

    @Override
    public ChessType getPieceType(ChessPosition p) throws EmptyCellException, OutOfBoardException {
        if(p.x < 0 | p.x > IChess.BOARD_HEIGHT - 1 | p.y < 0 | p.y > IChess.BOARD_WIDTH - 1) {
            throw new OutOfBoardException();
        }
        Piece pi = this.tray.getPiece(p);
        if(pi == null) {
            throw new EmptyCellException();
        }
        return pi.getChessType();
    }

    @Override
    public ChessColor getPieceColor(ChessPosition p) throws EmptyCellException, OutOfBoardException {
        if(p.x < 0 | p.x > IChess.BOARD_HEIGHT - 1 | p.y < 0 | p.y > IChess.BOARD_WIDTH - 1) {
            throw new OutOfBoardException();
        }
        Piece pi = this.tray.getPiece(p);
        if(pi == null) {
            throw new EmptyCellException();
        }
        return pi.getChessColor();

    }

    @Override
    public int getNbRemainingPieces(ChessColor color) {
        return tray.getNbPieces(color);
    }

    @Override
    public List<ChessPosition> getPieceMoves(ChessPosition p) throws OutOfBoardException {
        if(p.x < 0 | p.x > IChess.BOARD_HEIGHT - 1 | p.y < 0 | p.y > IChess.BOARD_WIDTH - 1) {
            throw new OutOfBoardException();
        }
        Piece pi = this.tray.getPiece(p);
        if(pi != null) {
            return pi.getMove(p, tray);

        }
        return new ArrayList<ChessPosition>();
    }

    @Override
    public void movePiece(ChessPosition p0, ChessPosition p1) {
        this.tray.Movemnt(p0, p1);
    }

    @Override
    public ChessKingState getKingState(ChessColor color) {
        return ChessKingState.KING_SAFE;
    }

    @Override
    public List<ChessType> getRemovedPieces(ChessColor color) {
        return new ArrayList<>();
    }

    @Override
    public boolean undoLastMove() {
        return false;
    }

    @Override
    public long getPlayerDuration(ChessColor color, boolean isPlaying) {
        return 0;
    }
}
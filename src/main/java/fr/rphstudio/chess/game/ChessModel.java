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
            List<ChessPosition> listPos = pi.getMove(p, tray);
            List<ChessPosition> FinalListPos = new ArrayList<ChessPosition>();
            for(int i = 0; i < listPos.size(); i++) {
                Tray clone = tray.clone();
                clone.Movemnt(p, listPos.get(i));
                if(clone.getKingState(pi.getChessColor()) == ChessKingState.KING_SAFE) {
                    FinalListPos.add(listPos.get(i));
                }
            }
            return FinalListPos;
        }
        return new ArrayList<ChessPosition>();
    }

    @Override
    public void movePiece(ChessPosition p0, ChessPosition p1) {
        this.tray.Movemnt(p0, p1);
    }

    @Override
    public ChessKingState getKingState(ChessColor color) {
        return tray.getKingState(color);
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
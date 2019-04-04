package fr.rphstudio.chess.game.pieces;

import fr.rphstudio.chess.game.IMove;
import fr.rphstudio.chess.game.Piece;
import fr.rphstudio.chess.game.Tray;
import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;

public class King implements IMove {

    @Override
    public ArrayList<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray) {
        ArrayList<IChess.ChessPosition> listPos = new ArrayList<>();
        Piece[][] table = tray.getTable();

            if (pos.y + 1 < IChess.BOARD_HEIGHT) {
                if (table[pos.x][pos.y + 1] == null || table[pos.x][pos.y + 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                    listPos.add(new IChess.ChessPosition(pos.x, pos.y + 1));
                }
            }
            if (pos.y - 1 >= 0) {
                if (table[pos.x][pos.y - 1] == null || table[pos.x][pos.y - 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                    listPos.add(new IChess.ChessPosition(pos.x, pos.y - 1));
                }
            }
            if (pos.x + 1 < IChess.BOARD_WIDTH) {
                if (table[pos.x + 1][pos.y] == null || table[pos.x + 1][pos.y].getChessColor() != tray.getPiece(pos).getChessColor()) {
                    listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y));
                }
            }
            if (pos.x - 1 >=0) {
                if (table[pos.x - 1][pos.y] == null || table[pos.x - 1][pos.y].getChessColor() != tray.getPiece(pos).getChessColor()) {
                    listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y));
                }
            }
            if (pos.x + 1 < IChess.BOARD_WIDTH && pos.y + 1 < IChess.BOARD_HEIGHT) {
                if (table[pos.x + 1][pos.y + 1] == null || table[pos.x + 1][pos.y + 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                    listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y + 1));
                }
            }
            if (pos.x - 1 >= 0 && pos.y + 1 < IChess.BOARD_HEIGHT) {
                if (table[pos.x - 1][pos.y + 1] == null || table[pos.x - 1][pos.y + 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                    listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y + 1));
                }
            }
            if (pos.x + 1 < IChess.BOARD_WIDTH && pos.y - 1 >= 0) {
                if (table[pos.x + 1][pos.y - 1] == null || table[pos.x + 1][pos.y - 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                    listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y - 1));
                }
            }
            if (pos.x - 1 >= 0 && pos.y - 1 >= 0) {
                if (table[pos.x - 1][pos.y - 1] == null || table[pos.x - 1][pos.y - 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                    listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y - 1));
                }
            }
        return listPos;
    }

}

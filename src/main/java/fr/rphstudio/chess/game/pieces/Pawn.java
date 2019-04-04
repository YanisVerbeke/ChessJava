package fr.rphstudio.chess.game.pieces;

import fr.rphstudio.chess.game.IMove;
import fr.rphstudio.chess.game.Piece;
import fr.rphstudio.chess.game.Tray;
import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;

import static fr.rphstudio.chess.interf.IChess.ChessColor.CLR_BLACK;
import static fr.rphstudio.chess.interf.IChess.ChessColor.CLR_WHITE;

public class Pawn implements IMove {

    private Tray tray;

    @Override
    public ArrayList<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray) {
        this.tray = tray;
        ArrayList<IChess.ChessPosition> listPos = new ArrayList<>();
        Piece[][] table = tray.getTable();
        Piece pi = this.tray.getPiece(pos);

        if (pi.getChessColor() == CLR_WHITE){
            if (table[pos.x][pos.y - 1] == null) {
                if (pos.y == 6) {
                    if ((table[pos.x][pos.y - 2] == null && table[pos.x][pos.y - 1] == null)) {
                        listPos.add(new IChess.ChessPosition(pos.x, pos.y - 2));
                    }
                    if (table[pos.x][pos.y - 1] == null) {
                        listPos.add(new IChess.ChessPosition(pos.x, pos.y - 1));
                    }
                } else if (pos.y - 1 >= 0) {
                        listPos.add(new IChess.ChessPosition(pos.x, pos.y - 1));
                }
            }
            if (pos.x - 1 >= 0) {
                if (table[pos.x - 1][pos.y - 1] != null && table[pos.x - 1][pos.y - 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                    listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y - 1));
                }
            }

            if (pos.x + 1 < IChess.BOARD_WIDTH) {
                if (table[pos.x + 1][pos.y - 1] != null && table[pos.x + 1][pos.y - 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                    listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y - 1));
                }
            }

        } else if (pi.getChessColor() == CLR_BLACK){
            if (table[pos.x][pos.y + 1] == null) {
                if (pos.y == 1) {
                    if (table[pos.x][pos.y + 2] == null && table[pos.x][pos.y + 1] == null) {
                        listPos.add(new IChess.ChessPosition(pos.x, pos.y + 2));
                    }
                    if (table[pos.x][pos.y + 1] == null) {
                        listPos.add(new IChess.ChessPosition(pos.x, pos.y + 1));
                    }
                } else if (pos.y + 1 < IChess.BOARD_HEIGHT) {
                        listPos.add(new IChess.ChessPosition(pos.x, pos.y + 1));
                }
            }
            if (pos.x - 1 >= 0) {
                if (table[pos.x - 1][pos.y + 1] != null && table[pos.x - 1][pos.y + 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                    listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y + 1));
                }
            }
            if (pos.x + 1 < IChess.BOARD_WIDTH) {
                if (table[pos.x + 1][pos.y + 1] != null && table[pos.x + 1][pos.y + 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                    listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y + 1));
                }
            }
        }
        return listPos;
    }
}
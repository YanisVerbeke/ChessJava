package fr.rphstudio.chess.game.pieces;

import fr.rphstudio.chess.game.Piece;
import fr.rphstudio.chess.game.Tray;
import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.game.IMove;
import javafx.scene.control.IndexedCell;

import java.util.ArrayList;
        //--------------------------------------------------------------------
        // KNIGHT MOVMENTS
        //--------------------------------------------------------------------

        /**
         * Creating the Knight class
         */
public class Knight implements IMove {

    @Override
    public ArrayList<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray) {
        ArrayList<IChess.ChessPosition> listPos = new ArrayList<>();
        Piece[][] table = tray.getTable();

        if (pos.x + 2 < IChess.BOARD_WIDTH && pos.y + 1 < IChess.BOARD_HEIGHT) {
            if (table[pos.x + 2][pos.y + 1] == null || table[pos.x + 2][pos.y + 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                listPos.add(new IChess.ChessPosition(pos.x + 2, pos.y + 1));
            }
        }

        if (pos.x + 2 < IChess.BOARD_WIDTH && pos.y - 1 >=0) {
            if (table[pos.x + 2][pos.y - 1] == null || table[pos.x + 2][pos.y - 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                listPos.add(new IChess.ChessPosition(pos.x + 2, pos.y - 1));
            }
        }

        if (pos.x - 2 >= 0 && pos.y + 1 < IChess.BOARD_HEIGHT) {
            if (table[pos.x - 2][pos.y + 1] == null || table[pos.x - 2][pos.y + 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                listPos.add(new IChess.ChessPosition(pos.x - 2, pos.y + 1));
            }
        }

        if (pos.x - 2 >= 0 && pos.y - 1 >= 0) {
            if (table[pos.x - 2][pos.y - 1] == null || table[pos.x - 2][pos.y - 1].getChessColor() != tray.getPiece(pos).getChessColor()) {
                listPos.add(new IChess.ChessPosition(pos.x - 2, pos.y - 1));
            }
        }

        if (pos.x + 1 < IChess.BOARD_WIDTH && pos.y + 2 < IChess.BOARD_HEIGHT) {
            if (table[pos.x + 1][pos.y + 2] == null || table[pos.x + 1][pos.y + 2].getChessColor() != tray.getPiece(pos).getChessColor()) {
                listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y + 2));
            }
        }
        if (pos.x + 1 < IChess.BOARD_WIDTH && pos.y - 2 >= 0) {
            if (table[pos.x + 1][pos.y - 2] == null || table[pos.x + 1][pos.y - 2].getChessColor() != tray.getPiece(pos).getChessColor()) {
                listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y - 2));
            }
        }
        if (pos.x - 1 >= 0 && pos.y + 2 < IChess.BOARD_HEIGHT) {
            if (table[pos.x - 1][pos.y + 2] == null || table[pos.x - 1][pos.y + 2].getChessColor() != tray.getPiece(pos).getChessColor()) {
                listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y + 2));
            }
        }
        if (pos.x - 1 >= 0 && pos.y - 2 >= 0) {
            if (table[pos.x - 1][pos.y - 2] == null || table[pos.x - 1][pos.y - 2].getChessColor() != tray.getPiece(pos).getChessColor()) {
                listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y - 2));
            }
        }

        return listPos;
    }

}

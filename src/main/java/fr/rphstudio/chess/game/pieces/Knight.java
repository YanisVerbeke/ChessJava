package fr.rphstudio.chess.game.pieces;

import fr.rphstudio.chess.game.Tray;
import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.game.IMove;
import javafx.scene.control.IndexedCell;

import java.util.ArrayList;

public class Knight implements IMove {

    @Override
    public ArrayList<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray) {
        ArrayList<IChess.ChessPosition> listPos = new ArrayList<>();

        if (pos.x + 2 < IChess.BOARD_WIDTH && pos.y + 1 < IChess.BOARD_HEIGHT) listPos.add(new IChess.ChessPosition(pos.x + 2, pos.y + 1));
        if (pos.x + 2 < IChess.BOARD_WIDTH && pos.y - 1 >=0) listPos.add(new IChess.ChessPosition(pos.x + 2, pos.y - 1));
        if (pos.x - 2 >= 0 && pos.y + 1 < IChess.BOARD_HEIGHT) listPos.add(new IChess.ChessPosition(pos.x - 2, pos.y + 1));
        if (pos.x - 2 >= 0 && pos.y - 1 >= 0) listPos.add(new IChess.ChessPosition(pos.x - 2, pos.y - 1));

        if (pos.x + 1 < IChess.BOARD_WIDTH && pos.y + 2 < IChess.BOARD_HEIGHT) listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y + 2));
        if (pos.x + 1 < IChess.BOARD_WIDTH && pos.y - 2 >= 0) listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y - 2));
        if (pos.x - 1 >= 0 && pos.y + 2 < IChess.BOARD_HEIGHT) listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y + 2));
        if (pos.x - 1 >= 0 && pos.y - 2 >= 0) listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y - 2));

        return listPos;
    }

}

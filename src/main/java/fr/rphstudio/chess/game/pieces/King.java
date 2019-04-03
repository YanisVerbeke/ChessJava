package fr.rphstudio.chess.game.pieces;

import fr.rphstudio.chess.game.IMove;
import fr.rphstudio.chess.game.Tray;
import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;

public class King implements IMove {

    @Override
    public ArrayList<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray) {
        ArrayList<IChess.ChessPosition> listPos = new ArrayList<>();
            if (pos.y + 1 < IChess.BOARD_HEIGHT) listPos.add(new IChess.ChessPosition(pos.x, pos.y + 1));
            if (pos.y - 1 >= 0) listPos.add(new IChess.ChessPosition(pos.x, pos.y - 1));
            if (pos.x + 1 < IChess.BOARD_WIDTH) listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y));
            if (pos.x - 1 >=0) listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y));
            if (pos.x + 1 < IChess.BOARD_WIDTH && pos.y + 1 < IChess.BOARD_HEIGHT) listPos.add(new IChess.ChessPosition(pos.x + 1 , pos.y + 1));
            if (pos.x - 1 >= 0 && pos.y + 1 < IChess.BOARD_HEIGHT) listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y + 1));
            if (pos.x + 1 < IChess.BOARD_WIDTH && pos.y - 1 >= 0) listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y - 1));
            if (pos.x - 1 >= 0 && pos.y - 1 >= 0) listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y - 1));
        return listPos;
    }

}

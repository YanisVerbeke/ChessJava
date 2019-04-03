package fr.rphstudio.chess.game.pieces;

import fr.rphstudio.chess.game.IMove;
import fr.rphstudio.chess.game.Tray;
import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;

public class Rook implements IMove {

    @Override
    public ArrayList<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray) {
        ArrayList<IChess.ChessPosition> listPos = new ArrayList<>();

        for(int i = 7; i > 0; i--) {
            if (pos.x + i < IChess.BOARD_WIDTH ) listPos.add(new IChess.ChessPosition(pos.x + i, pos.y));
            if (pos.x - i >= 0 ) listPos.add(new IChess.ChessPosition(pos.x - i, pos.y));
            if (pos.y + i < IChess.BOARD_HEIGHT ) listPos.add(new IChess.ChessPosition(pos.x, pos.y+ i));
            if (pos.y - i >=0 ) listPos.add(new IChess.ChessPosition(pos.x, pos.y- i));
        }
        return listPos;
    }

}

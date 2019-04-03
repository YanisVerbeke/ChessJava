package fr.rphstudio.chess.game.pieces;

import fr.rphstudio.chess.game.IMove;
import fr.rphstudio.chess.game.Tray;
import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;

public class Queen implements IMove {

    @Override
    public ArrayList<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray) {
        ArrayList<IChess.ChessPosition> listPos = new ArrayList<>();

        for(int i = 7; i >= 0; i--) {
            listPos.add(new IChess.ChessPosition(pos.x, pos.y +i));
            listPos.add(new IChess.ChessPosition(pos.x +i, pos.y));

            listPos.add(new IChess.ChessPosition(pos.x, pos.y -i));
            listPos.add(new IChess.ChessPosition(pos.x -i, pos.y));

            listPos.add(new IChess.ChessPosition(pos.x +i,pos.y +i));
            listPos.add(new IChess.ChessPosition(pos.x -i, pos.y +i));

            listPos.add(new IChess.ChessPosition(pos.x +i, pos.y -i));
            listPos.add(new IChess.ChessPosition(pos.x -i, pos.y -i));
        }
        return listPos;
    }

}

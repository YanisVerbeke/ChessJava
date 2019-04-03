package fr.rphstudio.chess.game.pieces;

import fr.rphstudio.chess.game.Tray;
import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.game.IMove;

import java.util.ArrayList;

public class Knight implements IMove {

    @Override
    public ArrayList<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray) {
        ArrayList<IChess.ChessPosition> listPos = new ArrayList<>();

        listPos.add(new IChess.ChessPosition(pos.x + 2, pos.y + 1));
        listPos.add(new IChess.ChessPosition(pos.x + 2, pos.y - 1));
        listPos.add(new IChess.ChessPosition(pos.x - 2, pos.y + 1));
        listPos.add(new IChess.ChessPosition(pos.x - 2, pos.y - 1));

        listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y + 2));
        listPos.add(new IChess.ChessPosition(pos.x + 1, pos.y - 2));
        listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y + 2));
        listPos.add(new IChess.ChessPosition(pos.x - 1, pos.y - 2));

        return listPos;
    }

}

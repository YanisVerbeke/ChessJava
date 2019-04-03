package fr.rphstudio.chess.game.pieces;

import fr.rphstudio.chess.game.IMove;
import fr.rphstudio.chess.game.Tray;
import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;

import static fr.rphstudio.chess.interf.IChess.ChessColor.CLR_BLACK;

public class Pawn implements IMove {

    @Override
    public ArrayList<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray) {
        ArrayList<IChess.ChessPosition> listPos = new ArrayList<>();

            // if (IChess.ChessColor == CLR_BLACK)
            listPos.add(new IChess.ChessPosition(pos.x, pos.y + 1));
            listPos.add(new IChess.ChessPosition(pos.x, pos.y - 1));
        return listPos;
    }

}

package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import javafx.geometry.Pos;
import java.util.List;

public interface IMove {

    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray);

}

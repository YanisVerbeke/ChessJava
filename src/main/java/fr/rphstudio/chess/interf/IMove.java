package fr.rphstudio.chess.interf;

import fr.rphstudio.chess.game.Piece;
import fr.rphstudio.chess.game.Tray;
import java.util.List;

public interface IMove {
	public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray);

}

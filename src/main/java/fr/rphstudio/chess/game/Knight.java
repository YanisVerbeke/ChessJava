package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;

public class Knight implements IMove {
	@Override
	public ArrayList<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray) {
		ArrayList<IChess.ChessPosition> listPos = new ArrayList<IChess.ChessPosition>();

		listPos.add(new IChess.ChessPosition(pos.x,pos.y+1));
		listPos.add(new IChess.ChessPosition(pos.x,pos.y-1));
		listPos.add(new IChess.ChessPosition(pos.x-1,pos.y));
		listPos.add(new IChess.ChessPosition(pos.x+1,pos.y));
		return listPos;



				//(pos.xFinish - pos.xStart >=2 || pos.yFinish - pos.yStart >=2)
	}
}

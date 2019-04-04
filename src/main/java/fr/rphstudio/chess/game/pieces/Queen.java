package fr.rphstudio.chess.game.pieces;

import fr.rphstudio.chess.game.IMove;
import fr.rphstudio.chess.game.Piece;
import fr.rphstudio.chess.game.Tray;
import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;

public class Queen implements IMove {

    @Override
    public ArrayList<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Tray tray) {
        ArrayList<IChess.ChessPosition> listPos = new ArrayList<>();
        Piece[][] table = tray.getTable();
        
        for(int direction = 0; direction < 4; direction++) {
            switch (direction) {
                case 0 :
                    for (int i = 1; i < 8; i++) {
                        if (pos.x + i < IChess.BOARD_WIDTH) {
                            if (table[pos.x + i][pos.y] == null) {
                                listPos.add(new IChess.ChessPosition(pos.x + i, pos.y));
                            } else if (table[pos.x + i][pos.y].getChessColor() != tray.getPiece(pos).getChessColor()) {
                                listPos.add(new IChess.ChessPosition(pos.x + i, pos.y));
                                break;
                            } else break;
                        }
                    }
                    break;

                case 1 :
                    for (int i = 1; i < 8; i++) {
                        if (pos.x - i >= 0) {
                            if (table[pos.x - i][pos.y] == null) {
                                listPos.add(new IChess.ChessPosition(pos.x - i, pos.y));
                            } else if (table[pos.x - i][pos.y].getChessColor() != tray.getPiece(pos).getChessColor()) {
                                listPos.add(new IChess.ChessPosition(pos.x - i, pos.y));
                                break;
                            } else break;
                        }
                    }
                    break;

                case 2 :
                    for (int i = 1; i < 8; i++) {
                        if (pos.y + i < IChess.BOARD_HEIGHT) {
                            if (table[pos.x][pos.y + i] == null) {
                                listPos.add(new IChess.ChessPosition(pos.x, pos.y + i));
                            } else if (table[pos.x][pos.y + i].getChessColor() != tray.getPiece(pos).getChessColor()) {
                                listPos.add(new IChess.ChessPosition(pos.x, pos.y + i));
                                break;
                            } else break;
                        }
                    }
                    break;

                case 3 :
                    for (int i = 1; i < 8; i++) {
                        if (pos.y - i >= 0) {
                            if (table[pos.x][pos.y - i] == null) {
                                listPos.add(new IChess.ChessPosition(pos.x, pos.y - i));
                            } else if (table[pos.x][pos.y - i].getChessColor() != tray.getPiece(pos).getChessColor()) {
                                listPos.add(new IChess.ChessPosition(pos.x, pos.y - i));
                                break;
                            } else break;
                        }
                    }
                    break;
            }
        }
        for(int direction = 0; direction < 4; direction++) {
            switch (direction) {
                case 0 :
                    for (int i = 1; i < 8; i++) {
                        if (pos.x + i < IChess.BOARD_HEIGHT && pos.y + i < IChess.BOARD_WIDTH) {
                            if (table[pos.x + i][pos.y + i] == null) {
                                listPos.add(new IChess.ChessPosition(pos.x + i, pos.y + i));
                            } else if (table[pos.x + i][pos.y + i].getChessColor() != tray.getPiece(pos).getChessColor()) {
                                listPos.add(new IChess.ChessPosition(pos.x + i, pos.y + i));
                                break;
                            } else break;
                        }
                    }
                    break;

                case 1 :
                    for (int i = 1; i < 8; i++) {
                        if (pos.x - i >= 0 && pos.y + i < IChess.BOARD_WIDTH) {
                            if (table[pos.x - i][pos.y + i] == null) {
                                listPos.add(new IChess.ChessPosition(pos.x - i, pos.y + i));
                            } else if (table[pos.x - i][pos.y + i].getChessColor() != tray.getPiece(pos).getChessColor()) {
                                listPos.add(new IChess.ChessPosition(pos.x - i, pos.y + i));
                                break;
                            } else break;
                        }
                    }
                    break;

                case 2 :
                    for (int i = 1; i < 8; i++) {
                        if (pos.x + i < IChess.BOARD_HEIGHT && pos.y - i >= 0) {
                            if (table[pos.x + i][pos.y - i] == null) {
                                listPos.add(new IChess.ChessPosition(pos.x + i, pos.y - i));
                            } else if (table[pos.x + i][pos.y - i].getChessColor() != tray.getPiece(pos).getChessColor()) {
                                listPos.add(new IChess.ChessPosition(pos.x + i, pos.y - i));
                                break;
                            } else break;
                        }
                    }
                    break;

                case 3 :
                    for (int i = 1; i < 8; i++) {
                        if (pos.x - i >= 0 && pos.y - i >= 0) {
                            if (table[pos.x - i][pos.y - i] == null) {
                                listPos.add(new IChess.ChessPosition(pos.x - i, pos.y - i));
                            } else if (table[pos.x - i][pos.y - i].getChessColor() != tray.getPiece(pos).getChessColor()) {
                                listPos.add(new IChess.ChessPosition(pos.x - i, pos.y - i));
                                break;
                            } else break;
                        }
                    }
                    break;
            }
        }
        return listPos;
    }

}

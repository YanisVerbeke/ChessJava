package fr.rphstudio.chess.game;

import fr.rphstudio.chess.game.pieces.*;
import fr.rphstudio.chess.interf.IChess;
import java.util.List;

public class Tray {

    private Piece[][] table;

    public Tray() {
        // Table
        this.table = new Piece[IChess.BOARD_HEIGHT][IChess.BOARD_WIDTH];

        // Piece Black
        this.table[0][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_ROOK, new Rook());
        this.table[1][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KNIGHT, new Knight());
        this.table[2][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_BISHOP, new Bishop());
        this.table[3][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KING, new King());
        this.table[4][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_QUEEN, new Queen());
        this.table[5][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_BISHOP, new Bishop());
        this.table[6][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KNIGHT, new Knight());
        this.table[7][0] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_ROOK, new Rook());

        this.table[0][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[1][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[2][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[3][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[4][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[5][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[6][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[7][1] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());

        // Piece White
        this.table[0][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[1][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[2][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[3][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[4][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[5][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[6][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        this.table[7][6] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());

        this.table[0][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_ROOK, new Rook());
        this.table[1][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_KNIGHT, new Knight());
        this.table[2][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_BISHOP, new Bishop());
        this.table[3][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_KING, new King());
        this.table[4][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_QUEEN, new Queen());
        this.table[5][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_BISHOP, new Bishop());
        this.table[6][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_KNIGHT, new Knight());
        this.table[7][7] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_ROOK, new Rook());
    }

    //PUBLIC PIECE
    public Piece getPiece(IChess.ChessPosition pos) {
        return table[pos.x][pos.y];
    }

    public int getNbPieces(IChess.ChessColor color) {
        int count = 0;
        for(int i = 0; i < IChess.BOARD_HEIGHT; i++) {
            for(int j = 0; j < IChess.BOARD_WIDTH; j++) {
                if (table[i][j] != null && color == table[i][j].getChessColor()) {
                    count++;
                }
            }
        }
        return count;
    }

    public Piece[][] getTable() {
        return table;
    }

    public void Movemnt(IChess.ChessPosition pos0, IChess.ChessPosition pos1) {
        table[pos1.x][pos1.y] = table[pos0.x][pos0.y];
        table[pos0.x][pos0.y] = null;
    }

    public IChess.ChessKingState getKingState(IChess.ChessColor color) {

        IChess.ChessPosition kingPos = null;
        List<IChess.ChessPosition> listPos = null;

        for(int i = 0; i < IChess.BOARD_WIDTH; i++) {
            for (int j = 0; j < IChess.BOARD_HEIGHT; j++) {
                if (table[i][j] != null) {
                    if (table[i][j].getChessType() == IChess.ChessType.TYP_KING && table[i][j].getChessColor() == color) {
                        kingPos = new IChess.ChessPosition(i, j);
                    }
                }
            }
        }

        if (kingPos != null) {
            for(int k = 0; k < IChess.BOARD_WIDTH; k++) {
                for (int l = 0; l < IChess.BOARD_HEIGHT; l++) {
                    if (table[k][l] != null) {
                        if (table[k][l].getChessColor() != color) {
                            IChess.ChessPosition pos = new IChess.ChessPosition(k, l);
                            Piece pi = this.getPiece(pos);
                            listPos = pi.getMove(pos, this);
                            for (int n = 0; n < listPos.size(); n++) {
                                if (listPos.get(n).equals(kingPos)) {
                                    return IChess.ChessKingState.KING_THREATEN;
                                }
                            }
                        }
                    }
                }
            }
        }
        return IChess.ChessKingState.KING_SAFE;
    }

    public Tray clone() {
        Tray Clone = new Tray();

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                IChess.ChessPosition pos = new IChess.ChessPosition(i, j);
                if(this.table[i][j] != null) {
                    Clone.table[i][j] = this.table[i][j].clone(table[i][j].getChessColor(), table[i][j].getChessType(), table[i][j].getMoveType());
                } else {
                    Clone.table[i][j] = null;
                }
            }
        }
        return Clone;
    }

}

import java.awt.*;

public class PaintGame {
    Chessboard chessboard = new Chessboard();
    King whiteKing = new King("whiteKing_small.png", 4, 7, true);
    King blackKing = new King("blackKing_small.png", 4, 0, false);
    Queen whiteQueen = new Queen("whiteQueen_small.png", 3, 7, true);
    Queen blackQueen = new Queen("blackQueen_small.png", 3, 0, false);
    Knight whiteBKnight = new Knight("whiteKnight_small.png", 1, 7, true);
    Knight whiteGKnight = new Knight("whiteKnight_small.png", 6, 7, true);
    Knight blackBKnight = new Knight("blackKnight_small.png", 1, 0, false);
    Knight blackGKnight = new Knight("blackKnight_small.png", 6, 0, false);
    Bishop whiteCBishop = new Bishop("whiteBishop_small.png", 2, 7, true);
    Bishop whiteFBishop = new Bishop("whiteBishop_small.png", 5, 7, true);
    Bishop blackCBishop = new Bishop("blackBishop_small.png", 2, 0, false);
    Bishop blackFBishop = new Bishop("blackBishop_small.png", 5, 0, false);
    Rook whiteARook = new Rook("whiteRook_small.png", 0, 7, true);
    Rook whiteHRook = new Rook("whiteRook_small.png", 7, 7, true);
    Rook blackARook = new Rook("blackRook_small.png", 0, 0, false);
    Rook blackHRook = new Rook("blackRook_small.png", 7, 0, false);
    Pawn whiteAPawn = new Pawn("whitePawn_small.png", 0,6, true);
    Pawn whiteBPawn = new Pawn("whitePawn_small.png", 1,6, true);
    Pawn whiteCPawn = new Pawn("whitePawn_small.png", 2,6, true);
    Pawn whiteDPawn = new Pawn("whitePawn_small.png", 3,6, true);
    Pawn whiteEPawn = new Pawn("whitePawn_small.png", 4,6, true);
    Pawn whiteFPawn = new Pawn("whitePawn_small.png", 5,6, true);
    Pawn whiteGPawn = new Pawn("whitePawn_small.png", 6,6, true);
    Pawn whiteHPawn = new Pawn("whitePawn_small.png", 7,6, true);
    Pawn blackAPawn = new Pawn("blackPawn_small.png", 0,1, false);
    Pawn blackBPawn = new Pawn("blackPawn_small.png", 1,1, false);
    Pawn blackCPawn = new Pawn("blackPawn_small.png", 2,1, false);
    Pawn blackDPawn = new Pawn("blackPawn_small.png", 3,1, false);
    Pawn blackEPawn = new Pawn("blackPawn_small.png", 4,1, false);
    Pawn blackFPawn = new Pawn("blackPawn_small.png", 5,1, false);
    Pawn blackGPawn = new Pawn("blackPawn_small.png", 6,1, false);
    Pawn blackHPawn = new Pawn("blackPawn_small.png", 7,1, false);

    public void paintInitialBoard(Graphics2D g) {
        chessboard.paintBoard(g);
        for(Piece p:Piece.pieceList) {
            p.paintPiece(g);
        }
    }
}

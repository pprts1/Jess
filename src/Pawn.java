import java.awt.*;
import java.util.Objects;

public class Pawn extends Piece{
    protected int moveCount = 0;
    protected final Point[] legalMovePoint = new Point[4];
//    List<Point> legalPointList = new ArrayList<>();

    public Pawn(String fileName, int xPosSquare, int yPosSquare, boolean isWhite) {
        super(fileName, xPosSquare, yPosSquare, isWhite);
        int moveCount = 0;
        isPawn = true;
    }
    private boolean isBlocked(int x, int y) {
        isLegalMove = false;
        return Piece.getPiece(x, y) != null && ((x == legalMovePoint[0].x && y == legalMovePoint[0].y) || (x == legalMovePoint[1].x && y == legalMovePoint[1].y));
    }
    public void calculateLegalMoves(int x, int y) {

        Point destinationPoint = new Point(x,y);

        legalMovePoint[0] = new Point();
        legalMovePoint[1] = new Point();
        legalMovePoint[2] = new Point();
        legalMovePoint[3] = new Point();


        if(this.isWhite) {
            if (this.moveCount == 0) {
                this.legalMovePoint[0].y = Piece.selectedPiece.lastY - 2;
            } else {
                this.legalMovePoint[0].y = Piece.selectedPiece.lastY - 1;
            }
            this.legalMovePoint[0].x = Piece.selectedPiece.lastX;

            this.legalMovePoint[1].x = Piece.selectedPiece.lastX;
            this.legalMovePoint[1].y = Piece.selectedPiece.lastY - 1;


            // capture diagonally for White
            if((Piece.getPiece(x, y) != null) && !Objects.requireNonNull(Piece.getPiece(x, y)).isWhite && !Objects.requireNonNull(Piece.getPiece(x, y)).isKing) {
                this.legalMovePoint[2].x = Piece.selectedPiece.lastX - 1;
                this.legalMovePoint[2].y = Piece.selectedPiece.lastY - 1;

                this.legalMovePoint[3].x = Piece.selectedPiece.lastX + 1;
                this.legalMovePoint[3].y = Piece.selectedPiece.lastY - 1;
            } else {
                this.legalMovePoint[2].x = -100;
                this.legalMovePoint[2].y = -100;

                this.legalMovePoint[3].x = -100;
                this.legalMovePoint[3].y = -100;
            }


        } else {
            if(this.moveCount == 0) {
                this.legalMovePoint[0].y = Piece.selectedPiece.lastY + 2;
            } else {
                this.legalMovePoint[0].y = Piece.selectedPiece.lastY + 1;
            }
            this.legalMovePoint[0].x = Piece.selectedPiece.lastX;

            this.legalMovePoint[1].x = Piece.selectedPiece.lastX;
            this.legalMovePoint[1].y = Piece.selectedPiece.lastY + 1;

            // capture diagonally for Black
            if((Piece.getPiece(x, y) != null) && Objects.requireNonNull(Piece.getPiece(x, y)).isWhite && !Objects.requireNonNull(Piece.getPiece(x, y)).isKing) {
                this.legalMovePoint[2].x = Piece.selectedPiece.lastX + 1;
                this.legalMovePoint[2].y = Piece.selectedPiece.lastY + 1;

                this.legalMovePoint[3].x = Piece.selectedPiece.lastX - 1;
                this.legalMovePoint[3].y = Piece.selectedPiece.lastY + 1;
            } else {
                this.legalMovePoint[2].x = -9;
                this.legalMovePoint[2].y = -9;

                this.legalMovePoint[3].x = -9;
                this.legalMovePoint[3].y = -9;
            }

        }
        for (Point point : legalMovePoint) {
            if (destinationPoint.x == point.x && destinationPoint.y == point.y) {
                this.isLegalMove = true;

                break;
            }
        }
        if (this.isLegalMove && !isBlocked(destinationPoint.x, destinationPoint.y)) {
            this.isLegalMove = false;
            this.moveCount += 1;
            this.movePiece(destinationPoint.x, destinationPoint.y);

        } else {
                this.movePiece(this.lastX, this.lastY);
        }
    }
}

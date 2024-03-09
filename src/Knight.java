import java.awt.*;

public class Knight extends Piece {
    private final Point[] legalMovePoint = new Point[8];

    public Knight(String fileName, int xPosSquare, int yPosSquare, boolean isWhite) {
        super(fileName, xPosSquare, yPosSquare, isWhite);
        isKnight = true;
    }

    public void calculateLegalMoves(int x, int y) {
        Point destinationPoint = new Point(x, y);
        legalMovePoint[0] = new Point();
        legalMovePoint[1] = new Point();
        legalMovePoint[2] = new Point();
        legalMovePoint[3] = new Point();
        legalMovePoint[4] = new Point();
        legalMovePoint[5] = new Point();
        legalMovePoint[6] = new Point();
        legalMovePoint[7] = new Point();

        this.legalMovePoint[0].x = this.xSquare - 2;
        this.legalMovePoint[0].y = this.ySquare + 1;

        this.legalMovePoint[1].x = this.xSquare - 2;
        this.legalMovePoint[1].y = this.ySquare - 1;

        this.legalMovePoint[2].x = this.xSquare - 1;
        this.legalMovePoint[2].y = this.ySquare + 2;

        this.legalMovePoint[3].x = this.xSquare - 1;
        this.legalMovePoint[3].y = this.ySquare - 2;

        this.legalMovePoint[4].x = this.xSquare + 1;
        this.legalMovePoint[4].y = this.ySquare - 2;

        this.legalMovePoint[5].x = this.xSquare + 1;
        this.legalMovePoint[5].y = this.ySquare + 2;

        this.legalMovePoint[6].x = this.xSquare + 2;
        this.legalMovePoint[6].y = this.ySquare - 1;

        this.legalMovePoint[7].x = this.xSquare + 2;
        this.legalMovePoint[7].y = this.ySquare + 1;

        for (Point point : legalMovePoint) {
            if (destinationPoint.x == point.x && destinationPoint.y == point.y) {
                this.isLegalMove = true;
                break;
            }
        }
        if (this.isLegalMove) {
            this.isLegalMove = false;
            this.movePiece(destinationPoint.x, destinationPoint.y);

        } else {
            this.movePiece(this.lastX, this.lastY); // hier ist der Fehler !
        }
    }
}
import java.awt.*;

public class Bishop extends Piece{
    private final Point[] legalMovePoint = new Point[28];
    public Bishop(String fileName, int xPosSquare, int yPosSquare, boolean isWhite) {
        super(fileName, xPosSquare, yPosSquare, isWhite);
        isBishop = true;
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
        legalMovePoint[8] = new Point();
        legalMovePoint[9] = new Point();
        legalMovePoint[10] = new Point();
        legalMovePoint[11] = new Point();
        legalMovePoint[12] = new Point();
        legalMovePoint[13] = new Point();
        legalMovePoint[14] = new Point();
        legalMovePoint[15] = new Point();
        legalMovePoint[16] = new Point();
        legalMovePoint[17] = new Point();
        legalMovePoint[18] = new Point();
        legalMovePoint[19] = new Point();
        legalMovePoint[20] = new Point();
        legalMovePoint[21] = new Point();
        legalMovePoint[22] = new Point();
        legalMovePoint[23] = new Point();
        legalMovePoint[24] = new Point();
        legalMovePoint[25] = new Point();
        legalMovePoint[26] = new Point();
        legalMovePoint[27] = new Point();

        this.legalMovePoint[0].x = this.xSquare - 1;
        this.legalMovePoint[0].y = this.ySquare - 1;

        this.legalMovePoint[1].x = this.xSquare - 2;
        this.legalMovePoint[1].y = this.ySquare - 2;

        this.legalMovePoint[2].x = this.xSquare - 3;
        this.legalMovePoint[2].y = this.ySquare - 3;

        this.legalMovePoint[3].x = this.xSquare - 4;
        this.legalMovePoint[3].y = this.ySquare - 4;

        this.legalMovePoint[4].x = this.xSquare - 5;
        this.legalMovePoint[4].y = this.ySquare - 5;

        this.legalMovePoint[5].x = this.xSquare - 6;
        this.legalMovePoint[5].y = this.ySquare - 6;

        this.legalMovePoint[6].x = this.xSquare - 7;
        this.legalMovePoint[6].y = this.ySquare - 7;

        this.legalMovePoint[7].x = this.xSquare + 1;
        this.legalMovePoint[7].y = this.ySquare + 1;

        this.legalMovePoint[8].x = this.xSquare + 2;
        this.legalMovePoint[8].y = this.ySquare + 2;

        this.legalMovePoint[9].x = this.xSquare + 3;
        this.legalMovePoint[9].y = this.ySquare + 3;

        this.legalMovePoint[10].x = this.xSquare + 4;
        this.legalMovePoint[10].y = this.ySquare + 4;

        this.legalMovePoint[11].x = this.xSquare + 5;
        this.legalMovePoint[11].y = this.ySquare + 5;

        this.legalMovePoint[12].x = this.xSquare + 6;
        this.legalMovePoint[12].y = this.ySquare + 6;

        this.legalMovePoint[13].x = this.xSquare + 7;
        this.legalMovePoint[13].y = this.ySquare + 7;

        this.legalMovePoint[14].x = this.xSquare - 1;
        this.legalMovePoint[14].y = this.ySquare + 1;

        this.legalMovePoint[15].x = this.xSquare - 2;
        this.legalMovePoint[15].y = this.ySquare + 2;

        this.legalMovePoint[16].x = this.xSquare - 3;
        this.legalMovePoint[16].y = this.ySquare + 3;

        this.legalMovePoint[17].x = this.xSquare - 4;
        this.legalMovePoint[17].y = this.ySquare + 4;

        this.legalMovePoint[18].x = this.xSquare - 5;
        this.legalMovePoint[18].y = this.ySquare + 5;

        this.legalMovePoint[19].x = this.xSquare - 6;
        this.legalMovePoint[19].y = this.ySquare + 6;

        this.legalMovePoint[20].x = this.xSquare - 7;
        this.legalMovePoint[20].y = this.ySquare + 7;

        this.legalMovePoint[21].x = this.xSquare + 1;
        this.legalMovePoint[21].y = this.ySquare - 1;

        this.legalMovePoint[22].x = this.xSquare + 2;
        this.legalMovePoint[22].y = this.ySquare - 2;

        this.legalMovePoint[23].x = this.xSquare + 3;
        this.legalMovePoint[23].y = this.ySquare - 3;

        this.legalMovePoint[24].x = this.xSquare + 4;
        this.legalMovePoint[24].y = this.ySquare - 4;

        this.legalMovePoint[25].x = this.xSquare + 5;
        this.legalMovePoint[25].y = this.ySquare - 5;

        this.legalMovePoint[26].x = this.xSquare + 6;
        this.legalMovePoint[26].y = this.ySquare - 6;

        this.legalMovePoint[27].x = this.xSquare + 7;
        this.legalMovePoint[27].y = this.ySquare - 7;

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

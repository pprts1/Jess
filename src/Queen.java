import java.awt.*;

public class Queen extends Piece{

    private final Point[] legalMovePoint = new Point[56];

    public Queen(String fileName, int xPosSquare, int yPosSquare, boolean isWhite) {
        super(fileName, xPosSquare, yPosSquare, isWhite);
        isQueen = true;
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

        legalMovePoint[28] = new Point();
        legalMovePoint[29] = new Point();
        legalMovePoint[30] = new Point();
        legalMovePoint[31] = new Point();
        legalMovePoint[32] = new Point();
        legalMovePoint[33] = new Point();
        legalMovePoint[34] = new Point();
        legalMovePoint[35] = new Point();
        legalMovePoint[36] = new Point();
        legalMovePoint[37] = new Point();
        legalMovePoint[38] = new Point();
        legalMovePoint[39] = new Point();
        legalMovePoint[40] = new Point();
        legalMovePoint[41] = new Point();
        legalMovePoint[42] = new Point();
        legalMovePoint[43] = new Point();
        legalMovePoint[44] = new Point();
        legalMovePoint[45] = new Point();
        legalMovePoint[46] = new Point();
        legalMovePoint[47] = new Point();
        legalMovePoint[48] = new Point();
        legalMovePoint[49] = new Point();
        legalMovePoint[50] = new Point();
        legalMovePoint[51] = new Point();
        legalMovePoint[52] = new Point();
        legalMovePoint[53] = new Point();
        legalMovePoint[54] = new Point();
        legalMovePoint[55] = new Point();

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



        this.legalMovePoint[28].x = this.xSquare - 1;
        this.legalMovePoint[28].y = this.ySquare;

        this.legalMovePoint[29].x = this.xSquare - 2;
        this.legalMovePoint[29].y = this.ySquare;

        this.legalMovePoint[30].x = this.xSquare - 3;
        this.legalMovePoint[30].y = this.ySquare;

        this.legalMovePoint[31].x = this.xSquare - 4;
        this.legalMovePoint[31].y = this.ySquare;

        this.legalMovePoint[32].x = this.xSquare - 5;
        this.legalMovePoint[32].y = this.ySquare;

        this.legalMovePoint[33].x = this.xSquare - 6;
        this.legalMovePoint[33].y = this.ySquare;

        this.legalMovePoint[34].x = this.xSquare - 7;
        this.legalMovePoint[34].y = this.ySquare;

        this.legalMovePoint[35].x = this.xSquare + 1;
        this.legalMovePoint[35].y = this.ySquare;

        this.legalMovePoint[36].x = this.xSquare + 2;
        this.legalMovePoint[36].y = this.ySquare;

        this.legalMovePoint[37].x = this.xSquare + 3;
        this.legalMovePoint[37].y = this.ySquare;

        this.legalMovePoint[38].x = this.xSquare + 4;
        this.legalMovePoint[38].y = this.ySquare;

        this.legalMovePoint[39].x = this.xSquare + 5;
        this.legalMovePoint[39].y = this.ySquare;

        this.legalMovePoint[40].x = this.xSquare + 6;
        this.legalMovePoint[40].y = this.ySquare;

        this.legalMovePoint[41].x = this.xSquare + 7;
        this.legalMovePoint[41].y = this.ySquare;

        this.legalMovePoint[42].x = this.xSquare;
        this.legalMovePoint[42].y = this.ySquare + 1;

        this.legalMovePoint[43].x = this.xSquare;
        this.legalMovePoint[43].y = this.ySquare + 2;

        this.legalMovePoint[44].x = this.xSquare;
        this.legalMovePoint[44].y = this.ySquare + 3;

        this.legalMovePoint[45].x = this.xSquare;
        this.legalMovePoint[45].y = this.ySquare + 4;

        this.legalMovePoint[46].x = this.xSquare;
        this.legalMovePoint[46].y = this.ySquare + 5;

        this.legalMovePoint[47].x = this.xSquare;
        this.legalMovePoint[47].y = this.ySquare + 6;

        this.legalMovePoint[48].x = this.xSquare;
        this.legalMovePoint[48].y = this.ySquare + 7;

        this.legalMovePoint[49].x = this.xSquare;
        this.legalMovePoint[49].y = this.ySquare - 1;

        this.legalMovePoint[50].x = this.xSquare;
        this.legalMovePoint[50].y = this.ySquare - 2;

        this.legalMovePoint[51].x = this.xSquare;
        this.legalMovePoint[51].y = this.ySquare - 3;

        this.legalMovePoint[52].x = this.xSquare;
        this.legalMovePoint[52].y = this.ySquare - 4;

        this.legalMovePoint[53].x = this.xSquare;
        this.legalMovePoint[53].y = this.ySquare - 5;

        this.legalMovePoint[54].x = this.xSquare;
        this.legalMovePoint[54].y = this.ySquare - 6;

        this.legalMovePoint[55].x = this.xSquare;
        this.legalMovePoint[55].y = this.ySquare - 7;


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

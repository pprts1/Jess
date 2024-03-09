import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Piece {
    private boolean hasPieceMoved = false;
    static Piece selectedPiece;
    public static boolean isTurnForWhite = true;
    static final int MAX_RANGE = 800;
    protected int xReal;
    protected int yReal;
    protected int xSquare;
    protected int ySquare;
    protected int lastX = 0;
    protected int lastY = 0;
    public static List<Piece> pieceList = new LinkedList<>();
    protected String fileName;
    protected boolean isWhite;
    protected BufferedImage pieceImage;
    protected boolean isPawn;
    protected boolean isBishop;
    protected boolean isKnight;
    protected boolean isRook;
    protected boolean isQueen;
    protected boolean isKing;
    protected boolean isLegalMove = false;

    public Piece(String fileName, int xSquare, int ySquare, boolean isWhite) {
        this.fileName = fileName;
        this.isWhite = isWhite;
        this.xSquare = xSquare;
        this.ySquare = ySquare;
        this.xReal = xSquare * 100;
        this.yReal = ySquare * 100;

        try {
            if (fileName != null) {
                this.pieceImage = ImageIO.read(Objects.requireNonNull(this.getClass().getResource(fileName)));
            } else return;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        pieceList.add(this);
    }
    public void movePiece(int x, int y) {
        if(Piece.getPiece(x, y)!=null){
            if(Piece.getPiece(x, y).isWhite != isWhite)  {
                Piece.getPiece(x, y).removePiece();
            }else {                                 // this moves the piece of the same color back to its initial square
                  xReal = this.xSquare*100;
                  yReal = this.ySquare*100;
                  return;
            }
        }

        this.xSquare = x;
        this.ySquare = y;
        this.xReal = this.xSquare*100;
        this.yReal = this.ySquare*100;
        Piece.isTurnForWhite = !Piece.isTurnForWhite;
    }

    public void removePiece() {
        pieceList.remove(this);
    }

    public void paintPiece(Graphics2D g){
        g.drawImage(pieceImage, this.xReal, this.yReal, null);
    }

    public static Piece getPiece(int x, int y) {
        for(Piece p : pieceList){
            if ((x == p.xSquare) && (y == p.ySquare)){
                return p;
            }
        }
        return null;
    }


    public void calculateLegalMoves(int x, int y) {

    }

    public boolean hasPieceMoved() {
        return this.hasPieceMoved;
    }
    public void setHasPieceMoved() {
        if (!this.hasPieceMoved) {
            this.hasPieceMoved = true;
        }
    }
}

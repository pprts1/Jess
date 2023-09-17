import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Piece {
    static Piece selectedPiece = null;
    protected int lastX = 0;
    protected int lastY = 0;
    public static List<Piece> pieceList = new LinkedList<>();
    protected String fileName;
    protected int xReal;
    protected int yReal;
    protected int xSquare;
    protected int ySquare;
    protected boolean isWhite;
    protected BufferedImage pieceImage;

    public Piece(String fileName, int xSquare, int ySquare, boolean isWhite) {
        this.fileName = fileName;
        this.isWhite = isWhite;
        this.xSquare = xSquare;
        this.ySquare = ySquare;
        this.xReal = xSquare * 100;
        this.yReal = ySquare * 100;

        try {
            if (fileName != null) {
                this.pieceImage = ImageIO.read(this.getClass().getResource(fileName));
            } else return;




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        pieceList.add(this);
    }
    public void movePiece(int x, int y) {
//        if(Piece.getPiece(x,y).xReal<0 || Piece.getPiece(x,y).yReal<0){
//            return;
//        }
        if(Piece.getPiece(x, y)!=null){
            if(Piece.getPiece(x, y).isWhite != isWhite)  {
                Piece.getPiece(x, y).removePiece();
            }else {
//                Piece.selectedPiece.xReal = Piece.selectedPiece.lastX*100;
//                Piece.selectedPiece.yReal = Piece.selectedPiece.lastY*100;
//                Piece.pieceList.add(Piece.selectedPiece);
//                Piece.selectedPiece.lastX = Piece.selectedPiece.xReal/100;
//                Piece.selectedPiece.lastY = Piece.selectedPiece.yReal/100;
//                Piece.pieceList.remove(Piece.selectedPiece);
//                Piece.pieceList.add(Piece.selectedPiece);
                  xReal = this.xSquare*100;
                  yReal = this.ySquare*100;
                return;
//                Piece.pieceList.remove(Piece.getPiece(x,y));
//                Piece.pieceList.add(Piece.getPiece(x,y));
            }
        }
        this.xSquare = x;
        this.ySquare = y;
        this.xReal = this.xSquare*100;
        this.yReal = this.ySquare*100;
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
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPanel extends JPanel {
    private final int divisorForBoardCoordinate = 100;
    private final int boardLimit = 800;
    private final int squareCentre = 50;
    private final int repaintSquare = 200;
    PaintGame paintTheGame = new PaintGame();
//    Piece selectedPiece = null;

    public MyPanel() {

        int borderThickness = 1;
        setBorder(BorderFactory.createLineBorder(Color.white, borderThickness));
        setVisible(true);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if(Piece.getPiece(e.getX()/divisorForBoardCoordinate, e.getY()/divisorForBoardCoordinate) != null) {
                    Piece.selectedPiece = Piece.getPiece(e.getX()/divisorForBoardCoordinate, e.getY()/divisorForBoardCoordinate);       /* create a helper piece to work with */
                    assert Piece.selectedPiece != null;
                    Piece.selectedPiece.lastX = e.getX()/divisorForBoardCoordinate; /* hier wird lastX definiert! */
                    Piece.selectedPiece.lastY = e.getY()/divisorForBoardCoordinate; /* hier wird lastY definiert! */
                    if (Piece.selectedPiece.isWhite == Piece.isTurnForWhite) {
                        if(!Piece.pieceList.contains(Piece.selectedPiece)){
                            Piece.pieceList.add(Piece.selectedPiece);                                  /* then the helper piece is added to the list */
                        } else {
                            Piece.pieceList.remove(Piece.selectedPiece);                               /* remove and add it to the list in order to keep it on top of other pieces */
                            Piece.pieceList.add(Piece.selectedPiece);
                        }
                        repaint();

                    } else {
                        System.out.println("it's not your turn");
                    }
                } else {
                    System.out.println("empty square");
                }
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if(Piece.selectedPiece != null) {
                    if (Piece.selectedPiece.isWhite == Piece.isTurnForWhite) {
                        if (e.getX() < 0 || e.getY() < 0 || e.getX() > boardLimit || e.getY() > boardLimit) {     // check if piece is inside the board, else return it to initial square and repaint.
                            Piece.selectedPiece.movePiece(Piece.selectedPiece.lastX, Piece.selectedPiece.lastY);
                            System.out.println("Is white: " + Piece.selectedPiece.isWhite);
                            repaint();

                        } else {              // HERE the piece makes a legal move and the board is repainted.
                            Piece.selectedPiece.calculateLegalMoves(e.getX() / divisorForBoardCoordinate, e.getY() / divisorForBoardCoordinate);  /* here I should rather call a calculation method which calculates whether the move is legal! */
                            System.out.println("Is white: " + Piece.selectedPiece.isWhite);

                            repaint();
                            Piece.selectedPiece = null;   /* this is important to unselect the piece. Otherwise it stays selected even after release */
                        }
                    }
                }
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                if(Piece.selectedPiece != null && (Piece.selectedPiece.isWhite == Piece.isTurnForWhite)){
                    Piece.selectedPiece.xReal = Math.max(-squareCentre, Math.min(Piece.MAX_RANGE-squareCentre, e.getX()-squareCentre));  // the pieces cannot be dragged beyond this boundary (from -50 to 850
                    Piece.selectedPiece.yReal = Math.max(-squareCentre, Math.min(Piece.MAX_RANGE-squareCentre, e.getY()-squareCentre));  // or the panel's height.
                    repaint(Piece.selectedPiece.xReal-squareCentre, Piece.selectedPiece.yReal-squareCentre, repaintSquare, repaintSquare);
                }
            }
        });
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(boardLimit, boardLimit);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        paintTheGame.paintInitialBoard(g2);
    }
}

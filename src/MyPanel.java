import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPanel extends JPanel {
    PaintGame paintTheGame = new PaintGame();

    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.white, 1));
        setVisible(true);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                Piece.selectedPiece = Piece.getPiece(e.getX()/100, e.getY()/100);
                Piece.selectedPiece.lastX = Piece.selectedPiece.xReal/100;
                Piece.selectedPiece.lastY = Piece.selectedPiece.yReal/100;
//                Piece.pieceList.remove(Piece.selectedPiece);
//                Piece.pieceList.add(Piece.selectedPiece);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                    Piece.pieceList.remove(Piece.selectedPiece);
                    if(Piece.selectedPiece.xReal<0 || Piece.selectedPiece.yReal<0 || Piece.selectedPiece.xReal>800 || Piece.selectedPiece.yReal>800){
                        Piece.selectedPiece.movePiece(Piece.selectedPiece.lastX, Piece.selectedPiece.lastY);
                        Piece.pieceList.add(Piece.selectedPiece);
                        repaint();
                    }else {
                        Piece.selectedPiece.movePiece(e.getX() / 100, e.getY() / 100);
                        Piece.pieceList.add(Piece.selectedPiece);

                        repaint();
                    }
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                if(Piece.selectedPiece != null){

                    Piece.selectedPiece.xReal = e.getX()-50;
                    Piece.selectedPiece.yReal = e.getY()-50;
//                    Piece.pieceList.remove(Piece.selectedPiece);
//                    Piece.pieceList.add(Piece.selectedPiece);
                    repaint(Piece.selectedPiece.xReal-50, Piece.selectedPiece.yReal-50, 200, 200);
                }
            }
        });
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 800);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        paintTheGame.paintInitialBoard(g2);
    }
}

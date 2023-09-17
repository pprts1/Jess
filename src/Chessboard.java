import java.awt.*;

public class Chessboard {
    public void paintBoard(Graphics2D g) {
        boolean isWhite=true;

        for(int y=0; y<8; y++){
            for(int x=0; x<8; x++) {
                if(isWhite) {
                    g.setColor(Color.lightGray);
                    g.drawRect(x*100, y*100, 100, 100);
                    g.fillRect(x*100, y*100, 100, 100);
                    isWhite = !isWhite;
                } else {
                    g.setColor(Color.darkGray);
                    g.drawRect(x*100, y*100, 100, 100);
                    g.fillRect(x*100, y*100, 100, 100);
                    isWhite = !isWhite;
                }
            }
            isWhite = !isWhite;
        }
    }

}

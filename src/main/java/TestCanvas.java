import java.awt.*;

public class TestCanvas extends Canvas {
    /*
    public void paint(Graphics g) {
        g.drawLine(0, 0, getWidth(), getHeight());
        g.drawLine(0, getHeight(),getWidth(), 0);
    }

     */
/*
    public void paint(Graphics g) {
        g.drawLine(0,0,getWidth()-1, getHeight()-1);
        g.drawLine(0,getHeight()-1, getWidth()-1,0);
        g.drawRect(0,0,getWidth()-1, getHeight()-1);
    }

 */
    /*
    public void paint(Graphics g) {
        g.drawRect(0, 0, getWidth()-1, getHeight()-1);
        g.drawOval(0, 0, getWidth()-1, getHeight()-1);
    }

     */
    /*
    public void paint(Graphics g) {
        g.drawString("abcdefgh", 15, 15);
        g.drawLine(15, 15, 115, 15);
    }

     */

    /*
    public void paint(Graphics g) {
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                int c = (int)((i+j)*255/6);
                g.setColor(new Color(c, c, c));
                g.fillRect(i*getWidth()/4, j*getHeight()/4, getWidth()/4, getHeight()/4);
            }
        }
    }

     */

    public void paint(Graphics g) {
        Color c = new Color(
                (int)(Math.random()*255),
                (int)(Math.random()*255),
                (int)(Math.random()*255));
        g.setColor(c);
        //g.setClip(null);
        g.fillRect(0, 0, getWidth(), getHeight());
    }



    public static void main(String arg[]) {
        Frame f = new Frame("Test frame");
        f.setSize(400, 300);
        f.add(new TestCanvas());
        f.setVisible(true);
    }
}
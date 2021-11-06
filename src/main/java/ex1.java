import java.awt.*;

public class ex1 {
    public void paint(Graphics g) {
        Color c = new Color(
                (int)(Math.random()*255),
                (int)(Math.random()*255),
                (int)(Math.random()*255));
        g.setColor(c);
        //g.setClip(null);
        g.fillRect(0, 0, 300, 300);
    }

    public static void main(String args[]) {

        

    }
}

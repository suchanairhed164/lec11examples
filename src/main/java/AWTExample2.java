import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AWTExample2 {

    AWTExample2() {

        Frame f = new Frame();

        Label l = new Label("LABEL:");

        Button b = new Button("BUTTON");

        TextField t = new TextField();

        l.setBounds(20, 80, 80, 30);
        t.setBounds(20, 100, 80, 30);
        b.setBounds(100, 100, 80, 30);

        f.add(b);
        f.add(l);
        f.add(t);

        f.setSize(400,300);

        f.setTitle("FRAME NAME");

        f.setLayout(null);

        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public static void main(String args[]) {

        AWTExample2 awt_obj = new AWTExample2();

    }

}    
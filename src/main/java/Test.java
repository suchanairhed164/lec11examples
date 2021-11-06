import java.awt.*;
import java.awt.event.*;



public class Test {
    
    public static void main(String args[]) {

        Frame frame = new Frame("Test Action");
        frame.setSize(400, 300);
        Panel p = new Panel();
        frame.add(p);
        Button save = new Button("Save");
        save.addActionListener(
                new SaveButtonListener(frame));
        p.add(save);

        frame.setVisible(true);
    }
}

class SaveButtonListener
        implements ActionListener {
    private Frame parent;
    public SaveButtonListener(Frame parentFrame)
    {
        parent = parentFrame;
    }
    public void actionPerformed(ActionEvent e)
    {
        /*
        FileDialog fd = new FileDialog(parent,
                "Save file", FileDialog.SAVE);
        fd.setVisible(true);
        System.out.println(fd.getDirectory()+
                fd.getFile());

         */

        System.out.println("GIT GUT");
    }
}

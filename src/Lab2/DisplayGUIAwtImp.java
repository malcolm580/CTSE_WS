package Lab2;

import java.awt.Frame;
import java.awt.Label;
import java.awt.BorderLayout;

public class DisplayGUIAwtImp implements DisplayGUI {

    private Frame frame;
    private Label label;

    public DisplayGUIAwtImp(){
        frame = new Frame();
        label = new Label();
        frame.add(label, BorderLayout.CENTER);
        frame.setSize(50 , 50);
        frame.setVisible(true);
    }

    @Override
    public void setText(String time) {
       label.setText(time);
       label.repaint();
    }
}

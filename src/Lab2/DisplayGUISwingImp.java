package Lab2;

import java.awt.*;
import javax.swing.*;

class DisplayGUISwingImp implements DisplayGUI
{
	private JFrame frame;
	private JLabel label;

	public DisplayGUISwingImp()
	{
		frame = new JFrame();
    	label = new JLabel();
    	label.setText("12:00:30");
    	frame.getContentPane().add(label,BorderLayout.CENTER);
    	frame.setSize(50,50);
    	frame.show();
	}

	@Override
	public void setText(String time) {
		label.setText(time);
		label.repaint();
	}
}


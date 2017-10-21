package Lab2;//import java.awt.Frame;
//import java.awt.Label;
//import java.awt.BorderLayout;

import java.util.Calendar;
import java.text.DecimalFormat;

public class Clock extends Thread {
    private DecimalFormat tflz, tf;
    //  private Frame frame;
    //  private Label label;
    private DisplayGUI display;

    public Clock(String ClassName) {

        //    frame = new Frame();
        //    label = new Label();
        //    frame.add(label,BorderLayout.CENTER);
        //    frame.setSize(50,50);
        //    frame.show();

        tf = new DecimalFormat("#0");
        tflz = new DecimalFormat("00");

        try {
            display = (DisplayGUI) Class.forName(ClassName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {
            while (true) {
                Calendar calendar = Calendar.getInstance();
                StringBuffer buf = new StringBuffer();
                buf.append(tf.format(calendar.get(Calendar.HOUR)));
                buf.append(':');
                buf.append(tflz.format(calendar.get(Calendar.MINUTE)));
                buf.append(':');
                buf.append(tflz.format(calendar.get(Calendar.SECOND)));
                //        label.setText(buf.toString());
                //        label.repaint();
                display.setText(buf.toString());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


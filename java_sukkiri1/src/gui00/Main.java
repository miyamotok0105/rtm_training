package gui00;

import java.awt.*;
import java.awt.event.*;

class Main extends WindowAdapter {
    public static void main(String args[]) {
        new Main().start();
    }
    private void start() {
        Frame frame = new Frame();
        frame.setSize(300 , 150);
        frame.setVisible(true);
        frame.addWindowListener(this);
    }
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
//
//public class Main {
//    public static void main(String[] args) {
//
//    }
//}

package DbCon;

import DbCon.menu.Menu;

import javax.swing.*;

public class Main extends JFrame{

    public static void main(String[] args) {
        final JFrame frame = new JFrame("Abd");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                (new Menu()).createPanelUI(frame.getContentPane());

                frame.pack();
                frame.setVisible(true);
                frame.setResizable(true);
            }
        });
    }
}

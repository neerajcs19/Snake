package mypackage;

import mypackage.Board;

import javax.swing.*;

public class Snake extends JFrame {
    public Snake() {
        initUI();
    }
    private void initUI() {
        add(new Board());
        setResizable(false);
        pack();

        setTitle("mypackage.Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

//  * ID : 6206021622143
//  * Name : PUNTIRA   SORNBOONTHONG
//  * Room : 3RB
//  * File Name : AnimationPanel.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class AnimationPanel extends JPanel implements ActionListener {
    private Timer time;
    private Picture ufo = new Picture();
    private int amount = 0;

    public AnimationPanel() {
        super();
        this.time = new Timer(30, this);
        this.setPreferredSize(new Dimension(970, 590));
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.setVisible(true);
    }

    public void start() {
        this.time.start();
    }

    public void stop() {
        this.time.stop();
    }

    public void setAmount(int num) {
        this.amount = num;
        this.ufo.setAmountUfo(this.getAmount());
        paintComponent(getGraphics());
    }

    public int getAmount() {
        return this.amount;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(getGraphics());
        if (this.amount != 0) {
            this.ufo.create_ufo(this, getGraphics());
        }
    }

    public void actionPerformed(ActionEvent e) {
        paintComponent(getGraphics());
    }

}
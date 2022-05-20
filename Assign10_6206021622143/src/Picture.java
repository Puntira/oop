//  * ID : 6206021622143
// * Name : PUNTIRA   SORNBOONTHONG
// * Room : IT3RC
// * File Name : Picture.java

import javax.swing.*;
import java.awt.*;

public class Picture extends Point {
    private ImageIcon ufo[];
    private int PopUfo[][];

    public void setAmountUfo(int amount) {
        this.ufo = new ImageIcon[amount];
        this.PopUfo = new int[amount][3];
        for (int i = 0; i < amount; i++) {
            this.ufo[i] = new ImageIcon("img/ufo.png");
            this.PopUfo[i][0] = this.getX();
            this.setY((int) Math.floor(Math.random() * 500));
            this.PopUfo[i][1] = this.getY();
            this.setSpeed((int) Math.floor(Math.random() * 5) + 1);
            this.PopUfo[i][2] = this.getSpeed();
        }
    }

    public void create_ufo(JPanel panel, Graphics g) {
        for (int i = 0; i < ufo.length; i++) {
            this.ufo[i].paintIcon(panel, g, this.PopUfo[i][0] += this.PopUfo[i][2], this.PopUfo[i][1]);
            if (this.PopUfo[i][0] > 970) {
                this.setX(0);
                this.PopUfo[i][0] = this.getX();
                ;
            }
        }
    }

}
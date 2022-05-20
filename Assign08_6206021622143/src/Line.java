
/* Name : ภัณฑิรา ศรบุญทอง
 * Id : 6206021622143
 * Room : IT3RC
 * File name :Line.java
*/

import java.awt.*;
import java.util.Random;

public class Line {
    private int size[] = new int[4];
    Random rand = new Random();

    public Line(Graphics g) {
        for (int i = 0; i < size.length; i++) {
            Point p = new Point();
            p.set_x(this.rand.nextInt(1024));
            this.size[i] = p.get_x();
        }
        g.setColor(new Color(this.rand.nextInt(255), this.rand.nextInt(255), this.rand.nextInt(255)));
        g.drawLine(this.size[0], this.size[1], this.size[2], this.size[3]);
    }

}
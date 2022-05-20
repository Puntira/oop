/* Name : ภัณฑิรา ศรบุญทอง
 * Id : 6206021622143
 * Room : IT3RC
 * File name : Rectangle.java
*/

import java.awt.*;
import java.util.Random;

public class Rectangle {
    int size[] = new int[4];
    Random rand = new Random();

    public Rectangle(Graphics g) {
        Point p = new Point();
        p.set_x(this.rand.nextInt(950 / 2));
        p.set_y(this.rand.nextInt(650 / 2));
        p.set_height(this.rand.nextInt(650));
        p.set_width(this.rand.nextInt(950));

            this.size[0] = p.get_x();
            this.size[1] = p.get_y();
            this.size[2] = p.get_height();
            this.size[3] = p.get_width();

        g.setColor(new Color(this.rand.nextInt(255), this.rand.nextInt(255), this.rand.nextInt(255)));
        g.drawRect(this.size[0], this.size[1], this.size[2], this.size[3]);
    }
}
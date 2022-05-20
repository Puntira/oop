/* Name : ภัณฑิรา ศรบุญทอง
 * Id : 6206021622143
 * Room : IT3RC
 * File name :Line.java
*/

import java.awt.*;


public class Line extends Point  {

    
    private Color color;
    private Point point = new Point();

    public Line(){
        super(0,0);
        this.point.setXY(0,0);
        setColor(Color.RED);
    }

    public Line(int x, int y, int x2, int y2) {
        super(x, y);
        this.point.setXY(x2,y2);
        setColor(Color.RED);
    }

    public void display(Graphics g){
        
        g.setColor(this.color);
        g.drawLine(super.getX(), super.getY(), point.getX(), point.getY());
       
    }

    public void setLine(int x, int y, int x2, int y2){
        super.setXY(x,y);
        this.point.setXY(x2,y2);
    }

    public void setLineStart(int x, int y){
        super.setXY(x,y);
    }

    public void setLineEnd( int x2, int y2){
        this.point.setXY(x2,y2);;
        
    }

    public void setColor(Color color){
        this.color = color;
    }
   
    public String toString(){
        String str = "";
        str += "(x1,y1) = (" + super.getX() + "," + super.getY() + ")\n" + "(x2,y2) = (" + point.getX() + "," + point.getY() + ")\n";
        str += "Color = " + this.color;
        return str;
    }

    

}
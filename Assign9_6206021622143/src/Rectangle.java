/* Name : ภัณฑิรา ศรบุญทอง
 * Id : 6206021622143
 * Room : IT3RC
 * File name :Rectangle.java
*/
import java.awt.*;

public class Rectangle extends Point {

    private int width, height;
    private Color color;
   

    public Rectangle(){
        super(0,0);
        setWidth(10);
        setHeight(10);
        setColor(Color.RED);
    }

    public Rectangle(int x, int y, int width, int height){
        super(x, y);
        setWidth(width);
        setHeight(height);
        setColor(Color.RED);
    }

    public void setRectangle(int x, int y, int width, int height){
        super.setXY(x,y);
        setWidth(width);
        setHeight(height);
    }

    public void display(Graphics g){
        g.setColor(color);
        g.drawRect(super.getX(), super.getY(), this.width, this.height);
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public void setColor(Color color){
        this.color = color;
    }
   

    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
   
    public String toString(){
        String str = "";
        str += super.toString()+'\n';
        str += "width="+this.width+", height="+this.height+'\n';
        str += "Color = "+this.color;
        return str;
    }



}









/* Name : ภัณฑิรา ศรบุญทอง
 * Id : 6206021622143
 * Room : IT3RC
 * File name :Circle.java
*/
import java.awt.*;
public class Circle extends Point {
    private int diameter;
    private Color color;
   
    public Circle(){

        super(0, 0);
        setDiameter(5);
        setColor(Color.RED);
    
    }

    public Circle(int x, int y, int diameter){
        super(x, y);
        setDiameter(diameter);
        setColor(Color.RED);
      
    }

    public void setCircle(int x, int y, int diameter){
        super.setXY(x, y);
        setDiameter(diameter);
    }

    public void display(Graphics g){
       
        g.setColor(this.color);
        g.drawOval(super.getX(), super.getY(), this.diameter, this.diameter);
        
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public void setColor(Color color){
        this.color = color;
    }
   
    public int getDiameter(){
        return this.diameter;
    }
    public String toString(){
        String str = "";
        str += super.toString() + '\n';
        str += "Diameter = " + this.diameter+'\n';
        str += "Color = " + this.color;
        return str;
    }
    

}


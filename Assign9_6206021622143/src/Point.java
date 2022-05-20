/* Name : ภัณฑิรา ศรบุญทอง
 * Id : 6206021622143
 * Room : IT3RC
 * File name :Point.java
*/
public class Point {
    private int x,y;

    public Point(){
        setX(0);
        setY(0);
        
    }
    public Point(int x, int y){
        setX(x);
        setY(y);
    }
   

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x, int y){
        setX(x);
        setY(y);
    }
  

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public String toString(){
        String str = "";
        str += "(x,y) = (" + x + "," + y + ")";
        return str;
    }

}



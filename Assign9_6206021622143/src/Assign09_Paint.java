
/* Name : ภัณฑิรา ศรบุญทอง
 * Id : 6206021622143
 * Room : IT3RC
 * File name :Assign09_Paint.java
*/
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Assign09_Paint extends JFrame implements MouseListener, KeyListener {

    private int width = 800 , height = 600;
    private Line line;
    private Circle circle;
    private Rectangle rect;
    private char type = 'L';
    private String shape = "Line";
    private Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.PINK};
    private Random rnd;

    
    public Assign09_Paint() {
        super("Assign09 Paint ");
        line = new Line();
        circle = new Circle();
        rect = new Rectangle();
        rnd = new Random();
        setSize(this.width, this.height);
        setFocusable(true);
        setFont(new Font("Arial", Font.BOLD,25));
        setForeground(Color.BLUE);
        addKeyListener(this);
        addMouseListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Shape : " + this.shape , 10, 50);
        if(type == 'L'){
            this.line.display(g);    
        }else if(type == 'R'){
            this.rect.display(g);
        }else if(type == 'C'){
            this.circle.display(g);
        }
    }



    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        if(e.getKeyChar() == 'L' || e.getKeyChar() == 'l'){
            type = 'L';
            shape = "Line";
        }else if(e.getKeyChar() == 'R' || e.getKeyChar() == 'r') {
            type = 'R';
            shape = "Rectangle";
        }else if(e.getKeyChar() == 'C' || e.getKeyChar() == 'c') {
            type = 'C';
            shape = "Circle";
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
      repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int numRnd = rnd.nextInt(5);
       int x = e.getX(), y = e.getY();
        if(type == 'L'){
            line.setLineStart(x, y);
            line.setColor(colors[numRnd]);
        }else if(type == 'R'){
            rect.setXY(x, y);
            rect.setColor(colors[numRnd]);
        }else if(type == 'C'){
            circle.setXY(x, y);
            circle.setColor(colors[numRnd]);
        }
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       int x = e.getX(), y = e.getY();

        if(type == 'L'){
            line.setLineEnd(x,y);
        }else if(type == 'R'){
            int x1 = rect.getX(), y1 = rect.getY();
            int px = Math.min(x1,x);
            int py = Math.min(y1,y);
            int pw = Math.abs(x1-x);
            int ph = Math.abs(y1-y);
            rect.setRectangle(px, py, pw, ph);
        }else if(type == 'C'){
            int x1 = circle.getX(), y1 = circle.getY();
            int w = Math.abs(x1-x);
            int h = Math.abs(y1-y);
            int m = (int)(Math.pow(w,2) + Math.pow(h,2));
            int d = (int)(Math.sqrt(m));
            circle.setDiameter(d);            
        }
        repaint();
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    public static void main(String[] args) throws Exception {
        new Assign09_Paint();
    }

}

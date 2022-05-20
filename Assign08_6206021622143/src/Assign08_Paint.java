/* Name : ภัณฑิรา ศรบุญทอง
 * Id : 6206021622143
 * Room : IT3RC
 * File name :Assign08_Paint.java
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class Assign08_Paint extends JFrame implements ActionListener {
    Container c;
    JPanel panelMenu, panelResult;
    JButton[] btn = new JButton[4];
    String[] txt = { "Line", "Rectangle", "Circle", "Exit" };
    int status = 0;

    public static void main(String[] args) {
        new Assign08_Paint();
    }

    public Assign08_Paint() {
        super("Paint 0.1");
        this.c = getContentPane();
        this.c.setLayout(new FlowLayout());

        this.panelMenu();
        this.panelResult();
        setSize(1024, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn[0])
            status = 1;
        else if (event.getSource() == btn[1])
            status = 2;
        else if (event.getSource() == btn[2])
            status = 3;
        else if (event.getSource() == btn[3])
            status = 4;
        repaint();
    }

    public void panelMenu() {
        this.panelMenu = new JPanel();
        this.panelMenu.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 10));
        for (int i = 0; i < btn.length; i++) {
            this.btn[i] = new JButton(txt[i]);
            this.btn[i].addActionListener(this);
            this.panelMenu.add(this.btn[i]);
        }
        this.c.add(this.panelMenu);
    }

    public void panelResult() {
        this.panelResult = new JPanel();
        this.panelResult.setPreferredSize(new Dimension(950, 650));
        this.panelResult.setBorder(new LineBorder(Color.GRAY, 1));

        this.c.add(this.panelResult);
    }

    public void paint(Graphics g) {
        super.paint(g);
        switch (this.status) {
            case 1:
                new Line(panelResult.getGraphics());
                this.status = 0;
                break;
            case 2:
                new Rectangle(panelResult.getGraphics());
                this.status = 0;
                break;
            case 3:
                new Circle(panelResult.getGraphics());
                this.status = 0;
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
    }

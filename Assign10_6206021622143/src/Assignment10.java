//  * ID : 6206021622143
//  * Name : PUNTIRA   SORNBOONTHONG
//  * Room : IT3RC
//  * File Name : Assignment10.java

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Assignment10 extends JFrame implements ActionListener {
   JButton btn[] = new JButton[3];
   JPanel panelMenu;
   String txt[] = { "Play", "Stop", "Set Max" };
   int x[] = { 330, 430, 530 };
   JLabel label;
   Font font = new Font("Arial", Font.BOLD, 15);
   AnimationPanel AniPanel;

   public Assignment10() {
      super("Assignment 10 : Animation Picture");
      super.setLayout(new FlowLayout());
      this.panelMenu = new JPanel(new BorderLayout());
      this.panelMenu.setPreferredSize(new Dimension(970, 60));
      this.panelMenu.setLayout(null);
      this.panelMenu.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      for (int i = 0; i < this.btn.length; i++) {
         this.btn[i] = new JButton(this.txt[i]);
         this.btn[i].setBounds(x[i], 5, 100, 50);
         this.btn[i].addActionListener(this);
         this.btn[i].setFont(this.font);
         this.panelMenu.add(this.btn[i]);
      }
      this.label = new JLabel(" Max : 0 ");
      this.label.setBounds(750, 20, 100, 20);
      this.label.setFont(this.font);
      this.panelMenu.add(this.label);
      this.add(this.panelMenu, BorderLayout.PAGE_START);
      this.add(this.AniPanel = new AnimationPanel());
      this.setSize(1000, 700);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == btn[2]) {
         this.AniPanel.setAmount((int) Math.floor(Math.random() * 21));
         this.label.setText(" Max : " + this.AniPanel.getAmount());
      } else if (e.getSource() == btn[0]) {
         this.AniPanel.start();
      } else if (e.getSource() == btn[1]) {
         this.AniPanel.stop();
      }

   }

   public static void main(String[] args) {
      new Assignment10();
   }
}
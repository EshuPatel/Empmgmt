
package empmgmt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Splash extends JFrame implements ActionListener {
    
    Splash() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        this.setSize(new Dimension(1800, 600));
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setPreferredSize(new Dimension(200, 50));
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 50, 1500, 00);
        add(image);
        
        JButton clickhere = new JButton("CONTINUE >>>");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        setSize(new java.awt.Dimension(1000, 699));
        setLocation(200, 50);
        pack();
        setVisible(true);
        
        while(true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                }
            
            heading.setVisible(true);
            try {
                Thread.sleep(1500);
            } catch (Exception e){ 
             }
        }
}
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]) {
        new Splash();
    }
}

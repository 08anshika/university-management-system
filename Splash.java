package university. management. system;
// string method java k extended versions mein ata h
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    
    //declare thread class
    Thread t;
    //constructor creation 
    Splash () {
        //frame k upper image lagane k liye imageicon use hota h
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        //humko image jo ki frame k upper lag gye hai use resize krna hai 
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        //is step mein hum image class ko vapis se image icon mein convert krna hoga
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        // imageicon ko hum direct add k andar place nhi kr skte
        add(image);
        
        //create thread object method of multithreading
        
        t = new Thread(this);
        t.start();
        
        setVisible(true);
        //ye condition humne apne frame ko chote se bada krne k liye lgaye hai means ik type ka animation 
        int x = 1;
        for (int i = 2; i <= 600; i+=4, x+=1) {
            setLocation(600 - ((i + x)/2), 350 - (i/2));
            setSize(i + 3*x, i + x/2);
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }        
    }
    
    public void run() {
        try {
            //this statement is used to automatically close the frame
            Thread.sleep(7000);
            setVisible(false);
            
            // Next Frame
            new Login();
        } catch (Exception e) {
            
        }
    }
    
    public static void main(String[] args) {
        //create a  object
        new Splash();
    }
}

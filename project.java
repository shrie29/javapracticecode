import javax.swing.*;
import java.awt.*;

public class project {
    public static void main(String[]args){
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

     //   frame.setSize(500,300);
       // frame.setLocation(100,100);
        frame.setBounds(100,100,500,300);
        frame.setTitle("shriesh prompt");
ImageIcon icon= new ImageIcon("C:\\Users\\Acer\\OneDrive\\Pictures\\IMG_20221227_142614498");
frame.setIconImage(icon.getImage());
//frame.setResizable(false);
        Container c=frame.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);
    }
}


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

public class lesson_2_Login_Window {
    public static void main(String[] args) {
        
        //configuring frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        //frame.setVisible(true);

        //configuring container
        Container container = frame.getContentPane();
        container.setLayout(null);

        //setting a new text style
        Font f = new FontUIResource("Papyrus",Font.BOLD,30);

        //Creating a new textfield
        JTextField tField = new JTextField();
        tField.setBounds(100,50,200,45);
        tField.setFont(f);
        tField.setText("Avatar");
        tField.setBackground(Color.gray);
        tField.setForeground(Color.BLACK);
        
        //Adding the text field in the container
        container.add(tField);

        frame.setVisible(true);
    }
}

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.plaf.FontUIResource;

/**
 * Java swing and awt are java libraries for creating windows related applications
 * The contain a class called Jframe which is used to make the windows.
 */
public class lesson1 {

    public static void main(String[] args) {
        
        //Makes a new frame AKA window..
        JFrame frame = new JFrame();

        //This allows the frame window to pop up as its value is false by default
        frame.setVisible(true);

        //this allows the frame to close when clicked on the close button.
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //This is to give size to the frame.
        //frame.setSize(600,700);

        //This determines the location where the frame appears when the app is opened.
        //frame.setLocation(100,50);

        //This is the combination of setLocation and setSize method respectively
        frame.setBounds(100,100,1000,500);
        
        //This statement sets the Title of the frame aka name of the app or the current window
        frame.setTitle("My first frame");

        //This class makes an object of image and gives the object the passed image
        ImageIcon icon = new ImageIcon("business-person.png");

        //This statement sets the icom image of the frame to he image passed in the icon.
        frame.setIconImage(icon.getImage());

        //This statement gets the content area of the frame and passes it to the container object.
        Container container = frame.getContentPane();

        //This statement changes the color of the container to dark gray.
        container.setBackground(Color.GRAY);

        //This statement will delete all the layouts in the container
        container.setLayout(null);

        //This statement will set the location and the size of the container.
        container.setBounds(0, 0, 1000, 500);

        //This statement assgins the string avatar to the label which object of JLabel 
        //JLabel is a label used to display text or image.
        JLabel label = new JLabel("Businessman",icon,SwingConstants.RIGHT);

        //This label stores an image in it.
        JLabel imagelabel = new JLabel(icon);

        //This statement sets the bounds for the label
        label.setBounds(0,50,500,250);
        
        //This statement defines the properties of object font of Font class.
        Font font = new FontUIResource("Papyrus", Font.CENTER_BASELINE, 45);

        //This statement changes the content of the label which is text.
        // label.setText("Avatar");

        //This statement sets the font propeties of label object to the propeties of font object
        label.setFont(font);

        //This statement adds the label object in the container.
        //Here this will display the contents of the lable in the frame pane area.
        container.add(label);
    }
}
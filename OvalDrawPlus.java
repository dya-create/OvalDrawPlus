import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container; 
import java.awt.Color;

class Oval extends JPanel {

    static final Color RECT_COLOR = new Color (0,0,204);
    private Color myColor;
    public void setColor(int red, int green, int blue) {
        myColor = new Color(red, green, blue);
    }
    public Color getColor() {
        return myColor;
    }

    Oval() {
        setColor(0, 0, 255);
    }

    Oval(int red, int green, int blue) {
        setColor(red, green, blue);
    }
    
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        g.setColor(RECT_COLOR);
        g.fillRect(0, 0, panelWidth, panelHeight);

        g.setColor(myColor);
        g.fillOval(0, 0, panelWidth, panelHeight);

    }
}

class OvalDrawPlusFrame extends JFrame {
    OvalDrawPlusFrame() {
       
        setTitle("OvalDrawPlus");
        setSize(400, 500); // 400 pixels across, 500 down
        setBounds(150,250,400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 

        Oval myOval = new Oval(0,255,51);
        Container contentPane = getContentPane();
        contentPane.add(myOval);          
        
    }
}

public class OvalDrawPlus {

    public static void main(String[] args) {
       
        System.out.println("Starting OvalDrawPlus...");
        OvalDrawPlusFrame myWindow = new OvalDrawPlusFrame(); // Title
        
        myWindow.setVisible(true);
        System.out.println("closing OvalDrawPlus...");

   
    }

}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame{
    private JPanel panel1;
    private JPanel welcome;
    private JCheckBox burgerCheckBox;
    private JCheckBox pizzaCheckBox;
    private JCheckBox iceTeaCheckBox;
    private JCheckBox mineralWaterCheckBox;
    private JLabel Price;
    private JLabel pricedrink;
    private JLabel Welcome;

    public Form(){
        setContentPane(welcome);
        setTitle("ALOHA");
        setSize(450,300);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {

        Form myform = new Form();
    }
}

import javax.swing.*;

public class Form extends JFrame{
    private JPanel panel1;
    private JPanel welcome;
    private JLabel Apps;
    private JButton resetButton;
    private JButton calculateButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
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

import javax.swing.*;

public class Receipt extends JFrame{
    private JTextArea ReceiptText;
    private JButton backButton;
    private JPanel ReceiptForm;

    public Receipt() {
        setContentPane(ReceiptForm);

        setTitle("Bills");

        setSize(450,300);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        Receipt myReceiptForm = new Receipt();
    }
}

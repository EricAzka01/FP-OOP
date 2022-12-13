import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == backButton){
                    Form myform1 = new Form();

                }
            }
        });
//        ReceiptText.setText(
//                "GRAND TOTAL\n" + "Burger = 15.00 * " + burger +
//
//       );
    }

    public static void main(String[] args) {

        Receipt myReceiptForm = new Receipt();
    }
}

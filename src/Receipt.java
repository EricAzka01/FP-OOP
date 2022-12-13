import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

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

        try {
            File data = new File ("data.txt");
            Scanner dataScanner = new Scanner(data);
            while (dataScanner.hasNextLine()) {
                String[] keyValue = dataScanner.nextLine().split(":");
                ReceiptText.setText(

                      "---TOTAL---\n" + "Burger Price: " + keyValue[0] + "\nPizza Price: " + keyValue[1] + "\nWater Price: "
                             + keyValue[2] + "\nCola Price: " + keyValue[3] + "\nGrand Total: " + keyValue[4]
                );
            }
            dataScanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Receipt myReceiptForm = new Receipt();
    }
}

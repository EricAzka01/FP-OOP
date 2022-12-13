import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Form extends JFrame{
    private JPanel panel1;
    private JPanel welcome;
    private JLabel Apps;
    private JTextField nburger;
    private JTextField npizza;
    private JTextField nwater;
    private JTextField ncola;
    private JTextField nresult;
    private JButton resetButton;
    private JButton calculateButton;
    private JButton resetButton1;
    private JButton calculateButton1;
    private JButton receiptButton;
    private JLabel Welcome;

    double burgerdefault, pizzadefault, coladefault, waterdefault, burger, pizza, cola, water, result;
    private final File data = new File("data.txt");


    public Form() {
        setContentPane(welcome);
        setTitle("WELCOME!");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        calculateButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Burger = 15.00
                //Pizza = 10.00
                //Water = 2.00
                //Cola = 3.00


                burgerdefault = 15.00;
                pizzadefault = 10.00;
                coladefault = 3.00;
                waterdefault = 2.00;

                //Casting or Conversion
                burger = Double.parseDouble(nburger.getText());
                pizza = Double.parseDouble(npizza.getText());
                cola = Double.parseDouble(ncola.getText());
                water = Double.parseDouble(nwater.getText());

                result = (burgerdefault * burger) + (pizzadefault * pizza) + (coladefault * cola) + (waterdefault * water);

                nresult.setText(String.valueOf(result));
            }
        });
        resetButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nburger.setText("");
                npizza.setText("");
                nwater.setText("");
                ncola.setText("");
                nresult.setText("");
            }
        });
        receiptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == receiptButton){
                    new Thread(() -> {
                        try {
                            FileWriter fileWriter = new FileWriter(data, true);
                            PrintWriter printWriter = new PrintWriter(fileWriter, false);

                            double a = burger*burgerdefault;
                           String str = Double.toString(a);
                           double b = pizza * pizzadefault;
                            String str1 = Double.toString(b);
                            double c = water * waterdefault;
                            String str2 = Double.toString(c);
                            double d = cola * coladefault;
                            String str3 = Double.toString(d);
                            String str4 = Double.toString(result);

                            printWriter.println(str + ":" + str1 + ":" + str2 + ":" + str3 + ":"  + str4);

                            printWriter.close();
                        } catch (Exception ignored) {
                            ignored.printStackTrace();
                        }
                    }).start();

                    Receipt receiptForm = new Receipt();
                }


            }
        });

    }



    public static void main(String[] args) {

        Form myform = new Form();
    }
}

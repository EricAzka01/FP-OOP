import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JLabel Welcome;

    public Form() {
        setContentPane(welcome);
        setTitle("ALOHA");
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
                double burgerdefault, pizzadefault, coladefault, waterdefault, burger, pizza, cola, water, result;

                burgerdefault = 15.00;
                pizzadefault = 10.00;
                coladefault = 3.00;
                waterdefault = 2.00;

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
    }

    public static void main(String[] args) {

        Form myform = new Form();
    }
}

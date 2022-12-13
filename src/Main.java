/*
PBO Final Exam - Eric Azka Nugroho 5025211064

Casting/Conversion (Parsing String into Double)
Constructor (In every class)
Overloading
Overriding (In Menu)
Encapsulation (Employee Name and Password)
Inheritance
Polymorphism
ArrayList (List of Employee)
Exception Handling (Try and Catch)
GUI (Form)
Interface (Menu)
Abstract Class
Generics (In Employee)
Collection
Input Output (Form)


*/


public class Main{
    Food burger = new Food("Burger", 15.00);
    Food pizza = new Food("Pizza", 10.00);
    Food water = new Food("Water", 2.00);
    Food cola = new Food("Cola", 3.00);

    public static void main(String[] args) {

        try {
            Menu.restaurant myrestaurant = new Menu.restaurant();

            Form myform = new Form();

            System.out.println("Employee Who's Taking Your Order: ");
            Employee.employeee<String> employee1 = new Employee.employeee<String>("Bobby\n");
            System.out.println(employee1.getEmployeename());

            myrestaurant.food();
            myrestaurant.drinks();
        }
            catch(Exception e){
                System.out.println("Case of Exception: " + e);
            }
        }


    }







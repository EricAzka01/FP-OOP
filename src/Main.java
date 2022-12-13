/*
PBO Final Exam - Eric Azka Nugroho 5025211064

Casting/Conversion (Parsing String into Double)
Constructor (In every class)
Overloading
Overriding (In Menu)
Encapsulation (Employee Name and Password)
Inheritance (MenuDrinks)
Polymorphism
ArrayList (List of Employee)
Exception Handling (Try and Catch)
GUI (Form)
Interface (Menu)
Abstract Class (Menu Drinks)
Generics (In Employee)
Collection
Input Output (Form)


*/


public class Main{

    public static void main(String[] args) {

        try {
            MenuFood.restaurant myrestaurant = new MenuFood.restaurant();

            Form myform = new Form();
            drink mydrinks = new drink();

            System.out.println("Employee Who's Taking Your Order: ");
            Employee.employeee<String> employee1 = new Employee.employeee<String>("Bobby\n");
            System.out.println(employee1.getEmployeename());

            myrestaurant.food();
            mydrinks.drinks();

        }
            catch(Exception e){
                System.out.println("Case of Exception: " + e);
            }
        }



}







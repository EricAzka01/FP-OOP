/*
PBO Final Exam - Eric Azka Nugroho 5025211064

Casting/Conversion (Parsing String into Double)
Constructor (In every class)
Overloading (DrinksDescription and FoodDescription)
Overriding (In Menu)
Encapsulation (Employee Name and Password)
Inheritance (MenuDrinks)
Polymorphism (DrinksDescription and FoodDescription)
ArrayList (List of Employee)
Exception Handling (Try and Catch)
GUI (Form)
Interface (Menu)
Abstract Class (Menu Drinks)
Generics (In Employee)
Collection (WELCOME)
Input Output (Form)


*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{

    public static void main(String[] args) {

            MenuFood.restaurant myrestaurant = new MenuFood.restaurant();
            DrinksDescription mydrinksdesc = new DrinksDescription();
            DrinksDescription mycola = new Cola();
            DrinksDescription mywater = new Water();
            FoodDescription myfooddesc = new FoodDescription();
            FoodDescription myburger = new Burger();
            FoodDescription mypizza = new Pizza();

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("W");
        list1.add("E");
        list1.add("L");
        list1.add("C");
        list1.add("O");
        list1.add("M");
        list1.add("E");
        System.out.println(" " + list1);
        Collections.sort(list1);

            Form myform = new Form();
            drink mydrinks = new drink();

            System.out.println("List of Employee: \n");
            ArrayList<String> MyEmployeeArray = new ArrayList<>
                    (List.of("Bobby", "Tony", "Bob\n"));

            MyEmployeeArray.forEach(employeelist -> {
                System.out.println(employeelist);
            });

            System.out.println("Employee Who's Taking Your Order: ");
            Employee.employeee<String> employee1 = new Employee.employeee<String>("Bobby\n");
            System.out.println(employee1.getEmployeename());
        System.out.println("--------------\n");

            myrestaurant.food();
        System.out.println("--------------\n");
            myfooddesc.FoodDesc();
            myburger.FoodDesc();
            mypizza.FoodDesc();
        System.out.println("--------------\n");
            mydrinks.drinks();
        System.out.println("--------------\n");
            mydrinksdesc.DrinksDesc();
            mywater.DrinksDesc();
            mycola.DrinksDesc();

        }

        }










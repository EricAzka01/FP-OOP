/*
PBO Final Exam - Eric Azka Nugroho 5025211064

Casting/Conversion
Constructor
Overloading
Overriding
Encapsulation
Inheritance
Polymorphism
ArrayList
Exception Handling
GUI
Interface
Abstract Class
Generics
Collection
Input Output


*/

import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {


        System.out.println("Welcome to My Restaurant!\n");
        System.out.println("What Day is Today? 1. Monday 2. Tuesday 3. Wednesday 4. Thursday 5. Friday 6. Saturday 7. Sunday\n");
        Scanner input = new Scanner(System.in);

        try {
            int input1 = Integer.parseInt(input.nextLine());
            // if(input1 != 1 || input1 != 2 || input1 != 3 || input1 != 4 || input1 != 5 || input1 != 6 || input1 != 7 ){
            //     System.out.println("Wrong Input");
            //  }
            if (input1 == 5) {
                System.out.println("In Friday, we have discount for our Foods!\n");
                System.out.println("What are you going to order? 1. Food 2. Drinks\n");
                Scanner inputbaru = new Scanner(System.in);
                int input2 = Integer.parseInt(inputbaru.nextLine());
                if (input2 == 1) {
                    System.out.println("List of Food = 1. Burger 2. Pizza\n");
                    Scanner input3 = new Scanner(System.in);
                    int input4 = Integer.parseInt(input3.nextLine());
                    if (input4 == 1) {
                        Food food1 = new Food("Burger", (double) 15.00, "Burger with original meat!", (double) 3.00);
                        System.out.println(food1.PrintValueDiscount());
                    } else if (input4 == 2) {
                        Food food1 = new Food("Pizza", (double) 10.00, "Pizza with Meatballs!", (double) 2.00);
                        System.out.println(food1.PrintValueDiscount());
                    } else {
                        System.out.println("Wrong Input!");
                    }
                    if (input2 == 2) {
                        System.out.println("List of Drinks = 1. Water 2. Cola\n");
                        Scanner inputbaru2 = new Scanner(System.in);
                        int input5 = Integer.parseInt(inputbaru2.nextLine());
                        if (input5 == 1) {
                            Drinks drinks1 = new Drinks("Water", (double) 2.00, "Mineral Water!", "We only have medium size");
                            System.out.println(drinks1.PrintValue());
                        } else if (input5 == 2) {
                            Drinks drinks2 = new Drinks("Cola", (double) 3.00, "Refreshing!", "We only have small size");
                            System.out.println(drinks2.PrintValue());
                        } else {
                            System.out.println("Wrong Input!");
                        }

                    }
                    if (input1 == 1 || input1 == 2 || input1 == 3 || input1 == 4 || input1 == 6 || input1 == 7) {
                        System.out.println("Other than Friday, we dont have discount\n");
                        System.out.println("What are you going to order? 1. Food 2. Drinks\n");
                        Scanner inputbaru10 = new Scanner(System.in);
                        int input30 = Integer.parseInt(inputbaru10.nextLine());
                        if (input30 == 1) {
                            System.out.println("List of Food = 1. Burger 2. Pizza\n");
                            Scanner input6 = new Scanner(System.in);
                            int input7 = Integer.parseInt(input6.nextLine());
                            if (input7 == 1) {
                                Food food1 = new Food("Burger", (double) 15.00, "Burger with original meat!");
                                System.out.println(food1.PrintValue());
                            } else if (input7 == 2) {
                                Food food1 = new Food("Pizza", (double) 10.00, "Pizza with Meatballs!");
                                System.out.println(food1.PrintValue());
                            } else {
                                System.out.println("Wrong Input!");
                            }
                        }
                        if (input30 == 2) {
                            System.out.println("List of Drinks = 1. Water 2. Cola\n");
                            Scanner inputbaru2 = new Scanner(System.in);
                            int input5 = Integer.parseInt(inputbaru2.nextLine());
                            if (input5 == 1) {
                                Drinks drinks1 = new Drinks("Water", (double) 2.00, "Mineral Water!", "We only have medium size");
                                System.out.println(drinks1.PrintValue());
                            } else if (input5 == 2) {
                                Drinks drinks2 = new Drinks("Cola", (double) 3.00, "Refreshing!", "We only have small size");
                                System.out.println(drinks2.PrintValue());
                            } else {
                                System.out.println("Wrong Input!");
                            }
                        }
                    }
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Case of Number Format Exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Case of Arithmetic Exception: " + e);
        } catch (Exception e) {
            System.out.println("Case of Exception: " + e);
        }


    }
}
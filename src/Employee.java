import java.util.ArrayList;
import java.util.List;

public class Employee {

    public String Name;
    private String pass;

    public Employee(String Name, String pass){
        this.Name = Name;
        this.setPass(pass);
    }


    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    public static void main(String[] args) {

        System.out.println("List of Employee: \n");
        ArrayList<String> MyEmployeeArray = new ArrayList<>
                (List.of("Bobby", "Tony", "Bob"));

        MyEmployeeArray.forEach(employeelist -> {
            System.out.println(employeelist);
        });
    }


}

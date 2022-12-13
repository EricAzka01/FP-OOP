import java.util.ArrayList;
import java.util.List;

public class Employee {

    public String Name;
    private String pass;

    public Employee(String Name, String pass) {
        this.Name = Name;
        this.setPass(pass);
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public static class employeee<T> {
        T employeename;

        employeee(T employeename) {
            this.employeename = employeename;
        }

        public T getEmployeename() {
            return employeename;
        }
    }
}






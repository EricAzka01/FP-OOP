public class Food {

    public String Name;
    public Double Price;
    public String Description;

    public Double Discount;


    public Food(String Name, Double Price, String Description){
        this.Name = Name;
        this.Price = Price;
        this.Description = Description;
    }

    public Food(String Name, Double Price, String Description, Double Discount){
        this.Name = Name;
        this.Price = Price;
        this.Description = Description;
        this.Discount = Discount;
    }

    public String PrintValue(){
        return("Food Name = " + this.Name + "\nPrice = " + this.Price + "\nDescription = " + this.Description);
    }

    public String PrintValueDiscount(){
        return("Food Name = " + this.Name + "\nPrice = " + this.Price + "\nDescription = " + this.Description + "\nDiscount = " + this.Discount);
    }


}

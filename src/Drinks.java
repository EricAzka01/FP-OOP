public class Drinks extends Food{

    public String DrinkSize;

    public Drinks(String Name, Double Price, String Description, String DrinkSize){
        super(Name, Price, Description);
        this.DrinkSize = DrinkSize;
    }

    public String PrintValue() {
        return("Drink Name = " + super.Name + "\nPrice = " + super.Price + "\nDescription = " + super.Description + "\nDrink Size = " + this.DrinkSize);
    }


}

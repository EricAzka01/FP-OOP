

public class Calculation {

    //Burger = 15.00
    //Pizza = 10.00
    //Water = 2.00
    //Cola = 3.00


    abstract class AbstractCalculator{

        protected double Burger;
        protected double Pizza;
        protected double Water;
        protected double Cola;

        public AbstractCalculator(double Burger, double Pizza, double Water, double Cola){
            this.Burger = Burger;
            this.Pizza = Pizza;
            this.Water = Water;
            this.Cola = Cola;
        }

    }

}

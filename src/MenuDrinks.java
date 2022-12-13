abstract class MenuDrinks {
    public abstract void drinks();
}

class drink extends MenuDrinks{

    @Override
    public void drinks() {
        System.out.println("List of Drinks\n");
        System.out.println("1. Water \n2. Cola\n");
    }
}



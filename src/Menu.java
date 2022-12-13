public interface Menu {
    public void food();
    public void drinks();

    class restaurant implements Menu{

        @Override
        public void food() {
            System.out.println("List of Foods: \n");
            System.out.println("1. Burger \n2. Pizza\n");
        }

        @Override
        public void drinks() {
            System.out.println("List of Drinks: \n");
            System.out.println("1. Water \n2. Cola\n");

        }
    }

}



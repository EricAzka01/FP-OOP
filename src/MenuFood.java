public interface MenuFood {
    public void food();

    class restaurant implements MenuFood {

        @Override
        public void food() {
            System.out.println("List of Foods: \n");
            System.out.println("1. Burger \n2. Pizza\n");
        }



    }

}



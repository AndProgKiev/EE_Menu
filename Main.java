public class Main {
    public static void main(String[] args) {
        Menu menu =new Menu();

        Dish d1=new Dish("fish",150,100,false);
        Dish d2=new Dish("pork",600,600,true);
        Dish d3=new Dish("salad", 400,500,true);
        Dish d4=new Dish("bread",80,60,false);

        menu.addDish(d1);
        menu.addDish(d2);
        menu.addDish(d3);
        menu.addDish(d4);

        menu.selectDishByPrice(100,500);
        menu.getDiscountDish();
        System.out.println("***************************");
        menu.getKilogramDish();

    }
}

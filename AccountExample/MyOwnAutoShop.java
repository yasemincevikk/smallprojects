public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan1=new Sedan(160,20000,"Red",10);
        Ford ford1 = new Ford(156,4452.0,"Black",2005,10);
        Car car1 = new Car(555,56856.0,"Red");

        System.out.println("Sedan1 Price:"+sedan1.getSalePrice());
        System.out.println("Ford1 Price: "+ford1.getSalePrice());
        System.out.println("Car1 Price: "+ car1.getSalePrice());

    }
}

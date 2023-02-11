public class Main {
    public static void main(String[] args) {



        Director director=new Director();

        Builder carBuilder=new Car();
        director.construct(carBuilder);
        Product pr1=carBuilder.getVehicle();
        pr1.show();


        System.out.println("\n\n\n");


        Builder motoBuilder=new MotoCycle();
        Product pr2=motoBuilder.getVehicle();
        director.construct(motoBuilder);
        pr2.show();




    }
}
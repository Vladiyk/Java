package lecture2.classwork;

public class Main {
    public static void main(String[] args) {
        Car car_1 = new Car();
        Car car_2 = new Car("audi", 300);
        Car car_3 = new Car("audi");
        Car car_4 = new Car("audi", 300, "yelow");

        System.out.println(car_1);
        System.out.println(car_2.getModel() + ", " + car_2.getSpeed());
        System.out.println(car_3.getModel() + ", " + car_3.getSpeed());
        System.out.println(car_4.getModel() + ", " + car_4.getSpeed() + ", " + car_4.getColor());
    }
}

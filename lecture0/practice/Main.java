package lecture0.practice;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("bmw", 200, 150);
        System.out.println(bmw.getModel() + ", " + bmw.getMaxSpeed() + ", " + bmw.getSpeed());

        Car audi = new Car();
        audi.setModel("audi");
        audi.setMaxSpeed(400);
        audi.setSpeed(300);

        System.out.println(audi.getModel() + ", " + audi.getMaxSpeed() + ", " + audi.getSpeed());
    }
}

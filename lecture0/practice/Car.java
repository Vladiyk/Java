package lecture0.practice;

public class Car {

    private String model;
    private int maxSpeed;
    private int speed;

    public Car(){}

    public Car(String model, int maxSpeed, int speed){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

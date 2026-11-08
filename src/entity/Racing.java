package entity;

public class Racing {
    private MotoGp motor;
    private double speed;

    public Racing(MotoGp motor, double speed) {
        this.motor = motor;
        this.speed = speed;
    }

    public MotoGp getMotor() {
        return motor;
    }

    public double getSpeed() {
        return speed;
    }
}
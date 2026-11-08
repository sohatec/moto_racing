package entity;

public class MotoGp {
    protected String brand;
    protected String racer;
    protected int no;

    public MotoGp(String brand, String racer, int no) {
        this.brand = brand;
        this.racer = racer;
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRacer() {
        return racer;
    }

    public void setRacer(String racer) {
        this.racer = racer;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public double racingOpeningLap() {
        return 300 + (new java.util.Random().nextDouble() * (350 - 300));
    }

    public void showResultFormationLap() {
        System.out.printf("|%-10s|%-10s|%5d|%8.2f|\n", brand, racer, no, racingOpeningLap());
    }

    public void showResultOpeningLap(double speed) {
        System.out.printf("|%-10s|%-10s|%5d|%8.2f|\n", brand, racer, no, speed);
    }
}

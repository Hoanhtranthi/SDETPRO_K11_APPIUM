package lab_11;

import java.security.SecureRandom;

public class Sparrow implements  MoveAble , FlyAble {
    final int SPARROW_MAX_SPEED = 100;
    String name;
    int speed ;
    boolean wing;

    public Sparrow() {
        this.name = getName();
        speed = new SecureRandom().nextInt(SPARROW_MAX_SPEED);
        wing = fly();
    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public int move() {
        return speed;
    }

    @Override
    public String toString() {
        return "Sparrow{" +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", wing=" + wing +
                '}';
    }
}

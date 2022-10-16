package lab_11;

import java.security.SecureRandom;

public class Horse implements MoveAble , FlyAble {
    final int HORSE_MAX_SPEED = 100;
    String name;
    int speed;
    boolean wing;


    public Horse() {
        this.name = getName();
        speed = new SecureRandom().nextInt(HORSE_MAX_SPEED);
        wing = fly();
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public int move() {
        return speed;
    }

    @Override
    public String toString() {
        return "Horse{" +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", wing=" + wing +
                '}';
    }
}

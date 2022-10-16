package lab_11;

import java.security.SecureRandom;

public class Falcon implements MoveAble , FlyAble {
    final int FALCON_MAX_SPEED = 100;
    String name;
    int speed ;
    boolean wing;

    public Falcon() {
        this.name = name;
        speed = new SecureRandom().nextInt(FALCON_MAX_SPEED);
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
        return "Falcon{" +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", wing=" + wing +
                '}';
    }
}

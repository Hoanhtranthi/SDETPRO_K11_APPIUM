package lab_11;

import java.security.SecureRandom;

public class Eagle implements MoveAble , FlyAble {
    final int EAGLE_MAX_SPEED = 100;
    String name;
    int speed ;
    boolean wing;

    public Eagle() {
        this.name = getName();
        speed = new SecureRandom().nextInt(EAGLE_MAX_SPEED);
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
        return "Eagle{" +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", wing=" + wing +
                '}';
    }
}

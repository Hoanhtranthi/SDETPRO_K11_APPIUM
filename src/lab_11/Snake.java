package lab_11;

import java.security.SecureRandom;

public class Snake implements MoveAble , FlyAble {
    final int SNAKE_MAX_SPEED = 100;
    String name;
    int speed ;
    boolean wing;

    public Snake() {
        this.name = getName();
        speed = new SecureRandom().nextInt(SNAKE_MAX_SPEED);
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
        return "Snake{" +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", wing=" + wing +
                '}';
    }
}

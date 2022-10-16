package lab_11;

import java.security.SecureRandom;

public class Dog implements MoveAble, FlyAble{
    final int DOG_MAX_SPEED = 100;
    String name;
    int speed;
    boolean wing;



    public Dog() {
        this.name = getName();
        speed = new SecureRandom().nextInt(DOG_MAX_SPEED);
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
        return "Dog{" +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", wing=" + wing +
                '}';
    }
}

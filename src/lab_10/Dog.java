package lab_10;

import java.security.SecureRandom;

public class Dog extends Animals {
    final int DOG_MAX_SPEED = 100;

    public Dog() {
    }

    @Override
    public Dog setSpeed() {
        speed = new SecureRandom().nextInt(DOG_MAX_SPEED);
        return this;
    }

    @Override
    public Dog setName() {
        name = this.getClass().getSimpleName();
        return this;
    }
}

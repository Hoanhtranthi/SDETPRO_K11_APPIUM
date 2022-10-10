package lab_10;

import java.security.SecureRandom;

public class Horse extends Animals {
    final int HORSE_MAX_SPEED = 100;
    public Horse() {
    }
    @Override
    public Horse setSpeed() {
        speed = new SecureRandom().nextInt(HORSE_MAX_SPEED);
        return this;
    }

    @Override
    public Horse setName() {
        name = this.getClass().getSimpleName();
        return this;
    }
}

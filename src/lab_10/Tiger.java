package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animals {
    final int TIGER_MAX_SPEED = 100;
    public Tiger() {
    }
    @Override
    public Tiger setSpeed() {
        speed = new SecureRandom().nextInt(TIGER_MAX_SPEED);
        return this;
    }

    @Override
    public Tiger setName() {
        name = this.getClass().getSimpleName();
        return this;
    }
}

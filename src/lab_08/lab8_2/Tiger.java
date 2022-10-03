package lab_08.lab8_2;

import java.security.SecureRandom;

public class Tiger extends Animals {
    @Override
    public int getSpeed() {
        return speed = new SecureRandom().nextInt(100);
    }
}
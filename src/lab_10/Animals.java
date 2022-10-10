package lab_10;

public abstract class Animals {
    public String name;
    public int speed;

    public abstract Animals setSpeed();

    public int getSpeed() {
        return speed;
    }

    public abstract Animals setName();

    public String getName() {
        return name;
    }

    public Animals() {
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}

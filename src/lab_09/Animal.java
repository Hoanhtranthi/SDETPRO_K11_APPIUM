package lab_09;

import javafx.util.Builder;
import sun.font.BidiUtils;

public class Animal {
    public String name;
    public int speed;
    public boolean wing;

    protected Animal(Builder builder){
        this.name = builder.name;
        this.speed = builder.speed;
        this.wing = builder.wing;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWing() {
        return wing;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", wing=" + wing +
                '}';
    }

    public static class Builder{
        public String name;
        public int speed;
        public boolean wing;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setWing(boolean wing) {
            this.wing = wing;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }
}
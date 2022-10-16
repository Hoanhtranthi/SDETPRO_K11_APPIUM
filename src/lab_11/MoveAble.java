package lab_11;

public interface MoveAble {
    int move();
    default String getName(){
        return getClass().getSimpleName();
    }
}

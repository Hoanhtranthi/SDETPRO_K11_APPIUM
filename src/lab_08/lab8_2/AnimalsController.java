<<<<<<< HEAD
package lab_08.lab8_2;public class AnimalsController {
=======
package lab_08.lab8_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalsController {
    public Animals Maxspeed(List<Animals> animalsList){
        int maxSpeed = animalsList.get(0).getSpeed();
        int indexmax = 0;
        for (int i = 0; i < animalsList.size(); i++) {
            if (maxSpeed < animalsList.get(i).getSpeed())
            {
                maxSpeed = animalsList.get(i).getSpeed();
                indexmax = i;
            }
        }
        return animalsList.get(indexmax);

    }

    public static void main(String[] args) {
        Animals dog = new Dog();
        Animals horse = new Horse();
        Animals tiger = new Tiger();
        AnimalsController animalsController = new AnimalsController();
        List<Animals> animalsList = Arrays.asList(dog,horse,tiger);
        Animals winner = animalsController.Maxspeed(animalsList);
        String nameWinner = winner.getClass().getSimpleName();
        String speedWinner = Integer.toString(winner.getSpeed());
        System.out.println(animalsList);
        System.out.print("Winner is " +nameWinner +  ", with speed:" + speedWinner) ;


    }
>>>>>>> origin/main
}

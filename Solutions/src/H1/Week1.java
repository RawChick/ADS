package H1;

import Tools.Console;
import Tools.Exercise;

class Week1 {

    //	Opdrachten H1: 1, 3, 5, 7 en 8
    
    public static void main(String[] args) {

        int choice;
        Exercise[] exercises = {
            new Exercise_1(), 
            new Exercise_2(), 
            new Exercise_3(),
            new Exercise_4(),
            new Exercise_5(),
            new Exercise_6(),
            new Exercise_7(),
            new Exercise_8()
        };
        do {
            choice = Console.readInt("What? (0 for help, -1 to quit) ", -1, exercises.length);
            if (choice == 0) {
                for (int i = 0; i < exercises.length; i++) {
                    Console.writeLine((i + 1) + ": " + exercises[i].getTitle());
                }
            } else if (choice > 0 && choice <= exercises.length) {
                exercises[choice - 1].runTest();
            }
        } while (choice != -1);
    }
}

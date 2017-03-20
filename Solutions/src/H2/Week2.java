package H2;

import Tools.Console;
import Tools.Exercise;

public class Week2 {
    // Opdrachten H2: 4, 5, 6, en 7

    private final Exercise[] exercises = {
        new Exercise_1(),
        new Exercise_2(),
        new Exercise_3()
    };

    private void list() {
        for (int i = 0; i < exercises.length; i++) {
            Console.writeLine((i + 1) + ": " + exercises[i].getTitle());
        }
    }

    Week2() {
        int choice;
        do {
            list();
            choice = Console.readInt("What? (0 for help, -1 to quit) ", -1, exercises.length);
            if (choice == 0) {
                list();
            } else if (choice > 0 && choice <= exercises.length) {
                exercises[choice - 1].runTest();
            }
        } while (choice != -1);
    }
}

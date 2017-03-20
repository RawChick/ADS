package H5;

public class Week5 {

    private final Exercise[] exercises = {
        new Exercise1(),
        new Exercise2(),
        new Exercise3()
    };

    private void list() {
        for (int i = 0; i < exercises.length; i++) {
            Console.writeLine((i + 1) + ": " + exercises[i].getTitle());
        }
    }
    Week5() {
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

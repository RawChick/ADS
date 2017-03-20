package H1;

import Tools.Exercise;

class Exercise_8 extends Exercise {

    Exercise_8() {
        super("Tovervierkant");
    }

    int[][] makeSquare(int n) {
        int square[][] = new int[n][n];
        int a = 1;
        int x = (n - 1) / 2;
        int y = n - 1;
        square[x][y] = a++;
        while (a <= n * n) {
            x = (x + 1) % n;
            y = (y + 1) % n;
            if (square[x][y] != 0) {
                x = (x + n - 1) % n;
                y = (y + n - 2) % n;
            }
            square[x][y] = a++;
        }
        return square;
    }

    void testSquare(int n) {
        int square[][] = makeSquare(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%3d", square[i][j]);
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void test() {
        testSquare(3);
        testSquare(5);
        testSquare(7);
    }
}

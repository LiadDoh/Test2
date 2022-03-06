package q2;

import java.util.Scanner;

//{1 1 1 1 1 1 1 1 1 1
//2 2 2 2 2 2 2 2 2 2
//3 3 3 3 3 3 3 3 3 3
//4 4 4 4 4 4 4 4 4 4
//5 5 5 5 5 5 5 5 5 5
//6 6 6 6 6 6 6 6 6 6
//7 7 7 7 7 7 7 7 7 7
//8 8 8 8 8 8 8 8 8 8
//9 9 9 9 9 9 9 9 9 9
//0 0 0 0 0 0 0 0 0 0}
//
// {2 2 2 2
//3 3 3 3
//4 4 4 4
//5 5 5 5}
public class Main {
    public static void main(String[] args) {
        int[][] bigMatrix = new int[10][10];
        int[][] smallMatrix = new int[4][4];
        initializeMatrix(bigMatrix, 10);
        initializeMatrix(smallMatrix, 4);
        printMatrix(bigMatrix);
        printMatrix(smallMatrix);
        boolean flag = false;
        for (int i = 0; i < 7 && !flag; i++) {
            for (int j = 0; j < 7 && !flag; j++) {
                if (bigMatrix[i][j] == smallMatrix[0][0]) {
                    flag = isSubMatrix(bigMatrix, smallMatrix, i, j);
                }
            }
        }
        if (flag) {
            System.out.println("Submatrix found");
        } else {
            System.out.println("Submatrix not found");
        }
    }

    private static boolean isSubMatrix(int[][] bigMatrix, int[][] smallMatrix, int i, int j) {
        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < 4; l++) {
                if (bigMatrix[i + k][j + l] != smallMatrix[k][l]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printMatrix(int[][] bigMatrix) {
        for (int i = 0; i < bigMatrix.length; i++) {
            for (int j = 0; j < bigMatrix.length; j++) {
                System.out.print(bigMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void initializeMatrix(int[][] bigMatrix, int size) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                bigMatrix[i][j] = scanner.nextInt();
            }
        }
    }
}

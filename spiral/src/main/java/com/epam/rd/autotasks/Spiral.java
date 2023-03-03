package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns)
    {
        int[][] spiralArray = new int[rows][columns];

        int value = 1;
        int rowStart = 0, rowEnd = rows-1, colStart = 0, colEnd = columns-1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse right
            for (int i = colStart; i <= colEnd; i++) {
                spiralArray[rowStart][i] = value++;
            }
            rowStart++;

            // Traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                spiralArray[i][colEnd] = value++;
            }
            colEnd--;

            // Traverse left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    spiralArray[rowEnd][i] = value++;
                }
                rowEnd--;
            }

            // Traverse up
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    spiralArray[i][colStart] = value++;
                }
                colStart++;
            }
        }

        return spiralArray;
    }

}

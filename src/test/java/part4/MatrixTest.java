package part4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MatrixTest {
    private  void assertArrayEquals(int[] actual, int[] expected) {
        assertEquals(actual.length, expected.length, "Arrays have different length");
        for (int i = 0; i < expected.length; i++) {
            assertEquals(actual[i], expected[i], "Arrays differ at index " + i);
        }
    }

    @Test
    public void testReduceMatrixToArray() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}};
        int[] actual = Matrix.reduceMatrixToArray(matrix);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testReduceEmptyMatrixToArray() {
        int[][] matrix = {};
        int[] actual = Matrix.reduceMatrixToArray(matrix);
        int[] expected = {};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testReduceMatrixOfEmptyArraysToArray() {
        int[][] matrix = {{}, {}, {}};
        int[] actual = Matrix.reduceMatrixToArray(matrix);
        int[] expected = {};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFillMatrixBySpiral() {
        int[][] actual = Matrix.fillMatrixBySpiral(3);
        int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {
                assertEquals(actual[i][j], expected[i][j], "Matrices differ at index " + i + ", " + j);
            }
        }
    }

    @Test
    public void testFillMatrixBySpiralForOneElement() {
        int[][] actual = Matrix.fillMatrixBySpiral(1);
        int[][] expected = {{1}};
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {
                assertEquals(actual[i][j], expected[i][j], "Matrices differ at index " + i + ", " + j);
            }
        }
    }

    @Test
    public void testFillMatrixBySpiralForEmptyMatrix() {
        int[][] actual = Matrix.fillMatrixBySpiral(0);
        int[][] expected = {};
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {
                assertEquals(actual[i][j], expected[i][j], "Matrices differ at index " + i + ", " + j);
            }
        }
    }
}

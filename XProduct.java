public class XProduct
{
  private static void printMatrix(double[][] matrix, int rows, int cols)
  {
    // Print generated matrix
    for(int r = 0; r < rows; r++)
    {
      for (int c = 0; c < cols; c++)
      {
        System.out.print(matrix[r][c] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String args[])
  {
    int rows = 5, cols = 5;

    MatrixCreator mc = new MatrixCreator();

    double[][] first_matrix = mc.createMatrix(rows, cols);
    double[][] second_matrix = mc.createMatrix(rows, cols);

    printMatrix(first_matrix, rows, cols);



    double value = mc.generateValue(100);
    System.out.println(value);

    System.out.println();

    printMatrix(second_matrix, rows, cols);
  }
}

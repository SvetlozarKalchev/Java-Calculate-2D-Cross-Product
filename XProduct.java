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
    int rows = 5000, cols = 5000;

    MatrixCreator mc = new MatrixCreator();

    double[][] first_matrix = mc.createMatrix(rows, cols);
    double[][] second_matrix = mc.createMatrix(rows, cols);

    // printMatrix(first_matrix, rows, cols);

    System.out.println();

    // printMatrix(second_matrix, rows, cols);

    // Calculate cross-product
    Correlator correlator = new Correlator();

    printMatrix(correlator.calculate2DProduct(first_matrix, second_matrix, rows, cols), rows, cols);

  }
}

public class XProduct
{
  private static void printMatrix(double[][] matrix, int rows, int cols)
  {
    // Print generated matrix
    for(int r = 0; r < rows; r++)
    {
      for (int c = 0; c < cols; c++)
      {
        // System.out.print(matrix[r][c] + " ");
      }
      // System.out.println();
    }
  }

  public static void main(String args[])
  {
    int rows = 5000, cols = 5000;

    MatrixCreator mc = new MatrixCreator();

    double[][] first_matrix = mc.createMatrix(rows, cols);
    double[][] second_matrix = mc.createMatrix(rows, cols);

    // Calculate cross-product
    Correlator correlator = new Correlator();

    final long startingTime = System.currentTimeMillis();

    correlator.calculate2DProduct(first_matrix, second_matrix, rows, cols);

    final long endTime = System.currentTimeMillis();

    double endTimeSeconds = (endTime - startingTime);// / (double) 1000;

    System.out.println("End time: " + endTimeSeconds);
  }
}

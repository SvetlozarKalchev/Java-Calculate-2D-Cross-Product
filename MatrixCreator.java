public class MatrixCreator
{
  // Creates a matrix with the desired x,y size
  public double[][] createMatrix(int rows, int columns)
  {
    double[][] matrix = new double[rows][columns];

    for(int r = 0; r < rows; r++)
    {
      for(int c = 0; c < columns; c++)
      {
        matrix[r][c] = this.generateValue(2);
        System.out.print(matrix[r][c] + " ");
      }

      System.out.println();
    }

    return matrix;
  }

  // Generates random floating point value 0 < n < range
  public double generateValue(int range)
  {
    return 2;
  }
}

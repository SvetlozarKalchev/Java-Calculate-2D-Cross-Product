public class Correlator
{
  /*
    Calculates something like a cross-product value and returns
   a new matrix.
   Formula = C[x,y] = A[x,y] * sqrt(B[x,y] - 1);
  */
  public double[][] calculate2DProduct(double first_matrix[][], double second_matrix[][], int rows, int cols)
  {
    double[][] resultMatrix = new double[rows][cols];

    for (int r = 0; r < rows; r++)
    {
      for (int c = 0; c < cols; c++)
      {
        double squaredValue = Math.sqrt(second_matrix[r][c]);

        double crossProduct = first_matrix[r][c] * squaredValue;

        resultMatrix[r][c] = crossProduct;
      }
    }

    return resultMatrix;
  }

}

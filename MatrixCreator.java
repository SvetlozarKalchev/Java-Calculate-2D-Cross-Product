import java.util.Random;

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
      }
    }

    return matrix;
  }

  // Generates random floating point value 0 < n < range
  public double generateValue(int range)
  {
    Random rand = new Random();

      double answer = range + rand.nextDouble();

      // Set the precision of a floating point number.
      // First we multiply the double value with 10000 and than we must take only
      // the int value and than we devide the number by 10000.
      answer = answer * 10000;
      answer = (double)((int)answer)/10000;
      return answer;
    //return 2;
  }
}

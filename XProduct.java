public class XProduct
{
  public static void main(String args[])
  {
    MatrixCreator mc = new MatrixCreator();

    mc.createMatrix(5, 5);


    double value = mc.generateValue(100);
    System.out.println(value);
  }
}

class Calculator4
{
    public float add(float num1 ,float num2)
    {
        return(num1 + num2); 
    }
    public float sub (float num1 ,float num2)
    {
        return(num1 - num2); 
    }
    public float Multiply (float num1 ,float num2)
    {
        return(num1 * num2); 
    }
    public float Divide (float num1 ,float num2)
    {
        return(num1 / num2); 
    }
    class Test{
    public static void main(String[] args)
    {
      ExtendedCalculator4 Calculator7 = new ExtendedCalculator4();

      System.out.println("Addition:"+Calculator7.add(5,3));
      System.out.println("Substraction:"+Calculator7.sub(5,3));
      System.out.println("Multiplication:"+Calculator7.Multiply(5,3));
      System.out.println("Division:"+Calculator7.Divide(5,3));
      System.out.println("Square:"+Calculator7.Square(5));
      System.out.println("Cube:"+Calculator7.Cube(5));

    }
    }
}

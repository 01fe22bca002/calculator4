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
      ExtendedCalculator4 Calculator4 = new ExtendedCalculator4();

      System.out.println("Addition:"+Calculator4.add(5,3));
      System.out.println("Substraction:"+Calculator4.sub(5,3));
      System.out.println("Multiplication:"+Calculator4.Multiply(5,3));
      System.out.println("Division:"+Calculator4.Divide(5,3));
      System.out.println("Square:"+Calculator4.Square(5));
      System.out.println("Cube:"+Calculator4.Cube(5));

    }
    }
}

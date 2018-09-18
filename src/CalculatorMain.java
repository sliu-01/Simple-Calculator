
public class CalculatorMain 
{

	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();
		System.out.println(calc.add(2,4));
		
		CalculatorSubtract calc2 = new CalculatorSubtract();
		System.out.println(calc2.subtract(10,6));
	}

}

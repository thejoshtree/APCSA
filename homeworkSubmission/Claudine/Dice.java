public class Dice 
{
	private int numSides;
	private int faceValue;
	
	public Dice()
	{
		numSides = 6;
		faceValue = 1;
	}
	
	public Dice(int sides)
	{
		numSides = sides;
		faceValue = 1;
	}
	
	public int getNumSides()
	{
		return numSides;
	}
	
	public int getFaceValue()
	{
		return faceValue;
	}
	
	public int roll()
	{
		faceValue = (int) (Math.random() * numSides) + 1;
		return faceValue;
	}
	
	public String toString()
	{
		return "" + faceValue;
	}
	
	public static void main(String[] args)
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice(5);
		
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int sum = roll1 + roll2;
		
		System.out.println("Roll from dice 1: " + roll1);
		System.out.println("Roll from dice 2: " + roll2);
		System.out.println("Sum of rolls: " + sum);

    int faceValue1 = dice1.getFaceValue();
		int faceValue2 = dice2.getFaceValue();
		
		System.out.println(faceValue1);
		System.out.println(faceValue2);
	}
}

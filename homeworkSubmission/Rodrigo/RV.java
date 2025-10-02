// Problem #1
public class point {
    private int x;
    private int y;

    public point() {
        this.x = 0;
        this.y = 0;
    }

    public point(int xCoordinate, int yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public double distance(point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "Point coordinate: \n x = " + x + "\n y = " + y;
    }

    public static void main(String[] args) {
        point p1 = new point(3, 4);
        point p2 = new point(2, 4);

        System.out.println(p1);
        System.out.println(p2);

        double dist = p1.distance(p2);
        System.out.println("Distance between points = " + dist);
    }
}

// Problem #2

package dice;

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
		faceValue = (int)(Math.random() * numSides) + 1;
		return faceValue;
	}
	
	public String toString()
	{
		return " " + faceValue;
	}

	public static void main (String [] args)
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int roll1 = dice1.roll();
        int roll2 = dice2.roll();
        int sum = roll1 + roll2;
        System.out.println("Dice 1 rolled: " + roll1);
        System.out.println("Dice 2 rolled: " + roll2);
        System.out.println("Sum of dice: " + sum);
	}
}

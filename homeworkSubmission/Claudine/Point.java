public class Point 
{
	private int pointX;
	private int pointY;
	
	public Point(int x, int y)
	{
		pointX = x;
		pointY = y;
	}
	
	public int getPointX()
	{
		return pointX;
	}
	
	public int getPointY()
	{
		return pointY;
	}
	
	public void move(int dx, int dy)
	{
		pointX += dx;
		pointY += dy;
	}
	
	public String toString()
	{
		return "(" + pointX + ", " + pointY + ")";
	}
	
	public static void main(String[] args)
	{
		Point coordinate1 = new Point(3, 7);
		Point coordinate2 = new Point();
		
		System.out.println("Initial coordinate 1: " + coordinate1);
		System.out.println("Initial coordinate 2: " + coordinate2);
		
		coordinate1.move(8, -2);
		coordinate2.move(-7, 9);
		
		System.out.println("Coordinate 1 after moving " + coordinate1);
		System.out.println("Coordinate 2 after moving " + coordinate2);
		
		int dx = coordinate1.getPointX() - coordinate2.getPointX();
		int dy = coordinate1.getPointY() - coordinate2.getPointY();
		double distance = Math.sqrt(dx * dx + dy * dy);
		
		System.out.println("Distance between coordinate 1 and 2: " + distance);
	}
}

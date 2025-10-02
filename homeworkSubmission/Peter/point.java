public class point 
{
    private int x;
    private int y;
    
    public point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void translate(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public String toString() 
    {
        return "(" + x + ", " + y + ")";
    }
    
    
    public static void main(String[] args) 
    {
        point p = new point(3, 4);
        System.out.println("Original point: " + p);

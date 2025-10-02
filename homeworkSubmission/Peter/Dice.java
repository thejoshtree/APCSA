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
        return "" + faceValue;
    }
    
    public static void main(String[] args) 
    {
        Dice d = new Dice(6);   
        System.out.println("Rolling:");
        for (int roll = 0; roll < 10; roll++) 
        {
            System.out.println("Roll " + roll + ": " + d.roll());
        }
    }
}
        
        p.translate(2, -1);
        System.out.println("After translating by (2, -1): " + p);
    }
}   

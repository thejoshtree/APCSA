

public class Card {
    private ;
    private ;
    private ;

    public Card(String theRank, String theSuit, int pv) // inside the parenthesis, instance variables not parameter
    {
        suit = theSuit; // will be the same in the situation: String rank ---> rank = this.rank . the way is only right when it is not static method.
                        // this refers to the object itself in the class. the same as 'self' in python.
        rank = theRank;
        pointValue = pv;
    }
    //accessor methods -- many of them one line return the attribute
    public String getSuit()
    {
        return ;
    }

    public String getRank()
    {
        
    }

    public int getPointValue()
    {
        
    }

    public boolean matches(Card c) //compare two cards
    {
        return rank.equals(c.rank) && suit.equals(c.suit);
    }

    // toString method
    public String toString()
    {

        return rank + " of" + " suit " + suit + " point value " + pointValue;
    }
}



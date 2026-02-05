//Rewrite the following code that uses an array to use an ArrayList instead. 
//In the comments write why you think an ArrayList is a better data structure to use than an array for this problem.

import java.util.*;

public class ChallengeArray
{
    public static void main(String[] args)
    {
        // Rewrite this code to use an ArrayList instead of an array
        String[] toDoList = new String[3];
        toDoList[0] = "Do homework";
        toDoList[1] = "Help make dinner";
        toDoList[2] = "Call grandma";

        // changing element 1
        toDoList[1] = "Order pizza";

        System.out.println(toDoList.length + " things to do!");
        System.out.println("Here's the first thing to do: " + toDoList[0]);

        // remove item 0 and move everything down
        //  (this can be done in one method call with ArrayList)
        toDoList[0] = toDoList[1];
        toDoList[1] = toDoList[2];
        toDoList[2] = "";

        System.out.println("Here's the next thing to do: " + toDoList[0]);

        // Why is an ArrayList better than an array for a toDoList?
        // Answer:
    }
}

/// MY CODE IS FROM HERE
/// ---------------------------------------
/// i used chatgpt a little bit on removing item 0

import java.util.*;

public class ChallengeArray
{
    public static void main(String[] args)
    {
        // Using an ArrayList instead of an array
        ArrayList String toDoList = new ArrayList String[];

        toDoList.add("Do homework");
        toDoList.add("Help make dinner");
        toDoList.add("Call grandma");

        // changing element 1
        toDoList.set(1, "Order pizza");

        System.out.println(toDoList.length + " things to do!");
        System.out.println("Here's the first thing to do: " + toDoList[0]);

        // remove item 0
        toDoList.remove(0);

        System.out.println("Here's the next thing to do: " + toDoList[0]);

    // Why is an ArrayList better than an array for a toDoList?
// Answer: An ArrayList is better because you can easily add and remove tasks,
// it automatically resizes, and you don't have to manually shift items like you
// would with an array.
    }
}


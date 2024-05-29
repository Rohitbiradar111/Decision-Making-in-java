//Here are the Decision making statements used in java

public class DecisionMakinginjava {
    public static void main(String args[])
    {
        int n = 10;

        // Simple if statement
        if(n > 2)
        {
            System.out.println("YES! n is greater"); 
        }

        // if - else statement
        if(n > 10)
        {
            System.out.println("YES!");
        }
        else
        {
            System.out.println("NO!");
        }

        // Nested if statement
        if(n>4)
        {
            if(n>6)
            {
                System.out.println("YES!");
            }
        }

        if(n == 10 || n <16)
        {
            if(n<15)
                System.out.println("YES! n is less than 15");
            if(n<12)
                System.out.println("YES! n is less than 12 too");
        }

        // if-else-if statement
        if(n < 15)
        {
            System.out.println("YES! n is less than 15");
        }
        else if(n == 12)
        {
            System.out.println("YES! n is 12");
        }
        else if(n == 10)
        {
            System.out.println("YES! n is 10");
        }
        else
        {
            System.out.println("NO!");
        }

        // Switch Case statement
        switch (n) {
            case 10  :
                System.out.println("YES! n is 10");
                break;
            case 100 :
                System.out.println("NO!");
                break;
            default:
            System.out.println("NOTHING!");
                break;
        }

        // return statement
        int a = 10;
        if(a == 10)
            System.out.println("YES! a is 10");
            return;
    }
}
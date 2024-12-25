package Prog_Code;
class Test
{
    public static void main(String[] args)
    {
        long a=28;
        int i=1, sum=0;

        while (i<=a/2) 
        {
         if (a%i==0)
         {
            //Calculating sum of factors 
            sum= sum +i;
         }   
         i++;
        }

        if(sum ==a)
        {
            System.out.println("Its perfect number");
        }
        else
        {
            System.out.println("Its not perfect number");
        }

        

    }
}
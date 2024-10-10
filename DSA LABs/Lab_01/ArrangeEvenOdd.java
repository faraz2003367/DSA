import java.util.Scanner;
import java.util.Arrays;

public class ArrangeEvenOdd
{  public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        int [] Numbers=new int[10];                  
        System.out.println("Enter Any Ten integer Numbers:");
        for(int i=0;i<10;i++)
        {
            Numbers[i] = sc.nextInt();
        }
        arrangeEvenOdd(Numbers);
        System.out.println("Output :" + Arrays.toString(Numbers));

    }
    public static void arrangeEvenOdd(int [] Arrays)
    {
        int i=0, j=Arrays.length-1;
         while(i <j){
            while(i<j && Arrays[i]%2==0)
            {
                i++;
            }
            while(i<j && Arrays[j]%2!=0)
            {
                j--;

            }
            if(i<j)
            {
                int temp = Arrays[i];
                Arrays[i]=Arrays[j];
                Arrays[j]=temp;
            }
         }
    }
}

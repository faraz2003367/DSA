import java.util.Scanner;
class AssecendingAndDescending{
     void Ascending(int number){
        if(number<=0){
        return ;
    }
         Ascending(number-1);
         System.out.print(number + " ");
         //Ascending(number-1);
    
    }
      void Descending(int number){
        if (number<=0){
        return;
        }
        System.out.print(number + " ");
        Descending(number-1);
    }
    public static void main(String args[])
    {
        Scanner scanner =new Scanner(System.in);

        AssecendingAndDescending lab =new AssecendingAndDescending();

        System.out.print("Inter Any Positive Integer:");
        int number = scanner.nextInt();
        System.out.println("Number In Assecending Order:");
        lab.Ascending(number);

        System.out.println();
       
        System.out.println("Number In Decending Order:");
        lab.Descending(number);
       
        

    }
}
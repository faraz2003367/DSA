import java.util.Scanner;
class Fabonacci {
    public static void FibonacciIterative(int n){
        int first=0,  second =1 , next;
        System.out.print("Fabonacci Itrective approach :" +first+" "+ second+" " );
        for (int i=2;i<=n;i++){
         next=first+second;
         System.out.print(next +" ");
         first=second;
         second=next;
        }
        System.out.println();
    }
    public static int fabonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fabonacci(n-1) +fabonacci(n-2);
        }
    }
    public static void  FibonacciRecursive(int n){
      System.out.print("fabonacci series (recursive) :");
      for(int i =0; i<=n ;i++){
       System.out.print(fabonacci(i) +" ");
      }
      System.out.println();
    }
    public static void main (String args []){
        Scanner scanner =new Scanner(System.in);
        Fabonacci fab=new Fabonacci();
        System.out.print("Inter the value of n: ");
        int n=scanner.nextInt();
        System.out.println("This is Fabonacci Iterative :");
         fab.FibonacciIterative(n);
       System.out.println("This is Fabonacci Recursive ");
        fab.FibonacciRecursive(n);
    }
}
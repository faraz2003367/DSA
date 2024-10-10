class Factorial{
//using itterative Approach 
public static int Factorialiteration(int n){
    int result =1;
    for(int i=1;i<=n;i++){
        result *=i;
    }
    return result;
}



    //using recursive way :
    public static int  Factorialrecusive (int n)
    {
     if(n==1||n==0){
        return 1;
     }
     else {
        return n*Factorialrecusive(n-1);
     }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("factorail of " + n + " (Iterative) is:" + Factorialiteration(n));
        System.out.println("Factoral of " + n + " (recursive) is :"+Factorialrecusive(n));
    }
}
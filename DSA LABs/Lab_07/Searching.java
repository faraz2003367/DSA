import java.util.Scanner;
import java.util.Random;
public class Searching {
public void Store(int[] array ){
Random random =new Random();
for(int i=0;i<array.length;i++){
    array[i]=random.nextInt(100);
}

}
public void DisplayArray(int [] array){
System.out.print("Array :");
for(int i:array){
    System.out.print(i +" ");

}
System.out.println();
}
public int searchitteractive(int [] array,int searchvalue){
 for(int i =0 ; i<array.length ; i++){
    if(array[i]== searchvalue){
        return 1;
    }
 }
 return 0;
 }
public int searchRecursive(int []array,int searchvalue ,int index){
    if(index>=array.length){
        return 0;
    }
    if(array[index]==searchvalue){
        return 1;
    }
    return searchRecursive(array, searchvalue, index+1);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Searching searchobj=new Searching();

    int [] array=new int[12];
    searchobj.Store(array);
    searchobj.DisplayArray(array);
    System.out.print("inter any value for Searchhing :");
    int searchvalue =sc.nextInt();
    int ItteractiveResult=searchobj.searchitteractive(array, searchvalue);
    System.out.println("Iteractive Search Result :" + (ItteractiveResult==1 ? "value found :"  : "Value not found :"));
int recursiveResult=searchobj.searchRecursive(array, searchvalue, 0);
System.out.println("Recursive Search Result :" +(recursiveResult ==1? "value found " : "value not found"));
sc.close();
}



}
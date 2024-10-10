import java.util.Arrays;

class SelectionSort{
    void selectionSort(int array[]){
      int size =array.length;
      for(int i=0;i<size-1;i++){
         int mainIndex=i;
         for(int j =i+1;j<size;j++){
            if(array[j]<array[mainIndex]){
              mainIndex=j;
            }
         }
         int temp=array[mainIndex];
         array[mainIndex]=array[i];
         array[i]=temp;
      }
    }
    public static void main(String[] args) {
        int [] data={9,5,4,1,3};
        System.out.println("Original Array: 9,5,4,1,3 ");
        SelectionSort sort =new SelectionSort();
        sort.selectionSort(data);
        System.out.println("Sorting Array in Selectin Sort");
        System.out.println(Arrays.toString(data));
    }
}
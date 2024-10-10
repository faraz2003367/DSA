class labEx4{
    void boundary(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i == 0 || i == arr.length-1){
                    System.out.print(arr[i][j] + " ");
                }
            else if(i >0 && i<arr.length-1){
                if(j==0 || j==arr[i].length-1){
                    System.out.print(arr[i][j] + " ");
                }
            }
            }
            System.out.println();
        }
    }
   
   
    void center(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i == 0 || i == arr.length-1){
                    continue;
                }
            else if(i >0 && i<arr.length-1){
                if(j==0 || j==arr[i].length-1){
                    continue;
                }
                else{
                    System.out.print(arr[i][j] + " ");
                }
            }
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int arr[][] = new int[5][4];
        labEx4 l = new labEx4();
        int num=1;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = num;
                num++;
            }
        }
        //l.boundary(arr);
       l.center(arr);
    }
}
class CharacterForword{
    public void characterforword(char[] array,int index){
        if (index>=array.length){
            return ;
        }
        System.out.println("Forword :" + array[index] + " ");
        characterforword(array, index+1 );
    }
    public void backWord(char[] array , int index){
        if(index<0){
            return ;
        }
        System.out.println(array[index] + " ");
        backWord(array, index-1);
    }
    public static void main(String[] args) {
        CharacterForword forword=new CharacterForword();
        char array[]={'a','b','c','d','e'};
        forword.characterforword(array, 1);
        forword.backWord(array, 3);
    }
}
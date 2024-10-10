public class FirstSingleLetter {
    public static char firstSingleLetter(String text)
    {
        int n=text.length();
        for(int i=0;i<n;i++){
        char currentChar =text.charAt(i);
        int count=0;
        for(int j=0;j<n;j++){
            if(currentChar==text.charAt(j)){
                count ++;
            }

        }
        if (count==1)
        {
            return currentChar;
        }
    }
    return '\0';
}
public static void main (String[]args){
    String text="ApnAKamKar ";
    char result=firstSingleLetter(text);
    if(result!='\0'){
        System.out.println("This is first single letter ="  +result);
    }
    else{
        System.out.println("No single letter found.");
    }
}
}
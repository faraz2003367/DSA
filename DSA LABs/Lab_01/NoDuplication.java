import java.util.Scanner;

public class NoDuplication {
    public static void main(String args[]) {
        int count = 0;
        int TwoDArray[][] = new int[4][5];
        Scanner TakeArray = new Scanner(System.in);
        int OneDArray[] = new int[20];  // Maximum size of 20

        System.out.println("Enter elements of the 2D array:");

        // Input elements into the 2D array
        for (int i = 0; i < TwoDArray.length; i++) {
            for (int j = 0; j < TwoDArray[i].length; j++) {
                TwoDArray[i][j] = TakeArray.nextInt();
            }
        }

        // Remove duplicates and store unique values in the 1D array
        for (int i = 0; i < TwoDArray.length; i++) {
            for (int j = 0; j < TwoDArray[i].length; j++) {
                boolean isDup = false;
                // Check if element is already in OneDArray
                for (int k = 0; k < count; k++) {
                    if (TwoDArray[i][j] == OneDArray[k]) {
                        isDup = true;
                        break;
                    }
                }
                // If not a duplicate, add to OneDArray
                if (!isDup) {
                    OneDArray[count] = TwoDArray[i][j];
                    count++;
                }
            }
        }

        // Output the unique elements
        System.out.println("Elements of the 1D array after removing duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(OneDArray[i] + " ");
        }
    }
}

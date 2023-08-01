import java.util.Arrays;

import javafx.scene.control.ListCell;

import java.util.ArrayList;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){


        int[] ans = new int[arr1.length + arr2.length];

        // adds entirety of arr2 to end of arr1

        // could create helper function to abstract this information
        // could also use System.arraycopy()

        for (int i = 0; i < arr1.length; i++) { ans[i] = arr1[i]; }         // fill ans with contents of arr1

        int j = 0;
        for (int i = arr1.length; i < ans.length; i++) {                    // starting from end of last loop, fill ans with contents of arr2
            ans[i] = arr2[j]; 
            j++; 
        }

        return ans;

        
    }
}

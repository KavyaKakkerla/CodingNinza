import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int maxPerimeterTriangle(ArrayList<Integer> arr, int n) {
        // Write your code here.
        Collections.sort(arr);
        for(int i=n-1;i>=2;i--)
        {
            int l1=arr.get(i);
            int l2=arr.get(i-1);
            int l3=arr.get(i-2);
            if(l1<l2+l3)
            {
                return l1+l2+l3;
            }
            
        }
        return 0;

    }
}

https://youtu.be/_JAjD9xQk6A?si=5UNl0g6hbjlZpvv-

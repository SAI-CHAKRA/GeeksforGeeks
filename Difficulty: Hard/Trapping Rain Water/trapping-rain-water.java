//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxWater(int arr[]) {
        // code here
        int len = arr.length;
        int[] left_max = new int[len];
        int[] right_max = new int[len];
        
        left_max[0] = arr[0];
        for(int i=1;i<len;i++){
            left_max[i] = Math.max(arr[i],left_max[i-1]);
        }
        right_max[len-1] = arr[len-1];
        for(int i=len-2;i>=0;i--){
            right_max[i] = Math.max(arr[i],right_max[i+1]);
        }
        int trapped = 0;
        int waterlevel = 0;
        for(int i=0;i<len;i++){
            waterlevel = Math.min(left_max[i],right_max[i]) - arr[i];
            trapped += waterlevel;
        }
        return trapped;
    }
}

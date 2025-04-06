//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        // Hashmap<Boolean,Integer> hashmap = new Hashmap<>();
        // for(int i=0;i<arr.length();i++){
        //     hashmap(true,arr[i]);
        // }
        // if(hashmap.containsKey(false)){
            
        //     System.out.print(hashmap.get(false));
        // }
        
        int n=arr.length+1;
        long sum1 = (long)n*(n+1)/2;
        long sum2 = 0;
        for(int i=0;i<n-1;i++){
            sum2+=arr[i];
        }
        //System.out.println(sum1+","+sum2+","+n);
        return (int)(sum1-sum2);
    }
}
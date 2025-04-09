//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();

            v = new Solution().arranged(array1);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        // code here
        
        int n = arr.size();
        int pos = 0;
        int neg = 1;
        
        // int res[] = new int[n];
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, 0));
        for(int i=0;i<n;i++){
            if(arr.get(i) > 0){
                res.set(pos,arr.get(i));
                pos+=2;
            }else{
                res.set(neg,arr.get(i));
                // res[neg] = arr.get(i);
                neg+=2;
            }
        }
        return res;
    }
}

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int n =  arr.length;
        int i=0,j=n-1;
        int res = 0;
        while(i <= j)
        {
            int sum = arr[i]+arr[j];
            if(sum ==target)
            {
                if(arr[i] == arr[j])
                {
                    res += ((j-i)*(j-i+1))/2;
                    break;
                }
                else
                {
                    int cnt1 = 1,cnt2=1;
                    while(arr[i] == arr[i+1] && i < j-1)
                    {
                        i++;
                        cnt1++;
                    }
                    while(arr[j] ==arr[j-1] && i < j-1)
                    {
                        j--;
                        cnt2++;
                    }
                    i++;
                    j--;
                    res += (cnt1*cnt2);
                }
            }
            else if(sum < target)
            {
                i++;
            }
            else
            {
                j--;
            }
           
        }
        return res;
    }
}


//{ Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution obj = new Solution();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

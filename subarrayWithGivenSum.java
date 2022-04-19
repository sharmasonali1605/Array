import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }

            subarrayWithGivenSum obj = new subarrayWithGivenSum();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class subarrayWithGivenSum
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int sum)
    {
        int l=0,r=0 , temp=arr[0];
        ArrayList<Integer> ans = new ArrayList<>();
        while(r<n){
            if(temp<sum){
                r++;
                if(r<n){
                    temp=temp+arr[r];
                }
                if(r>=n){
                    ans.add(-1);
                    return ans;
                }

            }
            else if(temp>sum){
                while(temp>sum){
                    temp=temp-arr[l];
                    l++;

                }
            }
            else if(temp==sum){
                ans.add(l+1);ans.add(r+1);
                break;
            }
        }
        return ans;
    }
}
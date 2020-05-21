import java.util.*;
import java.io.*;

public class Main {
  
  public static int XORsubArray(int a[],int n){
     int res = 0; 
      
        // loop over all elements once 
      for (int i = 1; i < n+1; i++) 
      { 
            // get the frequency of 
            // current element 
        int freq = (i) * (n - i + 1); 
      
        // if frequency is odd, then  
        // include it in the result 
        if (freq % 2 == 1) 
            res = res ^ a[i];
      }
    return res;
  }
  
  
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    
    while(t>0){
      int n = s.nextInt();
      int a[] = new int[n+1];
      
      for(int i=1;i<n+1;i++){
        a[i] = s.nextInt();
      }
      
      int ans = XORsubArray(a,n);
      System.out.println(ans);
      
      --t;
    }
    
  }
}
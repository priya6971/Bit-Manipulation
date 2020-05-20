import java.util.*;
import java.io.*;

public class Main {
  
  
  public static int NumberOccurOnce(int a[],int n){
    
    // Traverse all the array and convert them to binary number
    int res = a[0];
    
    for(int i=1;i<a.length;i++){
      
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
      int a[] = new int[n];
      
      for(int i=0;i<n;i++){
        a[i] = s.nextInt();
      }
      
      int num = NumberOccurOnce(a,n);
      System.out.println(num);
      
      --t;
    }
    
  }
}
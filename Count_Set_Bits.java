import java.util.*;
import java.io.*;

public class Main {

  
  public static int CountSetBits(int n){
    int count = 0;
    while(n > 0){
      int num = n;
      
      /* Brian Kernighan's Algorithm - O(k) , where k is the number of 1's*/
      while(num > 0){
        num = num & (num-1);
        count++;
      }
      
      num = 0;
      --n;
    }
    
    return count;
  }
  
  
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    
    while(t > 0){
      int n = s.nextInt();
      int count = CountSetBits(n);
      System.out.println(count);
      --t;
    }
    
  }
}
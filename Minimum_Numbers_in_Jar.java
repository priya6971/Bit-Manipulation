import java.util.*;
import java.io.*;

public class Main {
  
  public static int MinimumValue(int X){
    int countBits[] = new int[32];
    int i = 0;
    int count = 0;
    
    while(X > 0){
      countBits[i] = X % 2;
      X = X/2;
      i++;
    }
    
    for(int j=i-1;j>=0;j--){
      if(countBits[j] == 1){
        ++count;
      }
    }
    
    return count;
  }
  
  
  
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    int X = s.nextInt();
    int num = MinimumValue(X);
    System.out.println(num);
    
  }
}
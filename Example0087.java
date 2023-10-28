//------------------------------------------ Post-increment ------------------------------------------

import java.util.*;
class Example0087{
  public static void main (String[] args) {
        //1. Post-Increment Operator
      int a = 5;
      int b = 7;
       
      int c = a++ + b; //Here 'a' will not incremented immediately, a++ will still return value 5.
      //  c = 5   + 7 and this will evaluate to 12.
       
      System.out.println("Post- Increment \n c = "+ c);
  }
}

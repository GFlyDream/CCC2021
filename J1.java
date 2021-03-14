import java.util.Scanner; // import the Scanner class 
/*
Problem J1- 2021
*/

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int S;
//Enter boil temperature (B)
    int B = myObj.nextInt();  
if(B > 200 || B < 80) return;
//Calculate Pressure (P) 
    int P = 5*B-400;
//Check if above or below sea level
    if(P < 100){
      S = 1;
    } else if (P == 100){
      S = 0;
    } else {
      S = -1;
    }

//Print Pressure
    System.out.println(P);  
//Print sea level
    System.out.println(S);      
  }
}

//Sum of digit of a number using recursion
import java.util.Scanner;
class SumDigit{
static int sumOfDigit(int n){
if(n==0){
return 0;
}else{
  return n%10+sumOfDigit(n/10);
}
}
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter number:");
  int n=sc.nextInt();
  int result=sumOfDigit(n);
System.out.println("Result is:"+result);

}
}
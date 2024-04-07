//print 1to n number using recursion
import java.util.Scanner;
class PrintNum{
 static void print(int n){
if(n>=1){

 print(n-1);
 System.out.println(n);
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number:");
int n=sc.nextInt();
print(n);
}
}
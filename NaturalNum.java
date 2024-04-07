//2. Sum of natural numbers using recursion
import java.util.Scanner;
class NaturalNum{
static int sumNaturalNum(int n){
if(n<=1){
return n;
}else{
  return n+sumNaturalNum(n-1);
}

}
  
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n<=0){
System.out.println("Enter positive integer");
}else{
int sum=sumNaturalNum(n);
System.out.print("Sum is:"+sum);
}

}
}
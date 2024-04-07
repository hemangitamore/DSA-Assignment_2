//Print reverse of a string using recursion
import java.util.Scanner;
class Reverse{
  static void reverseStr(String str,int index){
if(index==0){
System.out.print(str.charAt(index));
return;
}
System.out.print(str.charAt(index));
reverseStr(str,index-1);

}
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter string:");
String str=sc.nextLine();
System.out.println("Reverse string is:");
reverseStr(str,str.length()-1);



}
}

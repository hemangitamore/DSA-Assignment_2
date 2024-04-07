import java.util.Scanner;
class SumOfArrNum{
static int sumOfArrElements(int arr[],int n){
if(n==0){
return 0;
}else{
  return sumOfArrElements(arr,n-1)+arr[n-1];
}

}
  
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
  arr[i]=sc.nextInt();
}
int result=sumOfArrElements(arr,n);
System.out.println("Sum is:"+result);
sc.close();
}
}
}
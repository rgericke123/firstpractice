import java.util.Scanner;
class Factorial1 {
public static void main(String args[]){ 

Scanner scan=new Scanner(System.in);


System.out.println("Enter a number to find the factorial:"); 
int num=scan.nextInt();
Factorial2(num);
}
static void Factorial2(int num)
{
int i,f=1;
for(i=1; i<=num; i++){
f=f*i;
}
System.out.print("Factorial of the "+num+"is "+f); 

}
}
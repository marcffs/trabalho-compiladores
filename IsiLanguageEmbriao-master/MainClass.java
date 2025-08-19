import java.util.Scanner;
public class MainClass{ 
  public static void main(String args[]){
       Scanner _key = new Scanner(System.in);
double  a;
double  b;
double  w;
double  x;
double  y;
a= _key.nextDouble();
b= _key.nextDouble();
w = a*(b+7);
x = b/(11*a);
y = 5+a*3-b;
System.out.println(w);
System.out.println(x);
System.out.println(y);
  }}
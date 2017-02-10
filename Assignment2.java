class Assignment2
{
public static void main(String args[])
{
int a,b,c,d,e;

a=20;
b=10;

 b= a-- - --a;
 c=a--;
 d=a>>2;
 e=a&b;

System.out.println("Output of exp:(b= a-- - --a)="+b+" And a="+a);
System.out.println("Output of exp: (c=a--)="+c+" And a="+a);
System.out.println("Output of exp: (d=a>>2)="+d);
System.out.println("Output of exp: e=a&b"+e);
}
}
import java.util.*;
class fact{
public static void main(String args[])
{
int fact=1,i;
int n=Integer.parseInt(args[0]);
  if(n==0)
    System.out.print("1");
  else if(n<0)
    System.out.print("Number should be a positive");
  else
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.print(fact);
}
}

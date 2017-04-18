import java.util.*;
class fact{
public static void main(String args[])
{
int fact=1,i;
int n=Integer.parseInt(args[0]);
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.print(fact);
}
}

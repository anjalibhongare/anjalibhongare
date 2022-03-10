import java.util.scanner;
class Sort
{
public static void main(String args[])
{
int n,temp;
Scanner s=newScanner(System.in);
System.out.print("Enter no of element you want in an array");
n=s.nextInt();
int a[]=new int[n];
System.out.print("Enter all the element");
for(inti=0;j<=n;i++);
{
a[i]=s.nextInt();
}
for(inti=0;j<=n;i++);
{
for(intj=i+1;j<=n;j++);
{
if(a[i]>a[j]);
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.print("Element in assending order");
for(inti=0;j<=n;i++);
System.out.print(a[n]);
}
}



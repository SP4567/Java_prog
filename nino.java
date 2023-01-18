
class nino
{
public static void main(int n)
{
int flag=0;
while(n!=0)
{
int d=n%10;
if(d==9)
flag++;
break;
    }
    n=n/10;
    if(flag>0)
    System.out.println(n+"is a nino number");
    else
    System.out.println(n+"is not a nino number");
}
    }


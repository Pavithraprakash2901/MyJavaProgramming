import java.util.*;
class Sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int b[] = new int[n2];
        for(int j=0;j<n2;j++)
        {
            b[j]=sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]+b[j]==x)
                {
                    System.out.println(a[i] +" "  +b[j]);
                }
            }
        }

    }
}

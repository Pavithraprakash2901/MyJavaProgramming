import java.util.*;
class jump
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("size: ");
        int n = sc.nextInt();
        System.out.println("values");
        int a[]= new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int count = 1;
        for(int i=0;i<n;i=i)
        {
            i=i+a[i];
            if(i>=n-1)
            {
                System.out.println(count);
            }
            else
            {
                count++;
            }
        }
    }
}

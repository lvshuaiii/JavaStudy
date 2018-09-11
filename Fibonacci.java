public class Fibonacci
{
	//String breed="ss";
    int f(int n)
    {
		if((n==1)||(n==2))
		{
			return 1;
		}
		else
		{
			return f(n-1)+f(n-2);
		}
    }
    public static void main(String[] args)
    {
		Fibonacci fa=new Fibonacci();
		int a=fa.f(6);
		String temp=a+"";
		String temp1=String.valueOf(a);
        System.out.println(Integer.toString(a));
		System.out.println(temp);
		System.out.println(temp1);
    }
}

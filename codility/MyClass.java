package codilityTest;

public class MyClass {
    public static void main(String args[]) {
		char[] a = {'a', 'b', 'b', 'b', 'b', 'b', 'c', 'd', 'e', 'e', 'e', 'f', 'f', 'g', 'h', 'i', 'i', 'i', 'j', 'k', 'k', 'l'};
		char[] b = new char[a.length];
		int[] c = new int[a.length];
		char target = ' ';
		int count = 0;
		int x = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (target != a[i]) 
			{
				if (i != 0)
				{
					b[x] = target;
					c[x] = count;
					target = a[i];
					count = 0;
					x++;
				}
				else
				{
					target = a[i];
					b[x] = a[i];
				}
			}
			count++;
		}
		b[a.length-1] = a[a.length-1];
		c[a.length-1] = count;
		for (int i= 0; i < b.length; i++)
		{
			if (c[i] > 0)
			{
				System.out.println(b[i] + "   " + c[i]);
			}
		}
    }
}
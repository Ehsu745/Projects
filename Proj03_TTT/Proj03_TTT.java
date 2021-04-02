import java.util.*;

public class Proj03_TTT
{
	static void pt(String[] a)
	{
		System.out.println("Player 1 (X), Player 2 (O)");
		System.out.println("     |     |     ");
		System.out.println("  " + a[0] + "  |  " + a[1] + "  |  " + a[2]+ "  ");
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  " + a[3] + "  |  " + a[4] + "  |  " + a[5]+ "  ");
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  " + a[6] + "  |  " + a[7] + "  |  " + a[8]+ "  ");
		System.out.println("     |     |     ");
	}

	static String ck(String[] a)
	{
		for(int i = 0; i < 9; i++)
		{
			if(i == 0 || i == 3 || i == 6)
			{
				if(a[i] == a[i + 1] && a[i] == a[i + 2])
					return(a[i]);
				if(i == 0 && a[i] == a[i + 4] && a[i + 4] == a[i + 8])
					return(a[i]);
			}
			if(i == 0 || i == 1 || i == 2)
			{
				if(a[i] == a[i + 3] && a[i + 3] == a[i + 6])
					return(a[i]);
				if(i == 2 && a[i] == a[i + 2] && a[i + 2] == a[i + 4])
					return(a[i]);
			}
		}
		return("n");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		String c;
		String str;
		String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] brr = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

		pt(arr);
		for(int k = 0; k < 9; k++)
		{
			System.out.print("Player " + (k % 2 + 1) + ": ");
			i = sc.nextInt();
			c = ((k % 2) == 0? "\033[1;31m" + "X" + "\033[0m": "\033[1;32m" + "O" + "\033[0m");
			if(arr[i - 1] != brr[i - 1])
			{
				System.out.println((i - 1) + " is not available");
				k--;
				continue;
			}
			arr[i - 1] = c; 
			if(ck(arr) != "n")
			{
				pt(arr);
				str = (ck(arr) == "\033[0;31m" + "X" + "\033[0m"? "Player 1": "Player 2");
				System.out.println(str + " wins\n");
				return;
			}
			else
				pt(arr);
		}
		System.out.println("No one wins");
	}
}

import java.util.*;

public class Proj02_RPC
{
	static void ck(int r)
    {
        if(r == -1 || r == 2)
            System.out.println("You won");
        else if(r == 0)
            System.out.println("It is a draw");
        else
            System.out.println("You lose");
    }

	static String sw(int ouo)
    {
		img ptObj = new img();
        switch(ouo)
        {
            case 0:
				ptObj.sci();
                return("scissor");
            case 1:
				ptObj.roc();
                return("rock");
            case 2:
				ptObj.pap();
                return("paper");
            default:
                System.out.print("Error");
				return("!");
        }
    }

	public static void main(String[] args)
	{
		boolean flag = false;
		int i, s;

		s = 1;
		try
		{
				System.out.print("Rock Paper Scissor\nscissor (0), rock (1), paper (2): ");
				Scanner sc = new Scanner(System.in);
				s = sc.nextInt();
				if(!(s >= 0 && s <= 2))
				{
					System.out.println("Input Error-02: Enter only 0, 1 or 2!");
					return;
				}
				sc.close();
				flag = true;
		} 
		catch(Exception e)
		{
			System.out.println("Input Error-01: " + e);
		}

		if(flag == true)
		{
			String o = " too";
			i = (int)(Math.random()*10) % 3;
			System.out.println("The computer is " + sw(i) + ".");
			o = (i == s? o: "");
			System.out.println("You are " + sw(s) + o +".");
			ck(i - s);
		}
	}
}

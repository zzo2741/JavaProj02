package project2;

import java.util.Scanner;

import project2.ver02.AccountManager;
import project2.ver02.MenuChoice;

public class BankingSystemVer02 implements MenuChoice
{
	public final static int MAX_SAVE_NUM = 50;

	public static void main(String[] args)
	{
		AccountManager am = new AccountManager(MAX_SAVE_NUM);

		while (true)
		{
			am.showMenu();

			Scanner sc = new Scanner(System.in);
			int selNum = sc.nextInt();

			switch (selNum)
			{
			case MAKE:
				am.makeAccount();
				break;

			case DEPOSIT:
				am.depositMoney();
				break;

			case WITHDRAW:
				am.withdrawMoney();
				break;

			case INQUIRE:
				am.showInfo();
				break;

			case EXIT:
				am.exit();
				break;
			}

		}
	}
}

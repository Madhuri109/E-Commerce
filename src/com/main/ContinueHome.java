package com.main;
import java.util.Scanner;

import com.main.MainActivity;

public class ContinueHome {

public static void continueApp()
{
	Scanner userInput = new Scanner(System.in);
    boolean noSelection = true;
    do {
        System.out.println("Do You Want To Continue This User Home ? Y/N");

        char userChoice = userInput.next().charAt(0);

        switch (userChoice) {
            case 'y':
            FinalProject.UserHomeActivity();
             System.exit(0);
                break;

            case 'n':
            	MainstartupOptions();
                break;

            default:
                System.out.println("That is not a valid entry");

        }

    }  while (noSelection);

    System.out.println("After the selection the program continues");
}


	
private static void MainstartupOptions() {
	FinalProject.startupOptions();
	
}



private static void startupOptions() {
	UserHome.startupOptions();
		
}



}

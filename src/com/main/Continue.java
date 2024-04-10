package com.main;
import java.util.Scanner;

import com.main.MainActivity;

public class Continue {

public static void continueApp()
{
	Scanner userInput = new Scanner(System.in);
    boolean noSelection = true;
    do {
        System.out.println("Do You Want To Continue This Aplication? Y/N");

        char userChoice = userInput.next().charAt(0);

        switch (userChoice) {
            case 'y':
            startupOptions();
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
	MainActivity.startupOptions();
	
}



private static void startupOptions() {
	 MainActivity.startupOptions();
		
}



}

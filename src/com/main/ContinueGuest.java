package com.main;


import java.util.Scanner;

import com.main.MainActivity;

public class ContinueGuest {

public static void continueApp()
{
	Scanner userInput = new Scanner(System.in);
    boolean noSelection = true;
    do {
        System.out.println("Do You Want To Continue This Guest Home? Y/N");

        char userChoice = userInput.next().charAt(0);

        switch (userChoice) {
            case 'y':
            startupOptions();
             System.exit(0);
                break;

            case 'n':
            	GueststartupOptions();
                break;

            default:
                System.out.println("That is not a valid entry");

        }

    }  while (noSelection);

    System.out.println("After the selection the program continues");
}
	
public static void GueststartupOptions() {
	MainActivity.startupOptions();
}

public static void startupOptions() {
GuestHome.startupOptions();
		
}



}


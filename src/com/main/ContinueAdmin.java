package com.main;
import java.util.Scanner;

import com.main.MainActivity;

public class ContinueAdmin {

public static void continueApp()
{
	Scanner userInput = new Scanner(System.in);
    boolean noSelection = true;
    do {
        System.out.println("Do You Want To Continue This Admin Home? Y/N");

        char userChoice = userInput.next().charAt(0);

        switch (userChoice) {
            case 'y':
            startupOptions();
             System.exit(0);
                break;

            case 'n':
            	 AdminstartupOptions(); 
                break;

            default:
                System.out.println("That is not a valid entry");

        }

    }  while (noSelection);

    System.out.println("After the selection the program continues");
}
	
public static void AdminstartupOptions() {
	MainActivity.startupOptions();
	
}

public static void startupOptions() {
AdminHome.startupOptions();
		
}



}

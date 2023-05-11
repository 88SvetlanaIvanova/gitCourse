package bg.jug.academy;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String password = "let me in";
        String name = "Clare";
        boolean welcome = false;
        String guess = scanner.nextLine();

        while(!guess.equals(password)){
            System.out.println("Guess the password:");
            guess = scanner.nextLine();
        }
        System.out.println("congrats");
        scanner.close();

        /*if (name.toLowerCase().equals("clare")) welcome = true;
        System.out.println("Welcome, Clare!");
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);
        String string = new String("This is a string");
        String easier = "Wow, that was easy!";
        String name = "300";

       /* Integer a = Integer.valueOf(money);
       // int b = Integer.parseInt(money);

        boolean welcome;

        if (name.equals("300")){
            welcome = true;
        } else {
            welcome = false;
        }

        //boolean welcome1 = name.equals("clare") ? true : false;*/

    }





}


import java.util.Scanner;

public class accept_user_input {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you?" );
        int age = scanner.nextInt();
        scanner.nextLine(); //Hopper over en linje etter int for å kunne svare på neste linje
        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello " +name);
        System.out.println("You are " +age+ " years old");
        System.out.println("You like " +food);

    }
}

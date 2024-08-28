import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: James
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favoriteFood;
        System.out.println("Your age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("first name: ");
        firstName = scanner.nextLine();
        System.out.println("Favorite food: ");
        favoriteFood = scanner.nextLine();
        System.out.println("First name:"+ firstName +"\n");
        System.out.println("Age:" +age+"\n");
        System.out.println("Favorite food:"+favoriteFood+"\n ");
        scanner.close();







    }

}


package Application;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]){
        int option;
        Double fnum, snum, result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1 for Addition, 2 for Subtraction, 3 for multiplication and 4 for division: ");
        option = scan.nextInt();
        if(option==1){
            System.out.println("You have chose Addition");
        }
        else if(option==2){
            System.out.println("You have chose Subtraction");
        }
        else if(option==3){
            System.out.println("You have choose Multiplication");
        }
        else if(option == 4){
            System.out.println("you have choose Division");
        }
        System.out.print("Enter 1st number here: ");
        fnum = scan.nextDouble();
        System.out.print("Enter 2nd number here: ");
        snum = scan.nextDouble();

        switch (option){
            case 1:
                result = fnum+snum;
                System.out.println("Answer: "+ result);
                break;
            case 2:
                result = fnum-snum;
                System.out.println("Answer: "+ result);
                break;
            case 3:
                result = fnum*snum;
                System.out.println("Answer: "+ result);
                break;
            case 4:
                result = fnum/snum;
                System.out.println("Answer: "+ result);
                break;
        }

    }
}

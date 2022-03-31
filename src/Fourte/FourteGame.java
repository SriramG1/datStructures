package Fourte;

import java.util.ArrayList;
import java.util.Scanner;

public class FourteGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean key = true;
        while (key) {
            System.out.println("Enter Number : ");
            int number = scanner.nextInt();

            ArrayList<Integer> array = new ArrayList<>();
            System.out.println("Enter Number four number in single digit :");
            for (int i = 0; i < 4; i++) {
                array.add(scanner.nextInt());
            }
            int condition = 4;
            int answer = 0;

            while (condition > 0) {
                System.out.println("Your Number :" + number);
                System.out.println("Your Option :" + array);
                System.out.println("Enter Number Given Below :");
                int userOption = scanner.nextInt();

                System.out.println("Enter Your Operator\n '+' '-' '*' '/' Or Press '0' -> concat");
                String operator = scanner.next();

                switch (operator) {
                    case "+" -> answer = answer + userOption;
                    case "-" -> answer = answer - userOption;
                    case "*" -> {
                        if (answer == 0) {
                            answer = 1;
                        }
                        answer = answer * userOption;
                    }
                    case "/" -> {
                        if (answer == 0) {
                            answer = 1;
                        }
                        answer = answer / userOption;
                    }
                    case "0" -> answer = (answer * 10) + userOption;
                    default -> {
                    }
                }
                System.out.println("answer " + answer);

                int index = 0;
                for (int i = 0; i < array.size(); i++) {
                    if (array.get(i) == userOption) {
                        index = i;
                    }
                }
                array.remove(index);
                condition--;
            }
            if (answer == number) {
                System.out.println("Answer is correct...(" + answer + ")");
                key=false;
            }
            else {
                System.out.println("Answer is not correct...(" + answer + ")");
                System.out.println("Enter your option :\n(0)-->For Exit (1)-->For continue ");
                int choice = scanner.nextInt();
                if(choice==0){
                    key=false;
                }
            }
        }
    }
}
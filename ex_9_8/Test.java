package ex_9_8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan = new Fan();
        Fan fan1 = new Fan();

        fan.setOn(false);
        fan1.setOn(false);

        System.out.println("Enter the Fan 1 or 2 and whether it is on or off");

        for (int i = 0; i < 2; i++) {
            int Fann = scanner.nextInt();
            String choice = scanner.next().toLowerCase();

            switch (Fann) {
                case 1: {
                    switch (choice) {
                        case "on":
                            fan.setOn(false);
                            System.out.println(fan.toString());
                            break;

                        case "off":
                            fan.setOn(true);
                            System.out.println(fan.toString());
                            break;

                        default:
                            System.out.println("Invalid choice. Please enter 'on' or 'off'.");
                            break;
                    }
                    break;
                }

                case 2: {
                    switch (choice) {
                        case "on":
                            fan1.setOn(false);
                            fan1.setColor("yellow");
                            System.out.println(fan1.toString());
                            break;

                        case "off":
                            fan1.setOn(true);
                            System.out.println(fan1.toString());
                            break;

                        default:
                            System.out.println("Invalid choice. Please enter 'on' or 'off'.");
                            break;
                    }
                    break;
                }

                default:
                    System.out.println("Invalid fan number. Please enter 1 or 2.");
                    break;
            }
        }
    }
}

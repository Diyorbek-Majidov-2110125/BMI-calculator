package project_1.BMI_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of clients: ");
        int n = input.nextInt();
        BMI[] clients = new BMI[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Client " + (i + 1));
            System.out.print("Enter client's name: "); input.nextLine();String name = input.nextLine();
            System.out.print("Enter client's age: ");Integer age = input.nextInt();
            System.out.print("Enter client's weight(in kg): ");Double weight = input.nextDouble();
            System.out.print("Enter client's height(in meter): ");Double height = input.nextDouble();

            clients[i] = new BMI(name, age, weight, height);
        }

        for(int i = 0; i < clients.length; i++){
            System.out.println("_____________________________________");
            System.out.println(clients[i]);
            System.out.println("Client's bmi: " + clients[i].getBMI());
            System.out.println("Client's status: " + clients[i].getStatus());

        }
    }
}

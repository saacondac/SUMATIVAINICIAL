package com.example.sumativainiciall;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

    public class HelloApplication {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();


            for (int i = 0; i < Math.abs(number); i++) {

                for (int j = 0; j < number - i - 1; j++) {
                    System.out.print(" ");
                }


                for (int j = 0; j <= i; j++) {
                    System.out.print("_");
                }


                System.out.println();
            }

            // if the number is 0,
            if (number == 0) {
                System.out.println("");
            }
        }
    }

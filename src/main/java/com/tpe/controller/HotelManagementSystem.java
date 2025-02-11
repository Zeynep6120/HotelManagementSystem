package com.tpe.controller;

import com.tpe.config.HibernateUtils;

import java.util.Scanner;

public class HotelManagementSystem {

    private static Scanner scanner =new Scanner(System.in);

    //ana menü kullanıcıya gösterilir ve seçimi alınır.

    public static void displayHotelManagementSystemMenu() {
        int choice;
        do {
            System.out.println("========== Hotel Management System ==========");
            System.out.println("1.Hotel Operations");
            System.out.println("2.Room Operations");
            System.out.println("3.Guest Operations");
            System.out.println("4.Reservation Operations");
            System.out.println("0.Exit");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();// \n
            scanner.nextLine();

            switch(choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Good Bye...");
                    HibernateUtils.shutDown();
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
                    break;
            }

        }while(choice!=0);

    }
    // her bir kategori için ayrı methodlar oluşturalım:işlemleri gösteren ve seçimini alan

}




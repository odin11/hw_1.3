package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //task1

            byte clientOS = 1;

            switch (clientOS){
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("not_corrected");
            }

            /*if  (clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("not_corrected");
            }*/

        //task2

            int clientDeviceYear = 2015;
            if (clientDeviceYear >= 2015 && clientOS == 0 ) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientDeviceYear >= 2015 && clientOS == 1 ) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientDeviceYear < 2015 && clientOS ==0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }  else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }


        //task3

            int year = 2022;
            if ((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0))  {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }

        //task4

            int deliveryDistance = 95;
            int days = 1;
            if (deliveryDistance < 20) {
                //days = days;
            }
            else if (deliveryDistance >= 20 && deliveryDistance <60) {
                days = days + 1;
            } else if (deliveryDistance >= 60 && deliveryDistance <100){
                days = days + 2;
            }
            System.out.println("Потребуется дней: " + days);

        //task5

            int monthNumber = 12;
            if (monthNumber<13) {
                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("зимушка пришла");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("весна сейчас всё покажет");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("лето же");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("осень-осень");
                        break;
                    default:
                        break;
                }
            }
    }
}

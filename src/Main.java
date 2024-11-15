public class Main {
    public static void main(String[] args) {
        int year = 2024;
        int phone = 0;
        int deliveryDistanse = 65;
        int days = 2;
        int relize = 2014;
        leapYear(year);
        phoneVersion(relize, phone);
        Delivery(deliveryDistanse, days);
    }
    public static void leapYear(int year){

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 1000 == 400)){
            System.out.println(year+" год — високосный год");
        } else {
            System.out.println(year+" год — невисокосный год");
        }
    }
    public static void phoneVersion(int relize, int phone){
        if (relize <= 2015 && phone == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (phone == 0 && relize <= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (relize > 2015 && phone == 1){
            System.out.println("Установите приложения для Android по ссылке");
        } else if (relize > 2015 && phone == 0){
            System.out.println("Установите приложения для IOS по ссылке");
        } else {
            System.out.println("ошибка");
        }
    }
    public static void Delivery(int deliveryDistanse, int days) {
        if (deliveryDistanse < 20) {
            System.out.println("Потребуется дней: " + days);
        } else if ((20 < deliveryDistanse) && (deliveryDistanse < 60)) {
            System.out.println("Потребуется дней: " + (days + 1));
        } else if ((60 < deliveryDistanse) && (deliveryDistanse < 100)) {
            System.out.println("Потребуется дней: " + (days + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }
}
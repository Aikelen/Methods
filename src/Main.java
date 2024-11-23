public class Main {
    public static void main(String[] args) {
        int year = 2800;
        int phone = 0;
        int relize = 2024;
        leapYear(year);
        phoneVersion(relize, phone);

        int deliveryDistanse = 65;
        int days = Delivery(deliveryDistanse);
        if (days == -1){
            System.out.println("Доставки нет");
        } else {
            System.out.println("Доставка займет "+days+" дня");
        }

    }
    public static void leapYear(int year){

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
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
    public static int Delivery(int deliveryDistanse) {
        if (deliveryDistanse < 20) {
            return 2;
        } else if ((20 <= deliveryDistanse) && (deliveryDistanse <= 60)) {
            return 3;
        } else if ((60 <= deliveryDistanse) && (deliveryDistanse <= 100)) {
            return 4;
        } else {
            return -1;
        }

    }
}
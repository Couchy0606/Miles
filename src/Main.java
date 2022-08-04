public class Main {

    public static void main(String[] args) {

        int amount = 25000; // стоимость билета
        int discount = 20; // 1 миля за каждые 20 руб

        int bonus = amount / discount;

        System.out.printf("Итого начисленных миль: " + bonus);

    }
}

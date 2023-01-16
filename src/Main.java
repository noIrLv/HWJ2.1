public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1000;

        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100 * 1;
        } else {
            bonus = 0;
        }

       /*int amount = balance + refill + bonus;
        System.out.println("Баланс вашего счета после пополения составил: " + amount  + ". Бонусные рубли за пополение составили: " + bonus);

        */
        String text;
        if (bonus > 0) {
            text = ". Бонусные рубли за пополнение составили: " + bonus;
        } else {
            text = ". Для получения бонусного баланса пополните счет на 1000 рублей и больше.";
        }
        int amount = balance + refill + bonus;
        System.out.println("Баланс вашего счета после пополения составил: " + amount + text);
    }
}

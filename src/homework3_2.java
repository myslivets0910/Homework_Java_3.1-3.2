public class homework3_2 {
    public static void main(String[] args) {
        System.out.println("Добрый день!");
        int clientAccount = 100;
        int scaleBonus = 100;
        int refill = 1100;
        int bonus;

        if (refill >= 1000){
            bonus = refill / scaleBonus;
        } else {
            bonus = 0;
        }

        int balance = clientAccount + refill + bonus;

        System.out.println("Вы пополнили счёт на " + refill + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + balance + " руб.");
    }
}
public class homework3_1 {
    public static void main(String[] args) {
        System.out.println("Добрый день!");
        int totalTicket = 13_676;
        System.out.println("Стоимость билета " + totalTicket + " руб.");
        System.out.println("У нас работает бонусная программа, за каждые 20 рублей стоимости билета" +
                " вам будет начисляться 1 бесплатная бонусная миля.");
        int resultOneMiles = 20;
        int bonusMiles = totalTicket / resultOneMiles;


        System.out.println("Ваш бонус составляет " + bonusMiles + " миль.");
    }
}

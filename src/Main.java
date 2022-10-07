public class Main {
    public static void main(String[] args) {
        int count = 100; // Остаток на счёте
        int depositAmount = 1100; // Сумма пополнения
        int perHundred = 100; // За каждые 100 рублей бонус 1 рубль

        int bonus;
        if(depositAmount > 1000) {
            bonus = depositAmount / perHundred; // Бонусов за каждые 100 рублей при пополнении свыше 1000 рублей
        } else {
            bonus = 0; // Бонусов при пополнении не более 1000 рублей
        }

        System.out.println("На вашем счёте " + (count + depositAmount + bonus) + " рублей.");
    }
}
public class Main {
    public static void main(String[] args) {
        int price = 15_000;

        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(price);

        System.out.println("Дополнительные бонусные милли: " + miles);
    }
}
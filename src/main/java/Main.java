public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

        long actual = service.calculate(amount, registered);

        boolean passed = amount == actual;

        System.out.println(passed);
    }
}


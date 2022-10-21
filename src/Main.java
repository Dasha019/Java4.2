public class Main {

    public static void main(String[] args) {
        BmService service = new BmService();
        double bodyIndex = service.calculate(50, 1.65);
        System.out.println(bodyIndex);
    }
}
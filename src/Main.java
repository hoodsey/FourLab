public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 56;
        double height = 1.73;
        double bodyMassIndex = service.calculate(weight, height);
        System.out.println(bodyMassIndex);
    }
}
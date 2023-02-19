public class BmiService {
    public double calculate(int weight, double height) {
        double result = weight / (height * height);// Рассчёт индекса массы тела
        return result;
    }
}

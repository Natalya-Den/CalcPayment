
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = 0;

        payment = service.calculate (1_000_000, 9.99, 1);
        System.out.println("Ежемесячный платеж: " + payment);
        payment = service.calculate (1_000_000, 9.99, 2);
        System.out.println("Ежемесячный платеж: " + payment);
        payment = service.calculate (1_000_000, 9.99, 3);
        System.out.println("Ежемесячный платеж: " + payment);
    }
}
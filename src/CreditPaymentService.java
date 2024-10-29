public class CreditPaymentService {
    public double calculate (int amount, double interestRate, int period) {

        double payment = amount * (interestRate/12/100+(interestRate/12/100)/(Math.pow(1 + interestRate/12/100, period*12)-1));
        return payment;
    }
}

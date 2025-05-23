public class CreditPaymentService {
    public double calculate(int credit, int periud) {

        double percent = 9.99;    // процент кредита
        double monthly_percentage = percent / 12 / 100; // месячный процент
        int loan_term = periud * 12; // срок кредита в месяцах

        double a = Math.pow(1 + monthly_percentage, loan_term); // вынес из формулы (1 + М)^S)


        double Annuity_ratio = (monthly_percentage * a) / (a - 1);    //К = (М × (1 + М)^S) / ((1 + М)^S // М — месячная процентная ставка по кредиту; S — срок кредита в месяцах.
        double result = credit * Annuity_ratio;    // Х = С * К, где X — аннуитетный платёж, С — сумма кредита, К — коэффициент аннуитета
        return (int)result;
    }


}




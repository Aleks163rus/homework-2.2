public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;  // сумма кредита
        int periud = 1;          //срок кредита

        double payment = service.calculate(credit, periud);
        System.out.println();
        System.out.println("Ежемесячный платеж "+ payment+ "р.");
        System.out.println();

        payment = service.calculate(1_000_000, 2);
        System.out.println("Ежемесячный платеж "+ payment+ "р.");
        System.out.println();

        payment = service.calculate(1_000_000, 3);
        System.out.println("Ежемесячный платеж "+ payment+ "р.");
        System.out.println();


    }
}



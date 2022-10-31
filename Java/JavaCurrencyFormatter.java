public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale locale = new Locale("en", "US");
        Locale locale1 = new Locale("zh", "CN");
        Locale locale2 = new Locale("fr", "FR");
        Locale locale3 = new Locale("en","in");
               
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        NumberFormat currencyFormatter1 = NumberFormat.getCurrencyInstance(locale1);
        NumberFormat currencyFormatter2 = NumberFormat.getCurrencyInstance(locale2);
        NumberFormat currencyFormatter3 = NumberFormat.getCurrencyInstance(locale3);
        
        System.out.println("US: " + (currencyFormatter.format(payment)));
        System.out.println("China: " +(currencyFormatter1.format(payment)));
        System.out.println("France: " + (currencyFormatter2.format(payment)));
        System.out.println("India: " +(currencyFormatter3.format(payment)));
        
       
    }
}

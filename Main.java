public class Main {
    public static void main(String[] args) {

        LazyNumberDetails lnd = new LazyNumberDetails(12);
        lnd.isPrime();
        lnd.isPerfect();
        lnd.isPrime();
        lnd.isMagic();
        lnd.isPerfect();
        lnd.isMagic();

        System.out.println();

        lnd.updateNumber(15);
        lnd.isPrime();
        lnd.isPerfect();
        lnd.isPrime();
        lnd.isMagic();
        lnd.isPerfect();
        lnd.isMagic();
    }
}

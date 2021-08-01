public class LazyNumberDetails {
    private int number;
    private int lastPrime;
    private int lastPerfect;
    private int lastMagic;
    private boolean checkPrime;
    private boolean checkPerfect;
    private boolean checkMagic;

    public LazyNumberDetails(int number) {
        this.number = number;
    }

    public void updateNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number == lastPrime) {
            System.out.println("Intra aici?");
            return checkPrime;
        }
        lastPrime = number;

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Nu este prim");
                checkPrime = false;
                return false;
            }
        }
        System.out.println("Este Prim");
        checkPrime = true;
        return true;
    }

    public boolean isPerfect() {
        int sum = 0;
        int i;

        if (number == lastPerfect) {
            System.out.println("Intra aici?");
            return checkPerfect;
        }

        lastPerfect = number;
        for (i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (number == sum) {
            System.out.println("Este numar perfect");
            checkPerfect = true;
            return true;

        }
        System.out.println("Nu este numar perfect");
        checkPerfect = false;
        return false;
    }

    public boolean isMagic() {
        if (number == lastMagic) {
            System.out.println("Intra aici?");
            return checkMagic;
        }
        int sum = 0;
        int aux = number;
        lastMagic = number;

        while (aux > 9) {
            sum = 0;
            while (aux != 0) {
                sum += aux % 10;
                aux /= 10;
            }
            aux = sum;
        }
        if (sum == 3 || sum == 7 || sum == 9) {
            System.out.println("Este numar magic");
            checkMagic = true;
            return true;
        }

        System.out.println("Nu este numar magic");
        checkMagic = false;
        return false;
    }

}
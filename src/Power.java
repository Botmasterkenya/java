public class Power {
    public static void main(String[] args) {
        /*double base;
        double exponent;
        base = 4;
        exponent = 3;

//Math.pow is used when raising numbers to certain exponentials
        double result = Math.pow(base, exponent);

        System.out.println("4 to power 3 is = " + result);
    }
}*/
        int result = 1;
        for (int i = 2; i <= 5; i++) {
            result *= 2;
        }
        System.out.println("Result: " + result);
    }
}// 32
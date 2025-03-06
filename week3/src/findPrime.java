public class findPrime {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        for (int i = 0; number <=i; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0 ) {
                    isPrime = false;
                    break;
                }
                if(isPrime){
                    System.out.print(i);
                }
            }
        }
    }
}

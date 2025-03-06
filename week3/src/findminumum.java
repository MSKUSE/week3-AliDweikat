public class findminumum {
    public static void main(String[] args) {
        if (args.length != 3) {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int number3 = Integer.parseInt(args[2]);

            boolean min_number1 = number1 < number2 && number1 < number3;
            boolean min_number2 = number2 < number1 && number2 < number3;
            int minimum = min_number1 ? number1 : min_number2 ? number2 : number3;
            System.out.println(minimum);
        }else{
            System.out.println("Invalid ");
        }
    }
}

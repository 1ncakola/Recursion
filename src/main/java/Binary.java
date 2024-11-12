public class Binary {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "";
        } else {
            return decimalToBinary(decimal / 2) + (decimal % 2);
        }
    }

    public static void main(String[] args) {
        int decimal = 13;
        String binary = decimalToBinary(decimal);
        System.out.println("Binary representation of " + decimal + " is: " + (binary.isEmpty() ? "0" : binary));
    }
}

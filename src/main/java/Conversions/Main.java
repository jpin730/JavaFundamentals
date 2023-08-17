package Conversions;

public class Main {

    public static void main(String[] args) {
        double numDouble = 1.5;

        int numInt = (int) numDouble;

        long numLong = (long) numDouble;

        System.out.println("numDouble: " + numDouble);
        System.out.println("numInt: " + numInt);
        System.out.println("numLong: " + numLong);

        String quantity = "4";
        String price = "1.50";

        int quantityParsed = Integer.parseInt(quantity);
        double priceParsed = Double.parseDouble(price);

        System.out.println("quantityParsed: " + quantityParsed);
        System.out.println("priceParsed: " + priceParsed);
        System.out.println("total: " + (quantityParsed * priceParsed));

    }
}

public class DataTypes {
    public static void main(String[] args) {
        // boolean 
        boolean isAlive = true;
        // byte 
        byte b = 50;
        // short 
        short s = 500;
        // int 
        int i = 5000000;
        // long
        long l = 5000000000L;
        // float 
        float f = 12.5f;
        // double 
        double d = 12.946271;
        // char 
        char c = 'A';

        System.out.println("Veri Tipleri Boyutları : ");
        System.out.println("-------------------------");
        System.out.println("Boolean : 1 Byte");
        System.out.println("Byte : " + Byte.SIZE/8 + " Byte");
        System.out.println("Short : " + Short.SIZE/8 + " Byte");
        System.out.println("Int : " + Int.SIZE/8 + " Byte");
        System.out.println("Long : " + Long.SIZE/8 + " Byte");
        System.out.println("Float : " + Float.SIZE/8 + " Byte");
        System.out.println("Double : " + Double.SIZE/8 + " Byte");

    }
}

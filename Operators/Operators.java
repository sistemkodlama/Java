public class Operators {

    public static void main(String[] args) {
        
        // Aritmetik Operatörler 
        System.out.println("7 + 4 = " + (7 + 4));     // 11
        System.out.println("7 - 4 = " + (7 - 4));     // 3
        System.out.println("7 * 4 = " + (7 * 4));     // 28
        System.out.println("7 / 4 = " + (7 / 4));     // 1
        System.out.println("7 % 4 = " + (7 % 4));     // 3 

        // Shift Operatörler 
        int i = 1;  // 0000 0001
        System.out.println("i << 1  = " + (i << 1));     // 0000 0010 = 2
        System.out.println("i << 2  = " + (i << 2));     // 0000 0100 = 4
        System.out.println("i << 3  = " + (i << 3));     // 0000 1000 = 8
        System.out.println("i >> 1  = " + (i >> 1));     // 0000 0100 = 4

        // Karşılaştırma Operatörleri
        int a = 10, b = 5;
        System.out.println("10 == 5 : " + (10 == 5));   // false 
        System.out.println("10 != 5 : " + (10 != 5));   // true 
        System.out.println("10 > 5 : " + (10 > 5));   // true 
        System.out.println("10 >= 5 : " + (10 >= 5));   // true
        System.out.println("10 < 5 : " + (10 < 5));   // false
        System.out.println("10 <= 5 : " + (10 <= 5));   // false

        // Mantıksal Operatörler
        System.out.println((1<10) && (10>5));     // true
        System.out.println((1<10) || (10>11));     // true
        System.out.println((1<10) && (10>11));     // false
        System.out.println((12<10) || (10>11));     // false
    }
}

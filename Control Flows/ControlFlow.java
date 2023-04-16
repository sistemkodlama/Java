public class ControlFlow {

    public static void main(String[] args) {
        
        int a = 9, b = 1; 
        if(a > b) {
            System.out.println("a büyüktür b 'den ! ");
        }

        int yas = 17;
        if(yas < 18) {
            System.out.println("18 yaşından küçüklere sigara satılmaz ! ");
        }

        // if-else 
        boolean is_Oyuncu1_Alive = false;
        if(is_Oyuncu1_Alive) {
            System.out.println("Oyuncu1 yaşıyor ! ");
        }
        else {
            System.out.println("Oyuncu1 öldü ! ");
        }

        // if-else if-else
        int k = 4;
        if(k == 1) {
            System.out.println("a == 1");
        }
        else if (k == 2) {
            System.out.println("a == 2");
        }
        else if (k == 3) {
            System.out.println("a == 3");
        }
        else if (k == 4) {
            System.out.println("a == 4");
        }
        else {
            System.out.println("Değer bulunamadı.");
        }

        // nested (iç-içe) if yapıları
        int i=0, j=5;
        if(i < j) {
            if(i != 0) { 
                System.out.println("i istenilen değerdedir.");
            }
            else {
                System.out.println("i = 0");
            }
        }

        // switch-case 
        int x = 3;
        switch (x) 
        {
            case 1:
                System.out.println("x = 1");
            case 2:
                System.out.println("x = 2");
            case 3:
                System.out.println("x = 3");
            default:
                System.out.println("x >= 4");
        }

    }
}

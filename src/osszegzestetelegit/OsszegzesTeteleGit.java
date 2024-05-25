
package osszegzestetelegit;

public class OsszegzesTeteleGit {

    static int[] sorozat = {0, 1, 2, 3, 5}; 
    
    public static void main(String[] args) {
        osszegzes();
        megszamlalas();
    }

    private static void osszegzes() {
        int osszead = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszead += sorozat[i];
        }
        System.out.println("[0, 1, 2, 3, 5] összege: " + osszead);
    }

    private static void megszamlalas() {
        int db = 0;
        for (int i = 0; i < sorozat.length; i++) {
            if (sorozat[i] < 3) {
                db++;
            }
        }
        System.out.println("A sorozatban " + db + " db 3-nál kisebb elem van.");
    }
    
}

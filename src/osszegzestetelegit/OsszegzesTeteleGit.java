
package osszegzestetelegit;

public class OsszegzesTeteleGit {

    static int[] sorozat = {1, 3, 5}; 
    
    public static void main(String[] args) {
        osszegzes();
    }

    private static void osszegzes() {
        int osszead = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszead += sorozat[i];
        }
        System.out.println("[1, 3, 5] összege: " + osszead);
    }
    
}

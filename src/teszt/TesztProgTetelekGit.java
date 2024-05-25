
package teszt;

import main.ProgTetelekGit;

public class TesztProgTetelekGit {
    public static void main(String[] args) {
        tesztesetek();
    }

    private static void tesztesetek() {
        
        int[] tesztErtekek = {3, 1, 7, 2};
        int kapott = ProgTetelekGit.osszegzes(tesztErtekek);
        int vart = -1;
        System.out.println("* összegzés teszt (3, 1, 7, 2)");
        assert kapott == vart : "sikertelen";
     
    }
}

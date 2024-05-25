
package teszt;

import main.ProgTetelekGit;

public class TesztProgTetelekGit {
    public static void main(String[] args) {
        tesztesetek();
    }

    private static void tesztesetek() {
        osszegzesTeszt();
        megszamlalasTeszt();
        maximumTeszt();
        minimumTeszt();
        eldontesTeszt();
    }

    private static void osszegzesTeszt() {
        int[] tesztErtekek = {1, 2, 1, 2};
        int kapott = ProgTetelekGit.osszegzes(tesztErtekek);
        int vart = 6;
        //System.out.println("* összegzés teszt (1, 2, 1, 2) = " + kapott);
        kiir("* összegzés teszt (1, 2, 1, 2) = " + kapott + "\n");
        assert kapott == vart : "sikertelen";
    }

    private static void megszamlalasTeszt() {
        int[] tesztErtekek = {1, 2, 1, 2};
        int kapott = ProgTetelekGit.megszamlalas(tesztErtekek);
        int vart = 4;
        //System.out.println("* megszámlálás teszt (1, 2, 1, 2) = " + kapott);
        kiir("* megszámlálás teszt (1, 2, 1, 2) = " + kapott + "\n");
        assert kapott == vart : "sikertelen";
    }

    private static void maximumTeszt() {
        int[] tesztErtekek = {1, 2, 1, 2};
        int kapott = ProgTetelekGit.maximumKivalasztas(tesztErtekek);
        int vart = 2;
        //System.out.println("* maximum teszt (1, 2, 1, 2) = " + kapott);
        kiir("* maximum teszt (1, 2, 1, 2) = " + kapott + "\n");
        assert kapott == vart : "sikertelen";
    }
    
    private static void minimumTeszt() {
        int[] tesztErtekek = {1, 2, 1, 2};
        int kapott = ProgTetelekGit.minimumKivalasztas(tesztErtekek);
        int vart = 1;
        //System.out.println("* minimum teszt (1, 2, 1, 2) = " + kapott);
        kiir("* minimum teszt (1, 2, 1, 2) = " + kapott + "\n");
        assert kapott == vart : "sikertelen";
    }

    private static void eldontesTeszt() {
        int[] tesztErtekek = {1, 2, 1, 2};
        int kereses = 3;
        boolean kapott = ProgTetelekGit.eldontesLegalabbEgy(kereses, tesztErtekek);
        boolean vart = false;
        //System.out.println("* eldöntés teszt van legalább egy, ami nagyobb mint 3 (1, 2, 1, 2) = " + kapott);
        kiir("* eldöntés teszt van legalább egy, ami nagyobb mint 3 (1, 2, 1, 2) = " + kapott + "\n");
        assert kapott == vart : "sikertelen";
    }
    
    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
}

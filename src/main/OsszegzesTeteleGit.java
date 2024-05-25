
package main;

public class OsszegzesTeteleGit {

    public static int[] sorozat = {0, 1, 2, 3, 5}; 
    
    public static void main(String[] args) {
        osszegzes();
        megszamlalas();
        maximumKivalasztas();
        minimumKivalasztas();
        eldontesLegalabbEgy();
    }
    
    public static int[] tombotLeker() {
        int tomb[] = sorozat;
        return tomb;
    }

    public static int osszegzes() {
        int osszead = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszead += sorozat[i];
        }
        return osszead;
    }

    public static int megszamlalas() {
        int db = 0;
        for (int i = 0; i < sorozat.length; i++) {
            if (sorozat[i] < 3) {
                db++;
            }
        }
        return db;
    }

    public static int maximumKivalasztas() {
        int maxIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if(sorozat[i] > sorozat[maxIndex]){
                maxIndex = i;
            }
        }
        return sorozat[maxIndex];
    }

    public static int minimumKivalasztas() {
        int minIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if(sorozat[i] < sorozat[minIndex]){
                minIndex = i;
            }
        }
        return sorozat[minIndex];
    }
    
    public static boolean eldontesLegalabbEgy() {
        int N = sorozat.length;
        int ker = 3;
        int i = 0;
        while(i < N && !(sorozat[i] > ker)){
            i++;
        }
        boolean valasz = i < N; 
        return valasz;
    }
    
    public static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
}

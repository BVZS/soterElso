
package main;

public class ProgTetelekGit {

    public static int[] sorozat = {0, 1, 2, 3, 5}; 
    
    public static void main(String[] args) {
        osszegzes(sorozat);
        megszamlalas(sorozat);
        maximumKivalasztas(sorozat);
        minimumKivalasztas(sorozat);
        eldontesLegalabbEgy(sorozat);
    }
    
    public static int[] tombotLeker() {
        int tomb[] = sorozat;
        return tomb;
    }

    public static int osszegzes(int[] tomb) {
        int osszead = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszead += tomb[i];
        }
        return osszead;
    }

    public static int megszamlalas(int[] tomb) {
        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < 3) {
                db++;
            }
        }
        return db;
    }

    public static int maximumKivalasztas(int[] tomb) {
        int maxIndex = 0;
        for (int i = 1; i < tomb.length; i++) {
            if(tomb[i] > tomb[maxIndex]){
                maxIndex = i;
            }
        }
        return tomb[maxIndex];
    }

    public static int minimumKivalasztas(int[] tomb) {
        int minIndex = 0;
        for (int i = 1; i < tomb.length; i++) {
            if(tomb[i] < tomb[minIndex]){
                minIndex = i;
            }
        }
        return tomb[minIndex];
    }
    
    public static boolean eldontesLegalabbEgy(int[] tomb) {
        int N = tomb.length;
        int ker = 3;
        int i = 0;
        while(i < N && !(tomb[i] > ker)){
            i++;
        }
        boolean valasz = i < N; 
        return valasz;
    }
    
    public static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
}

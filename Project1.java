
package MiniProject;

        import java.util.Arrays;
        import java.util.Random;

        import MiniProject.Project2.node;

public class Project1 {

    public static void main(String[] args) {
        for (int taille = 500; taille <= 20000; taille =taille+500) {

            int[] table = TabAleatoire(taille);

            System.out.println("Table before Sorting..");
            printTable(table,taille);
            System.out.println("             ");

            long starttime = System.currentTimeMillis();
            TriInsertionOfTable(table);
            long endtime = System.currentTimeMillis();
            System.out.println("             ");
            System.out.println("_____________________________________________");
            System.out.println("             ");
            System.out.println("Table after Sorting..");
            printTable(table,taille);

            long timeExcution = endtime - starttime;

            System.out.println("             ");
            System.out.println("               ");
            //       System.out.println(timeExcution);
            System.out.println("â—¤â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â—¥");
            System.out.println("â—– Temps d'exÃ©cution pour une taille de " + taille + ": " + timeExcution + " millisecondes â——");
            System.out.println("â—£â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â—¢");
            System.out.println("               ");
        }
    }
    public static int[] TabAleatoire(int taille) {
        int[] tableau = new int[taille];
        Random TST = new Random();
        for (int i = 0; i < taille; i++) {
            tableau[i] = TST.nextInt(20000);
        }
        return tableau;
    }
    public static void TriInsertionOfTable(int[] table) {
        int n = table.length;
        for (int i = 1; i < n; i++) {
            int v = table[i];
            int j = i - 1;
            while (j >= 0 && table[j] > v) {
                table[j + 1] = table[j];
                j = j - 1;
            }
            table[j + 1] = v;
        }

    }
    static void printTable(int[] table,int n)
    {
        for (int i = 1; i < n; i++) {

            System.out.print(table[i]+ " ");

        }
    }





}


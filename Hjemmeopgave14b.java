public class Hjemmeopgave14b {
//Delvis løsning fundet i github, som jeg har gjorde færdigt uden helt at forstå hvad der sker...hm
    public static void main(String[] args) {
	/*
    *      (Print a table) Write a program that displays the following table:
    *
    *      a   a^2 a^3 a^4
    *      1   1   1   1
    *      2   4   8   16
    *      3   9   27  81
    *      4   16  64  256
    *
    */
        System.out.printf("%3s  |%5s  |%5s  |%5s\n", "a", "a^2", "a^3", "a^4");
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%3d  |%5d  |%5d  |%5d\n", i, i * i, i * i * i, i * i * i * i);
        }
    }
}


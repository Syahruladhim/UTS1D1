import java.util.Scanner;
public class JAWABANO3 {
    public class platnomor {
        static int jumlahPlat = 10;
        static int kudus = 0;
        static int jakarta = 0;
        static int jogja = 0;
        static int karawang = 0;
        static int solo = 0;
        static int sisaKuota = 0;

        static boolean success = false;
//       String[] InfoPlat = new String[]{"K-Kudus","B-Jakarta","AB-jogja","T-Karawang","AD-Solo"};

        public static void main(String[] args) {
//           String[] InfoPlat = new String[]{"K-Kudus","B-Jakarta","AB-jogja","T-Karawang","AD-Solo"};
            for (int i = 0; 1 < 8; i++) {
                plat();
            }

        }

        public static void cekPlatNomor(String kodePlat) {
            if (kodePlat.contains("K")) {
                success = true;
                kudus++;
            } else if (kodePlat.contains("B")) {
                success = true;
                jogja++;
            } else if (kodePlat.contains("AB")) {
                success = true;
                karawang++;
            } else if (kodePlat.contains("T")) {
                success = true;
                karawang++;
            } else if (kodePlat.contains("AD")) {
                success = true;
                solo++;
            } else {
                success = false;
                System.out.println("kode tidak valid");
            }
        }
    }
}
package tgs_pemlan4;

import tgs_pemlan4.*;

public class main {
    public static void main(String[] args) {
        System.out.println("=============\n" + "Manusia" + "\n=============");
        tgs_pemlan4.manusia manusia1 = new tgs_pemlan4.manusia("budi", "123", false, false);
        System.out.println(manusia1);
        System.out.println("----------------");
        tgs_pemlan4.manusia manusia2 = new tgs_pemlan4.manusia("andi", "456", true, true);
        System.out.println(manusia2);
        System.out.println("------------------");
        tgs_pemlan4.manusia manusia3 = new tgs_pemlan4.manusia("joko", "101", false, false);
        System.out.println(manusia3);

        System.out.println("\n=====================\n" + "mahasiswaFilkom" + "\n=====================");
        tgs_pemlan4.mahasiswaFilkom mahasiswaFilkom1 = new tgs_pemlan4.mahasiswaFilkom("235150000555544", 4.0, "Budi",
                "212", false, false);
        System.out.println(mahasiswaFilkom1);
        System.out.println("--------------------");
        tgs_pemlan4.mahasiswaFilkom mahasiswaFilkom2 = new tgs_pemlan4.mahasiswaFilkom("2351504000001111", 3.0, "Agus",
                "112", true, false);
        System.out.println(mahasiswaFilkom2);
        System.out.println("-----------------------");
        tgs_pemlan4.mahasiswaFilkom mahasiswaFilkom3 = new tgs_pemlan4.mahasiswaFilkom("235150401111033", 2.0, "joko",
                "2222", true, false);
        System.out.println(mahasiswaFilkom3);

        System.out.println("\n=============\n" + "pekerja" + "\n=============");
        pekerja pekerja1 = new pekerja(200, 2020, 3, 2, 5, "yanto", "555", true, true);
        System.out.println(pekerja1);
        System.out.println("-----------------------");
        pekerja pekerja2 = new pekerja(2000, 2014, 7, 8, 3, "Yanti", "777", false, true);
        System.out.println(pekerja2);
        System.out.println("-------------------------");
        pekerja pekerja3 = new pekerja(1000, 2000, 9, 9, 20, "Mona", "666", false, true);
        System.out.println(pekerja3);

        System.out.println("\n=============\n" + "Kelas Manager" + "\n=============");
        tgs_pemlan4.manager manager = new tgs_pemlan4.manager("HRD", 8000, 2008, 2, 2, 4, "Roberth", "69", true, true);
        System.out.println(manager);
    }
}

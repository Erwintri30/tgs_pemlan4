package tgs_pemlan4;

public class mahasiswaFilkom extends manusia {
    private double ipk;
    private String nim;

    public mahasiswaFilkom(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public String getNim() {
        return nim;
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodi = Integer.parseInt(nim.substring(6, 7));
        String prodiStr = "";
        if (prodi == 2) {
            prodiStr = "Teknik Informatika";
        } else if (prodi == 3) {
            prodiStr = "Teknik Komputer";
        } else if (prodi == 4) {
            prodiStr = "Sistem Informasi";
        } else if (prodi == 6) {
            prodiStr = "Pendidikan Teknologi Informasi";
        } else if (prodi == 7) {
            prodiStr = "Teknologi Informasi";
        } else {
            prodiStr = "Prodi tidak ada";
        }
        return prodiStr + ", 20" + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.0;
        } else if (ipk > 3.5 && ipk <= 4.0) {
            return 75.0;
        } else {
            return 0.0;
        }
    }

    public double getPendapatan() {
        return super.getTunjangan() + getBeasiswa();
    }

    public String toString() {
        return super.toString() + "\nNIM\t\t: " + nim + "\nIPK\t\t: " + ipk + "\nStatus\t\t: " + getStatus();
    }

}

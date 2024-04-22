package tgs_pemlan4;

public class manusia {
    private String nama;
    private String nik;
    private boolean jenisKelamin;
    private boolean menikah;

    public manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;

    }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25.0 : 20.0;
        } else {
            return 15.0;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        String gender = jenisKelamin ? "Laki-laki" : "Perempuan";
        return String.format("Nama\t\t: %s%n" +
                "NIK\t\t: %s%n" +
                "Jenis Kelamin\t: %s%n" +
                "Pendapatan\t: %.1f",
                nama, nik, gender, getPendapatan());
    }

}

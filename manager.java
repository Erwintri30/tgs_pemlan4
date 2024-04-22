package tgs_pemlan4;

public class manager extends pekerja {
    private String departemen;
    private double tunjangan;

    public manager(String departemen, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama,
            String nik, boolean jenisKelamin, boolean menikah) {

        super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
        this.tunjangan = 0.10 * gaji;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public double getPendapatan() {
        return super.getPendapatan() + getTunjangan();
    }

    public void tambahBonus(double bonus) {

        setGaji(getGaji() + bonus);
    }

    public String toString() {
        return "\nDepartemen\t: " + departemen + super.toString();
    }
}

public class Tester {
    public static void main(String[] args) {
        Mahasiswa deni = new Mahasiswa();

        deni.setNama("Deni Saputra");
        System.out.println("Nama \t\t: " + deni.getNama());
        deni.setIPK(3.57f);
        System.out.println("IPK \t\t: " + deni.getIPK());
        deni.setTanggalLahir(19900620);
        System.out.println("Tanggal Lahir \t: " + deni.getTanggalLahir());
    }
}
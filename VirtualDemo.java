public class VirtualDemo {
    public static void main(String[] args) {
        gaji s = new gaji("Wahyu", "KUBAR", 3, 5000.00);
        pegawai e = new gaji("Ini nama", "Samarinda", 2, 2500.00);
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai --");
        e.mailCheck();
    }
    
}

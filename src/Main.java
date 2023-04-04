
public class Main {

    public static void main(String[] args) {
        Member member = new Member();
        Karyawan karyawan = new Karyawan();
        Barang barang = new Barang();
        Transaksi transaksi = new Transaksi();

        // Menampilkan data member
        System.out.println("Data Member:");
        for (int i = 0; i < member.getJmlMember(); i++) {
            System.out.println("ID Member: " + i);
            System.out.println("Nama: " + member.getNama(i));
            System.out.println("Alamat: " + member.getAlamat(i));
            System.out.println("Telepon: " + member.getTelepon(i));
            System.out.println("Saldo: " + member.getSaldo(i));
            System.out.println();
        }

        // Menampilkan data karyawan
        System.out.println("Data Karyawan:");
        for (int i = 0; i < karyawan.getJmlKaryawan(); i++) {
            System.out.println("ID Karyawan: " + i);
            System.out.println("Nama: " + karyawan.getNama(i));
            System.out.println("Alamat: " + karyawan.getAlamat(i));
            System.out.println("Telepon: " + karyawan.getTelepon(i));
            System.out.println("Jabatan: " + karyawan.getJabatan(i));
            System.out.println();
        }

        // Menampilkan data barang
        System.out.println("Data Barang:");
        for (int i = 0; i < barang.getJmlBarang(); i++) {
            System.out.println("ID Barang: " + i);
            System.out.println("Nama Barang: " + barang.getNamaBarang(i));
            System.out.println("Stok: " + barang.getStok(i));
            System.out.println("Harga: " + barang.getHarga(i));
            System.out.println();
        }

        // Menampilkan data transaksi
        System.out.println("Data Transaksi:");
        for (int i = 0; i < transaksi.getJmlTransaksi(); i++) {
            System.out.println("ID Transaksi: " + i);
            System.out.println("ID Member: " + transaksi.getIdMember(i));
            System.out.println("Nama Member: " + member.getNama(transaksi.getIdMember(i)));
            System.out.println("ID Barang: " + transaksi.getIdBarang(i));
            System.out.println("Nama Barang: " + barang.getNamaBarang(transaksi.getIdBarang(i)));
            System.out.println("Banyak: " + transaksi.getBanyak(i));
            System.out.println("Total Harga: " + barang.getHarga(transaksi.getIdBarang(i)) * transaksi.getBanyak(i));
            System.out.println();
        }
    }

}

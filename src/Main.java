public class Main {
    public static void main(String[] args) {
        Mahasiswa id1 = new Mahasiswa(
                "Galang Darma", "24078423", "Teknik Industri", 3.58

        );
        Mahasiswa id2 = new Mahasiswa(
                "Zahra Fadil", "23079343", "Antropologi Budaya", 3.87

        );
        Mahasiswa id3 = new Mahasiswa(
                "Asep Supriatna", "24075323", "Teknik Elektro", 3.77

        );
        Mahasiswa id4 = new Mahasiswa(
                "Rico Parnando", "23078924", "Teknik Metalurgi", 3.60
        );
        Mahasiswa id5 = new Mahasiswa(
                "Leticia Tessa Bilqis", "24074252", "Teknik Industri", 3.93
        );

        System.out.println(" === DATA MAHASISWA TERSIMPAN === ");
        System.out.println();

        id1.tampilkanInfo();
        id2.tampilkanInfo();
        id3.tampilkanInfo();
        id4.tampilkanInfo();
        id5.tampilkanInfo();
    }
}
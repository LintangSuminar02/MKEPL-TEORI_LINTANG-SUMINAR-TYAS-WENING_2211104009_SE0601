package sesudah_refactoring;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Artist
        Artist artist = new Artist("Seventeen", "Sebong",
                "https://www.allkpop.com/upload/2023/09/content/191059/web_data/allkpop_1695136312_untitled-1.jpg");

        // Membuat objek Album
        Album album = new Album("Face The Sun",
                "https://is2-ssl.mzstatic.com/image/thumb/Music122/v4/3a/a8/58/3aa8588c-0af9-a0f0-08b5-9d1baf0f5736/196922060847_Cover.jpg/1200x1200bf-60.jpg");

        // Membuat objek Song
        Song song = new Song("001", "HOT", "2022", "https://youtu.be/gRnuFC4Ualw?feature=shared");

        // Menghubungkan Song dengan Artist dan Album
        song.setArtist(artist);
        song.setAlbum(album);
        song.setGenre(Genre.KPOP);

        // Menampilkan informasi lagu dengan detail lengkap
        System.out.println("=== Detail Level 3 (Full Info) ===");
        song.printInfo(3);

        System.out.println("\n=== Detail Level 1 (Song + Artist) ===");
        song.printInfo(1);

        System.out.println("\n=== Detail Level 2 (Song + Album) ===");
        song.printInfo(2);

        System.out.println("\n=== Detail Level 0 (Song Only) ===");
        song.printInfo(0);
    }

}
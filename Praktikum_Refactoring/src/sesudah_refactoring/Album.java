package sesudah_refactoring;

public class Album {
    private String name;
    private String coverURL;

    public Album(String name, String coverURL) {
        this.name = name;
        this.coverURL = coverURL;
    }

    public void printInfo() {
        System.out.println("Album Title: " + name);
    }
    
}
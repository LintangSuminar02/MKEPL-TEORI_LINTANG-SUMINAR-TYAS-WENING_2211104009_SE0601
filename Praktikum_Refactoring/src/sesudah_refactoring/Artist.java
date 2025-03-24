package sesudah_refactoring;

public class Artist {
    private String name;
    private String alias;
    private String imageURL;

    public Artist(String name, String alias, String imageURL) {
        this.name = name;
        this.alias = alias;
        this.imageURL = imageURL;
    }

    public void printInfo() {
        System.out.println("Artist Name: " + name);
        if (!alias.isEmpty()) {
            System.out.println("Also Known As: " + alias);
        }
    }
    
}
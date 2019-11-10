public class Manager {

    public static void main(String[] args) {
        Novels novels = new Novels(199, 40, "Tom");
        novels.Info();
        Magazine magazine = new Magazine(3, 30, "2012.2.23");
        magazine.Info();
        Textbook textbook = new Textbook(56,234,"high school students");
        textbook.Info();
    }

}

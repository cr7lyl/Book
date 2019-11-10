public class Textbook extends Book{
    String Object;
    public Textbook(int price,int pages,String Object) {
        this.pages = pages;
        this.price = price;
        this.Object = Object;
    }
    public void Info() {
        System.out.println("This is a Textbook, which has " + pages + " pages,"+" costs " + price + " yuan, and provide for  " + Object +"." );

    }
}

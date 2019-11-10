public class Novels extends Book{
String writername;

public Novels(int pages,int price,String writername){
        this.pages=pages;
        this.price=price;
        this.writername=writername;
        }

    public void Info() {
        System.out.println("This is a  novel, which has " + pages + " pages,"+" costs " + price + " yuan, and write by " + writername +"." );
    }
}

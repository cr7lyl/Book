public class Magazine extends Book {
        String publishtime;
        public Magazine(int price,int pages,String publish_time) {
            this.pages = pages;
            this.price = price;
            this.publishtime = publish_time;
        }

    public void Info() {
            System.out.println("This is a magazine, which has " + pages + " pages,"+" costs " + price + " yuan, and publish once every " + publishtime +"." );

    }
}

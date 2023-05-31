class Book{
    int id;
    String author;
    Double price;
    String title;

    void setData(int i,String a, Double p ,String t) {
        id = i;
        author = a;
        price = p;
        title = t;


    }
    void showData() {
        System.out.println("Id : " + id );
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("Title : " + title);
    }

}

class P7{
    public static void main(String[] arg) {
        Book b1 = new Book();
        b1.setData(2,"James",100.00,"The green ");
        b1.showData();
    }
}
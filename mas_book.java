package mas.db.dao;

public class mas_book {
    private String book_no;

    private String book_name;

    private String book_publisher;

    private String book_date;

    private int book_distribute;

    private String book_identity;

    public mas_book(String book_no, String book_name, String book_publisher, String book_date, int book_distribute, String book_identity){
        this.book_no = book_no;
        this.book_name = book_name;
        this.book_publisher = book_publisher;
        this.book_date = book_date;
        this.book_distribute = book_distribute;
        this.book_identity = book_identity;
    }

    public mas_book(){//无参构造器
    }

    public String getBook_no() {
        return book_no;
    }

    public void setBook_no(String book_no) {
        this.book_no = book_no;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_publisher() {
        return book_publisher;
    }

    public void setBook_publisher(String book_publisher) {
        this.book_publisher = book_publisher;
    }

    public String getBook_date() {
        return book_date;
    }

    public void setBook_date(String book_date) {
        this.book_date = book_date;
    }

    public int getBook_distribute() {
        return book_distribute;
    }

    public void setBook_distribute(int book_distribute) {
        this.book_distribute = book_distribute;
    }

    public String getBook_identity() {
        return book_identity;
    }

    public void setBook_identity(String book_identity) {
        this.book_identity = book_identity;
    }

    //部分字段的toString方法

    @Override
    public String toString() {
        return "mas_book{" +
                "book_no='" + book_no + '\'' +
                ", book_name='" + book_name + '\'' +
                ", book_publisher='" + book_publisher + '\'' +
                ", book_date='" + book_date + '\'' +
                ", book_distribute=" + book_distribute +
                ", book_identity='" + book_identity + '\'' +
                '}';
    }
}

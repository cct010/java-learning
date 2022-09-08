package book;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-08
 * Time: 19:23
 */
public class BookList {
    private Book[] bookList = new Book[100];
    private int usedSize;

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public BookList() {
        bookList[0] = new Book("水浒传","施耐庵",9,"小说");
        bookList[1] = new Book("西游记","罗贯中",19,"小说");
        bookList[2] = new Book("红楼梦","曹雪芹",29,"小说");
        this.usedSize = 3;
    }
}

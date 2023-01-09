package mas.db.dao;
import java.util.List;
public interface mas_bookDAO {
    void addmas_book(mas_book new_mas_book);
    void updatemas_book(mas_book mas_book_update);
    void deletemas_book(String book_no);
    mas_book getmas_book(String book_no);
    List<mas_book> findmas_book(SearchCriteria searchCriteria);
}

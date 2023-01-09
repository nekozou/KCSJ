package mas.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class mas_bookDAOImpl extends DAObase implements mas_bookDAO{
    private static final String MAS_BOOK_INSERT_SQL = "insert into mas_book(book_no, book_name, \n" +
            "\tbook_publisher, book_date, book_distribute, book_identity) \n" +
            "\tvalues(?, ?, ?, ?, ?, ?);";
    @Override
    public void addmas_book(mas_book new_mas_book){
        Connection con = null;
        try {
            con = getconnection();
            PreparedStatement psmt = con.prepareStatement(MAS_BOOK_INSERT_SQL);
            psmt.setString(1,new_mas_book.getBook_no());
            psmt.setString(2,new_mas_book.getBook_name());
            psmt.setString(3,new_mas_book.getBook_publisher());
            psmt.setString(4,new_mas_book.getBook_date());
            psmt.setInt(5,new_mas_book.getBook_distribute());
            psmt.setString(6,new_mas_book.getBook_identity());
            psmt.executeUpdate();
            psmt.close();
    }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static final String MAS_BOOK_UPDATE_SQL = "update mas_book \n" +
            " set book_publisher = '清华大学出版社' \n" +
            "where mas_book.book_no = ?;\t";
    @Override
    public void updatemas_book(mas_book mas_book_update) {
        Connection con = null;
        try {
            con = getconnection();
            PreparedStatement psmt = con.prepareStatement(MAS_BOOK_UPDATE_SQL);
            psmt.setString(1,mas_book_update.getBook_no());
            psmt.executeUpdate();
            psmt.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static final String MAS_BOOK_DELETE_SQL = "delete from mas_book\n" +
            "where book_no = ?;";
    @Override
    public void deletemas_book(String book_no) {
        Connection con = null;
        try {
            con = getconnection();
            PreparedStatement psmt = con.prepareStatement(MAS_BOOK_DELETE_SQL);
            psmt.setString(1,book_no);
            psmt.executeUpdate();
            psmt.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    private static final String MAS_BOOK_SELECT_SQL = "select * from mas_book\n" +
            "where mas_book.book_no = ?;";
    @Override
    public mas_book getmas_book(String book_no){
        mas_book mas_book_select = new mas_book();
        Connection con = null;
        try {
            con = getconnection();
            PreparedStatement psmt = con.prepareStatement(MAS_BOOK_SELECT_SQL);
            psmt.setString(1,book_no);
            ResultSet rs = psmt.executeQuery();
            while(rs.next()){
                mas_book_select.setBook_no(rs.getString("book_no"));
                mas_book_select.setBook_name(rs.getString("book_name"));
                mas_book_select.setBook_publisher(rs.getString("book_publisher"));
                mas_book_select.setBook_date(rs.getString("book_date"));
                mas_book_select.setBook_distribute(rs.getInt("book_distribute"));
                mas_book_select.setBook_identity(rs.getString("book_identity"));
                System.out.println(mas_book_select.toString());
            }
            System.out.print("\n");
            psmt.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return mas_book_select;
    }

    @Override
    public List<mas_book> findmas_book(SearchCriteria searchCriteria){
        return null;
    }
}

package mas.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class phd_otherDAOImpl extends DAObase implements phd_otherDAO {

    private static final String PHD_OTHER_INSERT_SQL = "insert into phd_other(other_no, " +
            "other_name, other_rank, other_date, other_identity) \n" +
            "values(?, ?, ?, ?, ?)";
    @Override
    public void addphd_other(phd_other phd_other_add) {
        Connection con = null;
        try{
            con = getconnection();//建立连接
            PreparedStatement psmt = con.prepareStatement(PHD_OTHER_INSERT_SQL);//获取SQL模板语句
            //按问号的个数依次填入所需字段信息
            psmt.setString(1,phd_other_add.getOther_no());
            psmt.setString(2,phd_other_add.getOther_name());
            psmt.setString(3,phd_other_add.getOther_rank());
            psmt.setString(4,phd_other_add.getOther_date());
            psmt.setString(5,phd_other_add.getOther_identity());
            psmt.executeUpdate();//执行SQL语句相应功能
            psmt.close();//关闭接口
        }catch(Exception e){//出错提示
            e.printStackTrace();
        }finally {
            try{
                con.close();//关闭连接
            }catch (Exception e){//出错提示
                e.printStackTrace();
            }
        }
    }


    private static final String PHD_OTHER_UPDATE_SQL = "update phd_other set other_rank  = '行业标准'\n" +
            "where other_no = ?;";
    @Override
    public void updatephd_other(phd_other phd_other_update) {
        Connection con = null;
        try{
            con = getconnection();//建立连接
            PreparedStatement psmt = con.prepareStatement(PHD_OTHER_UPDATE_SQL);//获取SQL模板语句
            //按问号的个数依次填入所需字段信息
            psmt.setString(1,phd_other_update.getOther_no());
            psmt.executeUpdate();//执行SQL语句相应功能
            psmt.close();//关闭接口
        }catch(Exception e){//出错提示
            e.printStackTrace();
        }finally {
            try{
                con.close();//关闭连接
            }catch (Exception e){//出错提示
                e.printStackTrace();
            }
        }
    }

    private static final String PHD_OTHER_DELETE_SQL = "delete from phd_other\n" +
            "where phd_other.other_no = ?";
    @Override
    public void deletephd_other(String other_no) {
        Connection con = null;
        try{
            con = getconnection();//建立连接
            PreparedStatement psmt = con.prepareStatement(PHD_OTHER_DELETE_SQL);//获取SQL模板语句
            //按问号的个数依次填入所需字段信息
            psmt.setString(1,other_no);
            psmt.executeUpdate();//执行SQL语句相应功能
            psmt.close();//关闭接口
        }catch(Exception e){//出错提示
            e.printStackTrace();
        }finally {
            try{
                con.close();//关闭连接
            }catch (Exception e){//出错提示
                e.printStackTrace();
            }
        }
    }

    private static final String PHD_OTHER_SELECT_SQL = "select * from phd_other\n" +
            "where phd_other.other_no = ?";
    @Override
    public phd_other getphd_other(String other_no) {
        phd_other phd_other_select = new phd_other();
        Connection con = null;
        try {
            con = getconnection();
            PreparedStatement psmt = con.prepareStatement(PHD_OTHER_SELECT_SQL);
            psmt.setString(1,other_no);
            ResultSet rs = psmt.executeQuery();
            while(rs.next()){
                phd_other_select.setOther_no(rs.getString("other_no"));
                phd_other_select.setOther_name(rs.getString("other_name"));
                phd_other_select.setOther_rank(rs.getString("other_rank"));
                phd_other_select.setOther_date(rs.getString("other_date"));
                phd_other_select.setOther_identity(rs.getString("other_identity"));
                System.out.println(phd_other_select.toString());
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
        return phd_other_select;
    }

    @Override
    public List<phd_other> findphd_other(SearchCriteria searchCriteria) {
        return null;
    }
}

package mas.db.dao;

//加载类
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class mas_patentDAOImpl extends DAObase implements mas_patentDAO{

    private static final String MAS_PATENT_INSERT_SQL = "insert into mas_patent(patent_no, patent_name, patent_type, \n" +
            "patent_state, patent_time, patent_con, patent_identity)\n" +
            "values(?, ?, ?, ?, ?, ?, ?);";

    @Override
    public void addmas_patent(mas_patent mas_patent_add) {
        Connection con = null;
        try{
            con = getconnection();//建立连接
            PreparedStatement psmt = con.prepareStatement(MAS_PATENT_INSERT_SQL);//获取SQL模板语句
            //按问号的个数依次填入所需字段信息
            psmt.setString(1,mas_patent_add.getPatent_no());
            psmt.setString(2,mas_patent_add.getPatent_name());
            psmt.setString(3,mas_patent_add.getPatent_type());
            psmt.setInt(4,mas_patent_add.getPatent_state());
            psmt.setString(5,mas_patent_add.getPatent_time());
            psmt.setInt(6,mas_patent_add.getPatent_con());
            psmt.setString(7,mas_patent_add.getPatent_identity());
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

    private static final String MAS_PATENT_UPDATE_SQL = "update mas_patent " +
            "set patent_state  = 1\n" +
            "where patent_no = ?;";
    @Override
    public void updatemas_patent(mas_patent mas_patent_update) {
        Connection con = null;
        try{
            con = getconnection();//建立连接
            PreparedStatement psmt = con.prepareStatement(MAS_PATENT_UPDATE_SQL);//获取SQL模板语句
            //按问号的个数依次填入所需字段信息
            psmt.setString(1,mas_patent_update.getPatent_no());
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

    private static final String MAS_PATENT_DELETE_SQL = "delete from mas_patent\n" +
            "where mas_patent.patent_no = ?";
    @Override
    public void deletemas_patent(String patent_no) {
        Connection con = null;
        try{
            con = getconnection();//建立连接
            PreparedStatement psmt = con.prepareStatement(MAS_PATENT_DELETE_SQL);//获取SQL模板语句
            //按问号的个数依次填入所需字段信息
            psmt.setString(1,patent_no);
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

    private static final String MAS_PATENT_SELECT_SQL = "select * from mas_patent\n" +
            "where mas_patent.patent_no = ?";
    @Override
    public mas_patent getmas_patent(String patent_no) {
        mas_patent mas_patent_select = new mas_patent();
        Connection con = null;
        try {
            con = getconnection();
            PreparedStatement psmt = con.prepareStatement(MAS_PATENT_SELECT_SQL);
            psmt.setString(1,patent_no);
            ResultSet rs = psmt.executeQuery();
            while(rs.next()){
                mas_patent_select.setPatent_no(rs.getString("patent_no"));
                mas_patent_select.setPatent_name(rs.getString("patent_name"));
                mas_patent_select.setPatent_type(rs.getString("patent_type"));
                mas_patent_select.setPatent_state(rs.getInt("patent_state"));
                mas_patent_select.setPatent_time(rs.getString("patent_time"));
                mas_patent_select.setPatent_con(rs.getInt("patent_con"));
                mas_patent_select.setPatent_identity(rs.getString("patent_identity"));
                System.out.println(mas_patent_select.toString());
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
        return mas_patent_select;
    }


    @Override
    public List<mas_patent> findmas_patent(SearchCriteria searchCriteria) {
        return null;
    }
}

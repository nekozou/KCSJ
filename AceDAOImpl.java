package db.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class AceDAOImpl extends DAOBase implements AceDAO{
    private static final String ACE_INSERT_SQL = "insert into academic_exchange(ace_no,gra_id,ace_name,ace_place,ace_date,ace_CHname,ace_ENname,ace_pic,ace_note) values(?,?,?,?,?,?,?,?,?);";
    @Override
    public void addAce(Academic_exchange ace) {
        Connection con = null;
        PreparedStatement ps = null;
        int rs;
        try
        {
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(ACE_INSERT_SQL);
            psmt.setString(1,ace.getAce_no());
            psmt.setString(2,ace.getGra_id());
            psmt.setString(3,ace.getAce_name());
            psmt.setString(4,ace.getAce_place());
            psmt.setString(5,ace.getAce_date());
            psmt.setString(6,ace.getAce_CHname());
            psmt.setString(7,ace.getAce_ENname());
            psmt.setBytes(8,ace.getAce_pic());
            psmt.setString(9,ace.getAce_note());
            rs = psmt.executeUpdate();           //执行sql语句
            System.out.println("成功添加了"+rs+"行数据!");
            psmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally
        {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private static final String ACE_UPDATE_SQL = "UPDATE academic_exchange SET ace_no=?,gra_id=?,ace_name=?,ace_place=?,ace_date=?,ace_CHname=?,ace_ENname=?,ace_pic=?,ace_note=? WHERE ace_no = ?";
    @Override
    public void updateAce(Academic_exchange ace) {
        Connection con = null;
        int rs;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(ACE_UPDATE_SQL);
            psmt.setString(1,ace.getAce_no());
            psmt.setString(2,ace.getGra_id());
            psmt.setString(3,ace.getAce_name());
            psmt.setString(4,ace.getAce_place());
            psmt.setString(5,ace.getAce_date());
            psmt.setString(6,ace.getAce_CHname());
            psmt.setString(7,ace.getAce_ENname());
            psmt.setBytes(8,ace.getAce_pic());
            psmt.setString(9,ace.getAce_note());
            psmt.setString(10,ace.getAce_no());
            rs = psmt.executeUpdate();      //执行SQL语句
            System.out.println("成功更新了"+rs+"行数据!");
            psmt.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private static final String ACE_DELETE_SQL = "DELETE FROM academic_exchange WHERE ace_no= ?";
    @Override
    public void deleteAce(String ace_no) {
        Connection con = null;
        int rs;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(ACE_DELETE_SQL);
            psmt.setString(1,ace_no);
            rs = psmt.executeUpdate();
            System.out.println("成功删除了"+rs+"行数据!");
            psmt.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private static final String ACE_SELECT_SQL = "SELECT ace_no,gra_id,ace_name,ace_place,ace_date,ace_CHname,ace_ENname,ace_pic,ace_note FROM academic_exchange WHERE ace_no=?";
    @Override
    public Academic_exchange getAce(String ace_no) {
        Connection con = null;
        Academic_exchange ace = new Academic_exchange();
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(ACE_SELECT_SQL);
            psmt.setString(1, ace_no);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                ace.setAce_no(rs.getString("ace_no"));
                ace.setGra_id(rs.getString("gra_id"));
                ace.setAce_name(rs.getString("ace_name"));
                ace.setAce_place(rs.getString("ace_place"));
                ace.setAce_date((rs.getString("ace_date")));
                ace.setAce_CHname(rs.getString("ace_CHname"));
                ace.setAce_ENname(rs.getString("ace_ENname"));
                ace.setAce_pic(rs.getBytes("ace_pic"));
                ace.setAce_note(rs.getString("ace_note"));
            }
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
        return ace;
    }
}
package db.dao;
import java.sql.Connection;
import java.sql.DriverManager;
//实现connection接口
public class DAOBase implements DAO {
    @Override
    public Connection getConnection() {
        String URL = "jdbc:sqlserver://101.43.245.192:1433; DatabaseName=keshe";
        Connection con = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(URL,"sa","123456shujuku.");

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return con;
    }
}
import java.sql.*;

public class code {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement statement = null;
        Connection conn = null;
        try {
            String strSql = "select * from participation_projects";  //sql语句
            String url = "jdbc:sqlserver://101.43.245.192:1433; DatabaseName=keshe;user=sa;password=123456shujuku."; //连接数据库的地址、数据库、用户名和密码
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //驱动类名称
            } catch (ClassNotFoundException e) {
                System.out.println("无法找到驱动类");
            }
            conn = DriverManager.getConnection(url); //基于url进行数据库的连接
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(strSql); //执行sql语句
            while(rs.next()){
                String pp_no = rs.getString("pp_no");
                String gra_id = rs.getString("gra_id");
                String proj_id = rs.getString("proj_id");
                System.out.println(pp_no + ", " +gra_id+ ", " +proj_id);
            }
        } catch (SQLException sqlE) {
            sqlE.printStackTrace();
        } finally {
            if(conn != null){
                conn.close(); //关闭数据库的连接
            }

        }
    }

}
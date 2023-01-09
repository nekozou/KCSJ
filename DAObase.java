package mas.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class DAObase implements DAO{
    @Override
    public Connection getconnection() {//建立连接的方法getconnection()函数的主要实现方法
        String URL="jdbc:sqlserver://101.43.245.192:1433; DatabaseName=keshe";//连接数据库的URL(主机的ip，数据库名称，端口）
        Connection con = null;//连接初始化
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//加载驱动
            con = DriverManager.getConnection(URL,"sa","123456shujuku.");//连接数据库的登录名和登录密码
        }catch (Exception ex){//出错抛出异常
            ex.printStackTrace();
        }
        return con;//返回连接情况
    }
}

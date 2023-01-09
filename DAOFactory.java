package mas.db.dao;

public class DAOFactory {
    private static DAOFactory daoFactory;//构建自己的实例
    static{//静态代码段生成工厂化方法
        daoFactory =new DAOFactory();
    }
    private DAOFactory() {}//构造器
        public static DAOFactory getInstance() {
            return daoFactory;
        }

        public mas_bookDAO getmas_bookDAO() { return new mas_bookDAOImpl(); }

        public mas_patentDAO getmas_patentDAO() { return new mas_patentDAOImpl(); }

        public mas_reportDAO getmas_reportDAO() { return new mas_reportDAOImpl(); }

        public mas_soft_hardDAO getmas_soft_hardDAO() { return new mas_soft_hardDAOImpl(); }

        public phd_otherDAO getphd_otherDAO() { return new phd_otherDAOImpl(); }
    }

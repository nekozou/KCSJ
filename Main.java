import mas.db.dao.DAO;
import mas.db.dao.DAOFactory;
import mas.db.dao.mas_book;
import mas.db.dao.mas_patent;
import mas.db.dao.mas_report;
import mas.db.dao.mas_soft_hard;
import mas.db.dao.phd_other;
import mas.db.dao.DAObase;

import java.sql.Connection;
import java.sql.DriverManager;


public class Main {
    public static void main(String[] args) {

        /*硕士研究生教材表*/

        //增加研究生教材表
        /*mas_book mas_book_add = new mas_book();
            mas_book_add.setBook_no("book002");
            mas_book_add.setBook_name("《交换与路由之实际开发》");
            mas_book_add.setBook_publisher("中国科学院出版社");
            mas_book_add.setBook_date("1988-1-1");
            mas_book_add.setBook_distribute(100);
            mas_book_add.setBook_identity(null);
        DAOFactory.getInstance().getmas_bookDAO().addmas_book(mas_book_add);*/

        //删除硕士研究生教材表
        /*mas_book mas_book_delete = new mas_book();
            mas_book_delete.setBook_no("book002");
        DAOFactory.getInstance().getmas_bookDAO().deletemas_book(mas_book_delete.getBook_no());*/

        //查看研究生教材表
        /*mas_book mas_book_select = new mas_book();
            mas_book_select.setBook_no("book001");
        DAOFactory.getInstance().getmas_bookDAO().getmas_book(mas_book_select.getBook_no());*/

        //更新研究生教材表
        /*mas_book mas_book_update = new mas_book();
            mas_book_update.setBook_no("book002");
        DAOFactory.getInstance().getmas_bookDAO().updatemas_book(mas_book_update);*/

        /*硕士研究生专利表*/

        //增加研究生专利表
        /*mas_patent mas_patent_add = new mas_patent();
            mas_patent_add.setPatent_no("patent002");
            mas_patent_add.setPatent_name("关于使用LaTex的数学公式检索");
            mas_patent_add.setPatent_type("发明专利");
            mas_patent_add.setPatent_state(2);
            mas_patent_add.setPatent_time("2020-1-1");
            mas_patent_add.setPatent_con(20);
            mas_patent_add.setPatent_identity(null);
        DAOFactory.getInstance().getmas_patentDAO().addmas_patent(mas_patent_add);*/

        //删除研究生专利表
        /*mas_patent mas_patent_delete = new mas_patent();
            mas_patent_delete.setPatent_no("patent002");
        DAOFactory.getInstance().getmas_patentDAO().deletemas_patent(mas_patent_delete.getPatent_no());*/

        //查看研究生专利表
        mas_patent mas_patent_select = new mas_patent();
            mas_patent_select.setPatent_no("patent001");
        DAOFactory.getInstance().getmas_patentDAO().getmas_patent(mas_patent_select.getPatent_no());

        //更新研究生专利表
        /*mas_patent mas_patent_update = new mas_patent();
            mas_patent_update.setPatent_no("patent002");
        DAOFactory.getInstance().getmas_patentDAO().updatemas_patent(mas_patent_update);*/

        /*硕士研究生报告表*/

        //增加研究生报告表
        /*mas_report mas_report_add = new mas_report();
            mas_report_add.setReport_no("report002");
            mas_report_add.setReport_name("中国web前端发展初探报告");
            mas_report_add.setReport_type("省部级");
            mas_report_add.setReport_unit("中国标准报告协会");
            mas_report_add.setReport_date("2019-1-1");
            mas_report_add.setReport_con(20);
            mas_report_add.setReport_identity(null);
        DAOFactory.getInstance().getmas_reportDAO().addmas_report(mas_report_add);*/

        //删除研究生报告表
        /*mas_report mas_report_delete = new mas_report();
            mas_report_delete.setReport_no("report002");
        DAOFactory.getInstance().getmas_reportDAO().deletemas_report(mas_report_delete.getReport_no());*/

        //查看研究生报告表
        /*mas_report mas_report_select = new mas_report();
            mas_report_select.setReport_no("report001");
        DAOFactory.getInstance().getmas_reportDAO().getmas_report(mas_report_select.getReport_no());*/

        //更新研究生专利表
        /*mas_report mas_report_update = new mas_report();
            mas_report_update.setReport_no("report002");
        DAOFactory.getInstance().getmas_reportDAO().updatemas_report(mas_report_update);*/

        /*硕士研究生软硬件平台表*/

        //增加研究生软硬件平台
        /*mas_soft_hard mas_soft_hard_add = new mas_soft_hard();
            mas_soft_hard_add.setSoft_hard_no("sf002");
            mas_soft_hard_add.setSoft_hard_name("基于计算机视觉的学习平台");
            mas_soft_hard_add.setSoft_hard_unit("计算机视觉协会");
            mas_soft_hard_add.setSoft_hard_date("2019-1-1");
            mas_soft_hard_add.setSoft_hard_con(20);
            mas_soft_hard_add.setSoft_hard_identity(null);
        DAOFactory.getInstance().getmas_soft_hardDAO().addmas_soft_hard(mas_soft_hard_add);*/

        //删除研究生软硬件表
        /*mas_soft_hard mas_soft_hard_delete = new mas_soft_hard();
            mas_soft_hard_delete.setSoft_hard_no("sf002");
        DAOFactory.getInstance().getmas_soft_hardDAO().deletemas_soft_hard(mas_soft_hard_delete.getSoft_hard_no());*/

        //查看研究生软硬件表
        /*mas_soft_hard mas_soft_hard_select = new mas_soft_hard();
            mas_soft_hard_select.setSoft_hard_no("sf001");
        DAOFactory.getInstance().getmas_soft_hardDAO().getmas_soft_hard(mas_soft_hard_select.getSoft_hard_no());*/

        //更新研究生软硬件表
        /*mas_soft_hard mas_soft_hard_update = new mas_soft_hard();
            mas_soft_hard_update.setSoft_hard_no("sf002");
        DAOFactory.getInstance().getmas_soft_hardDAO().updatemas_soft_hard(mas_soft_hard_update);*/

        /*博士研究生其他成果表*/

        //增加博士研究生其他成果表
        /*phd_other phd_other_add = new phd_other();
            phd_other_add.setOther_no("other003");
            phd_other_add.setOther_name("百度云实习优秀生成果");
            phd_other_add.setOther_rank("团队标准");
            phd_other_add.setOther_date("2018-1-1");
            phd_other_add.setOther_identity(null);
        DAOFactory.getInstance().getphd_otherDAO().addphd_other(phd_other_add);*/

        //删除博士研究生其他成果表
        /*phd_other phd_other_delete = new phd_other();
            phd_other_delete.setOther_no("other003");
        DAOFactory.getInstance().getphd_otherDAO().deletephd_other(phd_other_delete.getOther_no());*/

        //查看博士研究生其他成果表
        /*phd_other phd_other_select = new phd_other();
            phd_other_select.setOther_no("other002");
        DAOFactory.getInstance().getphd_otherDAO().getphd_other(phd_other_select.getOther_no());*/

        //更新博士研究生其他成果表
        /*phd_other phd_other_update = new phd_other();
            phd_other_update.setOther_no("other003");
        DAOFactory.getInstance().getphd_otherDAO().updatephd_other(phd_other_update);*/
    }
}

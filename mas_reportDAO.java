package mas.db.dao;

import java.util.List;

public interface mas_reportDAO {
    void addmas_report(mas_report mas_report_add);
    void updatemas_report(mas_report mas_report_update);
    void deletemas_report(String report_no);
    mas_report getmas_report(String report_no);
    List<mas_book> findmas_report(SearchCriteria searchCriteria);
}

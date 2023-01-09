package mas.db.dao;

import java.util.List;

public interface mas_soft_hardDAO {
    void addmas_soft_hard(mas_soft_hard mas_soft_hard_add);
    void updatemas_soft_hard(mas_soft_hard mas_soft_hard_update);
    void deletemas_soft_hard(String soft_hard_no);
    mas_soft_hard getmas_soft_hard(String soft_hard_no);
    List<mas_soft_hard> findmas_soft_hard(SearchCriteria searchCriteria);
}

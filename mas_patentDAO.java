package mas.db.dao;

import java.util.List;

public interface mas_patentDAO {
    void addmas_patent(mas_patent mas_patent_add);
    void updatemas_patent(mas_patent mas_patent_update);
    void deletemas_patent(String patent_no);
    mas_patent getmas_patent(String patent_no);
    List<mas_patent> findmas_patent(SearchCriteria searchCriteria);
}

package mas.db.dao;

import java.util.List;

public interface phd_otherDAO {
    void addphd_other(phd_other phd_other_add);
    void updatephd_other(phd_other phd_other_update);
    void deletephd_other(String other_no);
    phd_other getphd_other(String other_no);
    List<phd_other> findphd_other(SearchCriteria searchCriteria);
}

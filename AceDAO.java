package db.dao;

public interface AceDAO {
    void addAce(Academic_exchange ace);//添加
    void updateAce(Academic_exchange ace);//更新
    void deleteAce(String ace_no);      //删除
    Academic_exchange getAce(String ace_no);       //查询
}

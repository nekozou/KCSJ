package mas.db.dao;

public class mas_patent {
    private String patent_no;
    private String patent_name;
    private String patent_type;
    private int patent_state;
    private String patent_time;
    private int patent_con;
    private String patent_identity;
    public mas_patent(String patent_no, String patent_name, String patent_type, int patent_state, String patent_time, int patent_con, String patent_identity){
        this.patent_no = patent_no;
        this.patent_name =patent_name;
        this.patent_type = patent_type;
        this.patent_state = patent_state;
        this.patent_time = patent_time;
        this.patent_con = patent_con;
        this.patent_identity = patent_identity;
    }
    public mas_patent(){//无参构造器
    }

    public String getPatent_no() {
        return patent_no;
    }

    public void setPatent_no(String patent_no) {
        this.patent_no = patent_no;
    }

    public String getPatent_name() {
        return patent_name;
    }

    public void setPatent_name(String patent_name) {
        this.patent_name = patent_name;
    }

    public String getPatent_type() {
        return patent_type;
    }

    public void setPatent_type(String patent_type) {
        this.patent_type = patent_type;
    }

    public int getPatent_state() {
        return patent_state;
    }

    public void setPatent_state(int patent_state) {
        this.patent_state = patent_state;
    }

    public String getPatent_time() {
        return patent_time;
    }

    public void setPatent_time(String patent_time) {
        this.patent_time = patent_time;
    }

    public int getPatent_con() {
        return patent_con;
    }

    public void setPatent_con(int patent_con) {
        this.patent_con = patent_con;
    }

    public String getPatent_identity() {
        return patent_identity;
    }

    public void setPatent_identity(String patent_identity) {
        this.patent_identity = patent_identity;
    }

    @Override
    public String toString() {
        return "mas_patent{" +
                "patent_no='" + patent_no + '\'' +
                ", patent_name='" + patent_name + '\'' +
                ", patent_type='" + patent_type + '\'' +
                ", patent_state=" + patent_state +
                ", patent_time='" + patent_time + '\'' +
                ", patent_con=" + patent_con +
                ", patent_identity='" + patent_identity + '\'' +
                '}';
    }
}

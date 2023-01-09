package mas.db.dao;

public class phd_other {
    private String other_no;
    private String other_name;
    private String other_rank;
    private String other_date;
    private String other_identity;

    public String getOther_no() {
        return other_no;
    }

    public void setOther_no(String other_no) {
        this.other_no = other_no;
    }

    public String getOther_name() {
        return other_name;
    }

    public void setOther_name(String other_name) {
        this.other_name = other_name;
    }

    public String getOther_rank() {
        return other_rank;
    }

    public void setOther_rank(String other_rank) {
        this.other_rank = other_rank;
    }

    public String getOther_date() {
        return other_date;
    }

    public void setOther_date(String other_date) {
        this.other_date = other_date;
    }

    public String getOther_identity() {
        return other_identity;
    }

    public void setOther_identity(String other_identity) {
        this.other_identity = other_identity;
    }

    @Override
    public String toString() {
        return "phd_other{" +
                "other_no='" + other_no + '\'' +
                ", other_name='" + other_name + '\'' +
                ", other_rank='" + other_rank + '\'' +
                ", other_date='" + other_date + '\'' +
                ", other_identity='" + other_identity + '\'' +
                '}';
    }
}

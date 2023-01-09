package mas.db.dao;

public class mas_report {
    private String report_no;
    private String report_name;
    private String report_type;
    private String report_unit;
    private String report_date;
    private int report_con;
    private String report_identity;

    public mas_report(String report_no, String report_name, String report_type, String report_unit, String report_date, int report_con, String report_identity){
        this.report_no = report_no;
        this.report_name = report_name;
        this.report_type = report_name;
        this.report_unit = report_unit;
        this.report_date = report_date;
        this.report_con = report_con;
        this.report_identity = report_identity;
    }

    public mas_report(){//无参构造器
    }

    public String getReport_no() {
        return report_no;
    }

    public void setReport_no(String report_no) {
        this.report_no = report_no;
    }

    public String getReport_name() {
        return report_name;
    }

    public void setReport_name(String report_name) {
        this.report_name = report_name;
    }

    public String getReport_type() {
        return report_type;
    }

    public void setReport_type(String report_type) {
        this.report_type = report_type;
    }

    public String getReport_unit() {
        return report_unit;
    }

    public void setReport_unit(String report_unit) {
        this.report_unit = report_unit;
    }

    public String getReport_date() {
        return report_date;
    }

    public void setReport_date(String report_date) {
        this.report_date = report_date;
    }

    public int getReport_con() {
        return report_con;
    }

    public void setReport_con(int report_con) {
        this.report_con = report_con;
    }

    public String getReport_identity() {
        return report_identity;
    }

    public void setReport_identity(String report_identity) {
        this.report_identity = report_identity;
    }

    @Override
    public String toString() {
        return "mas_report{" +
                "report_no='" + report_no + '\'' +
                ", report_name='" + report_name + '\'' +
                ", report_type='" + report_type + '\'' +
                ", report_unit='" + report_unit + '\'' +
                ", report_date='" + report_date + '\'' +
                ", report_con=" + report_con +
                ", report_identity='" + report_identity + '\'' +
                '}';
    }
}

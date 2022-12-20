package db.dao;

import java.util.Arrays;

public class Academic_exchange {
    private String ace_no;
    private String gra_id;
    private String ace_name;
    private String ace_place;
    private String ace_date;
    private String ace_CHname;
    private String ace_ENname;
    private byte[] ace_pic;
    private String ace_note;
    public Academic_exchange() {
    }

    @Override
    public String toString() {
        return "Academic_exchange{" +
                "ace_no='" + ace_no + '\'' +
                ", gra_id='" + gra_id + '\'' +
                ", ace_name='" + ace_name + '\'' +
                ", ace_place='" + ace_place + '\'' +
                ", ace_date='" + ace_date + '\'' +
                ", ace_CHname='" + ace_CHname + '\'' +
                ", ace_ENname='" + ace_ENname + '\'' +
                ", ace_note='" + ace_note + '\'' +
                '}';
    }

    public String getAce_no() {
        return ace_no;
    }

    public void setAce_no(String ace_no) {
        this.ace_no = ace_no;
    }

    public String getGra_id() {return gra_id;}

    public void setGra_id(String gra_id) {
        this.gra_id = gra_id;
    }

    public String getAce_name() {
        return ace_name;
    }

    public void setAce_name(String ace_name) {
        this.ace_name = ace_name;
    }

    public String getAce_place() {
        return ace_place;
    }

    public void setAce_place(String ace_place) {
        this.ace_place = ace_place;
    }

    public String getAce_date() {
        return ace_date;
    }

    public void setAce_date(String ace_date) {
        this.ace_date = ace_date;
    }

    public String getAce_CHname() {
        return ace_CHname;
    }

    public void setAce_CHname(String ace_CHname) {
        this.ace_CHname = ace_CHname;
    }

    public String getAce_ENname() {
        return ace_ENname;
    }

    public void setAce_ENname(String ace_ENname) {
        this.ace_ENname = ace_ENname;
    }

    public byte[] getAce_pic() {
        return ace_pic;
    }

    public void setAce_pic(byte[] ace_pic) {
        this.ace_pic = ace_pic;
    }
    public String getAce_note() {
        return ace_note;
    }

    public void setAce_note(String ace_note) {
        this.ace_note = ace_note;
    }
}

package Bodya;

import java.util.Date;


/**
 * Created by asus on 24.02.2019.
 */
public class Human {
    private String name;
    private String surename;
    private Date birthday;

    public Human(){
       name = "Bodya";
        surename = "M";
        birthday = new Date();
    }
    public Human(String name, String surename, String date) {
        this.name = name;
        this.surename = surename;
        birthday = Utils.parseDate(date);

    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

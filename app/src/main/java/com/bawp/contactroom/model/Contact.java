package com.bawp.contactroom.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "contact_table")
public class Contact {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "present_post")
    private String present_post;

    @ColumnInfo(name = "department")
    private String department;

    @ColumnInfo(name = "posted_district")
    private String posted_district;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "emp_id")
    private String emp_id;

    @ColumnInfo(name = "dob")
    private String dob;

    @ColumnInfo(name = "emp_designation")
    private String emp_designation;

    @ColumnInfo(name = "scale")
    private String scale;

    @ColumnInfo(name = "cadre")
    private String cadre;

    @ColumnInfo(name = "date_of_joining")
    private String date_of_joining;

    @ColumnInfo(name = "belt_no")
    private String belt_no;

    @ColumnInfo(name = "mob_no")
    private String mob_no;

    @ColumnInfo(name = "email_id")
    private String email_id;

    public Contact() {
    }

    public Contact(String present_post, String department, String posted_district,String name, String emp_id, String dob, String emp_designation, String scale, String cadre, String date_of_joining, String belt_no, String mob_no, String email_id) {

        this.name = name;
        this.present_post = present_post;
        this.department = department;
        this.posted_district = posted_district;
        this.emp_id = emp_id;
        this.dob = dob;
        this.emp_designation = emp_designation;
        this.scale = scale;
        this.cadre = cadre;
        this.date_of_joining = date_of_joining;
        this.belt_no = belt_no;
        this.mob_no = mob_no;
        this.email_id = email_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresent_post() {
        return present_post;
    }

    public void setPresent_post(String present_post) {
        this.present_post = present_post;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosted_district() {
        return posted_district;
    }

    public void setPosted_district(String posted_district) {
        this.posted_district = posted_district;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmp_designation() {
        return emp_designation;
    }

    public void setEmp_designation(String emp_designation) {
        this.emp_designation = emp_designation;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getCadre() {
        return cadre;
    }

    public void setCadre(String cadre) {
        this.cadre = cadre;
    }

    public String getDate_of_joining() {
        return date_of_joining;
    }

    public void setDate_of_joining(String date_of_joining) {
        this.date_of_joining = date_of_joining;
    }

    public String getBelt_no() {
        return belt_no;
    }

    public void setBelt_no(String belt_no) {
        this.belt_no = belt_no;
    }

    public String getMob_no() {
        return mob_no;
    }

    public void setMob_no(String mob_no) {
        this.mob_no = mob_no;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
}
package com.veer.login;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class login_dao {

 @Id
 int id;
 String first_name, last_name, email, dept, deg, emp_id, time_updated;
 String  mobile_no, age;
 
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTime_updated() {
        return time_updated;
    }

    
    public void setTime_updated(String time_updated) {
        this.time_updated = time_updated;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "login_dao{" + "id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", dept=" + dept + ", deg=" + deg + ", emp_id=" + emp_id + ", time_updated=" + time_updated + ", mobile_no=" + mobile_no + ", age=" + age + '}';
    }

    

    
 
 
}

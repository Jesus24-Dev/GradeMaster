
package grademaster.models;

import java.sql.Date;

public class Users {
    private String id;
    private String name;
    private String lastname;
    private String password;
    private Date birthday;
    private String address;
    private String gender;
    private int role;
    private boolean status;

    public Users(String id, String name, String lastname, String password, Date birthday, String address, String gender, int role) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
        this.gender = gender;
        this.role = role;
        this.status = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
        
}

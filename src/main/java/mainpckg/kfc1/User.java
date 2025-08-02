package mainpckg.kfc1;

import java.time.LocalDate;

public class User {
    private String id,name,email,password,phoneNo ;
    private LocalDate dob,doj ;

    public User(String id, String name, String email, String password, LocalDate dob, String phoneNo, LocalDate doj) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.phoneNo = phoneNo;
        this.doj = doj;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", dob=" + dob +
                ", doj=" + doj +
                '}';
    }
}

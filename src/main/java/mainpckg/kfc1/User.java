package mainpckg.kfc1;

import java.time.LocalDate;

public abstract class User {
    private String id, name, email, gender, address, password, phoneNo ;
    private LocalDate dob ;

    public User(String name, String email, String gender, String address, String password, String phoneNo, LocalDate dob) {
        this.id = this.generateID() ;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.password = password;
        this.phoneNo = phoneNo;
        this.dob = dob;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public String toString() {
        return
                "Id='" + id + '\n' +
                "Name='" + name + '\n' +
                "Email='" + email + '\n' +
                "Gender='" + gender + '\n' +
                "Address='" + address + '\n' +
                "Password='" + password + '\n' +
                "PhoneNo='" + phoneNo + '\n' +
                "Dob=" + dob +
                '}';
    }
    public abstract String generateID() ;
}





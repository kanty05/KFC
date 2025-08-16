package mainpckg.kfc1.KitchenEmployee;

import mainpckg.kfc1.User;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class KitchenEmployee extends User {

    public KitchenEmployee(String name, String email, String gender, String address, String password, String phoneNo, LocalDate dob) {
        super(name, email, gender, address, password, phoneNo, dob);
    }

    @Override
    public String generateID() {
        return "employee";
    }

    public KitchenEmployee login(String id, String password) {
        if (Objects.equals(id,this.getId()) && Objects.equals(password,this.getPassword())){
            return this ;
        }
        return null;
    }
}
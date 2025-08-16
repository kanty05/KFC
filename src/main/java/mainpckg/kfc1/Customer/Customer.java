package mainpckg.kfc1.Customer;

import mainpckg.kfc1.User;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Customer extends User{

    public Customer(String name, String email, String gender, String address, String password, String phoneNo, LocalDate dob) {
        super(name, email, gender, address, password, phoneNo, dob);
        this.setId(this.generateID());
    }

    @Override
    public String generateID() {
        String id = "" ;

        Random random = new Random();
        id = Integer.toString(random.nextInt(1000000,9999999));

        return id ;
    }

    public Customer login(String id, String password) {
        if (Objects.equals(id, this.getId()) && Objects.equals(password, this.getPassword())) {
            return this;
        }
        return null;
    }
}

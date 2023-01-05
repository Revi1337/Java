package optional_9;

import java.util.Base64;
import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Person person = new Person("james", "JAMES@gmail.com");

        // Recommand ✅
        String result = person.getEmail()
                .map(String::toLowerCase)
                .orElseGet(() -> Base64.getEncoder().encodeToString("email not provided".getBytes()));
        System.out.println(result);

        // Not Recomanded ❌
//        if (person.getEmail().isPresent()) {
//            String email = person.getEmail().get();
//            System.out.println(email.toLowerCase());
//        } else {
//            System.out.println("email not provided");
//        }

    }
}

class Person{
    private final String name;
    private final String email;

    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}

package project_spring_data_jpa;

import project_spring_data_jpa.model.User;
import project_spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) {
        User user = new User();
        user.setName("Wanderson");
        user.setUsername("Andin");
        user.setPassword("123456");
        user.setName("Walison");
        user.setUsername("Ash");
        user.setPassword("78910");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}











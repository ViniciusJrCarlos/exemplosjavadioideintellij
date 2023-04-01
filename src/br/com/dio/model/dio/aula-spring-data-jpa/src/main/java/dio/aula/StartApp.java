package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;
    @Autowired
    private User user;

    @Override
    public void run(String... args) throws Exception {

        //user user = new user();
        //user.setName(repository.getString(""));
        //user.setUsername();
        //user.setPassword();




        repository.save(user);

        for (User u : repository.findAll()) {
            System.out.println(u);
        }


    }
    private void User(){

        User user = new User();
        user.setName("name");
        user.setUsername("username");
        user.setPassword("password");
    }


}

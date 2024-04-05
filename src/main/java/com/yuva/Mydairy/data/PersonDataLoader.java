package com.yuva.Mydairy.data;

import com.yuva.Mydairy.biz.logs.LogData;
import com.yuva.Mydairy.biz.logs.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PersonDataLoader implements ApplicationRunner {
    private PersonRepo personRepo;
    private  UserRepo userRepo;
    @Autowired
    public PersonDataLoader(PersonRepo personRepo, UserRepo userRepo) {
        this.personRepo = personRepo;
        this.userRepo = userRepo;
    }
    public PersonDataLoader() {}

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (personRepo != null && personRepo.count() == 0) {
            List<LogData> data =
                    List.of(new LogData(null, "today", "firstlog"),
                            new LogData(null, "monday", "firstlog2"),
                            new LogData(null, "tuesday", "firstlog3"),
                            new LogData(null, "thursday", "firstlog4"),
                            new LogData(null, "today", "firstlog5")
                    );
            personRepo.saveAll(data);

        }
        if (userRepo != null && userRepo.count() == 0) {
            List<User> users = List.of(
                    new User("email1@example.com", "John", "Doe", "123"),
                    new User("email2@example.com", "Jane", "Smith", "1234")
            );
            userRepo.saveAll(users);

    }

}}

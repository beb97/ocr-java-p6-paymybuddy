package com.beb97.p6.service;

import com.beb97.p6.model.User;
import com.beb97.p6.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

//    https://openclassrooms.com/fr/courses/6900101-creez-une-application-java-avec-spring-boot/7078015-creez-un-controleur-rest-pour-gerer-vos-donnees

    public Iterable<User> getAll() {
//        List<Person> persons = new ArrayList<>();
//        persons.add(new Person());
        return userDao.findAll();
    }

    public boolean add() {
        User user1 = new User();
        User user2 = new User();
        user2.setFirstName("P2");
        userDao.save(user2);

        user1.addContact(user2);
        userDao.save(user1);
        return true;
    }
}

package be.glowing.system.services;

import be.glowing.system.models.User;
import be.glowing.system.models.UserType;
import be.glowing.system.respositories.UserRepo;
import io.smallrye.common.annotation.Blocking;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class UserService {
    @Inject
    UserRepo userRepo;

    public List<User> getAllActiveReviewers(){
        userRepo.listAll().stream()
                .filter(user -> user.isActive() && user.getType() == UserType.Reviewer)
                .toList();
        List<User> testList = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        user1.setId(123L);
        user2.setId(124L);
        user1.setName("iser1");
        user2.setName("iser2");
        testList.add(user1);
        testList.add(user2);
        return  testList;
    }


}

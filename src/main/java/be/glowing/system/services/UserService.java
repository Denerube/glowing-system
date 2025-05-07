package be.glowing.system.services;

import be.glowing.system.models.User;
import be.glowing.system.respositories.UserRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


@ApplicationScoped
public class UserService {
    @Inject
    UserRepo userRepo;


}

package be.glowing.system.services;

import be.glowing.system.respositories.PostRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PostService {
    @Inject
    PostRepo postRepo;
}

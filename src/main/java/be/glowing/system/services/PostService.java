package be.glowing.system.services;

import be.glowing.system.models.Post;
import be.glowing.system.respositories.PostRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class PostService {
    @Inject
    PostRepo postRepo;


    List<Post> getAllPostsByUser(Long userId){
        return postRepo.getAllPostsByUser(userId);
    }


}

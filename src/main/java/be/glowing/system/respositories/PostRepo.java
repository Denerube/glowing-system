package be.glowing.system.respositories;

import be.glowing.system.models.Post;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class PostRepo  implements PanacheRepository<Post> {

    public List<Post> getAllPostsByUser(Long userId){
        return list("postedBy",userId);
    }
}

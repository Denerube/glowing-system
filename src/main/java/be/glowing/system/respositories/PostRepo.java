package be.glowing.system.respositories;

import be.glowing.system.models.Post;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PostRepo  implements PanacheRepository<Post> {
}

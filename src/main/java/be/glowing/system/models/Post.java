package be.glowing.system.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy="post_content")
    private List<PostContent> content;
    private PostType type;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User postedBy;
    @OneToMany(mappedBy="rating")
    private List<Rating> ratingList;

}

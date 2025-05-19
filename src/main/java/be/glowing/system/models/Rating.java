package be.glowing.system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    @Id
    @GeneratedValue
    private Long id;
    private int rating;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User ratedBy;
    @ManyToOne
    @JoinColumn(name="post_id", nullable=false)
    private Post ratedPost;
}

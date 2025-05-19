package be.glowing.system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostContent {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    @Lob
    private List<byte[]> imageList;
    @ManyToOne
    @JoinColumn(name="post_id", nullable=false)
    private Post post_content;
}

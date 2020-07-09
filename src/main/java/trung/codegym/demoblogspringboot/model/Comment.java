package trung.codegym.demoblogspringboot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String Comment;

    private String author;

    @ManyToOne
    private Blog blog;
}

package trung.codegym.demoblogspringboot.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String subtitle;

    @Column(columnDefinition = "TEXT")
    private String content;

    private int likes;
}

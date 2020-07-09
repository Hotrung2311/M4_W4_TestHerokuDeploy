package trung.codegym.demoblogspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import trung.codegym.demoblogspringboot.model.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {
}

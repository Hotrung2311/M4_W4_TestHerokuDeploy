package trung.codegym.demoblogspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import trung.codegym.demoblogspringboot.model.Blog;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Long> {
}

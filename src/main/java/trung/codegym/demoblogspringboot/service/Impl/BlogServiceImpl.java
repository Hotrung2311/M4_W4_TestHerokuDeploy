package trung.codegym.demoblogspringboot.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trung.codegym.demoblogspringboot.model.Blog;
import trung.codegym.demoblogspringboot.repository.BlogRepository;
import trung.codegym.demoblogspringboot.service.BlogService;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return (List<Blog>) blogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Blog save(Blog model) {
        return blogRepository.save(model);
    }

    @Override
    public Blog delete(Long id) {
        Blog blog = this.findById(id);
        blogRepository.delete(blog);
        return blog;
    }
}

package trung.codegym.demoblogspringboot.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trung.codegym.demoblogspringboot.model.Comment;
import trung.codegym.demoblogspringboot.repository.CommentRepository;
import trung.codegym.demoblogspringboot.service.CommentService;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findAll() {
        return (List<Comment>)commentRepository.findAll();
    }

    @Override
    public Comment findById(Long id) {
        return null;
    }

    @Override
    public Comment save(Comment model) {
        return null;
    }

    @Override
    public Comment delete(Long id) {
        return null;
    }
}

package trung.codegym.demoblogspringboot.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    T findById(Long id);
    T save(T model);
    T delete(Long id);
}

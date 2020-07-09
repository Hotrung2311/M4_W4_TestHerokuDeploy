package trung.codegym.demoblogspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import trung.codegym.demoblogspringboot.model.Blog;
import trung.codegym.demoblogspringboot.service.BlogService;

@Controller
public class GreetingController {
    @Autowired
    private BlogService blogService;

    @GetMapping("")
    public ModelAndView allBlog(){
        ModelAndView doan = new ModelAndView("test/test_index");
        doan.addObject("blogs", blogService.findAll());
        return doan;
    }

    @GetMapping("/blog/{id}")
    public ModelAndView getDetailPage(@PathVariable Long id){
        ModelAndView doanyeudau = new ModelAndView("test/test_post");

        Blog blog = blogService.findById(id);
        doanyeudau.addObject("blog", blog);

        return doanyeudau;
    }

//    @GetMapping("{/blog/1")
//    public ModelAndView getDetailPage(){
//        ModelAndView doanyeudau = new ModelAndView("test/test_post");
//        doanyeudau.addObject("blog", blogService.findById(Long.parseLong("1")));
//        System.out.println(blogService.findById(Long.parseLong("1")));
//        return doanyeudau;
//    }

}

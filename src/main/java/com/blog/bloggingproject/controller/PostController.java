package com.blog.bloggingproject.controller;


import com.blog.bloggingproject.model.Post;
import com.blog.bloggingproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    @Autowired
    PostRepository repo;


    @GetMapping("/")
    public  String viewHomePage(Model model){
        model.addAttribute("listPosts",repo.findAll());
        return "index";
    }

    @GetMapping("/new")
    public  String newPost(Model model){
        model.addAttribute("post",new Post());
        return "new_post";
    }

    @PostMapping("/save")
    public  String savePost(@ModelAttribute("post") Post post){
        repo.save(post);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editPost(@PathVariable int id, Model model) {

        return repo.findById(id)
                .map(post -> {
                    model.addAttribute("post", post);
                    return "edit_post";
                })
                .orElse("redirect:/");
    }

    @PostMapping("/update")
    public String updatePost(
            @ModelAttribute("post") Post post) {

        repo.save(post);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public  String  deletePost(@PathVariable int id){
        repo.deleteById(id);
        return "redirect:/";
    }

}

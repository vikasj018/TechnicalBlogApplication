package technicalblog.controller;

import org.springframework.ui.Model;

import javax.xml.ws.RequestWrapper;
import java.util.ArrayList;

@controller
public class HomeController {

    @RequestMapping("/")
    public String getAllPosts(Model model){

        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("Post Body 1");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Post Body 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Post Body 3");
        post3.setDate(new Date());

        posts.add[post1];
        posts.add[post2];
        posts.add[post3];

        model.addAttribute("posts", posts);

        return "Index";
    }
}

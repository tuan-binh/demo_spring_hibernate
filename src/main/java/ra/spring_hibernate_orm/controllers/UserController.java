package ra.spring_hibernate_orm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.spring_hibernate_orm.models.dao.IUserDao;
import ra.spring_hibernate_orm.models.entity.User;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    private IUserDao userDao;

    @GetMapping
    public String userPage(Model model){
        model.addAttribute("users", userDao.findAll());
        return "list";
    }

    @GetMapping("/init")
    public String initPage(Model model){
        return "form";
    }

    @PostMapping("/add")
    public String addUser(User user){
        userDao.addUser(user);
        return "redirect:/";
    }

}

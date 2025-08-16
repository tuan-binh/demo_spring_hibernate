package ra.spring_hibernate_orm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ra.spring_hibernate_orm.models.dao.IUserDao;
import ra.spring_hibernate_orm.models.entity.User;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    private IUserDao userDao;

    // phân trang nên bắt đầu từ 0
    @GetMapping
    public String userPage(Model model,
                           @RequestParam(name = "page",defaultValue = "0") int page,
                           @RequestParam(name = "size",defaultValue = "3") int size) {
        model.addAttribute("users", userDao.findAll(page,size));
        return "list";
    }

    @GetMapping("/init")
    public String initPage(Model model) {
        return "form";
    }

    @PostMapping("/add")
    public String addUser(User user) {
        userDao.addUser(user);
        return "redirect:/";
    }

}

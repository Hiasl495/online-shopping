package edu.project.application.web.controller;

import edu.project.application.application.service.UserService;
import edu.project.application.web.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/userdto", method = RequestMethod.GET)
    public String getUser(Model model) {
        UserDto userDto = new UserDto();
        userDto.setName("Hans");
        model.addAttribute(userDto);

        return userDto.toString();
    }

}

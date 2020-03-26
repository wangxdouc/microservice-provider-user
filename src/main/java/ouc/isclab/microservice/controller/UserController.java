package ouc.isclab.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ouc.isclab.microservice.entity.User;
import ouc.isclab.microservice.repository.UserRepository;

import java.util.List;

/**
 * 服务提供者控制器
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable Long id) {
        return userRepository.findOne(id);
    }

    @GetMapping("/users")
    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}

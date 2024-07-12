package org.grtsinry43.springbootquickstart.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.constraints.NotBlank;
import org.grtsinry43.springbootquickstart.dto.ApiResponse;
import org.grtsinry43.springbootquickstart.model.User;
import org.grtsinry43.springbootquickstart.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public ApiResponse<List<User>> listAllUser() {
        List<User> list = userService.list();
        return ApiResponse.success(list);
    }

    @PostMapping("/add")
    public ApiResponse<String> addUser(@RequestParam @NotBlank String name) {
        User user = new User(name);
        boolean save = userService.save(user);
        if (save) {
            return ApiResponse.success("添加成功");
        } else {
            return ApiResponse.error(500, "添加失败");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ApiResponse<String> deleteUser(@PathVariable Integer id) {
        boolean remove = userService.removeById(id);
        if (remove) {
            return ApiResponse.success("删除成功");
        } else {
            return ApiResponse.error(500, "删除失败");
        }
    }
}
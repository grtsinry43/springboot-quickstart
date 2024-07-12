package org.grtsinry43.springbootquickstart.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.grtsinry43.springbootquickstart.dto.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author： grtsinry43
 * @Date： 2024/7/12 下午2:43
 * @Description：少年负壮气，奋烈自有时！
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping("/world")
    public ApiResponse<String> helloWorld(HttpServletRequest request) {
        String text = request.getParameter("text");
        // 假设这里直接返回请求参数text的内容
        return ApiResponse.success(text);
    }

    @RequestMapping("/world2")
    public ApiResponse<String> helloWorldErr() {
        // 假设这里直接返回请求参数text的内容
        return ApiResponse.error(400, "请求参数错误");
    }
}

package org.grtsinry43.springbootquickstart.controller;

import jakarta.validation.ConstraintViolationException;
import org.grtsinry43.springbootquickstart.dto.ApiResponse;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author： grtsinry43
 * @Date： 2024/7/12 下午7:41
 * @Description：少年负壮气，奋烈自有时！
 */

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ApiResponse<Object> handleMissingServletRequestParameterException(Exception ex) {
        // 提取错误信息
        String errorMessage = "缺少请求参数：" + ex.getMessage();

        return ApiResponse.error(400, errorMessage);
    }
//    @ExceptionHandler(ConstraintViolationException.class)
//    public ApiResponse<Object> handleConstraintViolationException(ConstraintViolationException ex) {
//        // 提取错误信息
//        String errorMessage = ex.getMessage();
//
//        return ApiResponse.error(400, errorMessage);
//    }
}
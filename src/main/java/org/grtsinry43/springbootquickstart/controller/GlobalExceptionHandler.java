package org.grtsinry43.springbootquickstart.controller;

import jakarta.validation.ConstraintViolationException;
import org.grtsinry43.springbootquickstart.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ApiResponse<Object>> handleMissingServletRequestParameterException(Exception ex) {
        // 提取错误信息
        String errorMessage = "缺少请求参数：" + ex.getMessage();
        ApiResponse<Object> apiResponse = ApiResponse.error(400, errorMessage);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ApiResponse<Object>> handleConstraintViolationException(ConstraintViolationException ex) {
        // 提取错误信息
        String errorMessage = ex.getMessage();
        ApiResponse<Object> apiResponse = ApiResponse.error(400, errorMessage);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
package com.mincai.samplewebinit.controller;

import com.mincai.webinit.common.ErrorCode;
import com.mincai.webinit.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author limincai
 */
@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/test")
    public String test(String name) {
        if ("limincai".equals(name)) {
            return "yes!";
        } else {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "参数错误");
        }
    }
}

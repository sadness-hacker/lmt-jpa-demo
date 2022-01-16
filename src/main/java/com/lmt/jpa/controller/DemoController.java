package com.lmt.jpa.controller;

import com.lmt.jpa.dto.UserDto;
import com.lmt.jpa.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description 演示接口
 *
 * @author bazhandao
 * @date 2022/1/16 16:08
 * @since JDK1.8
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Resource
    private UserRepository userRepository;

    /**
     * 执行方案4
     * @author bazhandao
     * @date 2022-01-16
     * @return
     */
    @GetMapping(value = "/exec-demo-4")
    public List<UserDto> demo4() {
        return userRepository.findUserDto();
    }

}

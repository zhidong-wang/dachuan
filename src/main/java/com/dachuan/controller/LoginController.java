package com.dachuan.controller;

import com.dachuan.util.ResultJsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/dachuan/login")
public class LoginController {

    @RequestMapping("login")
    @ResponseBody
    public Map<String, Object> hello(HttpServletRequest request, String userName, String passWord) {
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(passWord))
            return ResultJsonUtil.getResultErrorMap("用户名和密码不能为空!");

        // TODO 登录鉴权

        request.getSession().setAttribute("userName", userName);
        return ResultJsonUtil.getResultMap("登录成功！");
    }

}

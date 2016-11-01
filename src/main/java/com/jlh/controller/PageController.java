package com.jlh.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jlh
 * On 2016/10/17 0017.
 *
 * @description
 */
@Api("测试Thymeleaf和devtools")
@Controller
@RequestMapping("/thymeleaf")
public class PageController {
    @ApiOperation("第一个thymeleaf程序")
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "world") String name,
                           Model model) {
        model.addAttribute("xname", name);
        return "index";
    }

    @ApiOperation("thymeleaf ajax")
    @ResponseBody
    @RequestMapping(value = "/ajax", method = RequestMethod.GET)
    public String ajax(@RequestParam("username") String username) {
        return username;
    }
}
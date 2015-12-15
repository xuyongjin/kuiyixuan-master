package com.kuiyix.web.controller.index;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 许勇进 on 2015-11-24.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelMap list() {
        ModelMap model = new ModelMap();

        Subject subject = SecurityUtils.getSubject();
        if (subject.hasRole("admin")) {
            model.put("role:","有");
        }else {
            model.put("role:","无");
        }
        return model;
    }
}

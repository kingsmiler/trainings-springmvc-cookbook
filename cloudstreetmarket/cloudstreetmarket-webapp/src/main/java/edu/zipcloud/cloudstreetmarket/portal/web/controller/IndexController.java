package edu.zipcloud.cloudstreetmarket.portal.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;


@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping
    public ModelAndView root(ModelMap model) {
        ModelAndView view = new ModelAndView("/index");

        view.addObject("time", new Date());
        view.addObject("message", "Hello Beetl!");

        String submit = messageSource.getMessage("submit", null, LocaleContextHolder.getLocale());

        view.addObject("submit", submit);

        return view;
    }
}

package com.example.demo;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/excelTest")
public class ExcelController {
    @RequestMapping(method = RequestMethod.GET)
    public String test(Model model) {
        model.addAttribute("msg","サンプルメッセージ！");
        return "test/test";
    }
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public ModelAndView download(Map<String, Object> model) throws Exception {
        ModelAndView mav = new ModelAndView(new ExcelBuilder());

        mav.addObject("fileName", "サンプル.xlsx");

        return mav;
    }

}

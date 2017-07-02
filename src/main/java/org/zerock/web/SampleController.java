package org.zerock.web;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hankanghak on 2017. 6. 29..
 */
@Controller
public class SampleController {
	
	private static final Logger log =
			LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("doA")
    public void doA(){

        log.info("doA called ....................");
    }

    @RequestMapping("doB")
    public void doB() {

        log.info("doB called ....................");
    }

    @RequestMapping("doC")
    public String doC(@ModelAttribute("msg") String msg) {

        log.info("doC called ....................");

        return "result";

    }

}

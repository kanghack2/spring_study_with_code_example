package com.kanghack2.example.springEx.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hankanghak on 2017. 6. 29..
 */
@Slf4j
@Controller
@SpringBootApplication
public class SampleContorller {


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

    public static void main(String[] args){
        SpringApplication.run(SampleContorller.class);
    }
}

package com.springconfig.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shankarraomata on 5/24/17.
 */
@RestController
public class Controller {

    @Value("${demo.message}")
    private String message;

    @Value("${demo.message1}")
    private String messageYml;

    @Value("${demo.random1}")
    private String messageRandom;


    @Value("${demo.description}")
    private String messagePlaceholder;

    @RequestMapping("/")
    public String printMessage()
    {
        return message;
    }

    @RequestMapping("/yml")
    public String printMessageFromYml()
    {
        return messageYml;
    }

    @RequestMapping("/random")
    public String printMessageRandom()
    {
        return messageRandom;
    }

    @RequestMapping("/placeHolder")
    public String printMessagePlaceholder()
    {
        return messagePlaceholder;
    }
}

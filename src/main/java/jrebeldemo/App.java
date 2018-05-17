package jrebeldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
@ComponentScan
public class App {

    public App() {
    }

    @RequestMapping(value = "/helloworld")
    String hello() {
        return "Hello World";
    }

    public static void main(String... args) {
        SpringApplication.run(App.class, args);
    }
}
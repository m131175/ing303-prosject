package no.hvl.ing303project.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class GreetingController {

    @GetMapping()
    public String showGreeting(Model model) {
        model.addAttribute("greeting", "Hello World!");
        var x = 0;
        return "index";
    }
}

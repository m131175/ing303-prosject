package no.hvl.ing303project.visTabell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TargetPageController {

    @Autowired
    private ResturantEntityRepo resturantEntityRepo;
    @GetMapping("/target-page")
    public String showTargetPage(Model model){
        Iterable<ResturantEntity> data = resturantEntityRepo.findAll();
        model.addAttribute("data",data);
        return "target-page";
    }
}

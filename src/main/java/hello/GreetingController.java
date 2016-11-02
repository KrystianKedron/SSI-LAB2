package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {

        String values[] = new String[]{greeting.getImie(), greeting.getNazwisko(), greeting.getMail(),greeting.getWiadomosc()};
        boolean error = false;
        for (String value: values){
            String status = value.split(";")[0];
            if (status.equals("error")){
                error = true;
                break;
            }
        }

        if (error){
            return "error";
        } else {
            return "result";
        }
    }

}

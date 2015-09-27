package demo;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(HelloForm form) {
        return "Hello " + form.getName();
    }
}

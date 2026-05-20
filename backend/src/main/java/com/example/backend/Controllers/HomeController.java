//package com.example.backend.Controllers;
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class HomeController {
//
//    @GetMapping("/home")
//    public String getHome(Model model){
//        return "index";
//    }
////    @GetMapping("/about")
////    public String getAbout() {
////        return "about";
////    }
//}
package com.example.backend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String getHome(){
        return "Merhaba DevOps! İlk CI/CD Pipeline projemiz basariyla calisiyor. ve mutluyuz2233334444";
    }
}
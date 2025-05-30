
package com.LMS.LibraryManagementSystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")
public class PageController {

    /** Renders templates/login.html */
    @GetMapping("/login")
    public String loginView() {            // no Model needed
        return "login";                    // -> src/main/resources/templates/login.html
    }

    /** Landing page after successful login (optional) */
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}

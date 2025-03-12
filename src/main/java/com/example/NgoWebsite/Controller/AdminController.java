package com.example.NgoWebsite.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {

    @GetMapping("/admin/login")
    public String showAdminLogin() {
        return "admin/admin_login"; 
    }
    
    public String processLogin(@RequestParam String username, @RequestParam String password, HttpSession session) {
    	if("admin".equals(username) && "admin123".equals(password)) {
    		return "redirect:/admin/admin_dashboard";
    	}else {
    		return "redirect:/admin/login?error=true";
    	}
    }

    @GetMapping("/admin/dashboard")
    public String showAdminDashboard() {
        return "admin/admin_dashboard"; 
    }

    
    @GetMapping("/admin/edit-about")
    public String editAboutUs() {
        return "admin/about_edit"; 
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); 
        return "redirect:/admin/login"; 
    }

    
}

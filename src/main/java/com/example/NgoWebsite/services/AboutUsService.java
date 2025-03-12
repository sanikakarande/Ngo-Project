package com.example.NgoWebsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NgoWebsite.models.AboutUs;
import com.example.NgoWebsite.repository.AboutUsRepository;


@Service
public class AboutUsService {
	
	@Autowired
    private AboutUsRepository aboutUsRepository;

    public AboutUs getAboutUs() {
        return aboutUsRepository.findById(1L).orElse(new AboutUs());
    }

    public AboutUs updateAboutUs(AboutUs aboutUs) {
        aboutUs.setId(1L); // Ensure ID remains 1 to update existing record
        return aboutUsRepository.save(aboutUs);
    }

    public void saveAboutUs(AboutUs aboutUs) {
        aboutUsRepository.save(aboutUs); 
    }

}

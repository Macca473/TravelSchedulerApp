package travelScheduler.springframework.travelSchedulerApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import travelScheduler.springframework.travelSchedulerApp.Repository.LocationRepository;

@Controller
public class LocationController {

    private final LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @RequestMapping("/location")
    public String GetMyLocations(Model model ,String name){

        model.addAttribute("location", locationRepository.findAll());

        return "location";
    }
}

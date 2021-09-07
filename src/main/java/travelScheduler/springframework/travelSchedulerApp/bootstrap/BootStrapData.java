package travelScheduler.springframework.travelSchedulerApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import travelScheduler.springframework.travelSchedulerApp.Model.Location;
import travelScheduler.springframework.travelSchedulerApp.Repository.LocationRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final LocationRepository locationRepository;

    public BootStrapData(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

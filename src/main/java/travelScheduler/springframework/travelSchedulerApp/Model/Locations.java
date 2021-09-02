package travelScheduler.springframework.travelSchedulerApp.Model;

import javax.persistence.Entity;
import java.util.List;
import java.util.Set;

public class Locations {
//    Set<Location> locations;

    List<Location> locations;

    public Locations() {
    }

    public Locations(List<Location> location) {
        this.locations = location;
    }

    public List<Location> getLocation() {
        return locations;
    }

    public void setLocation(List<Location> location) {
        this.locations = location;
    }
}



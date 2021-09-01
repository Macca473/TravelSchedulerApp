package travelScheduler.springframework.travelSchedulerApp.Model;

import java.util.Set;

public class Locations {
    Set<Location> locations;

    public Locations() {
    }

    public Locations(Set<Location> location) {
        this.locations = location;
    }

    public Set<Location> getLocation() {
        return locations;
    }

    public void setLocation(Set<Location> location) {
        this.locations = location;
    }
}



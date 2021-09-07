package travelScheduler.springframework.travelSchedulerApp.Repository;

import org.springframework.data.repository.CrudRepository;
import travelScheduler.springframework.travelSchedulerApp.Model.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {

}

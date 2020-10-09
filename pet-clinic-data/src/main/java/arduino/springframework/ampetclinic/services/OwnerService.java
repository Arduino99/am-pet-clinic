package arduino.springframework.ampetclinic.services;

import arduino.springframework.ampetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);

}

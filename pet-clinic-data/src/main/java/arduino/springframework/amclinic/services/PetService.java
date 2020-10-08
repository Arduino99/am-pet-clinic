package arduino.springframework.amclinic.services;

import arduino.springframework.ampetclinic.model.Pet;

import java.util.Set;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();
}
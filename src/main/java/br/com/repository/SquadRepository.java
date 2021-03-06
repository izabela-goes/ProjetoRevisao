package br.com.repository;

import br.com.model.Squad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SquadRepository extends MongoRepository<Squad, String>{

}

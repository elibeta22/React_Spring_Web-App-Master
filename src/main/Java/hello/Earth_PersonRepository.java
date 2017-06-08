package hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by eli on 5/17/2017.
 */
@Repository

public interface Earth_PersonRepository extends CrudRepository<Earth_Person, Long> {

}

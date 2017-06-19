/**
 * 
 */
package com.dhaker.microservices.lab1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.dhaker.microservices.lab1.entities.Team;

/**
 * @author rsuarez
 *
 */
@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team,Long>{

}

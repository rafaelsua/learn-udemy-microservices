/**
 * 
 */
package com.dhaker.microservices.lab1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.dhaker.microservices.lab1.entities.Player;

/**
 * @author rsuarez
 *
 */
@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long>{

}

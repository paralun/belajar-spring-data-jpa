package com.paralun.app.repo;

import com.paralun.app.model.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long>{
    
}

package com.paralun.app.service;

import com.paralun.app.model.Player;
import com.paralun.app.repo.PlayerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("playerService")
@Transactional
public class PlayerService {
    
    @Autowired
    private PlayerRepository repository;
    
    public void save(Player player) {
        repository.save(player);
    }
    
    public List<Player> getPlayers() {
        return (List<Player>) repository.findAll();
    }
    
}

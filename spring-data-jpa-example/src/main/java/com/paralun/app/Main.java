package com.paralun.app;

import com.paralun.app.config.JpaConfig;
import com.paralun.app.model.Player;
import com.paralun.app.service.PlayerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);
        PlayerService service = context.getBean(PlayerService.class);
        
        Player p = new Player();
        p.setPlayerName("Haryono");
        p.setAge(33);
        p.setPosition("Gelandang");
        p.setRegion("Indonesia");
        p.setTeam("Persib Bandung");
        
        service.save(p);
    }
    
}

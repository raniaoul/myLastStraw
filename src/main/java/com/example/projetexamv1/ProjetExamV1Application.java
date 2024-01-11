package com.example.projetexamv1;

import com.example.projetexamv1.Entity.CentreLocal;
import com.example.projetexamv1.Entity.Habitant;
import com.example.projetexamv1.Repository.CentreLocalRepository;
import com.example.projetexamv1.Repository.HabitantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetExamV1Application {

    @Autowired
    CentreLocalRepository centreLocalRepository;
    @Autowired
    HabitantRepository habitantRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjetExamV1Application.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
                Habitant habitant = new Habitant("oul", "rania", "ibn sina", "agdal", "rabat", "oulhaj@gmail.com", "  0623456789");
                CentreLocal centreLocal = new CentreLocal(22, "centreAgdal", "ibn sina", "agdal", "rabat");
                habitant.setCentrePostalHabitant(centreLocal);
                centreLocalRepository.save(centreLocal);
                habitantRepository.save(habitant);
            };
        }
}

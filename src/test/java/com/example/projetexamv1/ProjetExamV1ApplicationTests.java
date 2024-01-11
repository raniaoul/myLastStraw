package com.example.projetexamv1;

import com.example.projetexamv1.Entity.CentreLocal;
import com.example.projetexamv1.Entity.CentreRegional;
import com.example.projetexamv1.Entity.Habitant;
import com.example.projetexamv1.Repository.CentreLocalRepository;
import com.example.projetexamv1.Repository.HabitantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjetExamV1ApplicationTests {

    @Autowired
    HabitantRepository habitantRepository;
    @Autowired
    CentreLocalRepository centreLocalRepository;


    @Test
    public void SaveHabitant() {
        Habitant habitant = new Habitant("oul", "rania","ibn sina", "agdal","rabat", "oulhaj@gmail.com", "  0623456789");
        CentreLocal centreLocal = new CentreLocal(22, "centreAgdal", "ibn sina", "agdal", "rabat");
        habitant.setCentrePostalHabitant(centreLocal);
        centreLocalRepository.save(centreLocal);
        habitantRepository.save(habitant);
    }

}

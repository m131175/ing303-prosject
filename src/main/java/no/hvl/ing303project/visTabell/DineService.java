package no.hvl.ing303project.visTabell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DineService {
    private final ResturantEntityRepo resturantEntityRepo;

    @Autowired
    public DineService(ResturantEntityRepo resturantEntityRepo){
        this.resturantEntityRepo = resturantEntityRepo;
    }
}

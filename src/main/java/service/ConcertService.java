package service;

import model.Concert;
import repositories.ConcertRepository;

import java.util.List;

public class ConcertService {
    ConcertRepository concertRepository = new ConcertRepository();

    public void create(Concert concert) {
        concertRepository.save(concert);
    }

    public List<Concert> findAll() {
        return concertRepository.findAll();

    }

    public Concert findById(Long id) {
        return concertRepository.findById(id);
    }

    public void update(Concert concert) {
        concertRepository.update(concert);
    }

    public void delete(Long id) {
        concertRepository.delete(id);
    }

}

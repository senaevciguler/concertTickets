package service;

import model.Audience;
import repositories.AudienceRepository;

import java.util.List;

public class AudienceService {
    AudienceRepository audienceRepository = new AudienceRepository();

    public void create(Audience audience) {

        audienceRepository.save(audience);
    }

    public List<Audience> findAll() {
        return audienceRepository.findAll();

    }

    public Audience findById(Long id) {
        return audienceRepository.findById(id);
    }

    public void update(Audience audience) {
        audienceRepository.update(audience);
    }

    public void delete(Long id) {
        audienceRepository.delete(id);
    }

}

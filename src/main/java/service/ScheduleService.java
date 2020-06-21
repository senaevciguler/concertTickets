package service;

import model.Schedule;
import repositories.ScheduleRepository;

import java.util.List;

public class ScheduleService {
    ScheduleRepository scheduleRepository = new ScheduleRepository();
    public void create(Schedule schedule){
        scheduleRepository.save(schedule);
    }
    public List<Schedule> findAll(){
        return scheduleRepository.findAll();
    }
    public Schedule findById(Long id){
        return scheduleRepository.findById(id);
    }
    public void update(Schedule schedule){
        scheduleRepository.update(schedule);
    }
    public void delete(Long id){
        scheduleRepository.delete(id);
    }

}

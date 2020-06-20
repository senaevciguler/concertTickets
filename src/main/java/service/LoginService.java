package service;

import model.Audience;
import repositories.AudienceRepository;

import java.util.List;

public class LoginService {

    public boolean isLoginSuccesful(String mail) {
        AudienceRepository audienceRepository = new AudienceRepository();
        List<Audience> audiences = audienceRepository.findByMail(mail);
        if (audiences.size() > 0) {
            System.out.println("login success!");
            return true;
        }

        System.out.println("wrong email, please try");
        return false;


    }

}

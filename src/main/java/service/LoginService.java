package service;

import model.Audience;
import repositories.AudienceRepository;

import java.util.List;
import java.util.Scanner;

public class LoginService {

    public boolean isLogiSuccesful() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your email");
        AudienceRepository audienceRepository = new AudienceRepository();
        List<Audience> audiences = audienceRepository.findByMail(sc.nextLine());
        if (audiences.size() > 0) {
            System.out.println("login success!");
            return true;
        }

        System.out.println("wrong email, please try");
        return false;


    }

}

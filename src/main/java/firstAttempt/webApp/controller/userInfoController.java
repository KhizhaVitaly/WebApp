package firstAttempt.webApp.controller;

import firstAttempt.webApp.domain.User;
import firstAttempt.webApp.domain.UserInfo;
import firstAttempt.webApp.repos.UserInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class userInfoController {

    @Autowired
    private UserInfoRepo userInfoRepo;

    @GetMapping("/userInfo")
    public String userInfo(){
        return "userInfo";
    }

    @PostMapping("/userInfo")
    public String applyChanges(@AuthenticationPrincipal User user,
                               @RequestParam String firstName,
                               @RequestParam String lastName, Map<String, Object> model){

        Date date = new Date();

        UserInfo userInfo = new UserInfo(firstName, lastName, user, date);
        model.put("info", userInfo);

        userInfoRepo.save(userInfo);

        return "redirect:/main";
    }
}

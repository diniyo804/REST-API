package kr.co.fastcampus.eatgo.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // web에서 접속 가능한 controller 임을 선언
public class WelcomeController {

    @GetMapping("/") // HTTP에서 접속할 때 사용하는 메서드를 설정한다.
    public String hello(){
        return "hello world!!";
    }
}

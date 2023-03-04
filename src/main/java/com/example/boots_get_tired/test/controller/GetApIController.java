package com.example.boots_get_tired.test.controller;

import com.example.boots_get_tired.test.model.SearchVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/getAPI")
public class GetApIController {

    @RequestMapping(method = RequestMethod.GET, path = "/getRequest")
    public String getRequest(){
        //http://localhost:8080/getAPI/getRequest
        String str = "GET API 테스트";
        return str;
    }
    @GetMapping("/getParameters")
    public String getParameters(@RequestParam String name, @RequestParam String email){
        //http://localhost:8080/getAPI/getParameters?name=test&email=test@test.com
        String str = "나는야 " + name + "이다! " + email;
        return str;
    }

    @GetMapping("/getParameters2")
    public String getParameters2(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "email") String email){
        //http://localhost:8080/getAPI/getParameters2?name=test&email=test@test.com
        String str = "2나는야 " + name + "이다2! " + email;
        return str;
    }
    @GetMapping("/getMultiParameters")
    public String getMultiParameters(SearchVO searchVO){
        //http://localhost:8080/getAPI/getMultiParameters?name=test&email=test@test.com
        String str = "이름은 " + searchVO.getName() + "이고, 이메일은 " + searchVO.getEmail();
        return str;
    }

    @GetMapping("/getMultiParametersJson")
    public SearchVO getMultiParametersJson(SearchVO searchVO){
        //http://localhost:8080/getAPI/getMultiParametersJson?name=test&email=test@test.com
        //이렇게 보내면 json 으로 화면에 받아준다.
        return searchVO;
    }


}

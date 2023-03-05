package com.example.boots_get_tired.test.controller;

import com.example.boots_get_tired.test.model.SearchVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postAPI")
public class PostApiController {

    @RequestMapping(method = RequestMethod.POST, path = "/postRequest")
    public SearchVO postRequest(@RequestBody SearchVO searchVO){
        return searchVO;
    }

    @PostMapping(value = "/postMapping")
    public SearchVO postMapping(@RequestBody SearchVO searchVO){
        return searchVO;
    }

    //postman 으로 데이터 보내서 테스트한다.

}

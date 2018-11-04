package com;

import io.swagger.api.HelloApi;
import io.swagger.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApi {

    @Override
    public ResponseEntity<String> helloGet(@RequestParam String name) {
        User user = new User();
        user.setName(name);
        return new ResponseEntity<>("Hello " + user.getName() + "!", HttpStatus.OK);
    }

}

package io.jza.jartadministrationback.controller;

import io.jza.jartadministrationback.dto.in.AdministratorLogininInDTO;
import io.jza.jartadministrationback.dto.in.AdministratorUpdateProfileInDTO;
import io.jza.jartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(AdministratorLogininInDTO administratorLogininInDTO){
         return null;
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer adminstratorId){
       return null;
    }

    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }
}

package io.jza.jcartadministrationback.controller;

import io.jza.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.jza.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import io.jza.jcartadministrationback.dto.out.PageOutDTO;
import io.jza.jcartadministrationback.dto.out.ReturnListOutDTO;
import io.jza.jcartadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}

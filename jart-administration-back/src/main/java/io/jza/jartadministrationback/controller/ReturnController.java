package io.jza.jartadministrationback.controller;

import io.jza.jartadministrationback.dto.in.ReturnSearchInDTO;
import io.jza.jartadministrationback.dto.in.ReturnUpdateActionInDTO;
import io.jza.jartadministrationback.dto.out.PageOutDTO;
import io.jza.jartadministrationback.dto.out.ReturnListOutDTO;
import io.jza.jartadministrationback.dto.out.ReturnShowOutDTO;
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

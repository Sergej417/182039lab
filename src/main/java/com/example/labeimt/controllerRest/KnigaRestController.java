package com.example.labeimt.controllerRest;

import com.example.labeimt.Model.Kniga;
import com.example.labeimt.service.KnigaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/kniga")
public class KnigaRestController {
    private final KnigaService knigaService;

    public KnigaRestController(KnigaService knigaService) {
        this.knigaService = knigaService;
    }

    @GetMapping
    private List<Kniga> findAll(){
        return this.knigaService.findAll();
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id){
        this.knigaService.deleteById(id);
        if(this.knigaService.findById(id).isEmpty())
            return ResponseEntity.ok().build();
        return ResponseEntity.badRequest().build();
    }
}

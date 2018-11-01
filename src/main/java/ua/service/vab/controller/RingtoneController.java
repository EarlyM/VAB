package ua.service.vab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.service.vab.dto.RingtoneDTO;
import ua.service.vab.services.RingtoneService;

@RestController
public class RingtoneController {

    @Autowired
    private RingtoneService ringtoneService;

    @PostMapping(value = "/ringtone")
    public ResponseEntity<?> soldAndActicateRingtone(@RequestBody final RingtoneDTO dto){
        ringtoneService.soldAndActivate(dto);
        return ResponseEntity.ok(dto);
    }
}

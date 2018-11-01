package ua.service.vab.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ua.service.vab.domain.Ringtone;
import ua.service.vab.dto.RingtoneDTO;
import ua.service.vab.repository.RingtoneRepository;
import ua.service.vab.services.ActivateRingtoneService;
import ua.service.vab.services.RingtoneService;
import ua.service.vab.services.SoundService;

import java.util.List;

@Service
public class RingtoneServiceImpl implements RingtoneService {

    @Autowired
    private ActivateRingtoneService activateRingtoneService;

    @Autowired
    private SoundService soundService;

    @Autowired
    private RingtoneRepository ringtoneRepository;

    @Override
    public void soldAndActivate(final RingtoneDTO ringtone) {

        RingtoneDTO dto = soundService.soldSound(ringtone);

        if(dto == null){
            throw new RuntimeException("Sound not sold");
        }

        dto = activateRingtoneService.activateRingtone(ringtone);

        if(dto == null){
            Ringtone r = new Ringtone();
            r.setPhoneNumber(ringtone.getPhoneNumber());
            r.setRingtoneId(ringtone.getRingtoneId());
            ringtoneRepository.save(r);
            throw new RuntimeException("Sound not activated");
        }

    }

    @Scheduled(fixedRate = 600000)
    private void activateFailedRingtone(){
        List<Ringtone> ringtoneList = ringtoneRepository.findAll();

        for(Ringtone ringtone : ringtoneList){
            RingtoneDTO dto = new RingtoneDTO();
            dto.setPhoneNumber(ringtone.getPhoneNumber());
            dto.setRingtoneId(ringtone.getRingtoneId());
            dto = activateRingtoneService.activateRingtone(dto);

            if(dto != null){
                ringtoneRepository.delete(ringtone);
            }
        }
    }
}

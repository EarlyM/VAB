package ua.service.vab.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ua.service.vab.dto.RingtoneDTO;
import ua.service.vab.services.SoundService;

@Service
public class SoundServiceImpl implements SoundService {

    private static final String URL_TO_SOUND = null;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public RingtoneDTO soldSound(final RingtoneDTO dto) {
        RingtoneDTO soldedRingtone = restTemplate.postForObject(URL_TO_SOUND, dto, RingtoneDTO.class);
        return soldedRingtone;
    }
}

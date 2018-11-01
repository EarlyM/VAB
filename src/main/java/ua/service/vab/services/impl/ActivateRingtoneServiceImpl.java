package ua.service.vab.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ua.service.vab.dto.RingtoneDTO;
import ua.service.vab.services.ActivateRingtoneService;

@Service
public class ActivateRingtoneServiceImpl implements ActivateRingtoneService {

    private static final String URL_TO_ACTIVATION = null;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public RingtoneDTO activateRingtone(final RingtoneDTO dto) {
        RingtoneDTO activatedRingtone = restTemplate.postForObject(URL_TO_ACTIVATION, dto, RingtoneDTO.class);
        return activatedRingtone;
    }
}

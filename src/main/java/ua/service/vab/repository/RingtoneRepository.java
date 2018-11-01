package ua.service.vab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.service.vab.domain.Ringtone;

public interface RingtoneRepository extends JpaRepository<Ringtone, Long> {
}

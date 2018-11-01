package ua.service.vab.domain;

import javax.persistence.*;

@Entity
@Table(name = "failed_activating")
public class Ringtone {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "ringtone_id")
    private Long ringtoneId;

    public Ringtone() {
    }

    public Ringtone(String phoneNumber, Long ringtoneId) {
        this.phoneNumber = phoneNumber;
        this.ringtoneId = ringtoneId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getRingtoneId() {
        return ringtoneId;
    }

    public void setRingtoneId(Long ringtoneId) {
        this.ringtoneId = ringtoneId;
    }
}

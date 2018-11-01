package ua.service.vab.dto;

public class RingtoneDTO {

    private String phoneNumber;
    private Long ringtoneId;


    public RingtoneDTO() {
    }

    public RingtoneDTO(String phoneNumber, Long ringtoneId) {
        this.phoneNumber = phoneNumber;
        this.ringtoneId = ringtoneId;
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

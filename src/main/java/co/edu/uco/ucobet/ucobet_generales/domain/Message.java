package co.edu.uco.ucobet.ucobet_generales.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Message implements Serializable {
    private String id;
    private String content;
    private String cityId;

    public Message(){

    }

    public Message(final String id, final String content, final String cityId) {
        this.id = id;
        this.content = content;
        this.cityId = cityId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}

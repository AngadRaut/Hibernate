package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String coarse;
    private String duration;


    public Certificate(){
        super();
    }

    public Certificate(String coarse, String duration) {
        this.coarse = coarse;
        this.duration = duration;
    }

    public String getCoarse() {
        return coarse;
    }

    public void setCoarse(String coarse) {
        this.coarse = coarse;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}

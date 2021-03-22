package com.company.itschool.colete;

import java.io.Serializable;

public class Colet implements Serializable {
    private String id;
    private String destinatar;
    private String adresa;

    public Colet(String id, String destinatar, String adresa) {
        this.id = id;
        this.destinatar = destinatar;
        this.adresa = adresa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDestinatar() {
        return destinatar;
    }

    public void setDestinatar(String destinatar) {
        this.destinatar = destinatar;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}

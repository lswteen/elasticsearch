package com.pick.domain.document;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class BasicProfile {
    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    protected BasicProfile() {
    }

    public BasicProfile(String name, String description) {
        this.name = name;
        this.description = description;
    }

}

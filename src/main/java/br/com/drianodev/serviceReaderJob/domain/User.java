package br.com.drianodev.serviceReaderJob.domain;

import lombok.Data;

@Data
public class User {
    private Name name;
    private String email;
    private String gender;

    public String getName() {
        return name.getFullName();
    }
}

package br.com.drianodev.serviceReaderJob.domain;

import lombok.Data;

@Data
public class Name {
    private String title;
    private String first;
    private String last;

    public String getFullName() {
        return first + " " + last;
    }
}

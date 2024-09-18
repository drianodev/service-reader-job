package br.com.drianodev.serviceReaderJob.domain;

import lombok.Data;

import java.util.List;

@Data
public class ResponseUser {
    private List<User> results;
}

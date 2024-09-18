package br.com.drianodev.serviceReaderJob.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.drianodev.serviceReaderJob.domain.User;

@Configuration
public class UserWriterConfig {

    @Bean
    ItemWriter<User> userWriter() {
        return items -> items.forEach(System.out::println);
    }
}

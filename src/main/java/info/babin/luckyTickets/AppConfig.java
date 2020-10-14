package info.babin.luckyTickets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
@ComponentScan("info.babin.luckyTickets")
public class AppConfig {

    @Bean(name = "ticketLength")
    public Integer getTicketLength() {
        return 4;
    }
}

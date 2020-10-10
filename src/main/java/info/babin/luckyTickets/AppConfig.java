package info.babin.luckyTickets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
public class AppConfig {

    @Bean(name = "ticketLength")
    public Integer getTicketLength() {
        return 6;
    }
}

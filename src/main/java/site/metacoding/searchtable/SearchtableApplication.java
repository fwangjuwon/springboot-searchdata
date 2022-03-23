package site.metacoding.searchtable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SearchtableApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchtableApplication.class, args);
	}

}

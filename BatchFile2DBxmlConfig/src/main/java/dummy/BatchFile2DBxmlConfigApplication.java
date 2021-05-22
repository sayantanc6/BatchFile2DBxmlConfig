package dummy;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableBatchProcessing
@ImportResource("batch-config.xml")
public class BatchFile2DBxmlConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchFile2DBxmlConfigApplication.class, args);
	}

}

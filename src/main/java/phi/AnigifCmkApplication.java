package phi;

import magick.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import phi.properties.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(FileStorageProperties.class)
public class AnigifCmkApplication {

	public static void main(String[] args) throws MagickException{
		SpringApplication.run(AnigifCmkApplication.class, args);
	}
}

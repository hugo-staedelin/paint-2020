package fr.hstaedelin.paint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EntityScan(basePackages = "fr/hstaedelin/paint/polygons")
public class PaintApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaintApplication.class, args);
        System.out.println("Paint redstring project started.");
    }
}

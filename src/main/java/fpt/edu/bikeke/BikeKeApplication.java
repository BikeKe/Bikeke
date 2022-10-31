package fpt.edu.bikeke;

import fpt.edu.bikeke.entity.BikeBrand;
import fpt.edu.bikeke.repository.BikeBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static fpt.edu.bikeke.constant.UrlConst.BIKEBRAND;
import static fpt.edu.bikeke.constant.UrlConst.BIKEBRAND_FIND_ALL;

@SpringBootApplication
public class BikeKeApplication {

    @Autowired
    private static BikeBrandRepository bikeBrandRepository;

    public static List<BikeBrand> findAll() {
        return bikeBrandRepository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(BikeKeApplication.class, args);

        System.out.println(findAll());






    }


}

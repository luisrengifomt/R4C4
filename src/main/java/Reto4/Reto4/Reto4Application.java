package Reto4.Reto4;

import Reto4.Reto4.mongoRepository.OrderMongoRepository;
import Reto4.Reto4.mongoRepository.SupplementsMongoRepository;
import Reto4.Reto4.mongoRepository.UserMongoRepository;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto4Application implements CommandLineRunner {
            
        @Autowired
        private SupplementsMongoRepository Supplementsrepo;
        @Autowired
        private UserMongoRepository Userrepo;
        @Autowired
        private OrderMongoRepository Orderrepo;

    
    
	public static void main(String[] args) {
		SpringApplication.run(Reto4Application.class, args);
	}
        
        @Override
        public void run(String... args) throws Exception {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Supplementsrepo.deleteAll();
        Userrepo.deleteAll();
        Orderrepo.deleteAll();
        
        }

}

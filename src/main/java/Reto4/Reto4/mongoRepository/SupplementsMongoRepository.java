/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto4.Reto4.mongoRepository;

import Reto4.Reto4.model.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Luis Rengifo
 */
public interface SupplementsMongoRepository extends MongoRepository<Supplements, String> {
    
}

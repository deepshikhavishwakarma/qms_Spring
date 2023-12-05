package com.qms.qualityPrpj.Repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qms.qualityPrpj.Entity.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{

    User findAllById(int employeeId);
    
}

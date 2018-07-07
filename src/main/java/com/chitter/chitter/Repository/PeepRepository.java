package com.chitter.chitter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chitter.chitter.Model.Peep;

//The @Repository stereotype annotation declares that the interface is used to specify all methods used to create, read (search), update and delete an entity within the database
@Repository
public interface PeepRepository extends JpaRepository<Peep, Long> {

}

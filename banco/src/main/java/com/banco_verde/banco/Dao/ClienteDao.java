package com.banco_verde.banco.Dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco_verde.banco.Models.Cliente;

@Repository
public interface ClienteDao extends CrudRepository< Cliente, String>  {
 
    

}
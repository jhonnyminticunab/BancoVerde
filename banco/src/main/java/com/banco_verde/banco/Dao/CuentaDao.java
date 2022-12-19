package com.banco_verde.banco.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco_verde.banco.Models.Cuenta;

@Repository
public interface CuentaDao  extends CrudRepository<Cuenta, String> {
    
}

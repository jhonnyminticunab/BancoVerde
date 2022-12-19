package com.banco_verde.banco.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

import com.banco_verde.banco.Dao.ClienteDao;
import com.banco_verde.banco.Models.Cliente;

@Service
public class ClienteService {
    @Autowired
    private ClienteDao clienteDao;

    @Transactional(readOnly=false)
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Transactional(readOnly=false)
    public void delete(String id) {
        clienteDao.deleteById(id);
    }

    @Transactional(readOnly=true)
    public Cliente findById(String id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional(readOnly=true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

}

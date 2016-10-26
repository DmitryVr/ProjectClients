package com.company.clientsapp.services;

import com.company.clientsapp.dao.InterfaceClientDao;
import com.company.clientsapp.models.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * класс для бизнес-логики
 */
@Service
public class ClientService implements InterfaceClientService {

    @Autowired
    private InterfaceClientDao clientDao;

    @Override
    @Transactional
    public void addClient(Client client) {
        clientDao.addClient(client);
    }

    @Override
    @Transactional
    public void updateClient(Client client) {
        clientDao.updateClient(client);
    }

    @Override
    @Transactional
    public void deleteClient(int id) {
        clientDao.deleteClient(id);
    }

    @Override
    @Transactional
    public Client getClientById(int id) {
        return clientDao.getClientById(id);
    }

    @Override
    @Transactional
    public List<Client> listClient() {
        return clientDao.listClient();
    }
}

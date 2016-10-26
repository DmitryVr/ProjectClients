package com.company.clientsapp.dao;

import com.company.clientsapp.models.Client;

import java.util.List;

public interface InterfaceClientDao {
    void addClient(Client client);

    void updateClient(Client client);

    void deleteClient(int id);

    Client getClientById(int id);

    List<Client> listClient();

}

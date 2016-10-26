package com.company.clientsapp.services;

import com.company.clientsapp.models.Client;

import java.util.List;

public interface InterfaceClientService {
    void addClient(Client client);

    void updateClient(Client client);

    void deleteClient(int id);

    Client getClientById(int id);

    List<Client> listClient();
}

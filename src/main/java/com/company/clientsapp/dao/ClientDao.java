package com.company.clientsapp.dao;

import com.company.clientsapp.models.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * класс для доступа к данным
 */
@Repository
public class ClientDao implements InterfaceClientDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addClient(Client client) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(client);

    }

    @Override
    public void updateClient(Client client) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(client);

    }

    @Override
    public void deleteClient(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Client client = (Client) session.get(Client.class, id);

        if(client != null){
            session.delete(client);
        }

    }

    @Override
    public Client getClientById(int id) {
        Session session =this.sessionFactory.getCurrentSession();
        Client client = (Client) session.get(Client.class, id);

        return client;
    }

    @Override
    public List<Client> listClient() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Client> clientList = session.createQuery("FROM Client").list();

        return clientList;
    }
}

package com.company.clientsapp.controllers;

import com.company.clientsapp.models.Client;
import com.company.clientsapp.services.InterfaceClientService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

    @Autowired
    private InterfaceClientService clientService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listClients(Model model) {
        model.addAttribute("client", new Client());
        model.addAttribute("listclient", this.clientService.listClient());

        return "clients";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteClient(@PathVariable("id") int id) {
        this.clientService.deleteClient(id);

        return "redirect:/";
    }

    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable("id") int id, Model model) {
        model.addAttribute("client", this.clientService.getClientById(id));

        return "client";
    }

    @RequestMapping(value = "/addorupdate", method = RequestMethod.POST)
    public String addOrUpdateClient(@ModelAttribute("client") Client client){
        if(client.getId() == 0) {
            this.clientService.addClient(client);
        } else {
            this.clientService.updateClient(client);
        }

        return "redirect:/";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateClient(@PathVariable("id") int id, Model model) {
        model.addAttribute("listclient", this.clientService.listClient());
        model.addAttribute("client", this.clientService.getClientById(id));

        return "clients";
    }
}

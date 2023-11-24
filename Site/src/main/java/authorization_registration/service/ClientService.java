package authorization_registration.service;

import authorization_registration.model.Client;
import authorization_registration.repository.ClientRepository;

import java.util.List;

public class ClientService {

    private ClientRepository repository;

    public ClientService() {
        repository = new ClientRepository();
    }

    public Client save(Client client) {
        return repository.save(client);
    }

    public List<Client> findAll() {
        return repository.findAll();
    }

    public Client findById(Long id) {
        return repository.findById(id);
    }

    public Client findByUserName(String userName) {
        return repository.findByUserName(userName);
    }
}

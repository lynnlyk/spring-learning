package com.lynnlyk.spring.core.ioc.beans_instantiation.static_factory_method;

public class ClientService {

    private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService createInstance() {
        return clientService;
    }
}

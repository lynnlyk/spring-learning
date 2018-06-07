package com.lynnlyk.spring.core.ioc.beans_instantiation.instance_factory_method;

import com.lynnlyk.spring.core.ioc.beans_instantiation.instance_factory_method.impl.AccountServiceImpl;
import com.lynnlyk.spring.core.ioc.beans_instantiation.instance_factory_method.impl.ClientServiceImpl;

public class DefaultServiceLocator {

    private static ClientService clientService = new ClientServiceImpl();

    private static AccountService accountService = new AccountServiceImpl();

    public ClientService createClientServiceInstance() {
        return clientService;
    }

    public AccountService createAccountServiceInstance() {
        return accountService;
    }
}

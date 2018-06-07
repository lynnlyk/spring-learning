package com.lynnlyk.spring.core.ioc.container_instantiating.service.impl;

import com.lynnlyk.spring.core.ioc.container_instantiating.dao.JpaItemDao;
import com.lynnlyk.spring.core.ioc.container_instantiating.service.PetStoreService;
import com.lynnlyk.spring.core.ioc.container_instantiating.dao.JpaAccountDao;

public class PetStoreServiceImpl implements PetStoreService {

    private JpaAccountDao accountDao;

    private JpaItemDao itemDao;

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }
}

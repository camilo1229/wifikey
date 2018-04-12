/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wifikey.controller;

import com.wifikey.entities.Connections;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author camilo
 */
@Stateless
public class ConnectionsFacade extends AbstractFacade<Connections> {

    @PersistenceContext(unitName = "wifikeyPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConnectionsFacade() {
        super(Connections.class);
    }
    
}

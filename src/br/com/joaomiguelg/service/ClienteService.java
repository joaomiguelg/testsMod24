package br.com.joaomiguelg.service;

import br.com.joaomiguelg.dao.IClienteDao;

public class ClienteService {
    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }



}

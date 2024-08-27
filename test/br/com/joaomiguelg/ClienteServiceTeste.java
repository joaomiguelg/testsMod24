package br.com.joaomiguelg;

import br.com.joaomiguelg.dao.ClienteDao;
import br.com.joaomiguelg.dao.IClienteDao;
import br.com.joaomiguelg.dao.mocks.ClienteDaoMock;
import br.com.joaomiguelg.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTeste {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}

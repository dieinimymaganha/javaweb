/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import beans.Pessoa;

@Path("pessoas")
public class PessoaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa getJson() {
        Pessoa p = new Pessoa();
        p.setNome("Dieinimy");
        p.setEmail("dieinimy@gmail.com");
        return p;
    }
}

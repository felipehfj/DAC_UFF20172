package br.uff.dac.t1.controleprojetos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "test", eager = true)
@RequestScoped
public class TestBean {

    private String nome;

    public String getMessage() {
        return "Test works!";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

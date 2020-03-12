/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mt.web.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author alexandrelerario
 */
@ManagedBean
@RequestScoped
public class JsfCidade {

    /**
     * Creates a new instance of JsfCidade
     */
    public JsfCidade() {
    }
    
    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public java.util.Collection<br.mt.data.entity.Cidades> getAll(){
        return new br.mt.data.crud.CrudCidades().getAll();
    }
    
    public void salvar_novo(){
        br.mt.data.entity.Cidades cid;
        cid = new br.mt.data.entity.Cidades();
        cid.setCodigo(codigo);
        cid.setNome(nome);
        new br.mt.data.crud.CrudCidades().persist(cid);
    }
}

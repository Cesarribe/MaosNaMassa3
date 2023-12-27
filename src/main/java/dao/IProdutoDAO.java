package dao;

import dao.generic.IGenericDAO;
import domain.Produto;
import exceptions.DAOException;
import exceptions.TipoChaveNaoEncontradaException;


public interface IProdutoDAO extends IGenericDAO<Produto, String> {

    Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException , DAOException;
}
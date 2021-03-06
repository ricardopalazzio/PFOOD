/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.pfood.bo;

import br.com.pfood.model.Produto;
import br.com.pfood.model.ProdutoComplemento;
import java.util.List;

/**
 *
 * @author r.palazzio
 */

public interface ProdutoBO  extends GenericBO{
    public List<ProdutoComplemento> listaComplementosPadrao(Produto produto);
    public List<ProdutoComplemento> listaComplementosAdicional(Produto produto);
    public List<ProdutoComplemento> listaComplementosOpcional(Produto produto);
    
}

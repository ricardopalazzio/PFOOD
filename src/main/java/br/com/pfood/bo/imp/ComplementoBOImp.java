/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.pfood.bo.imp;


import br.com.pfood.bo.ComplementoBO;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.Typed;
import javax.inject.Inject;
import org.apache.log4j.Logger;

/**
 *
 * @author r.palazzio
 */
@Typed(ComplementoBO.class)
public class ComplementoBOImp  extends GenericBOImp implements ComplementoBO , Serializable{

    @Inject transient Logger logger;
    @PostConstruct
    public void init(){
        logger.debug("ComplementoBO construido");
    }
    
    @PreDestroy
    public void destroy(){
        logger.debug("ComplementoBO destruido");
    }

}

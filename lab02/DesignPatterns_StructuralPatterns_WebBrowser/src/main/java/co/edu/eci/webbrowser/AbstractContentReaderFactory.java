/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.webbrowser;

import org.darkweb.utils.SiteContentReader;

/**
 *
 * @author fabian
 */
public abstract class AbstractContentReaderFactory {
    private static AbstractContentReaderFactory instance;
    
    protected AbstractContentReaderFactory(){
        
    }
    
    public static AbstractContentReaderFactory getInstance(Filter fl){
        if (instance == null){
            switch(fl){
                case COMPANY:
                    instance = new CompanyContentReaderFactory();
                    break;
                case CHILDREN:
                default:
                    instance = new ChildrenContentReaderFactory();
                    break;
            }
        }
        return instance;
    }
    
    public abstract SiteContentReader getProxy(SiteContentReader src);
}

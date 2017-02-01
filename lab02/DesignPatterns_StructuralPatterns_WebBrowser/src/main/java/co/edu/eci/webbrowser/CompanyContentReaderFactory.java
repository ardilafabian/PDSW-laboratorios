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
public class CompanyContentReaderFactory extends AbstractContentReaderFactory{
    @Override
    public SiteContentReader getProxy(SiteContentReader src) {
        return new ProxyCompanyContentReader(src);
    }
    
}

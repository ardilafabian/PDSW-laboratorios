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
public class ProxyChildrenContentReader extends AbstractProxyContentReader{
    
    private SiteContentReader siteContent;
    private String badWords[] = {"bomba", "explosivo", "violencia"};
    
    public ProxyChildrenContentReader(SiteContentReader src) {
        siteContent = src;
    }

    @Override
    public String getNextLine() {
        String line = siteContent.getNextLine();
        for (String wrd : badWords){
            if (line.toLowerCase().contains(wrd)){
                line = line.replace(wrd, "*****");
            }
        }
        return line;
    }

    @Override
    public boolean hasMoreLines() {
        return siteContent.hasMoreLines();
    }
    
}

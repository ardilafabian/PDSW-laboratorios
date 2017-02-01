/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.webbrowser;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import org.darkweb.utils.SiteContentReader;

/**
 *
 * @author fabian
 */
public class ProxyCompanyContentReader extends AbstractProxyContentReader{

    private static final int N = 2;
    private final SiteContentReader src;
    private Queue<String> content;
    private ArrayList<String> forbidden;
    
    private static final String txtForbidden = "<html><p>Atrapados en la Procrastinación</p><p>El cursor "
            + "pestañea en el margen izquierdo de la página en blanco. Tres "
            + "semanas atrás su jefe le comunicó que debía preparar un reporte "
            + "esencial para satisfacer a ese cliente que desde hace meses "
            + "amenaza con cambiar de proveedor. Durante los primeros días "
            + "siguió con sus ocupaciones habituales, calculando que si "
            + "adelantaba las tareas para la siguiente semana tendría tiempo "
            + "suficiente para dedicar una jornada exclusivamente al reporte.</p>"
            + "<p>Sin embargo, durante esa segunda semana surgieron nuevos imprevistos. "
            + "Primero una capacitación sobre el nuevo protocolo de seguridad "
            + "informática consumió gran parte del lunes. Luego una reunión de "
            + "emergencia el martes. El miércoles su jefe le preguntó cómo "
            + "avanzaba el reporte y, angustiado, respondió que bien y se "
            + "prometió concluirlo antes del viernes. Pero al enfrentarse por "
            + "primera vez a la hoja en blanco recordó que para que el informe "
            + "fuese completo sería mejor contar con los números del mes "
            + "corriente, que estarían disponibles a partir del lunes.</p></html>";
    
    
    public ProxyCompanyContentReader(SiteContentReader src) {
        this.src = src;
        content = new LinkedList<String>();
        forbidden = new ArrayList<String>();
        addForbiddenWords();
        
        process();
    }
    
    private void addForbiddenWords() {
        forbidden.add("juego");
        forbidden.add("apuesta");
        forbidden.add("piratería");
    }
    
    private void process() {
        int count = 0;
        
        while(src.hasMoreLines()) {
            String line = src.getNextLine();
            for(String e : forbidden) {
                count += (line.toLowerCase().contains(e)) ? 1 : 0;
            }
            content.add(line);
        }
        
        if (count > N) {
            content.clear();
            content.add(txtForbidden);
        }
    }
    
    @Override
    public String getNextLine() {
        String r = content.element();
        content.remove();
        return r;
    }

    @Override
    public boolean hasMoreLines() {
        return ! content.isEmpty();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Locale;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

/**
 *
 * @author Dieinimy
 */
@Named
@SessionScoped
public class LocaleMB implements Serializable{
    private Locale currentLocale = new Locale("pt", "BR");
    
    public void englishLocale(){
        UIViewRoot viewRoot = FacesContext.getCurrentInstance()
                                          .getViewRoot();
        currentLocale = Locale.US;
        viewRoot.setLocale(currentLocale);
    }
    
    public void portugueseLocale(){
        UIViewRoot viewRoot =  FacesContext.getCurrentInstance()
                                            .getViewRoot();
        
        currentLocale = new Locale("pt", "BR");
        viewRoot.setLocale(currentLocale);
        
    }
    
    public Locale getCurrretLocale(){
        return currentLocale;
    }
    

    /**
     * Creates a new instance of LocaleMB
     */
    public LocaleMB() {
    }
    
}

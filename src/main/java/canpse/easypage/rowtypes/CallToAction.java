/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canpse.easypage.rowtypes;

import canpse.easypage.mainElements.Row;

/**
 *
 * @author canpse
 */
public abstract class CallToAction implements Row{
    
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}

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
public abstract class TwoColumnText implements Row{
    
    private String firstColumnTitle;
    private String firstColumnContent;
    private String secondColumnTitle;
    private String secondColumnContent;

    public String getFirstColumnTitle() {
        return firstColumnTitle;
    }

    public void setFirstColumnTitle(String firstColumnTitle) {
        this.firstColumnTitle = firstColumnTitle;
    }

    public String getFirstColumnContent() {
        return firstColumnContent;
    }

    public void setFirstColumnContent(String firstColumnContent) {
        this.firstColumnContent = firstColumnContent;
    }

    public String getSecondColumnTitle() {
        return secondColumnTitle;
    }

    public void setSecondColumnTitle(String secondColumnTitle) {
        this.secondColumnTitle = secondColumnTitle;
    }

    public String getSecondColumnContent() {
        return secondColumnContent;
    }

    public void setSecondColumnContent(String secondColumnContent) {
        this.secondColumnContent = secondColumnContent;
    }
    
}

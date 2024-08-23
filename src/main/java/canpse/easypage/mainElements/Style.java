
package canpse.easypage.mainElements;

/**
 * Classe representando os estilos da pagina;
 *
 * @author canpse
 */
public class Style {
    
    protected String mainColor;
    protected String secoColor;
    protected String bgColor;
    protected String fontColor;
    protected String secondaryFontColor;
    protected String FontFamily;
    
    /**
     * retorna a cor principal do elemento
     * 
     * @return valor da cor em hexadecimal
     */
    public String getMainColor() {
        return mainColor;
    }

    /**
     * Seta a cor principal do elemento
     * @param mainColor valor da cor em hexadecimal
     */
    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    
    /**
     * retorna a cor secundaria do elemento
     * @return valor da cor em hexadecimal
     */
    public String getSecoColor() {
        return secoColor;
    }

    
    /**
     * Seta a cor secundaria do elemento
     * @param secoColor valor da cor em hexadecimal
     */
    public void setSecoColor(String secoColor) {
        this.secoColor = secoColor;
    }
    
    /**
     * Retorna a cor de fundo do elemento
     * @return valor da cor em hexadecimal
     */
    public String getBgColor() {
        return bgColor;
    }

    /**
     * Seta a cor de fundo do elemento
     * @param bgColor  valor da cor em hexadecimal
     */
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    /**
     * Retorna a cor da fonte do elemento
     * @return valor da cor em hexadecimal
     */
    public String getFontColor() {
        return fontColor;
    }

    /**
     * Seta a cor da fonte do elemento
     * @param fontColor valor da cor em hexadecimal
     */
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    
    /**
     * Retorna a cor da fonte secundaria
     * @return valor da cor em hexadecimal
     */
    public String getSecondaryFontColor() {
        return secondaryFontColor;
    }

    /**
     * Seta a cor da fonte secundaria
     * @param secondaryFontColor valor da cor em hexadecimal
     */
    public void setSecondaryFontColor(String secondaryFontColor) {
        this.secondaryFontColor = secondaryFontColor;
    }
    
    /**
     * Retorna a familia de font usada
     * @return 
     */
    public String getFontFamily() {
        return FontFamily;
    }

    /**
     * seta a familia da fonte para ser usada
     * @param FontFamily 
     */
    public void setFontFamily(String FontFamily) {
        this.FontFamily = FontFamily;
    }
    
}

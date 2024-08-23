package canpse.easypage.rowtypes;

import canpse.easypage.mainElements.Row;
import java.awt.Image;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 *
 * @author canpse
 */
public abstract class Hero implements Row{
    
    private Image backgroundImage;
    private String headline;
    private String subHeadLine;
    private String callToActionButtonText;

    public Hero() {
        
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("/"); // Root directory in resources
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML");
        templateResolver.setCharacterEncoding("UTF-8");
        
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
    
    }
    
    

    public Image getBackgroundImage() {
        return backgroundImage;
    }
    
    /**
     * Configura a imagem de fundo do Hero
     * 
     * @param backgroundImage
     * @return interface Fluente
     */
    public Hero setBackgroundImage(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }
    
    /**
     * @return a headLine
     */
    public String getHeadline() {
        return headline;
    }
    
    /**
     * @param headline
     * @return interface fluente
     */
    public Hero setHeadline(String headline) {
        this.headline = headline;
        return this;
    }

    public String getSubHeadLine() {
        return subHeadLine;
    }
    
    /**
     * @param subHeadLine
     * @return interface fluente
     */
    public Hero setSubHeadLine(String subHeadLine) {
        this.subHeadLine = subHeadLine;
        return this;
    }

    public String getCallToActionButtonText() {
        return callToActionButtonText;
    }
    
    /**
     * Seta o texto do botão de CallToAcion do Hero
     * 
     * @param callToActionButtonText Texto do botão
     * @return interface fluente 
     */
    public Hero setCallToActionButtonText(String callToActionButtonText) {
        this.callToActionButtonText = callToActionButtonText;
        return this;
    }
    
    public static void testeTemplate() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("/"); // Root directory in resources
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML");
        templateResolver.setCharacterEncoding("UTF-8");
        
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        
        Context context = new Context();
        context.setVariable("message", "Hello, Thymeleaf without Spring Boot!");
        
        String output = templateEngine.process("hero_template", context);

        System.out.println(output);
    }
    
}

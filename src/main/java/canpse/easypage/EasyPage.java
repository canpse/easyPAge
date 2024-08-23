package canpse.easypage;

import canpse.easypage.mainElements.HomePage;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 *
 * @author canpse
 */
public class EasyPage {

    public static void main(String[] args) {
        
        HomePage hp = new HomePage(FactoryFactory.getStyleAFactory());
        hp.addHero().setBackgroundImage(backgroundImage);
        hp.addTwoColumnImageText();
        
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

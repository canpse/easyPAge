package canpse.easypage;

import RowFactorie.RowFactory;
import RowFactorie.StyleARowFactory;

/**
 *
 * @author canpse
 */
public class FactoryFactory {

    public static RowFactory getStyleAFactory() {
        return new StyleARowFactory();
    }
    
    
}

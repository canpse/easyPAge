package RowFactorie;

import canpse.easypage.rowtypes.Hero;
import concreteTypes.styleA.StyleAHero;

/**
 *
 * @author canpse
 */
public class StyleARowFactory implements RowFactory{

    @Override
    public Hero hero() {
        return new StyleAHero();
    }

    @Override
    public Hero twoColumnImageText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

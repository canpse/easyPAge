package RowFactorie;

import canpse.easypage.rowtypes.Hero;
import canpse.easypage.rowtypes.TwoColumnImageText;

/**
 *
 * @author canpse
 */
public interface RowFactory {
    
    Hero hero();

    TwoColumnImageText twoColumnImageText();
    
}

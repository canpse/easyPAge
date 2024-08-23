package canpse.easypage.mainElements;

import RowFactorie.RowFactory;
import canpse.easypage.rowtypes.Hero;
import canpse.easypage.rowtypes.TwoColumnImageText;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author canpse
 */
public class HomePage implements Page {

    private RowFactory rowfactory;
    private List<Row> rows;

    @Override
    public Row addRow(Row row) {
        rows.add(row);
        return row;
    }

    public HomePage(RowFactory rowFactory) {
        rows = new ArrayList<Row>();
    }

    public Hero addHero() {
        Hero hero = rowfactory.hero();
        rows.add(hero);
        return hero;
    }

    public TwoColumnImageText addTwoColumnImageText() {
        TwoColumnImageText row = rowfactory.twoColumnImageText();
        rows.add(row);
        return row;
    }

}

//табл. 54

package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class HeaterTable54 extends JFrame {

    //Котлы чугунные секционнык с внутренними топками без дутья
    double castIronBoilersTime;
    double castIronBoilersPrice;

    //Котлы чугунные секционные с дутьем типа "Универсал"
    double castIronBoilersStaUniversalTime;
    double castIronBoilersStaUniversalPrice;

    //Жаротрубные
    double fireTubeTime;
    double fireTubePrice;

    double coef;

    public HeaterTable54(int answear, double coef1, double coef2) {

        coef = coef1 * coef2;

        if (answear == 1) {
            castIronBoilersTime = 1.73;
            castIronBoilersPrice = 1.10;
            castIronBoilersStaUniversalTime = 3.62;
            castIronBoilersStaUniversalPrice = 2.30;
            fireTubeTime = 4.25;
            fireTubePrice = 2.7;
        } else if (answear == 2) {
            castIronBoilersTime = 2.36;
            castIronBoilersPrice = 1.5;
            castIronBoilersStaUniversalTime = 4.25;
            castIronBoilersStaUniversalPrice = 2.7;
            fireTubeTime = 6.14;
            fireTubePrice = 3.9;
        } else if (answear == 3) {
            castIronBoilersTime = 3.15;
            castIronBoilersPrice = 2.00;
            castIronBoilersStaUniversalTime = 6.14;
            castIronBoilersStaUniversalPrice = 3.9;
            fireTubeTime = 0;
            fireTubePrice = 0;
        }

        castIronBoilersTime *= coef;
        castIronBoilersPrice *= coef;
        castIronBoilersStaUniversalTime *= coef;
        castIronBoilersStaUniversalPrice *= coef;
        fireTubeTime *= coef;
        fireTubePrice *= coef;

        Object[] columnsHeader = new Object[]{"Наименование работ", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"Котлы чугунные секционные с внутренними топками без дутья", castIronBoilersTime, castIronBoilersPrice},
                {"То же, секционные с дутьем типа Универсал", castIronBoilersStaUniversalTime, castIronBoilersStaUniversalPrice},
                {"Жаротрубные", fireTubeTime, fireTubePrice}
        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(0).setMinWidth(350);
        table.setRowHeight(2, 100);
        table.setRowHeight(25);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 17));
        setContentPane(contents);
        setSize(600, 300);
        System.out.println("Вызвано");
    }
}

//Разные конструкции и детали при количестве элементов табл. 36

package DbCon.tables.constructionDODELAT;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class DifferentDesignsAndDetailsWithTheNumberOfElementsTable36 extends JFrame {

    String jobRank = "III";

    double woodenProductsAndTheDetailsTime;
    double woodenProductsAndTheDetailsPrice;

    public DifferentDesignsAndDetailsWithTheNumberOfElementsTable36(int answer) {
        if (answer == 1) {
            woodenProductsAndTheDetailsTime = 19;
            woodenProductsAndTheDetailsPrice = 8.78;

        } else if (answer == 2) {
            woodenProductsAndTheDetailsTime = 23.4;
            woodenProductsAndTheDetailsPrice = 12.17;

        } else if (answer == 3) {
            woodenProductsAndTheDetailsTime = 26.8;
            woodenProductsAndTheDetailsPrice = 17.02;
        }

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"323", "Деревянные изделия и детали(каркасы," +
                        "стены и перегородки в М 1 : 20; врубки, карнизы," +
                        "раздаточные окна, стойки, мебель встроенная и т.п." +
                        "в М 1 : 10; металлические конструкции и детали различного" +
                        "назначения в М 1 : 20; железобетонные конструктивные элементы" +
                        "перекрытий, перегородок, приямков ограждений и т.п. и детали" +
                        "различного назначения в М 1 : 20)", jobRank, woodenProductsAndTheDetailsTime, woodenProductsAndTheDetailsPrice}
        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(1).setMinWidth(350);
        table.setRowHeight(80);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 400);
        System.out.println("Вызвано");
    }
}

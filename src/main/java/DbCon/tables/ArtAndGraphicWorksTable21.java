//Художественно-графические работы табл.21

package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class ArtAndGraphicWorksTable21 extends JFrame {

    double coef;

    double developmentOfWallsTime;
    double developmentOfWallsPrice;

    double rectangularTime;
    double rectangularPrice;

    double rectangularMoreTime;
    double rectangularMorePrice;

    double rectangularHardTime;
    double rectangularHardPrice;

    double axonometryTime;
    double axonometryPrice;

    double illuminationTabletsTime;
    double illuminationTabletsPrice;

    double illuminationBlueTime;
    double illuminationBluePrice;

    double drawingTabletsiTime;
    double drawingTabletsiPrice;

    double drawingBlueTime;
    double drawingBluePrice;

    double paintStrokeSweepsTime;
    double paintStrokeSweepsPrice;

    public ArtAndGraphicWorksTable21(double coef1, double coef2, double coef3, double coef4, double coef5,
                                     double coef6, double coef7, double coef8, double coef9, double coef10) {
        coef = coef1 * coef2 * coef3 * coef4 * coef5 * coef6 * coef7 * coef8 * coef9 * coef10;

        developmentOfWallsTime = coef * 25.3;
        developmentOfWallsPrice = coef * 13.16;

        rectangularTime = coef * 31.2;
        rectangularPrice = coef * 16.22;

        rectangularMoreTime = coef * 36.8;
        rectangularMorePrice = coef * 19.14;

        rectangularHardTime = coef * 43;
        rectangularHardPrice = coef * 22.36;

        axonometryTime = coef * 51.4;
        axonometryPrice = coef * 26.73;

        illuminationTabletsTime = coef * 6.14;
        illuminationTabletsPrice = coef * 2.84;

        illuminationBlueTime = coef * 3.84;
        illuminationBluePrice = coef * 1.77;

        drawingTabletsiTime = coef * 13;
        drawingTabletsiPrice = coef * 6.01;

        drawingBlueTime = coef * 6.14;
        drawingBluePrice = coef * 2.84;

        paintStrokeSweepsTime = coef * 18;
        paintStrokeSweepsPrice = coef * 9.36;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"223", "<html>Развертка стен, полов, потолков с построением и покраской акварелью или тушью<html>", "IV", developmentOfWallsTime, developmentOfWallsPrice},
                {"", "<html>Перспектива интерьера с планами:<html>", "", "", ""},
                {"224", "<html>прямоугольным (с построением и покраской акварелью или тушью<html>", "IV", rectangularTime, rectangularPrice},
                {"225", "<html>из нескольких прямоугольных фигур<html>", "IV", rectangularMoreTime, rectangularMorePrice},
                {"226", "<html>сложным (овальным, криволинейным и т. п.)<html>", "IV", rectangularHardTime, rectangularHardPrice},
                {"227", "<html>Аксонометрия или перспектива экстерьера с высоты «птичьего полета» с обводкой и покраской<html>", "IV", axonometryTime, axonometryPrice},
                {"", "<html>Иллюминирование и обводка планов и разрезов:<html>", "", "", ""},
                {"228", "<html>на планшетах<html>", "III", illuminationTabletsTime, illuminationTabletsPrice},
                {"229", "<html>на синьках<html>", "III", illuminationBlueTime, illuminationBluePrice},
                {"", "<html>Покраска и обводка фасадов:<html>", "", "", ""},
                {"230", "<html>на планшетах <html>", "III", drawingTabletsiTime, drawingTabletsiPrice},
                {"231", "<html>на синьках<html>", "III", drawingBlueTime, drawingBluePrice},
                {"232", "<html>Покраска и обводка разверток застройки на планшетах<html>", "IV", paintStrokeSweepsTime, paintStrokeSweepsPrice},

        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(1).setMinWidth(450);
        table.setRowHeight(25);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 430);
        System.out.println("Вызвано");
    }
}

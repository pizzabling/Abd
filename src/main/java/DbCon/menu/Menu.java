package DbCon.menu;

import DbCon.tables.*;
import DbCon.tables.architectural_details_and_patterns.ArchiDetailsPatternsTable22;
import DbCon.tables.architectural_details_and_patterns.FillingOpeningsVestibulesTable23;
import DbCon.tables.constructionDODELAT.*;
import DbCon.tables.design_work.*;
import DbCon.tables.facades.TechProjectFacadesHouseMoreTable15;
import DbCon.tables.facades.TechProjectFacadesHouseUpToTable13;
import DbCon.tables.facades.WorkDrawsFacadesHouseMoreTable16;
import DbCon.tables.facades.WorkDrawsFacadesHouseUpToTable14;
import DbCon.tables.house_plans.TechProjectHousePlansMoreTable11;
import DbCon.tables.house_plans.TechProjectHousePlansUpToTable9;
import DbCon.tables.house_plans.WorkDrawsHousePlansMoreTable12;
import DbCon.tables.house_plans.WorkDrawsHousePlansUpToTable10;
import DbCon.tables.section.TechProjectSectionHouseMoreTable;
import DbCon.tables.section.TechProjectSectionHouseUpToTable;
import DbCon.tables.section.WorkDrawsSelectionHouseMoreTable;
import DbCon.tables.section.WorkDrawsSelectionHouseUpToTable;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Menu extends JFrame implements ItemListener {

    static final String DISTRICT_LAYOUT = "1. Районная планировка";
    static final String LOCALITY_MASTER_PLAN = "2. Генеральные планы городов, посёлков";
    static final String DETAILED_LAYOUT_PROJECT = "3. Проект детальной планировки";
    static final String FLOORS_OF_THE_BUILDING_TYPICAL = "4. Этажность зданий для типовых проектов";
    static final String HEATER = "5. Оборудование и монтаж отопительных встроенных котельных или бойлерных";
    static final String FLOORS_OF_THE_BUILDING_INDIVIDUAL = "6.Этажность зданий для индивидуальных проектов";
    static final String HOT_WATER_SUPPLY = "7. Горячее водоснабжение";
    static final String INTERNAL_WATER_SUPPLY = "8. Внутренние водопровод и канализация жилых и гражданских зданий";
    static final String ARCHI_CONST_PART_CIVIL_BUILDS = "9. Архитектурно-строительная часть гражданских зданий с подвалом";
    static final String HEATING_VENTILATION = "10. Отопление и вентиляция";
    static final String HEATING_VENTILATION_WATER_SUPPLY_CIV_BUILDS = "11. Внутренние санитарно-технические работы жилых и гражданских зданий";
    static final String VERTICAL_LAYOUT_FIVE = "12. Вертикальная планировка детальной планировки 1 : 2000";
    static final String VERTICAL_LAYOUT = "13. Вертикальная планировка к генеральным планам 1 : 5000";
    static final String LAND_DEV_STAGE_WORKING_DRAWS = "14. Вертикальная планировка к проектам застройки жилых районов," +
            "микрорайонов, кварталов и отдельных участков на стадии рабочих чертежей в масштабе 1 : 500";
    static final String LAND_DEV_STAGE_TECH_PROJECT = "15. Вертикальная планировка к проектам застройки жилых районов," +
            "микрорайонов, кварталов и отдельных участков на стадии технического проекта в масштабе 1 : 1000";

    static final String TECH_PROJ_H_PLANS_MORE = "16. Планы здания площадью площадью более 300 м². Технический проект";
    static final String TECH_PROJ_H_PLANS_UP_TO = "17. Планы здания площадью площадью до 300 м². Технический проект";
    static final String WORK_DRAWS_H_PLANS_MORE = "18. Планы здания площадью площадью более 300 м². Рабочие чертежи";
    static final String WORK_DRAWS_H_PLANS_UP_TO = "19. Планы здания площадью площадью до 300 м². Рабочие чертежи";

    static final String TECH_PROJ_FACADES_H_MORE = "20. Фасады зданий площадью более 300 м². Технический проект";
    static final String TECH_PROJ_FACADES_H_UP_TO = "21. Фасады зданий площадью до 300 м². Технический проект";
    static final String WORK_DRAWS_FACADES_H_MORE = "22. Фасады зданий площадью более 300 м². Рабочие чертежи";
    static final String WORK_DRAWS_FACADES_H_UP_TO = "23. Фасады зданий площадью до 300 м². Рабочие чертежи";

    static final String TECH_PROJ_SELECTION_H_MORE = "24. Разрезы зданий площадью более 300 м². Технический проект";
    static final String TECH_PROJ_SELECTION_H_UP_TO = "25. Разрезы зданий площадью до 300 м². Технический проект";
    static final String WORK_DRAWS_SELECTION_H_MORE = "26. Разрезы зданий площадью более 300 м². Рабочие чертежи";
    static final String WORK_DRAWS_SELECTION_H_UP_TO = "27. Разрезы зданий площадью до 300 м². Рабочие чертежи";

    static final String ARCHI_DETAILS_PATTERNS = "28. Архитектурные детали и шаблоны (рабочие чертежи)";
    static final String FILLING_OPENINGS_VESTIBULES = "29. Заполнение проемов и тамбуры";

    static final String FOUNDATION = "30. Фундаменты";
    static final String STEEL_STRUCTURES = "31. Стальные конструкции";
    static final String STONE_CONCRETE_STRUCTURES = "32. Каменные и бетонные конструкции";
    static final String REINFORCED_CONCRETE_MONOLITH_STRUC = "33. Железобетонные монолитные конструкции";
    static final String REINFORCED_CONCRETE_PREFAB_STRUC = "34. Железобетонные сборные конструкции";
    static final String WOODEN_STRUC = "35. Деревянные конструкции";

    static final String FOUNDATIONS_FLOORS_RAFTERS = "36. Фундаменты, перекрытия, стропила";
    static final String REINFORCED_CONCRETE_STRUC = "37. Железобетонные конструкции";
    static final String ENCLOSING_METAL_STRUC = "38. Ограждающие металлические конструкции\n" +
            "(витражи, подвесные потолки, навесные панели,\n" +
            "перегородки и т. п.)";
    static final String WOODEN_CONSTRUCTION = "39. Деревянные конструкции";
    static final String DIFFERENT_DESIGN_AND_DETAILS = "40. Разные конструкции и детали";
    static final String DIFFERENT_DESIGN_AND_DETAILS_WITH_NUMB_ELEM = "41. Разные конструкции и детали при количестве элементов";
    static final String ART_AND_GRAPHIC_WORKS = "42. Художественно-графические работы";

    //Чекбоксы коэфов
    final JCheckBox checkBox1For5 = new JCheckBox("<html>При составлении объемов работ на оборудование и монтаж <br>" +
            "котельных с двумя теплоносителями или с разными типами котлов - 1,2</html>");
    final JCheckBox checkBox2For5 = new JCheckBox("<html>При установке в котельной более шести секционных котлов <br>" +
            "и более четырех жаротрубных котлов на каждый дополнительный котел - 1,1</html>");

    final JCheckBox checkBox1For6 = new JCheckBox("<html>При сложной конфигурации здания (круглое, полукруглое и др.) -  1,2</html>");
    final JCheckBox checkBox2For6 = new JCheckBox("<html>При составлении объемов работ для кирпичных<br>" +
            "зданий 12 этажей и выше - 1,5</html>");
    final JCheckBox checkBox3For6 = new JCheckBox("<html>Составление объемов работ по чертежам технического проекта - 0,8</html>");
    final JCheckBox checkBox4For6 = new JCheckBox("<html>Составление объемов работ при разработке типовых проектов - 1,6</html>");
    final JCheckBox checkBox5For6 = new JCheckBox("<html>При применении (привязке) типовых проектов<br>" +
            "жилых и гражданских зданий с техническим подпольем - 0,9</html>");
    final JCheckBox checkBox6For6 = new JCheckBox("<html>При применении (привязке) типовых проектов<br>" +
            "жилых и гражданских зданий без подвалов и технических подполий - 0,8</html>");

    final JCheckBox checkBox1For8 = new JCheckBox("<html>Здания со сложным архитектурно-планировочным решением - 1.2</html>");
    final JCheckBox checkBox2For8 = new JCheckBox("<html>Устройство в здании двухзонного водопровода - 1.2</html>");
    final JCheckBox checkBox3For8 = new JCheckBox("<html>Реконструкция сетей в существующих зданиях - 1.25</html>");
    final JCheckBox checkBox4For8 = new JCheckBox("<html>при наличии подвалов - 0.45</html>");
    final JCheckBox checkBox5For8 = new JCheckBox("<html>при отсутствии подвалов - 0.3</html>");
    final JCheckBox checkBox6For8 = new JCheckBox("<html>при изменении планировки подвала и первого этажа - 0.8</html>");
    final JCheckBox checkBox7For8 = new JCheckBox("<html>При количестве сетей водопровода и<br>" +
            "канализации более четырех каждая сеть сверх четырех - 0.25</html>");
    final JCheckBox checkBox8For8 = new JCheckBox("<html>Проектные работы по водостокам , пылеудалению,<br>" +
            " хладоснабжению, обратному водоснабжению, специальным системам пожаротушения и<br>" +
            " газооборудованию - 0.3</html>");

    final JCheckBox checkBox1For9 = new JCheckBox("<html>Составление объемов работ при разработке типовых проектов - 1,6</html>");

    final JCheckBox checkBox1For10 = new JCheckBox("<html>При составлении объемов работ внутренних водостоков и газооборудования - 0,1</html>");


    final JCheckBox checkBox1For11 = new JCheckBox("<html>Стадия технического проекта - 0,4</html>");
    final JCheckBox checkBox2For11 = new JCheckBox("<html>Самостоятельные проекты санитарно-технических устройств<br> " +
            " для помещений магазинов, столовых, библиотек, прачечных и т. п., расположенных в жилых зданиях,<br>" +
            " нормируются дополнительно по объему и категории сложности проектирования этих помещений - 0,8</html>");
    final JCheckBox checkBox3For11 = new JCheckBox("<html>Здания со сложным архитектурно-планировочным решением - 1,2</html>");
    final JCheckBox checkBox4For11 = new JCheckBox("<html>Реконструкция систем отопления и вентиляции существующих зданий - 1,3</html>");
    final JCheckBox checkBox5For11 = new JCheckBox("<html>Устройство в одном здании нескольких самостоятельных систем<br>" +
            "отопления по зонам и по странам светa - 1,2</html>");
    final JCheckBox checkBox6For11 = new JCheckBox("<html>Театры с количеством мест более 800 - 1,5</html>");
    final JCheckBox checkBox7For11 = new JCheckBox("<html>без изменения систем - 0,2</html>");
    final JCheckBox checkBox8For11 = new JCheckBox("<html>с переработкой систем - 0,5</html>");
    final JCheckBox checkBox9For11 = new JCheckBox("<html>с испарительным охлаждением воздуха - 1,6</html>");
    final JCheckBox checkBox10For11 = new JCheckBox("<html>с политропическим охлаждением воздуха - 1,8</html>");
    final JCheckBox checkBox11For11 = new JCheckBox("<html>При проектировании двухтрубных систем отопления к работам<br>" +
            " V разряда - 0,7</html>");
    final JCheckBox checkBoxHeatingOrVent1 = new JCheckBox("<html>Проект под отопление</html>");
    final JCheckBox checkBoxHeatingOrVent2 = new JCheckBox("<html>Проект под вентиляцию</html>");

    final JCheckBox checkBox1For14 = new JCheckBox("<html>При выполнении проекта вертикальной планировки в масштабе 1 :1000 - 0.7</html>");
    final JCheckBox checkBox2For14 = new JCheckBox("<html>При выполнении плана высотного решения (организации рельефа) без<br>" +
            "проектных (красных) горизонталей методом проектных отметок,<br>" +
            "профилей или другим методом - 0.6</html>");
    final JCheckBox checkBox3For14 = new JCheckBox("<html>При выполнении в карандаше плана застройки с элементами<br>" +
            "благоустройства на готовой геоподоснове, пригодного к размножению<br>" +
            "без обводки тушью - 0.8</html>");

    final JCheckBox checkBox1For15 = new JCheckBox("<html> При выполнении проекта вертикальной планировки <br>" +
            "в масштабе 1 : 500 - 1.5</html>");
    final JCheckBox checkBox2For15 = new JCheckBox("<html> При выполнении проекта вертикальной планировки <br>" +
            "в масштабе 1 : 2000 - 0.7</html>");
    final JCheckBox checkBox3For15 = new JCheckBox("<html>При выполнении в карандаше плана застройки с элементами<br>" +
            " благоустройства на готовой геоподоснове, пригодного к размножению без обводки тушью - 0.8</html>");

    final JCheckBox checkBox1For16 = new JCheckBox("<html>500м²</html>");
    final JCheckBox checkBox2For16 = new JCheckBox("<html>700м²</html>");
    final JCheckBox checkBox3For16 = new JCheckBox("<html>1000м²</html>");
    final JCheckBox checkBox4For16 = new JCheckBox("<html>2000м²</html>");
    final JCheckBox checkBox5For16 = new JCheckBox("<html>5000м²</html>");
    final JCheckBox checkBox6For16 = new JCheckBox("<html>более 5000м²</html>");

    final JCheckBox checkBox1For17 = new JCheckBox("<html>При разработке планов этажей со стенами - 1,1</html>");
    final JCheckBox checkBox2For17 = new JCheckBox("<html>При разработке монтажных планов - 1,2</html>");
    final JCheckBox checkBox3For17 = new JCheckBox("<html>При разработке планов подвала - 1,5</html>");
    final JCheckBox checkBox4For17 = new JCheckBox("<html>При разработке схем плановых жилых зданий - 0,3</html>");

    final JCheckBox checkBox1For20 = new JCheckBox("<html>500м²</html>");
    final JCheckBox checkBox2For20 = new JCheckBox("<html>700м²</html>");
    final JCheckBox checkBox3For20 = new JCheckBox("<html>1000м²</html>");
    final JCheckBox checkBox4For20 = new JCheckBox("<html>2000м²</html>");
    final JCheckBox checkBox5For20 = new JCheckBox("<html>5000м²</html>");
    final JCheckBox checkBox6For20 = new JCheckBox("<html>более 5000м²</html>");

    final JCheckBox checkBox1For21 = new JCheckBox("<html>При разработке фасадов жилых зданий с использованием<br>" +
            " первых этажей для торговли, общественного питания и т.п. - 1.2</html>");
    final JCheckBox checkBox2For21 = new JCheckBox("<html>при разработке фасадов при надстройке или<br>" +
            "пристройке зданий - 1.1</html>");

    final JCheckBox checkBox1For23 = new JCheckBox("<html>При разработке фасадов жилых зданий с использованием<br>" +
            " первых этажей для торговли, общественного питания и т.п. - 1.2</html>");
    final JCheckBox checkBox2For23 = new JCheckBox("<html>при разработке фасадов при надстройке или<br>" +
            "пристройке зданий - 1.1</html>");

    final JCheckBox checkBox1For24 = new JCheckBox("<html>500м²</html>");
    final JCheckBox checkBox2For24 = new JCheckBox("<html>700м²</html>");
    final JCheckBox checkBox3For24 = new JCheckBox("<html>1000м²</html>");
    final JCheckBox checkBox4For24 = new JCheckBox("<html>2000м²</html>");
    final JCheckBox checkBox5For24 = new JCheckBox("<html>5000м²</html>");
    final JCheckBox checkBox6For24 = new JCheckBox("<html>более 5000м²</html>");
    final JCheckBox checkBox7For24 = new JCheckBox("<html>1:200 - 0,3</html>");
    final JCheckBox checkBox8For24 = new JCheckBox("<html>1:400 - 0,2</html>");

    final JCheckBox checkBox1For26 = new JCheckBox("<html>1:100 - 0,5</html>");
    final JCheckBox checkBox2For26 = new JCheckBox("<html>1:200 - 0,3</html>");
    final JCheckBox checkBox3For26 = new JCheckBox("<html>1:400 - 0,2</html>");

    final JCheckBox checkBox1For28 = new JCheckBox("<html>При наличии в одном элементе нескольких архитектурных <br>" +
            "деталей или на одном чертеже нескольких различных шаблонов - 0.6 </html>");

    final JCheckBox checkBox1For29 = new JCheckBox("<html>При выполнении только общих видов и разрезов - 0.3</html>");
    final JCheckBox checkBox2For29 = new JCheckBox("<html>При выполнении только чертежей деталей - 0.5</html>");
    final JCheckBox checkBox3For29 = new JCheckBox("<html>При выполнении окон и фрамуг с одинарными переплетами - 0.7</html>");
    final JCheckBox checkBox4For29 = new JCheckBox("<html>При выполнении окон и фрамуг с тройными переплетами - 1.2</html>");

    final JCheckBox checkBox1For30 = new JCheckBox("<html>При расчете вариантов для различных климатических зон или различных<br>" +
            "сопротивлений грунтов - 0.4 </html>");
    final JCheckBox checkBox2For30 = new JCheckBox("<html> Расчеты свайных оснований нормируются по нормам № 274 и 275 - 1.1</html>");

    final JCheckBox checkBox1For32 = new JCheckBox("<html>Расчеты армокаменных конструкций нормируются по норме № 277 - 1,2</html>");

    final JCheckBox checkBox1For34 = new JCheckBox("<html>Расчет сборных железобетонных ферм нормируется по нормам 293 или 294 - 1.3,</html>");

    final JCheckBox checkBox1For36 = new JCheckBox("<html>Разработка чертежей монолитных фундаментов нормируется по норме № 302—304 - 0,8</html>");
    final JCheckBox checkBox2For36 = new JCheckBox("<html>Разработка плана забивки свай - 1,3</html>");
    final JCheckBox checkBox3For36 = new JCheckBox("<html>планов ростверков с сечениями — 1,1</html>");
    final JCheckBox checkBox4For36 = new JCheckBox("<html>план земляных работ или план подпольных каналов — 0,2</html>");
    final JCheckBox checkBox5For36 = new JCheckBox("<html>при совмещении плана подпольных каналов с планом фундаментов — 1,1</html>");
    final JCheckBox checkBox6For36 = new JCheckBox("<html>нормируется разработка плана раскладки карнизных плит или перемычек - 0,5</html>");
    final JCheckBox checkBox7For36 = new JCheckBox("<html>плана" +
            "раскладки перемычек, совмещенного с планом перекрытий — 1,2</html>");
    final JCheckBox checkBox8For36 = new JCheckBox("<html>Нормами №306 и №307 предусматривается разработка плана и разреза<br>" +
            " железобетонных или деревянных стропил из элементов заводского изготовления. При разработке плана и разреза стропил<br>" +
            " из пиломатериалов или бревен - 1,2</html>");

    final JCheckBox checkBox9For36 = new JCheckBox("<html>200м² - 1,8</html>");
    final JCheckBox checkBox10For36 = new JCheckBox("<html>500м² - 1,3</html>");
    final JCheckBox checkBox11For36 = new JCheckBox("<html>1000м² - 1</html>");
    final JCheckBox checkBox12For36 = new JCheckBox("<html>2000м² - 0,9</html>");
    final JCheckBox checkBox13For36 = new JCheckBox("<html>5000м² - 0,8</html>");

    final JCheckBox checkBox1For37 = new JCheckBox("<html>Разработка сборных каталожных элементов для альбомов - 1,3</html>");

    final JCheckBox checkBox1For38 = new JCheckBox("<html>При разработке чертежей клепаных или болтовых узлов к норме №313 - 1,2 </html>");
    final JCheckBox checkBox2For38 = new JCheckBox("<html>При разработке чертежей узлов и деталей из алюминиевых сплавов <br>" +
            "или пластических масс к нормам № 313 и 314 - 1,2</html>");
    final JCheckBox checkBox3For38 = new JCheckBox("<html>Чертежи монтажных схем, узлов и сечений марки КМД индивидуальных<br>" +
            " проектов могут нормироваться по нормам № 311 и 313 - 0,7</html>");

    final JCheckBox checkBox1For40 = new JCheckBox("<html>При разработке рабочих чертежей лестниц из сборных железобетонных" +
            " элементов по действующим каталогам - 0,8</html>");
    final JCheckBox checkBox2For40 = new JCheckBox("<html>При разработке рабочих чертежей железобетонных " +
            "монолитных пространственных лестниц №320 - 1,2</html>");

    final JCheckBox checkBox1For42 = new JCheckBox("<html>К нормам № 223—227 при выполнении отмывки или отделки пером<br>" +
            " вместо покраски — 1,2</html>");
    final JCheckBox checkBox2For42 = new JCheckBox("<html>К нормам № 223—227 построения без отмывки — 0,6</html>");
    final JCheckBox checkBox3For42 = new JCheckBox("<html>0,125 листа - 2</html>");
    final JCheckBox checkBox4For42 = new JCheckBox("<html>0,25 - 1.8</html>");
    final JCheckBox checkBox5For42 = new JCheckBox("<html>0.5 - 1.4</html>");
    final JCheckBox checkBox6For42 = new JCheckBox("<html>2 - 0.8</html>");
    final JCheckBox checkBox7For42 = new JCheckBox("<html>3 - 0.7</html>");
    final JCheckBox checkBox8For42 = new JCheckBox("<html>4 - 0.6</html>");
    final JCheckBox checkBox9For42 = new JCheckBox("<html>К нормам № 228 и 229 при иллюминировании чертежей цветными<br>" +
            " карандашами — 0,5;</html>");
    final JCheckBox checkBox10For42 = new JCheckBox("<html>При выполнении разверток стен или перспектив с мелкочлененными<br>" +
            " элементами или сложными кровлями — 1,3</html>");

    final JCheckBox checkBox1For4 = new JCheckBox("<html>При сложной конфигурации здания (круглое, полукруглое и др.) - 1,2</html>");
    final JCheckBox checkBox2For4 = new JCheckBox("<html>При составлении объемов работ для кирпичных зданий 12 этажей<br>" +
            " и выше - 1,5</html>");
    final JCheckBox checkBox3For4 = new JCheckBox("<html>Составление объемов работ по чертежам технического проекта - 0,8</html>");
    final JCheckBox checkBox4For4 = new JCheckBox("<html>Составление объемов работ при разработке типовых проектов - 1,6</html>");
    final JCheckBox checkBox5For4 = new JCheckBox("<html> При применении (привязке) типовых проектов жилых и гражданских<br>" +
            " зданий с техническим подпольем - 0,9</html>");
    final JCheckBox checkBox6For4 = new JCheckBox("<html> При применении (привязке) типовых проектов жилых и гражданских<br>" +
            " зданий без подвалов и технических подполий — 0,8 </html>");
    final JCheckBox checkBoxFor4Individual = new JCheckBox("<html>Индивидуальный проект</html>");
    final JCheckBox checkBoxFor4Binding = new JCheckBox("<html>Проект привязки</html>");

    //Чекбоксы удельного веса

    /*Таблица 1*/
    final JCheckBox percCheckBox1For1 = new JCheckBox("<html>Перенесение с плана на план</html>");
    final JCheckBox percCheckBox2For1 = new JCheckBox("<html>Оформление в туши</html>");
    final JCheckBox percCheckBox3For1 = new JCheckBox("<html>Оформление в красках</html>");
    final JCheckBox percCheckBox4For1 = new JCheckBox("<html>Оформление в туши</html>");
    final JCheckBox percCheckBox5For1 = new JCheckBox("<html>Оформление в красках</html>");

    /*Таблица2*/
    final JCheckBox percCheckBox1For2 = new JCheckBox("<html>Перенесение с плана на план</html>");
    final JCheckBox percCheckBox2For2 = new JCheckBox("<html>Оформление в туши</html>");
    final JCheckBox percCheckBox3For2 = new JCheckBox("<html>Оформление в красках</html>");
    final JCheckBox percCheckBox4For2 = new JCheckBox("<html>Оформление в туши</html>");
    final JCheckBox percCheckBox5For2 = new JCheckBox("<html>Оформление в красках</html>");

    /*Таблица3*/
    final JCheckBox percCheckBox1For3 = new JCheckBox("<html>Перенесение с плана на план</html>");
    final JCheckBox percCheckBox2For3 = new JCheckBox("<html>Оформление в туши</html>");
    final JCheckBox percCheckBox3For3 = new JCheckBox("<html>Оформление в красках</html>");
    final JCheckBox percCheckBox4For3 = new JCheckBox("<html>Оформление в туши</html>");
    final JCheckBox percCheckBox5For3 = new JCheckBox("<html>Оформление в красках</html>");

    /*Таблица5*/
    final JCheckBox percCheckBox1For12 = new JCheckBox("<html>Графическая подготовка материалов - 11</html>");
    final JCheckBox percCheckBox2For12 = new JCheckBox("<html>проектирование продольных профилей магистралей и улиц - 6 </html>");
    final JCheckBox percCheckBox3For12 = new JCheckBox("<html>Составление схемы организации рельефа, вычисление уклонов и <br>" +
            "расстояний по проездам, выбор дорожных покрытий - 37</html>");
    final JCheckBox percCheckBox4For12 = new JCheckBox("<html>Подсчет объемов работ и составление пояснительной записк - 8</html>");
    final JCheckBox percCheckBox5For12 = new JCheckBox("<html>Разработка схемы - 38</html>");

    /*Таблица 6*/
    final JCheckBox percCheckBox1For15 = new JCheckBox("<html>Выполнение плана застройки со всеми элементами благоустройства<br>" +
            " по эскизному решению автора проекта - 20</html>");
    final JCheckBox percCheckBox2For15 = new JCheckBox("<html>План высотного решения в проектных горизонталях сечением 0,2—0,25 м.<br>" +
            "Вычисление уклонов и расстояний по осям проездов и отметок в переломных точках. Вычисление проектных и черных отметок по <br>" +
            "углам зданий и сооружений, на хозяйственных, спортивных и игровых площадках, дорожках<br>" +
            "и тротуарах. Разработка типовых поперечных профилей проездов - 35</html>");
    final JCheckBox percCheckBox3For15 = new JCheckBox("<html>Картограммы земляных работ с выполнениемвсех графических и<br>" +
            "счетных работ - 20</html>");
    final JCheckBox percCheckBox4For15 = new JCheckBox("<html>План дорожных покрытий с подсчетом объемов работ по дорожному<br>" +
            "благоустройству, с выполнением всех графических и счетных работ - 18</html>");
    final JCheckBox percCheckBox5For15 = new JCheckBox("<html>Пояснительная записка - 7</html>");

    /*Таблица 7*/
    final JCheckBox percCheckBox1For14 = new JCheckBox("<html>Выполнение в соответствии с утвержденнымтехническим проектом<br>" +
            "плана застройки, благоустройства и разбивочного чертежа проекта застройки - 21</html>");
    final JCheckBox percCheckBox2For14 = new JCheckBox("<html>План высотного решения в проектных (красных) горизонталях сечением<br>" +
            "через 0,1 м. Вычисление уклонов и расстояний но осям проездов и отметок<br>" +
            "в переломных точках. Вычисление проектных и черных отметок да углах зданий<br>" +
            "и сооружений, на хозяйственных, спортивных и игровых площадках, дорожках и<br>" +
            "тротуарах, оформление поперечных профилей проездов - 47</html>");
    final JCheckBox percCheckBox3For14 = new JCheckBox("<html>Картограмма земляных работ с выполнениемвсех графических<br>" +
            "и счетных работ - 10</html>");
    final JCheckBox percCheckBox4For14 = new JCheckBox("<html>План дорожных покрыта (с разработкой конструкций дорожных<br>" +
            "покрытий) с подсчетом объемов работ по дорожному благоустройству и выполнением<br>" +
            "всех графических и счетных работ - 16</html>");
    final JCheckBox percCheckBox5For14 = new JCheckBox("<html>Пояснительная записка - 6</html>");

    /*Таблица 11*/
    final JCheckBox percCheckBox1For11 = new JCheckBox("<html>Получение от главного инженера проекта задания и необходимых данных<br>" +
            "для разработки проекта</html>");
    final JCheckBox percCheckBox2For11 = new JCheckBox("<html> вентиляционных обменов, выбор вентиляционного и отопительного оборудования,<br>" +
            "шумоглушителей и других элементов систем, компоновка камер,<br>" +
            "трассы воздуховодов и трубопроводов и увязка с другими частями<br>" +
            "проекта</html>");
    final JCheckBox percCheckBox3For11 = new JCheckBox("<html>Составление основных показателей по проекту (спецификации оборудования,<br>" +
            "расходов тепла, электроэнергии и т. п.)</html>");
    final JCheckBox percCheckBox4For11 = new JCheckBox("<html>Выдача материалов для выполнения других частей проекта </html>");
    final JCheckBox percCheckBox5For11 = new JCheckBox("<html>Составление заказных спецификаций</html>");
    final JCheckBox percCheckBox6For11 = new JCheckBox("<html>Проверка чертежей, расчетных материалов и выпуск проекта </html>");

    final JCheckBox percCheckBox7For11 = new JCheckBox("<html>Определение коэффициентов теплопередачи, расчеты потерь тепла<br>" +
            " и нагревательных приборов</html>");
    final JCheckBox percCheckBox8For11 = new JCheckBox("<html>Расчет трубопроводов систем отопления</html>");
    final JCheckBox percCheckBox9For11 = new JCheckBox("<html>Расчет воздуховодов, подбор вентиляционных шахт, дефлекторов и т.п.</html>");
    final JCheckBox percCheckBox10For11 = new JCheckBox("<html>Составление объемов работ (для смет)</html>");

    /*Таблица 44*/
    final JCheckBox percCheckBox1For7 = new JCheckBox("<html>Получение от руководителя работы задания и<br>" +
            "необходимых данных для разработки проекта</html>");
    final JCheckBox percCheckBox2For7 = new JCheckBox("<html>Трассировка внутренних сетей и выбор схемы</html>");
    final JCheckBox percCheckBox3For7 = new JCheckBox("<html>Выявление расчетных расходов</html>");
    final JCheckBox percCheckBox4For7 = new JCheckBox("<html>Составление основных показателей по проекту<br>" +
            "(спецификации оборудования, расходов воды, тепла и т. п.) </html>");
    final JCheckBox percCheckBox5For7 = new JCheckBox("<html>Выдача материалов для выполнения других<br>" +
            "частей проекта </html>");
    final JCheckBox percCheckBox6For7 = new JCheckBox("<html>Проверка чертежей, расчетных материалов и<br>" +
            "выпуск проекта</html>");

    final JCheckBox percCheckBox7For7 = new JCheckBox("<html>Расчет трубопроводов и отдельных элементов</html>");
    final JCheckBox percCheckBox8For7 = new JCheckBox("<html>Составление объемов работ (для сметы)</html>");

    /*Таблица 47*/
    final JCheckBox pecrCheckBox1For8 = new JCheckBox("<html>Получение от руководителя работы задания и необходимых <br>" +
            "данных для разработки проекта</html>");
    final JCheckBox pecrCheckBox2For8 = new JCheckBox("<html>Трассировка внутренних сетей</html>");
    final JCheckBox pecrCheckBox3For8 = new JCheckBox("<html>Подсчет расчетных расходов и площадей стока и определение<br>" +
            " диаметров трубопроводов</html>");
    final JCheckBox pecrCheckBox4For8 = new JCheckBox("<html>Составление основных показателей по проекту (спецификации<br>" +
            " оборудования, расходов воды, количества водопотребителей и т.п.)</html>");
    final JCheckBox pecrCheckBox5For8 = new JCheckBox("<html>Выдача материалов для выполнения других частей проекта</html>");
    final JCheckBox pecrCheckBox6For8 = new JCheckBox("<html>Составление заказных спецификаций</html>");
    final JCheckBox pecrCheckBox7For8 = new JCheckBox("<html>Составление объемов работ (для смет)</html>");
    final JCheckBox pecrCheckBox8For8 = new JCheckBox("<html>Проверка чертежей, расчетных материалов и выпуск проекта</html>");

    /*Таблица 47*/
    final JCheckBox percCheckBox1For4 = new JCheckBox("<html>Земляные работы</html>");
    final JCheckBox percCheckBox2For4 = new JCheckBox("<html>Фундаменты</html>");
    final JCheckBox percCheckBox3For4 = new JCheckBox("<html>Стены подвала</html>");
    final JCheckBox percCheckBox4For4 = new JCheckBox("<html>Стены этажей</html>");
    final JCheckBox percCheckBox5For4 = new JCheckBox("<html>Перекрытия</html>");
    final JCheckBox percCheckBox6For4 = new JCheckBox("<html>Кровля<html>");
    final JCheckBox percCheckBox7For4 = new JCheckBox("<html>Полы на грунте</html>");
    final JCheckBox percCheckBox8For4 = new JCheckBox("<html>Полы по перекрытиям<html>");
    final JCheckBox percCheckBox9For4 = new JCheckBox("<html>Лестницы<html>");
    final JCheckBox percCheckBox10For4 = new JCheckBox("<html>Перегородки<html>");
    final JCheckBox percCheckBox11For4 = new JCheckBox("<html>Проёмные заполнения<html>");
    final JCheckBox percCheckBox12For4 = new JCheckBox("<html>Внутренняя отделка, штукатурка, малярные работы<html>");
    final JCheckBox percCheckBox13For4 = new JCheckBox("<html>Разные работы, приямки, входы, антресоли, мусорокамеры и прочее<html>");

    /*Таблица 52*/
    final JCheckBox percCheckBox1For10 = new JCheckBox("<html>Отопление и вентиляци</html>");
    final JCheckBox percCheckBox2For10 = new JCheckBox("<html>Водопровод и канализация</html>");
    final JCheckBox percCheckBox3For10 = new JCheckBox("<html>Горячее водоснабжени</html>");


    int answer1;
    int answer2;
    int answer3;
    int answer4;
    int answer5;
    int answer6;
    int answer7;
    int answer8;
    int answer9;
    int answer10;
    int answer11;
    int answer12;
    int answer13;
    int answer14;
    int answer15;
    int answer16;
    int answer17;
    int answer18;
    int answer19;
    int answer20;
    int answer21;
    int answer22;
    int answer23;
    int answer24;
    int answer25;
    int answer26;
    int answer27;
    int answer28;
    int answer29;
    int answer30;
    int answer31;
    int answer32;
    int answer33;
    int answer34;
    int answer35;
    int answer302;
    int answer303304;
    int answer305306;
    int answer37first;
    int answer38;
    int answer39;
    int answer40first;
    int answer40second;
    int answer41;

    double coef1 = 1;
    double coef2 = 1;
    double coef3 = 1;
    double coef4 = 1;
    double coef5 = 1;
    double coef6 = 1;
    double coef7 = 1;
    double coef8 = 1;
    double coef9 = 1;
    double coef10 = 1;
    double coef11 = 1;
    double coef12 = 1;
    double coef13 = 1;
    double coefHeatingFor11 = 1;
    double coefVentFor11 = 1;
    double coefFor4 = 0;

    double percent = 0;
    double percent1 = 0;
    double percent2 = 0;
    double percent3 = 0;
    double percent4 = 0;
    double percent5 = 0;
    double percent6 = 0;
    double percent7 = 0;
    double percent8 = 0;
    double percent9 = 0;
    double percent10 = 0;
    double percent11 = 0;
    double percent12 = 0;
    double percent13 = 0;

    double percent1ForV = 0;
    double percent2ForV = 0;
    double percent3ForV = 0;
    double percent4ForV = 0;
    double percent5ForV = 0;
    double percent6ForV = 0;
    double percent7ForV = 0;
    double percent8ForV = 0;
    double percent9ForV = 0;
    double percent10ForV = 0;

    double percent1ForIV = 0;
    double percent2ForIV = 0;
    double percent3ForIV = 0;
    double percent4ForIV = 0;
    double percent5ForIV = 0;
    double percent6ForIV = 0;
    double percent7ForIV = 0;
    double percent8ForIV = 0;
    double percent9ForIV = 0;
    double percent10ForIV = 0;

    double numbHeatingOrVent = 0;


    static JPanel cards;

    public void createPanelUI(Container container) {
        JComboBox<String> combobox = new JComboBox<String>(new String[]{DISTRICT_LAYOUT, LOCALITY_MASTER_PLAN
                , DETAILED_LAYOUT_PROJECT, FLOORS_OF_THE_BUILDING_TYPICAL, HEATER,
                FLOORS_OF_THE_BUILDING_INDIVIDUAL,
                HOT_WATER_SUPPLY, INTERNAL_WATER_SUPPLY, ARCHI_CONST_PART_CIVIL_BUILDS,
                HEATING_VENTILATION, HEATING_VENTILATION_WATER_SUPPLY_CIV_BUILDS, VERTICAL_LAYOUT_FIVE,
                VERTICAL_LAYOUT, LAND_DEV_STAGE_WORKING_DRAWS, LAND_DEV_STAGE_TECH_PROJECT,
                TECH_PROJ_H_PLANS_MORE, TECH_PROJ_H_PLANS_UP_TO, WORK_DRAWS_H_PLANS_MORE, WORK_DRAWS_H_PLANS_UP_TO,
                TECH_PROJ_FACADES_H_MORE, TECH_PROJ_FACADES_H_UP_TO, WORK_DRAWS_FACADES_H_MORE, WORK_DRAWS_FACADES_H_UP_TO,
                TECH_PROJ_SELECTION_H_MORE, TECH_PROJ_SELECTION_H_UP_TO, WORK_DRAWS_SELECTION_H_MORE, WORK_DRAWS_SELECTION_H_UP_TO,
                ARCHI_DETAILS_PATTERNS, FILLING_OPENINGS_VESTIBULES,
                FOUNDATION, STEEL_STRUCTURES, STONE_CONCRETE_STRUCTURES, REINFORCED_CONCRETE_MONOLITH_STRUC, REINFORCED_CONCRETE_PREFAB_STRUC,
                WOODEN_STRUC,
                FOUNDATIONS_FLOORS_RAFTERS, REINFORCED_CONCRETE_STRUC, ENCLOSING_METAL_STRUC, WOODEN_CONSTRUCTION, DIFFERENT_DESIGN_AND_DETAILS,
                DIFFERENT_DESIGN_AND_DETAILS_WITH_NUMB_ELEM, ART_AND_GRAPHIC_WORKS}
        );

        combobox.setEditable(false);
        combobox.addItemListener(this);
        combobox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        JPanel cbPanel = new JPanel();
        cbPanel.add(combobox);

        final ButtonGroup buttonGroup = new ButtonGroup();

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        JPanel card1 = new JPanel();

        Box boxDistrictLayout = Box.createVerticalBox();
        Box boxDistrictLayoutPerc1 = Box.createVerticalBox();
        Box boxDistrictLayoutPerc2 = Box.createVerticalBox();
        Box boxDistrictLayoutPerc3 = Box.createVerticalBox();

        boxDistrictLayout.setBorder(new TitledBorder("<html><h2>Площадь района в тыс.м²</h2></html>"));
        boxDistrictLayoutPerc1.setBorder(new TitledBorder("<html><h2>Состав работы и удельный вес в % </h2></html>"));
        boxDistrictLayoutPerc2.setBorder(new TitledBorder("<html>к нормам № 1.3, 1.6, 1.9, 2.20, 2.26, 2.27,<br>" +
                "2.28 и 2.29</html>"));
        boxDistrictLayoutPerc3.setBorder(new TitledBorder("<html>к нормам № 1.5, 1.8, 2.12, 2.14, 2.22, 3.2 и 3.13</html>"));

        JButton buttonDistrictLayout = new JButton("Рассчитать");

        final JRadioButton radioButtonDistrictLayout1 = new JRadioButton("<html>до 2</html>");
        final JRadioButton radioButtonDistrictLayout2 = new JRadioButton("<html>5</html>");
        final JRadioButton radioButtonDistrictLayout3 = new JRadioButton("<html>30 и более</html>");

        boxDistrictLayout.add(radioButtonDistrictLayout1);
        boxDistrictLayout.add(radioButtonDistrictLayout2);
        boxDistrictLayout.add(radioButtonDistrictLayout3);

        boxDistrictLayoutPerc1.add(boxDistrictLayoutPerc2);
        boxDistrictLayoutPerc2.add(percCheckBox1For1);
        boxDistrictLayoutPerc2.add(percCheckBox2For1);
        boxDistrictLayoutPerc2.add(percCheckBox3For1);
        boxDistrictLayoutPerc1.add(boxDistrictLayoutPerc3);
        boxDistrictLayoutPerc3.add(percCheckBox4For1);
        boxDistrictLayoutPerc3.add(percCheckBox5For1);

        card1.add(boxDistrictLayout);
        card1.add(boxDistrictLayoutPerc1);
        card1.add(buttonDistrictLayout);

        percCheckBox1For1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox1For1.isSelected()) {
                    percent1 += 0.45;
                } else percent1 -= 0.45;
            }
        });
        percCheckBox2For1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox2For1.isSelected()) {
                    percent1 += 0.2;
                } else percent1 -= 0.2;
            }
        });
        percCheckBox3For1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox3For1.isSelected()) {
                    percent1 += 0.35;
                } else percent1 -= 0.35;
            }
        });
        percCheckBox4For1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox4For1.isSelected()) {
                    percent2 += 0.35;
                } else percent2 -= 0.35;
            }
        });
        percCheckBox5For1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox5For1.isSelected()) {
                    percent2 += 0.65;
                } else percent2 -= 0.65;
            }
        });
        radioButtonDistrictLayout1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer1 = 1;
            }
        });
        radioButtonDistrictLayout2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer1 = 2;
            }
        });
        radioButtonDistrictLayout3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer1 = 3;
            }
        });
        buttonDistrictLayout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DistrictLayoutTable1(answer1, percent1, percent2).setVisible(true);
            }
        });

        JPanel card2 = new JPanel();

        Box boxLocalityMasterPlan = Box.createVerticalBox();
        Box boxLocalityMasterPlanPerc1 = Box.createVerticalBox();
        Box boxLocalityMasterPlanPerc2 = Box.createVerticalBox();
        Box boxLocalityMasterPlanPerc3 = Box.createVerticalBox();

        boxLocalityMasterPlan.setBorder(new TitledBorder("<html>Численность насленность в тыс.чел.</html>"));
        boxLocalityMasterPlanPerc1.setBorder(new TitledBorder("<html><h2>Состав работы и удельный вес в % </h2></html>"));
        boxLocalityMasterPlanPerc2.setBorder(new TitledBorder("<html>к нормам № 1.3, 1.6, 1.9, 2.20, 2.26, 2.27,<br>" +
                "2.28 и 2.29</html>"));
        boxLocalityMasterPlanPerc3.setBorder(new TitledBorder("<html>к нормам № 1.5, 1.8, 2.12, 2.14, 2.22, 3.2 и 3.13</html>"));

        JButton buttonLocalityMasterPlan = new JButton("Рассчитать");

        final JRadioButton radioButtonLocalityMasterPlan1 = new JRadioButton("<html>до 20</html>");
        final JRadioButton radioButtonLocalityMasterPlan2 = new JRadioButton("<html>50</html>");
        final JRadioButton radioButtonLocalityMasterPlan3 = new JRadioButton("<html>150</html>");
        final JRadioButton radioButtonLocalityMasterPlan4 = new JRadioButton("<html>500 и более</html>");

        boxLocalityMasterPlan.add(radioButtonLocalityMasterPlan1);
        boxLocalityMasterPlan.add(radioButtonLocalityMasterPlan2);
        boxLocalityMasterPlan.add(radioButtonLocalityMasterPlan3);
        boxLocalityMasterPlan.add(radioButtonLocalityMasterPlan4);

        boxLocalityMasterPlanPerc1.add(boxLocalityMasterPlanPerc2);
        boxLocalityMasterPlanPerc2.add(percCheckBox1For2);
        boxLocalityMasterPlanPerc2.add(percCheckBox2For2);
        boxLocalityMasterPlanPerc2.add(percCheckBox3For2);
        boxLocalityMasterPlanPerc1.add(boxLocalityMasterPlanPerc3);
        boxLocalityMasterPlanPerc3.add(percCheckBox4For2);
        boxLocalityMasterPlanPerc3.add(percCheckBox5For2);

        card2.add(boxLocalityMasterPlan);
        card2.add(boxLocalityMasterPlanPerc1);
        card2.add(buttonLocalityMasterPlan);
        percCheckBox1For2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox1For2.isSelected()) {
                    percent1 += 0.45;
                } else percent1 -= 0.45;
            }
        });
        percCheckBox2For2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox2For2.isSelected()) {
                    percent1 += 0.20;
                } else percent1 -= 0.2;
            }
        });
        percCheckBox3For2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox3For2.isSelected()) {
                    percent1 += 0.35;
                } else percent1 -= 0.35;
            }
        });
        percCheckBox4For2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox4For2.isSelected()) {
                    percent2 += 0.35;
                } else percent2 -= 0.35;
            }
        });
        percCheckBox5For2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox5For2.isSelected()) {
                    percent2 += 0.65;
                } else percent2 -= 0.65;
            }
        });
        radioButtonLocalityMasterPlan1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer2 = 1;
            }
        });
        radioButtonLocalityMasterPlan2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer2 = 2;
            }
        });
        radioButtonLocalityMasterPlan3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer2 = 3;
            }
        });
        radioButtonLocalityMasterPlan4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer2 = 4;
            }
        });
        buttonLocalityMasterPlan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LocalityMasterPlanTable2(answer2, percent1, percent2).setVisible(true);
            }
        });

        JPanel card3 = new JPanel();

        Box boxDetailedLayoutProject = Box.createVerticalBox();
        Box boxDetailedLayoutProjectPerc1 = Box.createVerticalBox();
        Box boxDetailedLayoutProjectPerc2 = Box.createVerticalBox();
        Box boxDetailedLayoutProjectPerc3 = Box.createVerticalBox();

        boxDetailedLayoutProjectPerc1.setBorder(new TitledBorder("<html><h2>Состав работы и удельный вес в % </h2></html>"));
        boxDetailedLayoutProjectPerc2.setBorder(new TitledBorder("<html>к нормам № 1.3, 1.6, 1.9, 2.20, 2.26, 2.27,<br>" +
                "2.28 и 2.29</html>"));
        boxDetailedLayoutProjectPerc3.setBorder(new TitledBorder("<html>к нормам № 1.5, 1.8, 2.12, 2.14, 2.22, 3.2 и 3.13</html>"));

        boxDetailedLayoutProject.setBorder(new TitledBorder("Площадь территории в гектарах"));

        JButton buttonDetailedLayoutProject = new JButton("Рассчитать");

        final JRadioButton radioButtonDetailedLayoutProject1 = new JRadioButton("<html>до 250</html>");
        final JRadioButton radioButtonDetailedLayoutProject2 = new JRadioButton("<html>400</html>");
        final JRadioButton radioButtonDetailedLayoutProject3 = new JRadioButton("<html>500 и более</html>");

        boxDetailedLayoutProject.add(radioButtonDetailedLayoutProject1);
        boxDetailedLayoutProject.add(radioButtonDetailedLayoutProject2);
        boxDetailedLayoutProject.add(radioButtonDetailedLayoutProject3);

        boxDetailedLayoutProjectPerc1.add(boxDetailedLayoutProjectPerc3);
        boxDetailedLayoutProjectPerc3.add(percCheckBox4For3);
        boxDetailedLayoutProjectPerc3.add(percCheckBox5For3);

        card3.add(boxDetailedLayoutProject);
        card3.add(boxDetailedLayoutProjectPerc1);
        card3.add(buttonDetailedLayoutProject);

        percCheckBox3For3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox3For3.isSelected()) {
                    percent1 += 0.35;
                } else percent1 -= 0.35;
            }
        });
        percCheckBox4For3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox4For3.isSelected()) {
                    percent2 += 0.35;
                } else percent2 -= 0.35;
            }
        });
        percCheckBox5For3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox5For3.isSelected()) {
                    percent2 += 0.65;
                } else percent2 -= 0.65;
            }
        });
        radioButtonDetailedLayoutProject1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer3 = 1;
            }
        });
        radioButtonDetailedLayoutProject2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer3 = 2;
            }
        });
        radioButtonDetailedLayoutProject3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer3 = 3;
            }
        });
        buttonDetailedLayoutProject.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DetailedLayoutProjectTable3(answer3, percent1, percent2).setVisible(true);
            }
        });

        JPanel card4 = new JPanel();
        ButtonGroup groupFor4 = new ButtonGroup();

        groupFor4.add(checkBoxFor4Individual);
        groupFor4.add(checkBoxFor4Binding);

        Box boxFloorsOfTheBuildingTypical = Box.createVerticalBox();
        Box boxFloorsOfTheBuildingTypical1 = Box.createVerticalBox();
        Box boxFloorsOfTheBuildingTypicalPerc = Box.createVerticalBox();
        Box boxFloorsOfTheBuildingTypicalIndBind = Box.createVerticalBox();
        boxFloorsOfTheBuildingTypical.setBorder(new TitledBorder("<html><h2>Этажность здания</h2></html>"));
        boxFloorsOfTheBuildingTypical1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));
        boxFloorsOfTheBuildingTypicalPerc.setBorder(new TitledBorder("<html><h2>Состав работы</h2></html>"));
        boxFloorsOfTheBuildingTypicalIndBind.setBorder(new TitledBorder("<html><h2>Тип проекта(влияет на процент от состава работы)</h2></html>"));

        JButton buttonFloorsOfTheBuildingTypical = new JButton("Рассчитать");

        final JRadioButton radioButtonFloorsOfTheBuildingTypical1 = new JRadioButton("<html>1</html>");
        final JRadioButton radioButtonFloorsOfTheBuildingTypical2 = new JRadioButton("<html>2-3</html>");
        final JRadioButton radioButtonFloorsOfTheBuildingTypical3 = new JRadioButton("<html>4-5</html>");
        final JRadioButton radioButtonFloorsOfTheBuildingTypical4 = new JRadioButton("<html>6-9</html>");

        boxFloorsOfTheBuildingTypical.add(radioButtonFloorsOfTheBuildingTypical1);
        boxFloorsOfTheBuildingTypical.add(radioButtonFloorsOfTheBuildingTypical2);
        boxFloorsOfTheBuildingTypical.add(radioButtonFloorsOfTheBuildingTypical3);
        boxFloorsOfTheBuildingTypical.add(radioButtonFloorsOfTheBuildingTypical4);
        boxFloorsOfTheBuildingTypical.add(boxFloorsOfTheBuildingTypicalIndBind);

        boxFloorsOfTheBuildingTypical1.add(checkBox1For4);
        boxFloorsOfTheBuildingTypical1.add(checkBox2For4);
        boxFloorsOfTheBuildingTypical1.add(checkBox3For4);
        boxFloorsOfTheBuildingTypical1.add(checkBox4For4);
        boxFloorsOfTheBuildingTypical1.add(checkBox5For4);
        boxFloorsOfTheBuildingTypical1.add(checkBox6For4);

        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox1For4);
        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox2For4);
        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox3For4);
        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox4For4);
        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox5For4);
        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox6For4);
        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox7For4);
        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox8For4);
        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox9For4);
        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox10For4);
        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox11For4);
        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox12For4);
        boxFloorsOfTheBuildingTypicalPerc.add(percCheckBox13For4);

        boxFloorsOfTheBuildingTypicalIndBind.add(checkBoxFor4Individual);
        boxFloorsOfTheBuildingTypicalIndBind.add(checkBoxFor4Binding);

        card4.add(boxFloorsOfTheBuildingTypical);
        card4.add(boxFloorsOfTheBuildingTypical1);
        card4.add(boxFloorsOfTheBuildingTypicalPerc);
        card4.add(buttonFloorsOfTheBuildingTypical);
        percCheckBox1For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox1For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent1 += 0.05;
                    }
                    if (coefFor4 > 1) {
                        percent1 += 0.12;
                    }
                } else percent1 -= percent1;
            }
        });
        percCheckBox2For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox2For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent2 += 0.07;
                    }
                    if (coefFor4 > 1) {
                        percent2 += 0.18;
                    }
                } else percent2 -= percent2;
            }
        });
        percCheckBox3For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox3For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent3 += 0.03;
                    }
                    if (coefFor4 > 1) {
                        percent3 += 0.1;
                    }
                } else percent3 -= percent3;
            }
        });
        percCheckBox4For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox4For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent4 += 0.18;
                    }
                    if (coefFor4 > 1) {
                        percent4 += 0;
                    }
                } else percent4 -= percent4;
            }
        });
        percCheckBox5For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox5For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent5 += 0.1;
                    }
                    if (coefFor4 > 1) {
                        percent5 += 0.1;
                    }
                } else percent5 -= percent5;
            }
        });
        percCheckBox6For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox6For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent6 += 0.02;
                    }
                    if (coefFor4 > 1) {
                        percent6 += 0;
                    }
                } else percent6 -= percent6;
            }
        });
        percCheckBox7For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox7For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent7 += 0.02;
                    }
                    if (coefFor4 > 1) {
                        percent7 += 0.06;
                    }
                } else percent7 -= percent7;
            }
        });
        percCheckBox8For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox8For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent8 += 0.07;
                    }
                    if (coefFor4 > 1) {
                        percent8 += 0.08;
                    }
                } else percent8 -= percent8;
            }
        });
        percCheckBox9For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox9For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent9 += 0.04;
                    }
                    if (coefFor4 > 1) {
                        percent9 += 0.09;
                    }
                } else percent9 -= percent9;
            }
        });
        percCheckBox10For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox10For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent10 += 0.07;
                    }
                    if (coefFor4 > 1) {
                        percent10 += 0.06;
                    }
                } else percent10 -= percent10;
            }
        });
        percCheckBox11For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox11For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent11 += 0.08;
                    }
                    if (coefFor4 > 1) {
                        percent11 += 0.06;
                    }
                } else percent11 -= percent11;
            }
        });
        percCheckBox12For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox12For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent12 += 0.19;
                    }
                    if (coefFor4 > 1) {
                        percent12 += 0.07;
                    }
                } else percent12 -= percent12;
            }
        });
        percCheckBox13For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox13For4.isSelected()) {
                    if (coefFor4 > 0 | coefFor4 < 2) {
                        percent13 += 0.08;
                    }
                    if (coefFor4 > 1) {
                        percent13 += 0.08;
                    } else percent13 -= percent13;
                }
            }
        });

        checkBoxFor4Individual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBoxFor4Individual.isSelected()) {
                    coefFor4 = 1;
                }
            }
        });
        checkBoxFor4Binding.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBoxFor4Binding.isSelected()) {
                    coefFor4 = 2;
                }
            }
        });
        checkBox1For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For4.isSelected()) {
                    coef1 = 1.2;
                } else coef1 = 1;
            }
        });
        checkBox2For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For4.isSelected()) {
                    coef2 = 1.5;
                } else coef2 = 1;
            }
        });
        checkBox3For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For4.isSelected()) {
                    coef3 = 0.8;
                } else coef3 = 1;
            }
        });
        checkBox4For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox4For4.isSelected()) {
                    coef4 = 1.6;
                } else coef4 = 1;
            }
        });
        checkBox5For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox5For4.isSelected()) {
                    coef5 = 0.9;
                } else coef5 = 1;
            }
        });
        checkBox6For4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox6For4.isSelected()) {
                    coef6 = 0.8;
                } else coef6 = 1;
            }
        });
        radioButtonFloorsOfTheBuildingTypical1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer4 = 1;
            }
        });
        radioButtonFloorsOfTheBuildingTypical2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer4 = 2;
            }
        });
        radioButtonFloorsOfTheBuildingTypical3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer4 = 3;
            }
        });
        radioButtonFloorsOfTheBuildingTypical4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer4 = 4;
            }
        });
        buttonFloorsOfTheBuildingTypical.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FloorsOfTheBuildingTypicalTable49(answer4, coef1, coef2, coef3, coef4, coef5, coef6,
                        percent1, percent2, percent3, percent4, percent5, percent6, percent7, percent8, percent9,
                        percent10, percent11, percent12, percent13).setVisible(true);
            }
        });

        JPanel card5 = new JPanel();

        Box boxHeater = Box.createVerticalBox();
        Box boxHeater1 = Box.createVerticalBox();

        boxHeater.setBorder(new TitledBorder("<html><h2>Количество котлов</h2><html>"));
        boxHeater1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2><html>"));
        JButton buttonHeater = new JButton("Рассчитать");

        final JRadioButton radioButtonHeater1 = new JRadioButton("<html>1-2</html>");
        final JRadioButton radioButtonHeater2 = new JRadioButton("<html>3-4</html>");
        final JRadioButton radioButtonHeater3 = new JRadioButton("<html>5-6</html>");

        boxHeater.add(radioButtonHeater1);
        boxHeater.add(radioButtonHeater2);
        boxHeater.add(radioButtonHeater3);

        boxHeater1.add(checkBox1For5);
        boxHeater1.add(checkBox2For5);


        card5.add(boxHeater);
        card5.add(boxHeater1);
        card5.add(buttonHeater);
        checkBox1For5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For5.isSelected()) {
                    coef1 = 1.2;
                } else coef1 = 1;
            }
        });
        checkBox2For5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For5.isSelected()) {
                    coef2 = 1.1;
                } else coef2 = 1;
            }
        });
        radioButtonHeater1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer5 = 1;
            }
        });
        radioButtonHeater2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer5 = 2;
            }
        });
        radioButtonHeater3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer5 = 3;
            }
        });
        buttonHeater.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HeaterTable54(answer5, coef1, coef2).setVisible(true);
            }
        });

        JPanel card6 = new JPanel();

        Box boxFloorsOfTheBuildingIndividual = Box.createVerticalBox();
        Box boxFloorsOfTheBuildingIndividual1 = Box.createVerticalBox();

        boxFloorsOfTheBuildingIndividual.setBorder(new TitledBorder("<html><h2>Этажность здания</h2></html>"));
        boxFloorsOfTheBuildingIndividual1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));

        JButton buttonFloorsOfTheBuildingIndividual = new JButton("Рассчитать");

        final JRadioButton radioButtonFloorsOfTheBuildingIndividual1 = new JRadioButton("<html>1</html>");
        final JRadioButton radioButtonFloorsOfTheBuildingIndividual2 = new JRadioButton("<html>2-3</html>");
        final JRadioButton radioButtonFloorsOfTheBuildingIndividual3 = new JRadioButton("<html>4-5</html>");
        final JRadioButton radioButtonFloorsOfTheBuildingIndividual4 = new JRadioButton("<html>6-9</html>");

        boxFloorsOfTheBuildingIndividual.add(radioButtonFloorsOfTheBuildingIndividual1);
        boxFloorsOfTheBuildingIndividual.add(radioButtonFloorsOfTheBuildingIndividual2);
        boxFloorsOfTheBuildingIndividual.add(radioButtonFloorsOfTheBuildingIndividual3);
        boxFloorsOfTheBuildingIndividual.add(radioButtonFloorsOfTheBuildingIndividual4);

        boxFloorsOfTheBuildingIndividual1.add(checkBox1For6);
        boxFloorsOfTheBuildingIndividual1.add(checkBox2For6);
        boxFloorsOfTheBuildingIndividual1.add(checkBox3For6);
        boxFloorsOfTheBuildingIndividual1.add(checkBox4For6);
        boxFloorsOfTheBuildingIndividual1.add(checkBox5For6);
        boxFloorsOfTheBuildingIndividual1.add(checkBox6For6);


        card6.add(boxFloorsOfTheBuildingIndividual);
        card6.add(boxFloorsOfTheBuildingIndividual1);
        card6.add(buttonFloorsOfTheBuildingIndividual);

        checkBox1For6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For6.isSelected()) {
                    coef1 = 1.2;
                } else coef1 = 1;
            }
        });
        checkBox2For6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For6.isSelected()) {
                    coef2 = 1.5;
                } else coef2 = 1;
            }
        });
        checkBox3For6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For6.isSelected()) {
                    coef3 = 0.8;
                } else coef3 = 1;
            }
        });
        checkBox4For6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox4For6.isSelected()) {
                    coef4 = 1.6;
                } else coef4 = 1;
            }
        });
        checkBox5For6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox5For6.isSelected()) {
                    coef5 = 0.9;
                } else coef5 = 1;
            }
        });
        checkBox6For6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox6For6.isSelected()) {
                    coef6 = 1.2;
                } else coef6 = 1.2;
            }
        });
        radioButtonFloorsOfTheBuildingIndividual1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer6 = 1;
            }
        });
        radioButtonFloorsOfTheBuildingIndividual2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer6 = 2;
            }
        });
        radioButtonFloorsOfTheBuildingIndividual3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer6 = 3;
            }
        });
        radioButtonFloorsOfTheBuildingIndividual4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer6 = 4;
            }
        });
        buttonFloorsOfTheBuildingIndividual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FloorsOfTheBuildingIndividualTable49(answer6, coef1, coef2, coef3, coef4, coef5, coef6).setVisible(true);
            }
        });

        JPanel card7 = new JPanel();

        Box boxHotWaterSupply = Box.createVerticalBox();
        Box boxHotWaterSupplyPerc = Box.createVerticalBox();
        Box boxHotWaterSupplyPerc1 = Box.createVerticalBox();
        Box boxHotWaterSupplyPerc2 = Box.createVerticalBox();
        boxHotWaterSupply.setBorder(new TitledBorder("<html><h2>Категории сложности</h2><html>"));
        boxHotWaterSupplyPerc.setBorder(new TitledBorder("<html><h2>Состав работы</h2></html>"));
        boxHotWaterSupplyPerc1.setBorder(new TitledBorder("<html><h3>Работа V разряда</h3><html>"));
        boxHotWaterSupplyPerc2.setBorder(new TitledBorder("<html><h3>Работа IV разряда</h3><html>"));

        JButton buttonHotWaterSupply = new JButton("Рассчитать");

        final JRadioButton radioButtonHotWaterSupply1 = new JRadioButton("<html>1 - Жилые дома высотой до трёх этажей, " +
                "дачи, казармы, общежития, магазины, административные здания,<br>" +
                " низшие и средние учебные заведения.</html>");
        final JRadioButton radioButtonHotWaterSupply2 = new JRadioButton("<html>2 - Жилые дома высотой более трёх этажей," +
                " гостиницы, дома отдыха, спортивные залы, фильмохранилища, <br>" +
                "выставочные здания.</html>");
        final JRadioButton radioButtonHotWaterSupply3 = new JRadioButton("<html>3 - Детские сады и ясли, амбулатории, " +
                "больницы и поликлиники, главные корпуса киностудии, универсальные <br>" +
                "магазины.</html>");
        final JRadioButton radioButtonHotWaterSupply4 = new JRadioButton("<html>4 - Дворцы культуры и спорта, Дома печати," +
                " радио-телевизионные центры, театры и кинотеатры, цирки, концертные <br>" +
                "здания, музеи, Дома Советов, здания министерств, санатории, столовые, спортивные павильоны повышенного типа, <br>" +
                "вокзалы всех типов, высшие учебные заведения и научно-исследовательские институты</html>");
        final JRadioButton radioButtonHotWaterSupply5 = new JRadioButton("<html>5 - Бани, душевые, прачечные, бассейны, " +
                "дезинфекционные станции, лечебные, заведения <br>" +
                "с водочлечебницами, высшие учебные заведения и научно-исследовательчкие инститы при <br>" +
                "наличии лаборатории</html>");

        boxHotWaterSupply.add(radioButtonHotWaterSupply1);
        boxHotWaterSupply.add(radioButtonHotWaterSupply2);
        boxHotWaterSupply.add(radioButtonHotWaterSupply3);
        boxHotWaterSupply.add(radioButtonHotWaterSupply4);
        boxHotWaterSupply.add(radioButtonHotWaterSupply5);

        boxHotWaterSupplyPerc.add(boxHotWaterSupplyPerc1);
        boxHotWaterSupplyPerc1.add(percCheckBox1For7);
        boxHotWaterSupplyPerc1.add(percCheckBox2For7);
        boxHotWaterSupplyPerc1.add(percCheckBox3For7);
        boxHotWaterSupplyPerc1.add(percCheckBox4For7);
        boxHotWaterSupplyPerc1.add(percCheckBox5For7);
        boxHotWaterSupplyPerc1.add(percCheckBox6For7);
        boxHotWaterSupplyPerc.add(boxHotWaterSupplyPerc2);
        boxHotWaterSupplyPerc2.add(percCheckBox7For7);
        boxHotWaterSupplyPerc2.add(percCheckBox8For7);

        card7.add(boxHotWaterSupply);
        card7.add(boxHotWaterSupplyPerc);
        card7.add(buttonHotWaterSupply);
        radioButtonHotWaterSupply1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer7 = 1;
            }
        });
        radioButtonHotWaterSupply2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer7 = 2;
            }
        });
        radioButtonHotWaterSupply3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer7 = 3;
            }
        });
        radioButtonHotWaterSupply4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer7 = 4;
            }
        });
        radioButtonHotWaterSupply5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer7 = 5;
            }
        });
        percCheckBox1For7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox1For7.isSelected()) {
                    percent2ForV += 0.15;
                } else percent2ForV -= 0.15;
            }
        });
        percCheckBox2For7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox2For7.isSelected()) {
                    percent2ForV += 0.20;
                } else percent2ForV -= 0.20;
            }
        });
        percCheckBox3For7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox3For7.isSelected()) {
                    percent2ForV += 0.15;
                } else percent2ForV -= 0.15;
            }
        });
        percCheckBox4For7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox4For7.isSelected()) {
                    percent2ForV += 0.20;
                } else percent2ForV -= 0.20;
            }
        });
        percCheckBox5For7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox5For7.isSelected()) {
                    percent2ForV += 0.05;
                } else percent2ForV -= 0.05;
            }
        });
        percCheckBox6For7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox6For7.isSelected()) {
                    percent2ForV += 0.25;
                } else percent2ForV -= 0.25;
            }
        });
        percCheckBox7For7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox7For7.isSelected()) {
                    percent2ForIV += 0.5;
                } else percent2ForIV -= 0.5;
            }
        });
        percCheckBox8For7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox8For7.isSelected()) {
                    percent2ForIV += 0.5;
                } else percent2ForIV -= 0.5;
            }
        });
        buttonHotWaterSupply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HotWaterSupplyTable4244(answer7, percent2ForV, percent2ForIV).setVisible(true);
            }
        });

        JPanel card8 = new JPanel();

        Box boxInternalWaterSupply = Box.createVerticalBox();
        Box boxInternalWaterSupply1 = Box.createVerticalBox();
        Box boxInternalWaterSupply2 = Box.createVerticalBox();
        Box boxInternalWaterSupplyPerc = Box.createVerticalBox();
        Box boxInternalWaterSupplyPerc1 = Box.createVerticalBox();
        boxInternalWaterSupply.setBorder(new TitledBorder("<html><h2>Категория сложности</h2></html>"));
        boxInternalWaterSupply1.setBorder(new TitledBorder("<html><h2>Дополнительыне факторы</h2></html>"));
        boxInternalWaterSupply2.setBorder(new TitledBorder("<html><h3>Использование типовых проектов с <br>" +
                "привязкой их к местным условиям:</h3></html>"));
        boxInternalWaterSupplyPerc.setBorder(new TitledBorder("<html><h2>Состав работы:</h2></html>"));
        boxInternalWaterSupplyPerc1.setBorder(new TitledBorder("<html><h3>Работы IV и V разрядов:</h3></html>"));
        JButton buttonInternalWaterSupply = new JButton("Рассчитать");

        final JRadioButton radioButtonInternalWaterSupply1 = new JRadioButton("<html>1 - Жилые дома высотой до трёх " +
                "этажей, дачи, казармы, общежития, магазины, административные здания,<br>" +
                " низшие и средние учебные заведения.</html>");
        final JRadioButton radioButtonInternalWaterSupply2 = new JRadioButton("<html>2 - Жилые дома высотой более трёх" +
                " этажей, гостиницы, дома отдыха, спортивные залы, фильмохранилища, <br>" +
                "выставочные здания.</html>");
        final JRadioButton radioButtonInternalWaterSupply3 = new JRadioButton("<html>3 - Детские сады и ясли, " +
                "амбулатории, больницы и поликлиники, главные корпуса киностудии, универсальные <br>" +
                "магазины.</html>");
        final JRadioButton radioButtonInternalWaterSupply4 = new JRadioButton("<html>4 - Дворцы культуры и спорта, Дома " +
                "печати, радио-телевизионные центры, театры и кинотеатры, цирки, концертные <br>" +
                "здания, музеи, Дома Советов, здания министерств, санатории, столовые, спортивные павильоны повышенного типа, <br>" +
                "вокзалы всех типов, высшие учебные заведения и научно-исследовательские институты</html>");
        final JRadioButton radioButtonInternalWaterSupply5 = new JRadioButton("<html>5 - Бани, душевые, прачечные," +
                " бассейны, дезинфекционные станции, лечебные, заведения <br>" +
                "с водочлечебницами, высшие учебные заведения и научно-исследовательчкие инститы при <br>" +
                "наличии лаборатории.</html>");

        boxInternalWaterSupply2.add(checkBox4For8);
        boxInternalWaterSupply2.add(checkBox5For8);
        boxInternalWaterSupply2.add(checkBox6For8);

        boxInternalWaterSupply1.add(checkBox1For8);
        boxInternalWaterSupply1.add(checkBox2For8);
        boxInternalWaterSupply1.add(checkBox3For8);
        boxInternalWaterSupply1.add(boxInternalWaterSupply2);
        boxInternalWaterSupply1.add(checkBox7For8);
        boxInternalWaterSupply1.add(checkBox8For8);

        boxInternalWaterSupply.add(radioButtonInternalWaterSupply1);
        boxInternalWaterSupply.add(radioButtonInternalWaterSupply2);
        boxInternalWaterSupply.add(radioButtonInternalWaterSupply3);
        boxInternalWaterSupply.add(radioButtonInternalWaterSupply4);
        boxInternalWaterSupply.add(radioButtonInternalWaterSupply5);

        boxInternalWaterSupplyPerc.add(boxInternalWaterSupplyPerc1);
        boxInternalWaterSupplyPerc1.add(pecrCheckBox1For8);
        boxInternalWaterSupplyPerc1.add(pecrCheckBox2For8);
        boxInternalWaterSupplyPerc1.add(pecrCheckBox3For8);
        boxInternalWaterSupplyPerc1.add(pecrCheckBox4For8);
        boxInternalWaterSupplyPerc1.add(pecrCheckBox5For8);
        boxInternalWaterSupplyPerc1.add(pecrCheckBox6For8);
        boxInternalWaterSupplyPerc1.add(pecrCheckBox7For8);
        boxInternalWaterSupplyPerc1.add(pecrCheckBox8For8);

        card8.add(boxInternalWaterSupply);
        card8.add(boxInternalWaterSupply1);
        card8.add(boxInternalWaterSupplyPerc);
        card8.add(buttonInternalWaterSupply);
        pecrCheckBox1For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pecrCheckBox1For8.isSelected()) {
                    if (answer8 > 0 | answer8 < 3) {
                        percent += 0.1;
                    }
                    if (answer8 > 2) {
                        percent += 0.1;
                    }
                } else percent -= percent;
            }
        });
        pecrCheckBox2For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pecrCheckBox2For8.isSelected()) {
                    if (answer8 > 0 | answer8 < 3) {
                        percent1 += 0.25;
                    }
                    if (answer8 > 2) {
                        percent1 += 0.1;
                    }
                } else percent1 -= percent1;
            }
        });
        pecrCheckBox3For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pecrCheckBox3For8.isSelected()) {
                    if (answer8 > 0 | answer8 < 3) {
                        percent2 += 0.15;
                    }
                    if (answer8 > 2) {
                        percent2 += 0.15;
                    }
                } else percent2 -= percent2;
            }
        });
        pecrCheckBox4For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pecrCheckBox4For8.isSelected()) {
                    if (answer8 > 0 | answer8 < 3) {
                        percent3 += 0.10;
                    }
                    if (answer8 > 2) {
                        percent3 += 0.10;
                    }
                } else percent3 -= percent3;
            }
        });
        pecrCheckBox5For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pecrCheckBox5For8.isSelected()) {
                    if (answer8 > 0 | answer8 < 3) {
                        percent4 += 0.05;
                    }
                    if (answer8 > 2) {
                        percent4 += 0.05;
                    }
                } else percent4 -= percent4;
            }
        });
        pecrCheckBox6For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pecrCheckBox6For8.isSelected()) {
                    if (answer8 > 0 | answer8 < 3) {
                        percent5 += 0.05;
                    }
                    if (answer8 > 2) {
                        percent5 += 0.05;
                    }
                } else percent5 -= percent5;
            }
        });
        pecrCheckBox7For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pecrCheckBox7For8.isSelected()) {
                    if (answer8 > 0 | answer8 < 3) {
                        percent6 += 0.10;
                    }
                    if (answer8 > 2) {
                        percent6 += 0.10;
                    }
                } else percent6 -= percent6;
            }
        });
        pecrCheckBox8For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pecrCheckBox8For8.isSelected()) {
                    if (answer8 > 0 | answer8 < 3) {
                        percent7 += 0.2;
                    }
                    if (answer8 > 2) {
                        percent7 += 0.25;
                    }
                } else percent7 -= percent7;
            }
        });
        checkBox1For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For8.isSelected()) {
                    coef1 = 1.2;
                } else coef1 = 1;
            }
        });
        checkBox2For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For8.isSelected()) {
                    coef2 = 1.2;
                } else coef2 = 1;
            }
        });
        checkBox3For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For8.isSelected()) {
                    coef3 = 1.25;
                } else coef3 = 1;
            }
        });
        checkBox4For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox4For8.isSelected()) {
                    coef4 = 0.45;
                } else coef4 = 1;
            }
        });
        checkBox5For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox5For8.isSelected()) {
                    coef5 = 0.3;
                } else coef5 = 1;
            }
        });
        checkBox6For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox6For8.isSelected()) {
                    coef6 = 0.8;
                } else coef6 = 1;
            }
        });
        checkBox7For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox7For8.isSelected()) {
                    coef7 = 0.25;
                } else coef7 = 1;
            }
        });
        checkBox8For8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox8For8.isSelected()) {
                    coef8 = 0.3;
                } else coef8 = 1;
            }
        });

        radioButtonInternalWaterSupply1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer8 = 1;
            }
        });
        radioButtonInternalWaterSupply2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer8 = 2;
            }
        });
        radioButtonInternalWaterSupply3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer8 = 3;
            }
        });
        radioButtonInternalWaterSupply4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer8 = 4;
            }
        });
        radioButtonInternalWaterSupply5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer8 = 5;
            }
        });
        buttonInternalWaterSupply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InternalWaterSupplyTable47(answer8, coef1, coef2, coef3, coef4, coef5, coef6, coef7, coef8,
                        percent, percent1, percent2, percent3, percent4, percent5, percent6, percent7).setVisible(true);
            }
        });

        JPanel card9 = new JPanel();

        Box boxArchi = Box.createVerticalBox();
        Box boxArchi1 = Box.createVerticalBox();
        boxArchi.setBorder(new TitledBorder("<html><h2>Категория сложности</h2></html>"));
        boxArchi1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));

        JButton buttonArchi = new JButton("Рассчитать");

        final JRadioButton radioButtonArchi1 = new JRadioButton("<html>1 - столовые и другие здания общественного " +
                "питания,<br>" +
                "мелкие административно-хозяйственные здания;</html>");
        final JRadioButton radioButtonArchi2 = new JRadioButton("<html>2 - административные здания, библиотеки, школы, " +
                "магазины, универмаги,<br>" +
                "техникумы, лечебно-профилактические учреждения, поликлиники, детские учреждения,<br>" +
                "бани и прачечные.</html>");
        final JRadioButton radioButtonArchi3 = new JRadioButton("<html>3 - кинотеатры, санатории, дома отдыха," +
                " научно-исследовательские институты, вузы и втузы,<br>" +
                "клубы, Дома культуры и т.д.</html>");
        boxArchi.add(radioButtonArchi1);
        boxArchi.add(radioButtonArchi2);
        boxArchi.add(radioButtonArchi3);
        boxArchi1.add(checkBox1For9);
        card9.add(boxArchi);
        card9.add(boxArchi1);
        card9.add(buttonArchi);
        checkBox1For9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For9.isSelected()) {
                    coef1 = 1.6;
                } else coef1 = 1;
            }
        });
        radioButtonArchi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer9 = 1;
            }
        });
        radioButtonArchi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer9 = 2;
            }
        });
        radioButtonArchi3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer9 = 3;
            }
        });
        buttonArchi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ArchiConstPartCivilBuildsTable50(answer9, coef1).setVisible(true);
            }
        });

        JPanel card10 = new JPanel();

        Box boxHeating = Box.createVerticalBox();
        Box boxHeating1 = Box.createVerticalBox();
        Box boxHeatingPerc = Box.createVerticalBox();
        boxHeating.setBorder(new TitledBorder("<html><h2>Категория сложности:</h2></html>"));
        boxHeating1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы:</h2></html>"));
        boxHeatingPerc.setBorder(new TitledBorder("<html><h2>Составление объемов отдельных видов санитарно-технических работ:</h2></html>"));

        JButton buttonHeating = new JButton("Рассчитать");

        final JRadioButton radioButtonHeating1 = new JRadioButton("<html>1 - дачи, казармы, общежития, " +
                "административно-конторские<br>" +
                "здания, дома отдыха, магазины;</html>");
        final JRadioButton radioButtonHeating2 = new JRadioButton("<html>2 - жилые жома, школы и средние учебные заведения," +
                " гостиницы, детские сады и ясли,<br>" +
                "спортивные залы;</html>");
        final JRadioButton radioButtonHeating3 = new JRadioButton("<html>3 - амбулатории, больницы, поликлиники, санатории," +
                " столовые, выставочные здания;</html>");
        final JRadioButton radioButtonHeating4 = new JRadioButton("<html>4 - бани, прачечные, душевые, дезинфекционные" +
                " станции, бассейны, лечебные заведения,<br>" +
                "высшие учебные заведения, Дворцы культуры и спорта, клубы и кинотеатры.</html>");

        boxHeating.add(radioButtonHeating1);
        boxHeating.add(radioButtonHeating2);
        boxHeating.add(radioButtonHeating3);
        boxHeating.add(radioButtonHeating4);

        boxHeating1.add(checkBox1For10);

        boxHeatingPerc.add(percCheckBox1For10);
        boxHeatingPerc.add(percCheckBox2For10);
        boxHeatingPerc.add(percCheckBox3For10);

        card10.add(boxHeating);
        card10.add(boxHeating1);
        card10.add(boxHeatingPerc);
        card10.add(buttonHeating);
        checkBox1For10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For10.isSelected()) {
                    coef1 = 0.1;
                } else coef1 = 1;
            }
        });
        percCheckBox1For10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox1For10.isSelected()) {
                    percent1 += 0.6;
                } else percent1 -= 0.6;
            }
        });
        percCheckBox2For10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox2For10.isSelected()) {
                    percent2 += 0.3;
                } else percent2 -= 0.3;
            }
        });
        percCheckBox3For10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox3For10.isSelected()) {
                    percent3 += 0.1;
                } else percent3 -= 0.1;
            }
        });
        radioButtonHeating1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer10 = 1;
            }
        });
        radioButtonHeating2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer10 = 2;
            }
        });
        radioButtonHeating3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer10 = 3;
            }
        });
        radioButtonHeating4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer10 = 4;
            }
        });
        buttonHeating.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HeatingVentilationWaterSupplyCivBuilds52(answer10, coef1, percent1, percent2, percent3).setVisible(true);
            }
        });

        JPanel card11 = new JPanel();

        Box boxHeatingVent = Box.createVerticalBox();
        Box boxHeatingVent1 = Box.createVerticalBox();
        Box boxHeatingVent2 = Box.createVerticalBox();
        Box boxHeatingVent3 = Box.createVerticalBox();
        Box boxHeatingVent4 = Box.createVerticalBox();

        Box boxHeatingVentPerc1 = Box.createVerticalBox();
        Box boxHeatingVentPerc2 = Box.createVerticalBox();
        Box boxHeatingVentPerc3 = Box.createVerticalBox();

        boxHeatingVent.setBorder(new TitledBorder("<html><h2>Классификация зданий по категории<br>" +
                "сложности проектирования</h2></html>"));
        boxHeatingVent3.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));
        boxHeatingVent1.setBorder(new TitledBorder("<html>Использование типовых проектов с привязкой их к местным условиям:</html>"));
        boxHeatingVentPerc1.setBorder(new TitledBorder("<html><h2>Состав работы:</h2></html>"));
        boxHeatingVentPerc2.setBorder(new TitledBorder("<html><h4>Работа V разряда</h4></html>"));
        boxHeatingVentPerc3.setBorder(new TitledBorder("<html><h4>Работа IV разряда</h4></html>"));
        boxHeatingVent4.setBorder(new TitledBorder("<html><h2>При раздельном выполнении проекта</h2></html>"));

        boxHeatingVent2.setBorder(new TitledBorder("<html>Помещения с кондиционированием воздуха:</html>"));

        JButton buttonHeatingVent = new JButton("Рассчитать");

        final JRadioButton radioButtonHeatingVent1 = new JRadioButton("<html>1 - Жилые дома, дачи, казармы, общежития," +
                "административно-конторские здания,<br>" +
                "дома отдыха.</html>");
        final JRadioButton radioButtonHeatingVent2 = new JRadioButton("<html>2 - Низшие и средние учебные заведения, " +
                "гостиницы, детские сады и ясли, магазины,<br>" +
                "спортивные залы.</html>");
        final JRadioButton radioButtonHeatingVent3 = new JRadioButton("<html>3 - Амбулатории, больницы, поликлиники," +
                " санатории, столовые, главные корпуса киностудий<br>" +
                "(выпускающих до 5 фильмов в год).</html>");
        final JRadioButton radioButtonHeatingVent4 = new JRadioButton("<html>4 - Выставочные здания, главные корпуса" +
                " киностудии (выпускающих до 10 фильмов в год),<br>" +
                "бани, душевые, прачечные, дезинфекционные станции, бассейны.</html>");
        final JRadioButton radioButtonHeatingVent5 = new JRadioButton("<html>5 - Дворцы культуры и спорта, театры, " +
                "кинотеатры, цирки, концертные здания, музеи,<br>" +
                "Дома печати, радиотелевизионные центры, почтаматы, теплицы и оранжереи, Дома Советов,<br>" +
                "здания министерств, учебные и научно-исследовательские институты.</html>");


        boxHeatingVent4.add(checkBoxHeatingOrVent1);
        boxHeatingVent4.add(checkBoxHeatingOrVent2);

        boxHeatingVent1.add(checkBox7For11);
        boxHeatingVent1.add(checkBox8For11);

        boxHeatingVent2.add(checkBox9For11);
        boxHeatingVent2.add(checkBox10For11);

        boxHeatingVent3.add(checkBox1For11);
        boxHeatingVent3.add(checkBox2For11);
        boxHeatingVent3.add(checkBox3For11);
        boxHeatingVent3.add(checkBox4For11);
        boxHeatingVent3.add(checkBox5For11);
        boxHeatingVent3.add(checkBox6For11);

        boxHeatingVent3.add(boxHeatingVent1);
        boxHeatingVent3.add(boxHeatingVent2);

        boxHeatingVent3.add(checkBox11For11);


        boxHeatingVent.add(radioButtonHeatingVent1);
        boxHeatingVent.add(radioButtonHeatingVent2);
        boxHeatingVent.add(radioButtonHeatingVent3);
        boxHeatingVent.add(radioButtonHeatingVent4);
        boxHeatingVent.add(radioButtonHeatingVent5);
        boxHeatingVent.add(boxHeatingVent4);

        boxHeatingVentPerc1.add(boxHeatingVentPerc2);
        boxHeatingVentPerc2.add(percCheckBox1For11);
        boxHeatingVentPerc2.add(percCheckBox2For11);
        boxHeatingVentPerc2.add(percCheckBox3For11);
        boxHeatingVentPerc2.add(percCheckBox4For11);
        boxHeatingVentPerc2.add(percCheckBox5For11);
        boxHeatingVentPerc2.add(percCheckBox6For11);
        boxHeatingVentPerc1.add(boxHeatingVentPerc3);
        boxHeatingVentPerc3.add(percCheckBox7For11);
        boxHeatingVentPerc3.add(percCheckBox8For11);
        boxHeatingVentPerc3.add(percCheckBox9For11);
        boxHeatingVentPerc3.add(percCheckBox10For11);

        card11.add(boxHeatingVent);
        card11.add(boxHeatingVent3);
        card11.add(boxHeatingVentPerc1);
        card11.add(buttonHeatingVent);

        checkBoxHeatingOrVent1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBoxHeatingOrVent1.isSelected()) {
                    if (answer11 == 1) {
                        coefHeatingFor11 = 0.8;
                    }
                    if (answer11 == 2) {
                        coefHeatingFor11 = 0.7;
                    }
                    if (answer11 == 3 || answer11 == 4) {
                        coefHeatingFor11 = 0.6;
                    }
                    if (answer11 == 5) {
                        coefHeatingFor11 = 0.5;
                    }
                } else coefHeatingFor11 = 1;
            }
        });
        checkBoxHeatingOrVent2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBoxHeatingOrVent2.isSelected()) {
                    if (answer11 == 1) {
                        coefVentFor11 = 0.3;
                    }
                    if (answer11 == 2) {
                        coefVentFor11 = 0.4;
                    }
                    if (answer11 == 3 || answer11 == 4) {
                        coefVentFor11 = 0.6;
                    }
                    if (answer11 == 5) {
                        coefVentFor11 = 0.7;
                    }
                } else coefVentFor11 = 1;
            }
        });
        percCheckBox1For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox1For11.isSelected()) {
                    if (answer11 < 2) {
                        percent1ForV += 0.10;
                    }
                    if (answer11 > 1) {
                        percent1ForV += 0.10;
                    }
                } else percent1ForV -= percent1ForV;

            }
        });
        percCheckBox2For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox2For11.isSelected()) {
                    if (answer11 < 2) {
                        percent2ForV += 0.43;
                    }
                    if (answer11 > 1) {
                        percent2ForV += 0.35;
                    }
                } else percent2ForV -= percent2ForV;
            }

        });
        percCheckBox3For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox3For11.isSelected()) {
                    if (answer11 < 2) {
                        percent3ForV += 0.10;
                    }
                    if (answer11 > 1) {
                        percent3ForV += 0.10;
                    }
                } else percent3ForV -= 0.10;
            }

        });
        percCheckBox4For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox4For11.isSelected()) {
                    if (answer11 < 2) {
                        percent4ForV += 0.12;
                    }
                    if (answer11 > 1) {
                        percent4ForV += 0.15;
                    }
                } else percent4ForV -= 0.15;
            }
        });
        percCheckBox5For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox5For11.isSelected()) {
                    if (answer11 < 2) {
                        percent5ForV += 0.05;
                    }
                        if (answer11 > 1) {
                            percent5ForV += 0.10;
                        }
                    } else percent5ForV -= percent5ForV;
                }
            });
        percCheckBox6For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox6For11.isSelected()) {
                    if (answer11 < 2) {
                        percent6ForV += 0.2;
                    }
                        if (answer11 > 1) {
                            percent6ForV += 0.2;
                        }
                    } else percent6ForV -= percent6ForV;

            }
        });
        percCheckBox7For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox7For11.isSelected()) {
                    if (answer11 < 2) {
                        percent1ForIV += 0.4;
                    }
                        if (answer11 > 1) {
                            percent1ForIV += 0.5;
                        }
                    } else percent1ForIV -= percent1ForIV;

            }
        });
        percCheckBox8For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox8For11.isSelected()) {
                    if (answer11 < 2) {
                        percent2ForIV += 0.3;
                    }
                        if (answer11 > 1) {
                            percent2ForIV += 0.3;
                        }
                    } else percent2ForIV -= percent2ForIV;
                }

        });
        percCheckBox9For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox9For11.isSelected()) {
                    if (answer11 < 2) {
                        percent3ForIV += 0.2;
                    }
                        if (answer11 > 1) {
                            percent3ForIV += 0.1;
                        }
                    } else percent3ForIV -= percent3ForIV;

            }
        });
        percCheckBox10For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox10For11.isSelected()) {
                    if (answer11 < 2) {
                        percent4ForIV += 0.1;
                    }
                        if (answer11 > 1) {
                            percent4ForIV += 0.1;
                        }
                    } else percent4ForIV -= percent4ForIV;
                }

        });

        checkBox1For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For11.isSelected()) {
                    coef1 = 0.4;
                } else coef1 = 1;
            }
        });
        checkBox2For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For11.isSelected()) {
                    coef2 = 0.8;
                } else coef2 = 1;
            }
        });
        checkBox3For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For11.isSelected()) {
                    coef3 = 1.2;
                } else coef3 = 1;
            }
        });
        checkBox4For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox4For11.isSelected()) {
                    coef4 = 1.3;
                } else coef4 = 1;
            }
        });
        checkBox5For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox5For11.isSelected()) {
                    coef5 = 1.2;
                } else coef5 = 1;
            }
        });
        checkBox6For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox6For11.isSelected()) {
                    coef6 = 1.5;
                } else coef6 = 1;
            }
        });
        checkBox7For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox7For11.isSelected()) {
                    coef7 = 0.2;
                } else coef7 = 1;
            }
        });
        checkBox8For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox8For11.isSelected()) {
                    coef8 = 0.5;
                } else coef8 = 1;
            }
        });
        checkBox9For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox9For11.isSelected()) {
                    coef9 = 1.6;
                } else coef9 = 1;
            }
        });
        checkBox10For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox10For11.isSelected()) {
                    coef10 = 1.8;
                } else coef10 = 1;
            }
        });
        checkBox11For11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox11For11.isSelected()) {
                    coef11 = 0.7;
                } else coef11 = 1;
            }
        });
        radioButtonHeatingVent1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer11 = 1;
            }
        });
        radioButtonHeatingVent2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer11 = 2;
            }
        });
        radioButtonHeatingVent3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer11 = 3;
            }
        });
        radioButtonHeatingVent4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer11 = 4;
            }
        });
        radioButtonHeatingVent5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer11 = 5;
            }
        });
        buttonHeatingVent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HeatingVentilation41(answer11, coef1, coef2, coef3, coef4, coef5, coef6, coef7, coef8, coef9, coef10, coef11,
                        coefHeatingFor11, coefVentFor11, percent1ForV, percent2ForV, percent3ForV, percent4ForV, percent5ForV,
                        percent6ForV, percent1ForIV, percent2ForIV, percent3ForIV, percent4ForIV).setVisible(true);
            }
        });

        JPanel card12 = new JPanel();

        Box boxVertLayFive = Box.createVerticalBox();
        boxVertLayFive.setBorder(new TitledBorder("<html><h2>Схема вертикальной планировки к проектам<br>" +
                "детальной планировки городов и посёлков в масштабе 1 : 2000</h2></html>"));
        Box boxVertLayFivePerc = Box.createVerticalBox();

        boxVertLayFivePerc.setBorder(new TitledBorder("<html><h2>Состав работы и удельный вес в %<h2></html>"));

        JButton buttonVertLayFive = new JButton("Рассчитать");

        final JRadioButton radioButtonVertLayFive1 = new JRadioButton("<html>1 - свободная территория. Рельеф местности ровный, " +
                "опокойный,<br>" +
                "с уклонами в пределах от 0,4 до 2% на площади до 50% проектируемой<br>" +
                "территории.<br></html>");
        final JRadioButton radioButtonVertLayFive2 = new JRadioButton("<html>2 - частично застроенная территория с " +
                "наличием опорной застройки,<br>" +
                "зелёных насаждений и инженерных коммуникаций. Рельеф местности средний,<br>" +
                "с уклонами от 0,4 до 5% на площади до 50% проектируемой территории.<br></html>");
        final JRadioButton radioButtonVertLayFive3 = new JRadioButton("<html>3 - существующая застройка. Рельеф местности" +
                " резко выраженный, с уклонами<br>" +
                "от 5 до 7%<br></html>");
        final JRadioButton radioButtonVertLayFive4 = new JRadioButton("<html>4 - территория с большой опорной застройкой," +
                " наличием зелёных насаждений<br>" +
                "или большой сетью инженерных коммуникаций. Рельеф местности мало выраженный,<br>" +
                "плоский или замкнутый, с уклонами менее 0,4% или резко пересечённый,<br>" +
                "с уклонами более 7%</html>");

        boxVertLayFive.add(radioButtonVertLayFive1);
        boxVertLayFive.add(radioButtonVertLayFive2);
        boxVertLayFive.add(radioButtonVertLayFive3);
        boxVertLayFive.add(radioButtonVertLayFive4);

        boxVertLayFivePerc.add(percCheckBox1For12);
        boxVertLayFivePerc.add(percCheckBox2For12);
        boxVertLayFivePerc.add(percCheckBox3For12);
        boxVertLayFivePerc.add(percCheckBox4For12);
        boxVertLayFivePerc.add(percCheckBox5For12);

        card12.add(boxVertLayFive);
        card12.add(boxVertLayFivePerc);
        card12.add(buttonVertLayFive);

        percCheckBox1For12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox1For12.isSelected()) {
                    percent += 0.11;
                } else percent -= 0.11;
            }
        });
        percCheckBox2For12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox2For12.isSelected()) {
                    percent += 0.06;
                } else percent -= 0.06;
            }
        });
        percCheckBox3For12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox3For12.isSelected()) {
                    percent += 0.37;
                } else percent -= 0.37;
            }
        });
        percCheckBox4For12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox4For12.isSelected()) {
                    percent += 0.08;
                } else percent -= 0.08;
            }
        });
        percCheckBox5For12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox5For12.isSelected()) {
                    percent += 0.38;
                } else percent -= 0.38;
            }
        });
        radioButtonVertLayFive1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer12 = 1;
            }
        });
        radioButtonVertLayFive2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer12 = 2;
            }
        });
        radioButtonVertLayFive3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer12 = 3;
            }
        });
        radioButtonVertLayFive4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer12 = 4;
            }
        });
        buttonVertLayFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VerticalDetailLayoutTable5(answer12, percent).setVisible(true);
            }
        });

        JPanel card13 = new JPanel();

        Box boxVertLay = Box.createVerticalBox();
        boxVertLay.setBorder(new TitledBorder("<html><h2>Схема вертикальной планировкик генеральным<br>" +
                "планам городов и посёлков в масштабе 1 : 5000</h2></html>"));

        JButton buttonVertLay = new JButton("Рассчитать");

        final JRadioButton radioButtonVertLay1 = new JRadioButton("<html>1 - свободная территория. Рельеф местности " +
                "ровный, спокойный,<br>" +
                "с уклонами в пределах от 0,4 до 3%</html>");
        final JRadioButton radioButtonVertLay2 = new JRadioButton("<html>2 - частично застроенная территория с наличием" +
                " опорной застройки,<br>" +
                "зелёных насаждений и ниженерных коммуникаций</html>");
        final JRadioButton radioButtonVertLay3 = new JRadioButton("<html>3 - существующая застройка. Рельеф местности " +
                "резко выраженный,<br>" +
                "с уклонами от 0,4 до 7%</html>");
        final JRadioButton radioButtonVertLay4 = new JRadioButton("<html>4 - территория с большой опорной застройкой и " +
                "зелёными насаждениями<br>" +
                "или большой сетью инженерных коммуникаций. Рельеф местности мало<br>" +
                "выраженный, плоский или замкнутый с уклонами менее 0,3% или резко<br>" +
                "пересечённый, с уклонами более 7%</html>");

        boxVertLay.add(radioButtonVertLay1);
        boxVertLay.add(radioButtonVertLay2);
        boxVertLay.add(radioButtonVertLay3);
        boxVertLay.add(radioButtonVertLay4);
        card13.add(boxVertLay);
        card13.add(buttonVertLay);
        radioButtonVertLay1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer13 = 1;
            }
        });
        radioButtonVertLay2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer13 = 2;
            }
        });
        radioButtonVertLay3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer13 = 3;
            }
        });
        radioButtonVertLay4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer13 = 4;
            }
        });
        buttonVertLay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VerticalMasterLayoutTable4(answer13).setVisible(true);
            }
        });

        JPanel card14 = new JPanel();

        Box boxLandDevDraws = Box.createVerticalBox();
        Box boxLandDevDraws1 = Box.createVerticalBox();
        Box boxLandDevDrawsPerc = Box.createVerticalBox();
        boxLandDevDraws.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности:</h2></html>"));
        boxLandDevDraws1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы:</h2></html>"));
        boxLandDevDrawsPerc.setBorder(new TitledBorder("<html><h2>Состав работ и удельный вес в %:</h2></html>"));

        JButton buttonLandDevDraws = new JButton("Рассчитать");

        final JRadioButton radioButtonLandDevDraws1 = new JRadioButton("<html>1 - свободная от застройки территория при " +
                "спокойном рельефе местности,<br>" +
                "геометрически правильный контур территории, расположение проектируемой<br>" +
                "территории вне центра города (жилого района, микрорайона), однообразная<br>" +
                "ширина городских магистралей и улиц, отсутствие существующих подземных сооружений,<br>" +
                "опорных зелёных насаждений и покрытий дорог. Контур картограммы земляных работ<br>" +
                "простой. Объёмы замляных работ незначительные;</html>");
        final JRadioButton radioButtonLandDevDraws2 = new JRadioButton("<html>2 - малозастроенная территория, рельеф " +
                "местности резко выраженный, наличие<br>" +
                "неправильного контура территории, расположение проектируемой территории<br>" +
                "вблизи центра города (жилого района, микрорайона), разнообразная ширина<br>" +
                "магистралей и улиц, наличие существующих подземных сооружений и опорных<br>" +
                "зелёных насаждений. Сеть дорог имеет искусственные покрытия. Контур картограммы<br>" +
                "земляных работ сложный. Объёмы земляных работ значительные;</html>");
        final JRadioButton radioButtonLandDevDraws3 = new JRadioButton("<html>3 - территория с большой опорной застройкой," +
                " резко пересечённая территория с<br>" +
                "оврагами, поймами рек и карьерами или слабовыраженный рельеф местности с<br>" +
                "поверхностными водостоками и замкнутыми территориями, контур территории<br>" +
                "криволинейного очертания, менябщаяся и разнообразная ширина магистралей<br>" +
                "и улиц, наличие развитой сети подземных сооружений и дорог, опорных зелёных<br>" +
                "насаждений. Контур картограммы земляных работ криволинейный. Объёмы земляных<br>" +
                "работ большие.</html>");

        boxLandDevDraws.add(radioButtonLandDevDraws1);
        boxLandDevDraws.add(radioButtonLandDevDraws2);
        boxLandDevDraws.add(radioButtonLandDevDraws3);

        boxLandDevDraws1.add(checkBox1For14);
        boxLandDevDraws1.add(checkBox2For14);
        boxLandDevDraws1.add(checkBox3For14);

        boxLandDevDrawsPerc.add(percCheckBox1For14);
        boxLandDevDrawsPerc.add(percCheckBox2For14);
        boxLandDevDrawsPerc.add(percCheckBox3For14);
        boxLandDevDrawsPerc.add(percCheckBox4For14);
        boxLandDevDrawsPerc.add(percCheckBox5For14);

        card14.add(boxLandDevDraws);
        card14.add(boxLandDevDraws1);
        card14.add(boxLandDevDrawsPerc);
        card14.add(buttonLandDevDraws);

        checkBox1For14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For14.isSelected()) {
                    coef1 = 0.7;
                } else coef1 = 1;
            }
        });
        checkBox2For14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For14.isSelected()) {
                    coef2 = 0.6;
                } else coef2 = 1;
            }
        });
        checkBox3For14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For14.isSelected()) {
                    coef3 = 0.8;
                } else coef3 = 1;
            }
        });

        percCheckBox1For14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox1For14.isSelected()) {
                    percent += 0.21;
                } else percent -= 0.21;
            }
        });
        percCheckBox2For14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox2For14.isSelected()) {
                    percent += 0.47;
                } else percent -= 0.47;
            }
        });
        percCheckBox3For14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox3For14.isSelected()) {
                    percent += 0.1;
                } else percent -= 0.1;
            }
        });
        percCheckBox4For14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox4For14.isSelected()) {
                    percent += 0.16;
                } else percent -= 0.16;
            }
        });
        percCheckBox5For14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox5For14.isSelected()) {
                    percent += 0.06;
                } else percent -= 0.06;
            }
        });
        radioButtonLandDevDraws1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer14 = 1;
            }
        });
        radioButtonLandDevDraws2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer14 = 2;
            }
        });
        radioButtonLandDevDraws3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer14 = 3;
            }
        });
        buttonLandDevDraws.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LandDevStageWorkingDrawsTable7(answer14, percent, coef1, coef2, coef3).setVisible(true);
            }
        });

        JPanel card15 = new JPanel();

        Box boxLandDevTech = Box.createVerticalBox();
        Box boxLandDevTech1 = Box.createVerticalBox();
        Box boxLandDevTechPerc = Box.createVerticalBox();
        boxLandDevTech.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2></html>"));
        boxLandDevTech1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));
        boxLandDevTechPerc.setBorder(new TitledBorder("<html><h2>Состав работ и удельный вес в %:</h2></html>"));

        JButton buttonLandDevTech = new JButton("Рассчитать");

        final JRadioButton radioButtonLandDevTech1 = new JRadioButton("<html>1 - свободная от застройки территория при " +
                "спокойном рельефе местности,<br>" +
                "геометрически правильный контур территории, расположение проектируемой<br>" +
                "территории вне центра города (жилого района). Однообразная ширина<br>" +
                "магистралей и улиц, отсутствие существующих подземных сооружений,<br>" +
                "опорных зелёных насаждений и покрытий дорог. Контур картограммы простой.<br>" +
                "Объёмы земляных работ незначительные.</html>");
        final JRadioButton radioButtonLandDevTech2 = new JRadioButton("<html>2 - мало застроенная территория, рельеф " +
                "местности имеет значительные уклоны,<br>" +
                "наличие неправильного контура территории, расположение проектируемой<br>" +
                "территории вблизи центра города (жилого района, микрорайона),<br>" +
                "разнообразная ширина магистралей и улиц, наличие существующих подземных<br>" +
                "сооружений и опорных насаждений. Дорожные покрытия - однотипные. Контур<br>" +
                "картограммы - сложный. Объёмы земляных работ - значительные.</html>");
        final JRadioButton radioButtonLandDevTech3 = new JRadioButton("<html>3 - территория с большой опорной застройкой," +
                " резко пересечённая территория<br>" +
                "оврагами, поймами рек и карьерами, или слабовыраженный рельеф местности с<br>" +
                "затрудненными поверхностными водостоками и защитными территориями. Контур<br>" +
                "территории криволинейного очертания, меняющаяся и разнообразная ширина<br>" +
                "магистралей и улиц, наличие развитой сети подземных сооружений и дорог,<br>" +
                "опорных зелёных насаждений. Контур картограммы - криволинейный. Объёмы<br>" +
                "земляных работ большие.</html>");

        boxLandDevTech.add(radioButtonLandDevTech1);
        boxLandDevTech.add(radioButtonLandDevTech2);
        boxLandDevTech.add(radioButtonLandDevTech3);

        boxLandDevTech1.add(checkBox1For15);
        boxLandDevTech1.add(checkBox2For15);
        boxLandDevTech1.add(checkBox3For15);

        boxLandDevTechPerc.add(percCheckBox1For15);
        boxLandDevTechPerc.add(percCheckBox2For15);
        boxLandDevTechPerc.add(percCheckBox3For15);
        boxLandDevTechPerc.add(percCheckBox4For15);
        boxLandDevTechPerc.add(percCheckBox5For15);

        card15.add(boxLandDevTech);
        card15.add(boxLandDevTech1);
        card15.add(boxLandDevTechPerc);
        card15.add(buttonLandDevTech);

        checkBox1For15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For15.isSelected()) {
                    coef1 = 1.5;
                } else coef1 = 1;
            }
        });
        checkBox2For15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For15.isSelected()) {
                    coef2 = 0.7;
                } else coef2 = 1;
            }
        });
        checkBox3For15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For15.isSelected()) {
                    coef3 = 0.8;
                } else coef3 = 1;
            }
        });
        percCheckBox1For15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox1For15.isSelected()) {
                    percent += 0.20;
                } else percent -= 0.20;
            }
        });
        percCheckBox2For15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox2For15.isSelected()) {
                    percent += 0.35;
                } else percent -= 0.35;
            }
        });
        percCheckBox3For15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox3For15.isSelected()) {
                    percent += 0.20;
                } else percent -= 0.20;
            }
        });
        percCheckBox4For15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox4For15.isSelected()) {
                    percent += 0.18;
                } else percent -= 0.18;
            }
        });
        percCheckBox5For15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (percCheckBox5For15.isSelected()) {
                    percent += 0.07;
                } else percent -= 0.07;
            }
        });

        radioButtonLandDevTech1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer15 = 1;
            }
        });
        radioButtonLandDevTech2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer15 = 2;
            }
        });
        radioButtonLandDevTech3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer15 = 3;
            }
        });
        buttonLandDevTech.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LandDevStageTechProject6(answer15, percent, coef1, coef2, coef3).setVisible(true);
            }
        });

        JPanel card16 = new JPanel();

        String textTechProjectHousePlansMore = "<html> Разработка планов, фасадов и разрезов зданий<br>" +
                "и сооружений</html>";

        Box boxTechProjectHousePlansMore = Box.createVerticalBox();
        Box boxTechProjectHousePlansMore1 = Box.createVerticalBox();
        boxTechProjectHousePlansMore.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2></html>"));
        boxTechProjectHousePlansMore1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));

        JButton buttonTechProjectHousePlansMore = new JButton("Рассчитать");

        final JRadioButton radioButtonTechProjectHousePlansMore1 = new JRadioButton("<html>1 - планы прямоугольной " +
                "конфигурации с однотипными помещениями;</html>");
        final JRadioButton radioButtonTechProjectHousePlansMore2 = new JRadioButton("<html>2 - планы различной конфигурации " +
                "с выступающими частями; с разнотипными помещениями;</html>");
        final JRadioButton radioButtonTechProjectHousePlansMore3 = new JRadioButton("<html>3 - планы сложной конфигурации," +
                " криволинейного очертания стен или выступающих<br>" +
                "частей; с разнотипными помещениями, значительно отличающимися по конфигурации,<br>" +
                "габаритам и назначению.</html>");

        boxTechProjectHousePlansMore.add(radioButtonTechProjectHousePlansMore1);
        boxTechProjectHousePlansMore.add(radioButtonTechProjectHousePlansMore2);
        boxTechProjectHousePlansMore.add(radioButtonTechProjectHousePlansMore3);
        boxTechProjectHousePlansMore1.add(checkBox1For16);
        boxTechProjectHousePlansMore1.add(checkBox1For16);
        boxTechProjectHousePlansMore1.add(checkBox2For16);
        boxTechProjectHousePlansMore1.add(checkBox3For16);
        boxTechProjectHousePlansMore1.add(checkBox4For16);
        boxTechProjectHousePlansMore1.add(checkBox5For16);
        boxTechProjectHousePlansMore1.add(checkBox6For16);
        card16.add(boxTechProjectHousePlansMore);
        card16.add(boxTechProjectHousePlansMore1);
        card16.add(buttonTechProjectHousePlansMore);
        radioButtonTechProjectHousePlansMore1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer16 = 1;
            }
        });
        radioButtonTechProjectHousePlansMore2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer16 = 2;
            }
        });
        radioButtonTechProjectHousePlansMore3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer16 = 3;
            }
        });
        checkBox1For16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For16.isSelected()) {
                    coef1 = 1.3;
                } else coef1 = 1;
            }
        });
        checkBox2For16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For16.isSelected()) {
                    coef1 = 1.2;
                } else coef1 = 1;
            }
        });
        checkBox3For16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For16.isSelected()) {
                    coef1 = 1;
                } else coef1 = 1;
            }
        });
        checkBox4For16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox4For16.isSelected()) {
                    coef1 = 0.9;
                } else coef1 = 1;
            }
        });
        checkBox5For16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox5For16.isSelected()) {
                    coef1 = 0.8;
                } else coef1 = 1;
            }
        });
        checkBox6For16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox6For16.isSelected()) {
                    coef1 = 0.7;
                } else coef1 = 1;
            }
        });
        buttonTechProjectHousePlansMore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TechProjectHousePlansMoreTable11(answer16, coef1, coef2, coef3, coef4, coef5, coef6).setVisible(true);
            }
        });

        JPanel card17 = new JPanel();

        Box boxTechUpTo = Box.createVerticalBox();
        Box boxTechUpTo1 = Box.createVerticalBox();
        boxTechUpTo.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2><html>"));
        boxTechUpTo1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));

        JButton buttonTechUpTo = new JButton("Рассчитать");

        final JRadioButton radioButtonTechUpTo1 = new JRadioButton("<html>1 - планы прямоугольной конфигурации с " +
                "однотипными помещениями;</html>");
        final JRadioButton radioButtonTechUpTo2 = new JRadioButton("<html>2 - планы различной конфигурации с выступающими " +
                "частями; с разнотипными помещениями;</html>");
        final JRadioButton radioButtonTechUpTo3 = new JRadioButton("<html>3 - планы сложной конфигурации, криволинейного" +
                " очертания стен или выступающих<br>" +
                "частей; с разнотипными помещениями, значительно отличающимися по конфигурации,<br>" +
                "габаритам и назначению.</html>");

        boxTechUpTo.add(radioButtonTechUpTo1);
        boxTechUpTo.add(radioButtonTechUpTo2);
        boxTechUpTo.add(radioButtonTechUpTo3);
        boxTechUpTo1.add(checkBox1For17);
        boxTechUpTo1.add(checkBox2For17);
        boxTechUpTo1.add(checkBox3For17);
        boxTechUpTo1.add(checkBox4For17);
        card17.add(boxTechUpTo);
        card17.add(boxTechUpTo1);
        card17.add(buttonTechUpTo);

        radioButtonTechUpTo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer17 = 1;
            }
        });
        radioButtonTechUpTo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer17 = 2;
            }
        });
        radioButtonTechUpTo3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer17 = 3;
            }
        });
        checkBox1For17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For17.isSelected()) {
                    coef1 = 1.1;
                } else coef1 = 1;
            }
        });
        checkBox2For17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For17.isSelected()) {
                    coef2 = 1.2;
                } else coef2 = 1;
            }
        });
        checkBox3For17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For17.isSelected()) {
                    coef3 = 1.5;
                } else coef3 = 1;
            }
        });

        checkBox4For17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox4For17.isSelected()) {
                    coef4 = 0.3;
                } else coef4 = 1;
            }
        });
        buttonTechUpTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TechProjectHousePlansUpToTable9(answer17, coef1, coef2, coef3, coef4).setVisible(true);
            }
        });

        JPanel card18 = new JPanel();


        Box boxWorkDrawsMore = Box.createVerticalBox();
        boxWorkDrawsMore.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2></html>"));

        JButton buttonWorkDrawsMore = new JButton("Рассчитать");
        final JRadioButton radioButtonWorkDrawsMore1 = new JRadioButton("<html>1 - планы прямоугольной конфигурации с " +
                "однотипными помещениями;</html>");
        final JRadioButton radioButtonWorkDrawsMore2 = new JRadioButton("<html>2 - планы различной конфигурации с " +
                "выступающими частями; с разнотипными помещениями;</html>");
        final JRadioButton radioButtonWorkDrawsMore3 = new JRadioButton("<html>3 - планы сложной конфигурации, криволинейного очертания стен или выступающих<br>" +
                "частей; с разнотипными помещениями, значительно отличающимися по конфигурации,<br>" +
                "габаритам и назначению.</html>");

        boxWorkDrawsMore.add(radioButtonWorkDrawsMore1);
        boxWorkDrawsMore.add(radioButtonWorkDrawsMore2);
        boxWorkDrawsMore.add(radioButtonWorkDrawsMore3);
        card18.add(boxWorkDrawsMore);
        card18.add(buttonWorkDrawsMore);
        radioButtonWorkDrawsMore1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer18 = 1;
            }
        });
        radioButtonWorkDrawsMore2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer18 = 2;
            }
        });
        radioButtonWorkDrawsMore3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer18 = 3;
            }
        });
        buttonWorkDrawsMore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WorkDrawsHousePlansMoreTable12(answer18).setVisible(true);
            }
        });

        JPanel card19 = new JPanel();

        Box boxWorkDrawsUpTo = Box.createVerticalBox();
        boxWorkDrawsUpTo.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2></html>"));

        JButton buttonWorkDrawsUpTo = new JButton("Рассчитать");

        final JRadioButton radioButtonWorkDrawsUpTo1 = new JRadioButton("<html>1 - планы прямоугольной конфигурации с " +
                "однотипными помещениями;</html>");
        final JRadioButton radioButtonWorkDrawsUpTo2 = new JRadioButton("<html>2 - планы различной конфигурации с " +
                "выступающими частями; с разнотипными помещениями;</html>");
        final JRadioButton radioButtonWorkDrawsUpTo3 = new JRadioButton("<html>3 - планы сложной конфигурации, криволинейного " +
                "очертания стен или выступающих<br>" +
                "частей; с разнотипными помещениями, значительно отличающимися по конфигурации,<br>" +
                "габаритам и назначению.</html>");

        boxWorkDrawsUpTo.add(radioButtonWorkDrawsUpTo1);
        boxWorkDrawsUpTo.add(radioButtonWorkDrawsUpTo2);
        boxWorkDrawsUpTo.add(radioButtonWorkDrawsUpTo3);
        card19.add(boxWorkDrawsUpTo);
        card19.add(buttonWorkDrawsUpTo);
        radioButtonWorkDrawsUpTo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer19 = 1;
            }
        });
        radioButtonWorkDrawsUpTo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer19 = 2;
            }
        });
        radioButtonWorkDrawsUpTo3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer19 = 3;
            }
        });
        buttonWorkDrawsUpTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WorkDrawsHousePlansUpToTable10(answer19).setVisible(true);
            }
        });

        JPanel card20 = new JPanel();

        Box boxTechProjFacadesMore = Box.createVerticalBox();
        Box boxTechProjFacadesMore1 = Box.createVerticalBox();
        boxTechProjFacadesMore.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2><html>"));
        boxTechProjFacadesMore1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));

        JButton buttonTechProjFacadesMore = new JButton("Рассчитать");

        final JRadioButton radioButtonTechProjFacadesMore1 = new JRadioButton("<html>1 - фасады с малой насыщенностью архитектурными" +
                " деталями, с проемами без обрамления;</html>");
        final JRadioButton radioButtonTechProjFacadesMore2 = new JRadioButton("<html>2 - фасады, насыщенные деталями " +
                "(эркерами, балконами, лоджиями, поясами, сандриками,<br>" +
                "колоннами, пилястрами, фронтонами), и с обрамленными проемами.</html>");

        boxTechProjFacadesMore.add(radioButtonTechProjFacadesMore1);
        boxTechProjFacadesMore.add(radioButtonTechProjFacadesMore2);
        boxTechProjFacadesMore1.add(checkBox1For20);
        boxTechProjFacadesMore1.add(checkBox2For20);
        boxTechProjFacadesMore1.add(checkBox3For20);
        boxTechProjFacadesMore1.add(checkBox4For20);
        boxTechProjFacadesMore1.add(checkBox5For20);
        boxTechProjFacadesMore1.add(checkBox6For20);
        card20.add(boxTechProjFacadesMore);
        card20.add(boxTechProjFacadesMore1);
        card20.add(buttonTechProjFacadesMore);
        radioButtonTechProjFacadesMore1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer20 = 1;
            }
        });
        radioButtonTechProjFacadesMore2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer20 = 2;
            }
        });
        checkBox1For20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For20.isSelected()) {
                    coef1 = 1.3;
                } else coef1 = 1;
            }
        });
        checkBox2For20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For20.isSelected()) {
                    coef1 = 1.2;
                } else coef1 = 1;
            }
        });
        checkBox3For20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For20.isSelected()) {
                    coef1 = 1;
                } else coef1 = 1;
            }
        });
        checkBox4For20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox4For20.isSelected()) {
                    coef1 = 0.9;
                } else coef1 = 1;
            }
        });
        checkBox5For20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox5For20.isSelected()) {
                    coef1 = 0.8;
                } else coef1 = 1;
            }
        });
        checkBox6For20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox6For20.isSelected()) {
                    coef1 = 0.7;
                } else coef1 = 1;
            }
        });
        buttonTechProjFacadesMore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TechProjectFacadesHouseMoreTable15(answer20, coef1, coef2, coef3, coef4, coef5, coef6).setVisible(true);
            }
        });

        JPanel card21 = new JPanel();

        Box boxTechProjFacadesUpTo = Box.createVerticalBox();
        Box boxTechProjFacadesUpTo1 = Box.createVerticalBox();
        boxTechProjFacadesUpTo.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2><html>"));
        boxTechProjFacadesUpTo1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));

        JButton buttonTechProjFacadesUpTo = new JButton("Рассчитать");

        final JRadioButton radioButtonTechProjFacadesUpTo1 = new JRadioButton("<html>1 - фасады с малой насыщенностью архитектурными" +
                "деталями, с проемами без обрамления;</html>");
        final JRadioButton radioButtonTechProjFacadesUpTo2 = new JRadioButton("<html>2 - фасады, насыщенные деталями (эркерами," +
                "балконами, лоджиями, поясами, сандриками,<br>" +
                "колоннами, пилястрами, фронтонами), и с обрамленными проемами.</html>");

        boxTechProjFacadesUpTo.add(radioButtonTechProjFacadesUpTo1);
        boxTechProjFacadesUpTo.add(radioButtonTechProjFacadesUpTo2);
        boxTechProjFacadesUpTo1.add(checkBox1For21);
        boxTechProjFacadesUpTo1.add(checkBox2For21);
        card21.add(boxTechProjFacadesUpTo);
        card21.add(boxTechProjFacadesUpTo1);
        card21.add(buttonTechProjFacadesUpTo);

        radioButtonTechProjFacadesUpTo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer21 = 1;
            }
        });
        radioButtonTechProjFacadesUpTo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer21 = 2;
            }
        });
        checkBox1For21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For21.isSelected()) {
                    coef1 = 1.2;
                } else coef1 = 1;
            }
        });
        checkBox2For21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For21.isSelected()) {
                    coef2 = 1.1;
                } else coef2 = 1;
            }
        });
        buttonTechProjFacadesUpTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TechProjectFacadesHouseUpToTable13(answer21, coef1, coef2).setVisible(true);
            }
        });

        JPanel card22 = new JPanel();

        Box boxWorkDrawsFascadesMore = Box.createVerticalBox();
        boxWorkDrawsFascadesMore.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2><html>"));

        JButton buttonWorkDrawsFascadesMore = new JButton("Рассчитать");

        final JRadioButton radioButtonWorkDrawsFascadesMore1 = new JRadioButton("<html>1 - фасады с малой насыщенностью " +
                "архитектурными деталями, с проемами без обрамления;</html>");
        final JRadioButton radioButtonWorkDrawsFascadesMore2 = new JRadioButton("<html>2 - фасады, насыщенные деталями " +
                "(эркерами, балконами, лоджиями, поясами, сандриками,<br>" +
                "колоннами, пилястрами, фронтонами), и с обрамленными проемами.</html>");
        boxWorkDrawsFascadesMore.add(radioButtonWorkDrawsFascadesMore1);
        boxWorkDrawsFascadesMore.add(radioButtonWorkDrawsFascadesMore2);

        card22.add(boxWorkDrawsFascadesMore);
        card22.add(buttonWorkDrawsFascadesMore);

        radioButtonWorkDrawsFascadesMore1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer22 = 1;
            }
        });
        radioButtonWorkDrawsFascadesMore2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer22 = 2;
            }
        });
        buttonWorkDrawsFascadesMore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WorkDrawsFacadesHouseMoreTable16(answer22).setVisible(true);
            }
        });

        JPanel card23 = new JPanel();

        Box boxWorkDrawsFascadesUpTo = Box.createVerticalBox();
        Box boxWorkDrawsFascadesUpTo1 = Box.createVerticalBox();
        boxWorkDrawsFascadesUpTo.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2></html>"));
        boxWorkDrawsFascadesUpTo1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы<h2></html>"));

        JButton buttonWorkDrawsFascadesUpTo = new JButton("Рассчитать");

        final JRadioButton radioButtonWorkDrawsFascadesUpTo1 = new JRadioButton("<html>1 - фасады с малой насыщенностью " +
                "архитектурными деталями, с проемами без обрамления;</html>");
        final JRadioButton radioButtonWorkDrawsFascadesUpTo2 = new JRadioButton("<html>1 - фасады, насыщенные деталями " +
                "(эркерами, балконами, лоджиями, поясами, сандриками,<br>" +
                "колоннами, пилястрами, фронтонами), и с обрамленными проемами.</html>");


        boxWorkDrawsFascadesUpTo.add(radioButtonWorkDrawsFascadesUpTo1);
        boxWorkDrawsFascadesUpTo.add(radioButtonWorkDrawsFascadesUpTo2);
        boxWorkDrawsFascadesUpTo1.add(checkBox1For23);
        boxWorkDrawsFascadesUpTo1.add(checkBox2For23);

        card23.add(boxWorkDrawsFascadesUpTo);
        card23.add(boxWorkDrawsFascadesUpTo1);
        card23.add(buttonWorkDrawsFascadesUpTo);

        radioButtonWorkDrawsFascadesUpTo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer23 = 1;
            }
        });
        radioButtonWorkDrawsFascadesUpTo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer23 = 2;
            }
        });
        checkBox1For23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For23.isSelected()) {
                    coef1 = 1.2;
                } else coef1 = 1;
            }
        });
        checkBox2For23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For23.isSelected()) {
                    coef2 = 1.1;
                } else coef2 = 1;
            }
        });
        buttonWorkDrawsFascadesUpTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WorkDrawsFacadesHouseUpToTable14(answer23, coef1, coef2).setVisible(true);
            }
        });

        JPanel card24 = new JPanel();

        Box boxTechSelectionMore = Box.createVerticalBox();
        Box boxTechSelectionMore1 = Box.createVerticalBox();
        Box boxTechSelectionMore2 = Box.createVerticalBox();

        boxTechSelectionMore.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2><h2>"));
        boxTechSelectionMore1.setBorder(new TitledBorder("<html><h2>Дополнительные работы</h2><h2>"));
        boxTechSelectionMore2.setBorder(new TitledBorder("<html>К норме № 220</html>"));

        JButton buttonTechSelectionMore = new JButton("Рассчитать");

        final JRadioButton radioButtonTechSelectionMore1 = new JRadioButton("<html>1 - разрезы по зданию простого очертания " +
                "без выступающих объёмов с небольшим количеством<br>" +
                "перегородок;<br></html>");
        final JRadioButton radioButtonTechSelectionMore2 = new JRadioButton("<html>2 - разрезы по зданиям различной " +
                "конфигурации, с помещениями разными по высоте, разрезы<br>" +
                "по лестничным клеткам;<br></html>");
        final JRadioButton radioButtonTechSelectionMore3 = new JRadioButton("<html>3 - сложные разрезы по зданиям с различными " +
                "высотами; с большим количеством выступающих<br>" +
                "объёмов, наличием подвалов, сложная конструкция кровли.</html>");

        boxTechSelectionMore1.add(checkBox1For24);
        boxTechSelectionMore1.add(checkBox2For24);
        boxTechSelectionMore1.add(checkBox3For24);
        boxTechSelectionMore1.add(checkBox4For24);
        boxTechSelectionMore1.add(checkBox5For24);
        boxTechSelectionMore1.add(checkBox6For24);
        boxTechSelectionMore2.add(checkBox7For24);
        boxTechSelectionMore2.add(checkBox8For24);
        boxTechSelectionMore.add(radioButtonTechSelectionMore1);
        boxTechSelectionMore.add(radioButtonTechSelectionMore2);
        boxTechSelectionMore.add(radioButtonTechSelectionMore3);

        card24.add(boxTechSelectionMore);
        card24.add(boxTechSelectionMore1);
        card24.add(boxTechSelectionMore2);
        card24.add(buttonTechSelectionMore);
        checkBox1For24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For24.isSelected()) {
                    coef1 = 1.3;
                } else coef1 = 1;
            }
        });
        checkBox2For24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For24.isSelected()) {
                    coef2 = 1.2;
                } else coef2 = 1;
            }
        });
        checkBox3For24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For24.isSelected()) {
                    coef3 = 1;
                } else coef3 = 1;
            }
        });
        checkBox4For24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox4For24.isSelected()) {
                    coef4 = 0.9;
                } else coef4 = 1;
            }
        });
        checkBox5For24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox5For24.isSelected()) {
                    coef5 = 0.8;
                } else coef5 = 1;
            }
        });
        checkBox6For24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox6For24.isSelected()) {
                    coef6 = 0.7;
                } else coef6 = 1;
            }
        });
        checkBox7For24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox7For24.isSelected()) {
                    coef7 = 0.3;
                } else coef7 = 1;
            }
        });
        checkBox8For24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox8For24.isSelected()) {
                    coef8 = 0.2;
                } else coef8 = 1;
            }
        });
        radioButtonTechSelectionMore1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer24 = 1;
            }
        });
        radioButtonTechSelectionMore2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer24 = 2;
            }
        });
        radioButtonTechSelectionMore3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer24 = 3;
            }
        });
        buttonTechSelectionMore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TechProjectSectionHouseMoreTable(answer24, coef1, coef2, coef3, coef4, coef5, coef6, coef7, coef8)
                        .setVisible(true);
            }
        });

        JPanel card25 = new JPanel();

        Box boxTechSelectionUpTo = Box.createVerticalBox();
        boxTechSelectionUpTo.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2></html>"));

        JButton buttonTechSelectionUpTo = new JButton("Рассчитать");

        final JRadioButton radioButtonTechSelectionUpTo1 = new JRadioButton("<html>1 - разрезы по зданию простого " +
                "очертания без выступающих объёмов с небольшим количеством<br>" +
                "перегородок;<br></html>");
        final JRadioButton radioButtonTechSelectionUpTo2 = new JRadioButton("<html>2 - разрезы по зданиям различной " +
                "конфигурации, с помещениями разными по высоте, разрезы<br>" +
                "по лестничным клеткам;<br></html>");
        final JRadioButton radioButtonTechSelectionUpTo3 = new JRadioButton("<html>3 - сложные разрезы по зданиям с " +
                "различными высотами; с большим количеством выступающих<br>" +
                "объёмов, наличием подвалов, сложная конструкция кровли.</html>");

        boxTechSelectionUpTo.add(radioButtonTechSelectionUpTo1);
        boxTechSelectionUpTo.add(radioButtonTechSelectionUpTo2);
        boxTechSelectionUpTo.add(radioButtonTechSelectionUpTo3);

        card25.add(boxTechSelectionUpTo);
        card25.add(buttonTechSelectionUpTo);

        radioButtonTechSelectionUpTo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer25 = 1;
            }
        });
        radioButtonTechSelectionUpTo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer25 = 2;
            }
        });
        radioButtonTechSelectionUpTo3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer25 = 3;
            }
        });
        buttonTechSelectionUpTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TechProjectSectionHouseUpToTable(answer25).setVisible(true);
            }
        });

        JPanel card26 = new JPanel();

        Box boxDrawsSelectionMore = Box.createVerticalBox();
        Box boxDrawsSelectionMore1 = Box.createVerticalBox();
        boxDrawsSelectionMore.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2></html>"));
        boxDrawsSelectionMore1.setBorder(new TitledBorder("К норме № 222"));

        JButton buttonForDrawsSelectionMore = new JButton("Рассчитать");

        final JRadioButton DrawsSelectionMoreRadioButton1 = new JRadioButton("<html>1 - разрезы по зданию простого очертания без " +
                "выступающих объёмов с небольшим количеством<br>" +
                "перегородок;<br></html>");
        final JRadioButton DrawsSelectionMoreRadioButton2 = new JRadioButton("<html>2 - разрезы по зданиям различной " +
                "конфигурации, с помещениями разными по высоте, разрезы<br>" +
                "по лестничным клеткам;<br></html>");
        final JRadioButton DrawsSelectionMoreRadioButton3 = new JRadioButton("<html>3 - сложные разрезы по зданиям с различными " +
                "высотами; с большим количеством выступающих<br>" +
                "объёмов, наличием подвалов, сложная конструкция кровли.</html>");

        boxDrawsSelectionMore.add(DrawsSelectionMoreRadioButton1);
        boxDrawsSelectionMore.add(DrawsSelectionMoreRadioButton2);
        boxDrawsSelectionMore.add(DrawsSelectionMoreRadioButton3);

        boxDrawsSelectionMore1.add(checkBox1For26);
        boxDrawsSelectionMore1.add(checkBox2For26);
        boxDrawsSelectionMore1.add(checkBox3For26);

        card26.add(boxDrawsSelectionMore);
        card26.add(boxDrawsSelectionMore1);
        card26.add(buttonForDrawsSelectionMore);

        DrawsSelectionMoreRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer26 = 1;
            }
        });
        DrawsSelectionMoreRadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer26 = 2;
            }
        });
        DrawsSelectionMoreRadioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer26 = 3;
            }
        });
        checkBox1For26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For26.isSelected()) {
                    coef1 = 0.5;
                } else coef1 = 1;
            }
        });
        checkBox2For26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For26.isSelected()) {
                    coef2 = 0.3;
                } else coef2 = 1;
            }
        });

        checkBox3For26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For26.isSelected()) {
                    coef3 = 0.2;
                } else coef3 = 1;
            }
        });
        buttonForDrawsSelectionMore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WorkDrawsSelectionHouseMoreTable(answer26, coef1, coef2, coef3).setVisible(true);
            }
        });

        JPanel card27 = new JPanel();

        Box boxDrawsSelectionUpTo = Box.createVerticalBox();
        Box boxDrawsSelectionUpTo1 = Box.createVerticalBox();

        boxDrawsSelectionUpTo.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2></html>"));

        JButton buttonDrawsSelectionUpTo = new JButton("Рассчитать");

        final JRadioButton radioButtonDrawsSelectionUpTo1 = new JRadioButton("<html>1 - разрезы по зданию простого " +
                "очертания без выступающих объёмов с небольшим количеством<br>" +
                "перегородок;<br></html>");
        final JRadioButton radioButtonDrawsSelectionUpTo2 = new JRadioButton("<html>2 - разрезы по зданиям различной " +
                "конфигурации, с помещениями разными по высоте, разрезы<br>" +
                "по лестничным клеткам;<br></html>");
        final JRadioButton radioButtonDrawsSelectionUpTo3 = new JRadioButton("<html>3 - сложные разрезы по зданиям с " +
                "различными высотами; с большим количеством выступающих<br>" +
                "объёмов, наличием подвалов, сложная конструкция кровли.</html>");

        boxDrawsSelectionUpTo.add(radioButtonDrawsSelectionUpTo1);
        boxDrawsSelectionUpTo.add(radioButtonDrawsSelectionUpTo2);
        boxDrawsSelectionUpTo.add(radioButtonDrawsSelectionUpTo3);
        card27.add(boxDrawsSelectionUpTo);
        card27.add(boxDrawsSelectionUpTo1);
        card27.add(buttonDrawsSelectionUpTo);

        radioButtonDrawsSelectionUpTo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer27 = 1;
            }
        });
        radioButtonDrawsSelectionUpTo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer27 = 2;
            }
        });
        radioButtonDrawsSelectionUpTo3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer27 = 3;
            }
        });
        buttonDrawsSelectionUpTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WorkDrawsSelectionHouseUpToTable(answer27).setVisible(true);
            }
        });

        JPanel card28 = new JPanel();

        Box boxArchiDetPatterns = Box.createVerticalBox();
        Box boxArchiDetPatterns1 = Box.createVerticalBox();
        boxArchiDetPatterns.setBorder(new TitledBorder("<html><h2>Характеристика категории сложности</h2></html>"));
        boxArchiDetPatterns1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));

        JButton buttonArchiDetPatterns = new JButton("Рассчитать");

        final JRadioButton radioButtonArchiDetPatterns1 = new JRadioButton("<html>1 - детали простого оформления и " +
                "несложного рисунка, с небольшим членением и<br>" +
                "прямоугольными тягами (плафоны аванвестибюля, фойе при ярусах, курительных,<br>" +
                "артистических помещений и др.), шаблоны несложного профиля, с небольшим<br>" +
                "членением и простой прорисовкой;</html>");
        final JRadioButton radioButtonArchiDetPatterns2 = new JRadioButton("<html>2 - детали средней сложности, различного" +
                " очертания с повторяющимся членением,<br>" +
                "с прорисовкой (плафоны главного фойе, главного вестибюля и парадных лестниц),<br>" +
                "шаблоны различного очертания, с криволинейным профилем, с орнаментовкой<br>" +
                "и лепкой;<br></html>");
        final JRadioButton radioButtonArchiDetPatterns3 = new JRadioButton("<html>3 - детали различного членения и очертания" +
                " со сложной прорисовкой, с профилями<br>" +
                "неодинакового членения, с барельефами и лепкой(плафоны зрительного зала), шаблоны<br>" +
                "особого сложного профиля, индивидуального характера, различного очертания с<br>" +
                "высокохудожественной прорисовкой.</html>");


        boxArchiDetPatterns.add(radioButtonArchiDetPatterns1);
        boxArchiDetPatterns.add(radioButtonArchiDetPatterns2);
        boxArchiDetPatterns.add(radioButtonArchiDetPatterns3);

        boxArchiDetPatterns1.add(checkBox1For28);

        card28.add(boxArchiDetPatterns);
        card28.add(boxArchiDetPatterns1);
        card28.add(buttonArchiDetPatterns);
        checkBox1For28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For28.isSelected()) {
                    coef1 = 0.6;
                } else coef1 = 1;
            }
        });
        radioButtonArchiDetPatterns1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer28 = 1;
            }
        });
        radioButtonArchiDetPatterns2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer28 = 2;
            }
        });
        radioButtonArchiDetPatterns3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer28 = 3;
            }
        });
        buttonArchiDetPatterns.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ArchiDetailsPatternsTable22(answer28, coef1).setVisible(true);
            }
        });

        JPanel card29 = new JPanel();

        Box boxFillingOpenVest = Box.createVerticalBox();
        Box boxFillingOpenVest1 = Box.createVerticalBox();
        boxFillingOpenVest.setBorder(new TitledBorder("<html><h2>Категория сложности</h2><html>"));
        boxFillingOpenVest1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2><html>"));

        JButton buttonFillingOpenVest = new JButton("Рассчитать");

        final JRadioButton radioButtonFillingOpenVest1 = new JRadioButton("<html>1 - несложные изделия с простой " +
                "профилировкой;</html>");
        final JRadioButton radioButtonFillingOpenVest2 = new JRadioButton("<html>2 - изделия средней сложности, с" +
                " индивидуальной проработкой<br>" +
                "отдельных узлов;</html>");
        final JRadioButton radioButtonFillingOpenVest3 = new JRadioButton("<html>3 - изделия по особо сложным схемам, с" +
                " индвидиуальной архитектурой<br>" +
                "и конструктивной проработкой всего элемента.</html>");

        boxFillingOpenVest.add(radioButtonFillingOpenVest1);
        boxFillingOpenVest.add(radioButtonFillingOpenVest2);
        boxFillingOpenVest.add(radioButtonFillingOpenVest3);

        boxFillingOpenVest1.add(checkBox1For29);
        boxFillingOpenVest1.add(checkBox2For29);
        boxFillingOpenVest1.add(checkBox3For29);
        boxFillingOpenVest1.add(checkBox4For29);

        card29.add(boxFillingOpenVest);
        card29.add(boxFillingOpenVest1);
        card29.add(buttonFillingOpenVest);

        checkBox1For29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For29.isSelected()) {
                    coef1 = 0.3;
                } else coef1 = 0.5;
            }
        });
        checkBox2For29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For29.isSelected()) {
                    coef2 = 0.5;
                } else coef2 = 1;
            }
        });
        checkBox3For29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For29.isSelected()) {
                    coef3 = 0.7;
                } else coef3 = 1.2;
            }
        });
        checkBox4For29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox4For29.isSelected()) {
                    coef4 = 1.2;
                } else coef4 = 1;
            }
        });

        radioButtonFillingOpenVest1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer29 = 1;
            }
        });
        radioButtonFillingOpenVest2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer29 = 2;
            }
        });
        radioButtonFillingOpenVest3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer29 = 3;
            }
        });
        buttonFillingOpenVest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FillingOpeningsVestibulesTable23(answer29, coef1, coef2, coef3, coef4).setVisible(true);
            }
        });

        JPanel card30 = new JPanel();

        Box boxFoundation = Box.createVerticalBox();
        Box boxFoundation1 = Box.createVerticalBox();
        boxFoundation.setBorder(new TitledBorder("<html><h2>Категория сложности</h2></html>"));
        boxFoundation1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));

        JButton buttonFoundation = new JButton("Рассчитать");

        final JRadioButton radioButtonFoundation1 = new JRadioButton("<html>1 - при центральной нагрузке;</html>");
        final JRadioButton radioButtonFoundation2 = new JRadioButton("<html>2 - при внецентренной нагрузке;</html>");
        final JRadioButton radioButtonFoundation3 = new JRadioButton("<html>3 - сложной формы с внецентренной нагрузкой,<br>" +
                "с перекрестными лентами и на свайных основаниях.</html>");

        boxFoundation.add(radioButtonFoundation1);
        boxFoundation.add(radioButtonFoundation2);
        boxFoundation.add(radioButtonFoundation3);

        boxFoundation1.add(checkBox1For30);
        boxFoundation1.add(checkBox2For30);

        card30.add(boxFoundation);
        card30.add(buttonFoundation);
        checkBox1For30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For30.isSelected()) {
                    coef1 = 0.4;
                } else coef1 = 1;
            }
        });
        checkBox2For30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For30.isSelected()) {
                    coef3 = 1.1;
                } else coef3 = 1;
            }
        });
        radioButtonFoundation1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer30 = 1;
                coef2 = 0.5;
            }
        });
        radioButtonFoundation2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer30 = 2;
                coef2 = 0.7;
            }
        });
        radioButtonFoundation3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer30 = 3;
                coef2 = 0.7;
            }
        });
        buttonFoundation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FoundationTable25(answer30, coef1, coef2, coef3).setVisible(false);
            }
        });

        JPanel card31 = new JPanel();

        Box boxSteelStruc = Box.createVerticalBox();
        boxSteelStruc.setBorder(new TitledBorder("<html><h2>Категория сложности</h2><html>"));

        JButton buttonSteelStruc = new JButton("Рассчитать");

        final JRadioButton radioButtonSteelStruc1 = new JRadioButton("<html>1 - каменные и бетонные подпорные стенки " +
                "высотой до 2 м, стены, столбы и<br>" +
                "простенки прямоугольного сечения с центральной нагрузкой, перемычки с <br>" +
                "простой нагрузкой, карнизы с выносом до 40 см;</html>");
        final JRadioButton radioButtonSteelStruc2 = new JRadioButton("<html>2 - каменные и бетонные подпорные стенки " +
                "высотой более 3м, железобетонные<br>" +
                "подборные стенки высотой до 3 м, стены, столбы и простенки с внецентренной<br>" +
                "нагрузкой или с центральной нагрузкой слонжого сечения, перемычки со<br>" +
                "сложной и арки с простой нагрузкой, карнизы с выносом до 70 см;</html>");
        final JRadioButton radioButtonSteelStruc3 = new JRadioButton("<html>3 - железобетонные подпорные стенки высотой" +
                " более 3 м, стены, столбы и<br>" +
                "простенки сложного сечения с внецентренной нагрузкой, арки со сложной<br>" +
                "нагрузкой, карнизы с выносом более 70 см.</html>");

        boxSteelStruc.add(radioButtonSteelStruc1);
        boxSteelStruc.add(radioButtonSteelStruc2);
        boxSteelStruc.add(radioButtonSteelStruc3);
        card31.add(boxSteelStruc);
        card31.add(buttonSteelStruc);
        radioButtonSteelStruc1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer31 = 1;
            }
        });
        radioButtonSteelStruc2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer31 = 2;
            }
        });
        radioButtonSteelStruc3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer31 = 3;
            }
        });
        buttonSteelStruc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SteelStructuresTable27(answer31).setVisible(false);
            }
        });

        JPanel card32 = new JPanel();

        Box boxStoneConcStruc = Box.createVerticalBox();
        Box boxStoneConcStruc1 = Box.createVerticalBox();
        boxStoneConcStruc.setBorder(new TitledBorder("<html><h2>Категория сложности</h2><html>"));
        boxStoneConcStruc1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2><html>"));

        JButton buttonStoneConcStruc = new JButton("Рассчитать");

        final JRadioButton radioButtonStoneConcStruc1 = new JRadioButton("<html>1 - однопролётные балки и прогоны с " +
                "простой нагрузкой, колонные простого<br>" +
                "сечения с центральной нагрузкой, колонны составного сечения с центральной<br>" +
                "нагрузкой до 80 т, треугольные и полигональные фермы пролётом до 10 м;</html>");
        final JRadioButton radioButtonStoneConcStruc2 = new JRadioButton("<html>2 - многопролётные балки и прогоны с " +
                "простой нагрузкой, однопролётные балки и<br>" +
                "прогоны со сложной нагрузкой, колонны простого сечения с внецентренной нагрузкой,<br>" +
                "колонны составного сечения с центральной нагрузкой до 160 т и с<br>" +
                "внецентренной нагрузкой до 80 т, треугольные и полигональные фермы с<br>" +
                "пролётом до 18 м, фермы криволинейного очертания пролётом до 10 м;</html>");
        final JRadioButton radioButtonStoneConcStruc3 = new JRadioButton("<html>3 - многопролётные балки и прогоны с " +
                "разными пролётами и сложными нагрузками,<br>" +
                "колонны составного сечения с внецентренной нагрузкой более 80 т, фермы<br>" +
                "криволинейного очертания пролётом до 15 м, треугольные и полигональные<br>" +
                "фермы пролётом более 18 м.</html>");

        boxStoneConcStruc.add(radioButtonStoneConcStruc1);
        boxStoneConcStruc.add(radioButtonStoneConcStruc2);
        boxStoneConcStruc.add(radioButtonStoneConcStruc3);

        boxStoneConcStruc1.add(checkBox1For32);

        card32.add(boxStoneConcStruc);
        card32.add(boxStoneConcStruc1);
        card32.add(buttonStoneConcStruc);
        checkBox1For32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For32.isSelected()) {
                    coef1 = 1.2;
                } else coef1 = 1;
            }
        });
        radioButtonStoneConcStruc1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer32 = 1;
            }
        });
        radioButtonStoneConcStruc2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer32 = 2;
            }
        });
        radioButtonStoneConcStruc3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer32 = 3;
            }
        });
        buttonStoneConcStruc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StoneConcreteStructuresTable26(answer32, coef1).setVisible(false);
            }
        });

        JPanel card33 = new JPanel();

        Box boxReinConcMonolith = Box.createVerticalBox();
        boxReinConcMonolith.setBorder(new TitledBorder("<html><h2>Категория сложности</h2></html>"));

        JButton buttonReinConcMonolith = new JButton("Рассчитать");

        final JRadioButton radioButtonReinConcMonolith1 = new JRadioButton("<html>1 - однопролётные и многопролётные " +
                "плиты с равными пролётами и простой нагрузкой,<br>" +
                "однопролётные балки и прогоны с простой нагрузкой, однопролётные балки и<br>" +
                "прогоны с просто нагрузкой, колонны с центральной нагрузкой;</html>");
        final JRadioButton radioButtonReinConcMonolith2 = new JRadioButton("<html>2 - многопролётные плиты со сложной " +
                "нагрузкой, многопролётные балки и прогоны с<br>" +
                "равными пролётами и простой нагрузкой, однопролётные балки и прогоны со сложной<br>" +
                "нагрузкой, колонны с внецентренной нагрузкой и в одной плоскости;</html>");
        final JRadioButton radioButtonReinConcMonolith3 = new JRadioButton("<html>3 - многопролётные балки и прогоны со " +
                "сложной нагрузкой, колонны сложного сечения<br>" +
                "с внецентренной нагрузкой в двух плоскостях.</html>");

        boxReinConcMonolith.add(radioButtonReinConcMonolith1);
        boxReinConcMonolith.add(radioButtonReinConcMonolith2);
        boxReinConcMonolith.add(radioButtonReinConcMonolith3);

        card33.add(boxReinConcMonolith);
        card33.add(buttonReinConcMonolith);
        radioButtonReinConcMonolith1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer33 = 1;
            }
        });
        radioButtonReinConcMonolith2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer33 = 2;
            }
        });
        radioButtonReinConcMonolith3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer33 = 3;
            }
        });
        buttonReinConcMonolith.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ReinforcedConcreteMonolithicStructuresTable28(answer33).setVisible(true);
            }
        });

        JPanel card34 = new JPanel();

        Box boxReinConcPrefab = Box.createVerticalBox();
        Box boxReinConcPrefab1 = Box.createVerticalBox();
        boxReinConcPrefab.setBorder(new TitledBorder("<html><h2>Категория сложности</h2><html>"));
        boxReinConcPrefab1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2><html>"));

        JButton buttonReinConcPrefab = new JButton("Рассчитать");

        final JRadioButton radioButtonReinConcPrefab1 = new JRadioButton("<html>1 - сборные элементы с простой нагрузкой," +
                " рассчитываемые как однопролётные<br>" +
                "конструкции;</html>");
        final JRadioButton radioButtonReinConcPrefab2 = new JRadioButton("<html>2 - сборные элементы с простой нагрузкой," +
                " рассчитываемые как статически<br>" +
                "неопределимые системы;</html>");
        final JRadioButton radioButtonReinConcPrefab3 = new JRadioButton("<html>3 - сборные элементы со сложной нагрузкой," +
                " рассчитываемые как статически<br>" +
                "неопределимые системы.</html>");

        boxReinConcPrefab.add(radioButtonReinConcPrefab1);
        boxReinConcPrefab.add(radioButtonReinConcPrefab2);
        boxReinConcPrefab.add(radioButtonReinConcPrefab3);

        boxReinConcPrefab1.add(checkBox1For34);

        card34.add(boxReinConcPrefab);
        card34.add(boxReinConcPrefab1);
        card34.add(buttonReinConcPrefab);

        checkBox1For34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For34.isSelected()) {
                    coef1 = 1.3;
                } else coef1 = 1;
            }
        });

        radioButtonReinConcPrefab1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer34 = 1;
            }
        });
        radioButtonReinConcPrefab2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer34 = 2;
            }
        });
        radioButtonReinConcPrefab3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer34 = 3;
            }
        });
        buttonReinConcPrefab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ReinforcedConcretePrefabricatedStructures29(answer34, coef1).setVisible(true);
            }
        });

        JPanel card35 = new JPanel();

        Box boxWoodenStruc = Box.createVerticalBox();
        boxWoodenStruc.setBorder(new TitledBorder("<html><h2>Категория сложности</h2></html>"));

        JButton buttonWoodenStruc = new JButton("Рассчитать");

        final JRadioButton radioButtonWoodenStruc1 = new JRadioButton("<html>1 - однотипные балки и прогоны с простой " +
                "нагрузкой, стойки и колонны простого<br>" +
                "сечения с центральной нагрузкой, фермы пролётом до 10 м, простые стыки, вырубки<br>" +
                "и сопряжения;</html>");
        final JRadioButton radioButtonWoodenStruc2 = new JRadioButton("<html>2 - многолролетные балки и прогоны с " +
                "различными пролетами я простой нагрузкой,<br>" +
                "однопролетные балки и прогоны со сложной нагрузкой, стойки простого сечения с<br>" +
                "внецентренной нагрузкой, треугольные и полигональные фермы пролетом от 10 до 18 м,<br>" +
                "фермы криволинейного очертания пролетом до 10 м, сложные стыки, врубки и сопряжения,<br>" +
                "элементы каркасов одноэтажных зданий;<br></html>");
        final JRadioButton radioButtonWoodenStruc3 = new JRadioButton("<html>3 - многопролетные балки и прогоны, с " +
                "равными пролетами и сложной нагрузкой, стойки<br>" +
                " сложного сечения с внецентренной нагрузкой, фермы криволинейного очертания пролетом<br>" +
                " от 10 до 18 м, фермы с нагельными и болтовыми сопряжениями, элементы каркасов для<br>" +
                "двухэтажных зданий, треугольные я полигональные фермы пролетом более 18 м.</html></html>");
        boxWoodenStruc.add(radioButtonWoodenStruc1);
        boxWoodenStruc.add(radioButtonWoodenStruc2);
        boxWoodenStruc.add(radioButtonWoodenStruc3);
        card35.add(boxWoodenStruc);
        card35.add(buttonWoodenStruc);
        radioButtonWoodenStruc1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer35 = 1;
            }
        });
        radioButtonWoodenStruc2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer35 = 2;
            }
        });
        radioButtonWoodenStruc3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer35 = 3;
            }
        });
        buttonWoodenStruc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WoodenStructuresTable30(answer35).setVisible(true);
            }
        });

        JPanel card36 = new JPanel();

        Box boxFoundFloorsRaft = Box.createVerticalBox();
        Box boxFoundFloorsRaft1 = Box.createVerticalBox();
        Box boxFoundFloorsRaft2 = Box.createVerticalBox();
        Box boxFoundFloorsRaft3 = Box.createVerticalBox();
        Box boxFoundFloorsRaft4 = Box.createVerticalBox();
        Box boxFoundFloorsRaft5 = Box.createVerticalBox();
        Box boxFoundFloorsRaft6 = Box.createVerticalBox();
        Box boxFoundFloorsRaft7 = Box.createVerticalBox();
        boxFoundFloorsRaft.setBorder(new TitledBorder("<html><h2>План фундаментов</h2></html>"));
        boxFoundFloorsRaft1.setBorder(new TitledBorder("<html><h2>Развёртка и сечения фундаментов</h2></html>"));
        boxFoundFloorsRaft2.setBorder(new TitledBorder("<html><h2>Планы перекрытий и стропил</h2></html>"));

        boxFoundFloorsRaft7.setBorder(new TitledBorder("<html><h2>Нормы №302-304</h2></html>"));
        boxFoundFloorsRaft3.setBorder(new TitledBorder("<html><h2>Нормы №302</h2></html>"));
        boxFoundFloorsRaft4.setBorder(new TitledBorder("<html><h2>Норма №305</h2></html>"));
        boxFoundFloorsRaft5.setBorder(new TitledBorder("<html><h2>Нормы №306 и №307</h2></html>"));
        boxFoundFloorsRaft6.setBorder(new TitledBorder("<html><h2>При площади здания более 100 м² к нормам №302 и №305—307</h2></html>"));

        JButton buttonFoundFloorsRaft = new JButton("Рассчитать");

        final JRadioButton radioButtonFoundFloorsRaft1 = new JRadioButton("<html>I — здания прямоугольной конфигурации высотой<br>" +
                "до пяти этажей или с перепадом отметок заложения до<br>" +
                "двух;</html>");
        final JRadioButton radioButtonFoundFloorsRaft2 = new JRadioButton("<html>II — здания прямоугольной конфигурации " +
                "высотой<br>" +
                "более пяти этаж ей или здания сложной конфигурации<br>" +
                "до пяти этаж ей или с перепадом отметок заложения до<br>" +
                "четырех;</html>");
        final JRadioButton radioButtonFoundFloorsRaft3 = new JRadioButton("<html>III — здания сложной конфигурации" +
                " высотой более<br>" +
                "пяти этаж ей или здания с разными отметками пола подвала<br>" +
                "или с перепадом отм еток заложения более четырех;</html>");
        final JRadioButton radioButtonFoundFloorsRaft4 = new JRadioButton("<html>I — здания без подвалов при спокойном " +
                "рельефе<br>" +
                "местности. Рядность блоков до трех;<br></html>");
        final JRadioButton radioButtonFoundFloorsRaft5 = new JRadioButton("<html>II — здания с подвалом при спокойном " +
                "рельефе местности,<br>" +
                " с небольшим количеством проемов и технических отверстий, здания<br>" +
                "без подвалов при слож ном рельефе местности. Рядность блоков до пяти;</html>");
        final JRadioButton radioButtonFoundFloorsRaft6 = new JRadioButton("<html>III — здания при сложном рельефе местности с<br>" +
                "различными отметками полов первого или подвального<br>" +
                "этажей , с большим количеством проемов и технических<br>n" +
                "отверстий. Рядность блоков свыше пяти;</html>");
        final JRadioButton radioButtonFoundFloorsRaft7 = new JRadioButton("<html>I — прямоугольные здания;</html>");
        final JRadioButton radioButtonFoundFloorsRaft8 = new JRadioButton("<html>II — угловые здания прямоугольного очертания;</html>");
        final JRadioButton radioButtonFoundFloorsRaft9 = new JRadioButton("<html>III — здания сложной конфигурации с тупыми и острыми<br>" +
                "углами или криволинейного очертания, здания с<br>" +
                "перекрытиями под оборудованием (для планов перекрытий).</html>");

        boxFoundFloorsRaft7.add(checkBox1For36);

        boxFoundFloorsRaft3.add(checkBox2For36);
        boxFoundFloorsRaft3.add(checkBox3For36);
        boxFoundFloorsRaft3.add(checkBox4For36);
        boxFoundFloorsRaft3.add(checkBox5For36);

        boxFoundFloorsRaft4.add(checkBox6For36);
        boxFoundFloorsRaft4.add(checkBox7For36);

        boxFoundFloorsRaft5.add(checkBox8For36);

        boxFoundFloorsRaft6.add(checkBox9For36);
        boxFoundFloorsRaft6.add(checkBox10For36);
        boxFoundFloorsRaft6.add(checkBox11For36);
        boxFoundFloorsRaft6.add(checkBox12For36);
        boxFoundFloorsRaft6.add(checkBox13For36);

        boxFoundFloorsRaft.add(radioButtonFoundFloorsRaft1);
        boxFoundFloorsRaft.add(radioButtonFoundFloorsRaft2);
        boxFoundFloorsRaft.add(radioButtonFoundFloorsRaft3);

        boxFoundFloorsRaft1.add(radioButtonFoundFloorsRaft4);
        boxFoundFloorsRaft1.add(radioButtonFoundFloorsRaft5);
        boxFoundFloorsRaft1.add(radioButtonFoundFloorsRaft6);

        boxFoundFloorsRaft2.add(radioButtonFoundFloorsRaft7);
        boxFoundFloorsRaft2.add(radioButtonFoundFloorsRaft8);
        boxFoundFloorsRaft2.add(radioButtonFoundFloorsRaft9);

        card36.add(boxFoundFloorsRaft);
        card36.add(boxFoundFloorsRaft1);
        card36.add(boxFoundFloorsRaft2);
        card36.add(boxFoundFloorsRaft7);
        card36.add(boxFoundFloorsRaft3);
        card36.add(boxFoundFloorsRaft4);
        card36.add(boxFoundFloorsRaft5);
        card36.add(boxFoundFloorsRaft6);
        card36.add(buttonFoundFloorsRaft);
        checkBox1For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For36.isSelected()) {
                    coef1 = 0.8;
                } else coef1 = 1;
            }
        });
        checkBox2For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For36.isSelected()) {
                    coef2 = 1.3;
                } else coef2 = 1;
            }
        });
        checkBox3For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For36.isSelected()) {
                    coef3 = 1.1;
                } else coef3 = 1;
            }
        });
        checkBox4For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox4For36.isSelected()) {
                    coef4 = 0.2;
                } else coef4 = 1;
            }
        });
        checkBox5For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox5For36.isSelected()) {
                    coef5 = 1.1;
                } else coef5 = 1;
            }
        });
        checkBox6For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox6For36.isSelected()) {
                    coef6 = 0.5;
                } else coef6 = 1;
            }
        });
        checkBox7For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox7For36.isSelected()) {
                    coef7 = 1.2;
                } else coef7 = 1;
            }
        });
        checkBox8For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox8For36.isSelected()) {
                    coef8 = 1.2;
                } else coef8 = 1;
            }
        });
        checkBox9For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox9For36.isSelected()) {
                    coef9 = 1.8;
                } else coef9 = 1;
            }
        });
        checkBox10For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox10For36.isSelected()) {
                    coef10 = 1.3;
                } else coef10 = 1;
            }
        });
        checkBox11For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox11For36.isSelected()) {
                    coef11 = 1;
                } else coef11 = 1;
            }
        });
        checkBox12For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox12For36.isSelected()) {
                    coef12 = 0.9;
                } else coef12 = 1;
            }
        });
        checkBox13For36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox13For36.isSelected()) {
                    coef13 = 0.8;
                } else coef13 = 1;
            }
        });
        radioButtonFoundFloorsRaft1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer302 = 1;
            }
        });
        radioButtonFoundFloorsRaft2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer302 = 2;
            }
        });
        radioButtonFoundFloorsRaft3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer302 = 3;
            }
        });
        radioButtonFoundFloorsRaft4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer303304 = 1;
            }
        });
        radioButtonFoundFloorsRaft5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer303304 = 2;
            }
        });
        radioButtonFoundFloorsRaft6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer303304 = 3;
            }
        });
        radioButtonFoundFloorsRaft7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer305306 = 1;
            }
        });
        radioButtonFoundFloorsRaft8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer305306 = 2;
            }
        });
        radioButtonFoundFloorsRaft9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer305306 = 3;
            }
        });
        buttonFoundFloorsRaft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FoundationsFloorsRaftersTable31DODELAT(answer302, answer303304, answer305306, coef1, coef2, coef3, coef4,
                        coef5, coef6, coef7, coef8, coef9, coef10, coef11, coef12, coef13).setVisible(true);
            }
        });


        JPanel card37 = new JPanel();

        Box boxReinConcStruc = Box.createVerticalBox();
        Box boxReinConcStruc1 = Box.createVerticalBox();
        Box boxReinConcStruc2 = Box.createVerticalBox();
        boxReinConcStruc.setBorder(new TitledBorder("<html><h2>Монолитные конструкции</h2></html>"));
        boxReinConcStruc1.setBorder(new TitledBorder("<html><h2>Сборные конструкции</h2></html>"));
        boxReinConcStruc2.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));

        JButton buttonReinConcStruc = new JButton("Рассчитать");

        final JRadioButton radioButtonReinConcStruc1 = new JRadioButton("<html>1 — фундаменты и колонны симметричные " +
                "(по форме и армированию) прямоугольного сечения; одиночные<br>" +
                "сваи, подпорные стенки высотой до 3 м, балочные плиты, однопролетные балки;</html>");
        final JRadioButton radioButtonReinConcStruc2 = new JRadioButton("<html>2 — фундаменты и колонны несимметричные " +
                "сложного сечения, подпорные стенки высотой более 3 м;<br>" +
                " кустовые сваи, плиты, опертые по контуру, кессонные перекрытия, многопролетные балки и прогоны;<br>" +
                "3 — плиты безбалочных перекрытий, прогоны и<br>" +
                "балки сложных профилей;</html>");
        final JRadioButton radioButtonReinConcStruc3 = new JRadioButton("<html>3 — плиты безбалочных перекрытий, прогоны и<br>" +
                "балки сложных профилей;</html>");
        final JRadioButton radioButtonReinConcStruc4 = new JRadioButton("<html>1 — плоские, балконные и карнизные плиты " +
                "простой конфигурации, перемычки и прогоны прямоугольного<br>" +
                "сечения;</html>");
        final JRadioButton radioButtonReinConcStruc5 = new JRadioButton("<html>2 — ребристые, кессонные и пустотелые " +
                "плиты и настилы; колонны; тавровые прогоны, прямоугольные<br>" +
                " прогоны с защемлением на опорах; однослойные стеновые панели;</html>");
        final JRadioButton radioButtonReinConcStruc6 = new JRadioButton("<html>3 — крупноразмерные плиты с бортовыми " +
                "элементами, многослойные стеновые панели, тавровые прогоны<br>" +
                "с защемлением на опорах.</html>");
        boxReinConcStruc.add(radioButtonReinConcStruc1);
        boxReinConcStruc.add(radioButtonReinConcStruc2);
        boxReinConcStruc.add(radioButtonReinConcStruc3);
        boxReinConcStruc1.add(radioButtonReinConcStruc4);
        boxReinConcStruc1.add(radioButtonReinConcStruc5);
        boxReinConcStruc1.add(radioButtonReinConcStruc6);

        boxReinConcStruc2.add(checkBox1For37);

        card37.add(boxReinConcStruc);
        card37.add(boxReinConcStruc1);
        card37.add(boxReinConcStruc2);
        card37.add(buttonReinConcStruc);

        checkBox1For37.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For37.isSelected()) {
                    coef1 = 1.3;
                } else coef1 = 1;
            }
        });
        radioButtonReinConcStruc1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer37first = 1;
            }
        });
        radioButtonReinConcStruc2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer37first = 2;
            }
        });
        radioButtonReinConcStruc3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer37first = 3;
            }
        });
        radioButtonReinConcStruc4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer37first = 1;
            }
        });
        radioButtonReinConcStruc5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer37first = 2;
            }
        });
        radioButtonReinConcStruc6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer37first = 3;
            }
        });
        buttonReinConcStruc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ReinforcedConcreteStructures32Table(answer37first, coef1).setVisible(true);
            }
        });

        JPanel card38 = new JPanel();

        Box boxEncMetalStruc = Box.createVerticalBox();
        Box boxEncMetalStruc1 = Box.createVerticalBox();
        boxEncMetalStruc.setBorder(new TitledBorder("<html><h2>Характеристика категорий сложности</h2><html>"));
        boxEncMetalStruc1.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2><html>"));

        JButton buttonEncMetalStruc = new JButton("Рассчитать");

        final JRadioButton radioButtonEncMetalStruc1 = new JRadioButton("<html>1 - монтажные схемы, с колчичеством монтажных" +
                " элементов до 20 (М 1:100);<br>" +
                "узлы, монтажные марки и сечения с количеством делатлей до 5 (М 1:2, 1:5);<br>" +
                "простые деталировочные чертежи;</html>");
        final JRadioButton radioButtonEncMetalStruc2 = new JRadioButton("<html>2 - монтажные схемы с количеством монтажных" +
                " элементов более 20 до 50 (М 1:100);<br>" +
                "узлы, монтажные марки и сечения с количеством деталей более 5 до 10 (М 1:2, 1:5);<br>" +
                "простые чертежи витринных приборов (М 1:1, 1:5); деталировочные чертежи средней<br>" +
                "сложности;</html>");
        final JRadioButton radioButtonEncMetalStruc3 = new JRadioButton("<html>3 - монтажные схемы с количеством монтажных" +
                " элементов более 50 (М 1:100); узлы, монтажные<br>" +
                "марки и сечения с количеством деталей более 10 (М 1:1, 1:2, 1:5);<br>" +
                "сложные чертежи витринных приборов (М 1:1, 1:5); деталировочные чертежи сложных деталей<br>" +
                "криволинейных очертаний. </html>");

        boxEncMetalStruc.add(radioButtonEncMetalStruc1);
        boxEncMetalStruc.add(radioButtonEncMetalStruc2);
        boxEncMetalStruc.add(radioButtonEncMetalStruc3);

        boxEncMetalStruc1.add(checkBox1For38);
        boxEncMetalStruc1.add(checkBox2For38);
        boxEncMetalStruc1.add(checkBox3For38);
        card38.add(boxEncMetalStruc);
        card38.add(boxEncMetalStruc1);
        card38.add(buttonEncMetalStruc);
        checkBox1For38.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For38.isSelected()) {
                    coef1 = 1.2;
                } else coef1 = 1;
            }
        });
        checkBox2For38.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For38.isSelected()) {
                    coef2 = 1.2;
                } else coef2 = 1;
            }
        });
        checkBox3For38.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For38.isSelected()) {
                    coef3 = 0.7;
                } else coef3 = 1;
            }
        });
        radioButtonEncMetalStruc1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer38 = 1;
            }
        });
        radioButtonEncMetalStruc2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer38 = 2;
            }
        });
        radioButtonEncMetalStruc3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer38 = 3;
            }
        });
        buttonEncMetalStruc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EnclosingMetalStructures33(answer38, coef1, coef2, coef3).setVisible(true);
            }
        });

        JPanel card39 = new JPanel();

        Box boxWoodConst = Box.createVerticalBox();
        Box boxWoodConst1 = Box.createVerticalBox();
        Box boxWoodConst2 = Box.createVerticalBox();
        Box boxWoodConst3 = Box.createVerticalBox();
        boxWoodConst.setBorder(new TitledBorder("<html><h2>Составные балки</h2></html>"));
        boxWoodConst1.setBorder(new TitledBorder("<html><h2>Составные стойки</h2></html>"));
        boxWoodConst2.setBorder(new TitledBorder("<html><h2>Каркасы, стены, перегородки</h2></html>"));
        boxWoodConst3.setBorder(new TitledBorder("<html><h2>Фермы</h2></html>"));

        JButton buttonWoodConst = new JButton("Рассчитать");

        final JRadioButton radioButtonWoodConst1 = new JRadioButton("<html>1 - клееные на нагелях;</html>");
        final JRadioButton radioButtonWoodConst2 = new JRadioButton("<html>2 - клееные на шпонках;</html>");
        final JRadioButton radioButtonWoodConst3 = new JRadioButton("<html>3 - с перекрёстной стенкой, с архитектурным<br>" +
                "оформлением;</html>");
        final JRadioButton radioButtonWoodConst4 = new JRadioButton("<html>I — одноэтажных зданий;</html>");
        final JRadioButton radioButtonWoodConst5 = new JRadioButton("<html>II — зданий высотой 2—3 этажа;</html>");
        final JRadioButton radioButtonWoodConst6 = new JRadioButton("<html>I — пролетом до 10 м;</html>");
        final JRadioButton radioButtonWoodConst7 = new JRadioButton("<html>II — зданий высотой 2—3 этажа;</html>");
        final JRadioButton radioButtonWoodConst8 = new JRadioButton("<html>I — пролетом до 10 м;</html>");
        final JRadioButton radioButtonWoodConst9 = new JRadioButton("<html>II — треугольные и полигональные пролетом до<br>" +
                "18 м, криволинейного очертания пролетом до 10 м</html>");
        final JRadioButton radioButtonWoodConst10 = new JRadioButton("<html>III — треугольные и полигональные пролетом более<br>" +
                "18 м, криволинейного очертания пролетом более 10 до<br>" +
                "18 м./html>");
        boxWoodConst.add(radioButtonWoodConst1);
        boxWoodConst.add(radioButtonWoodConst2);
        boxWoodConst.add(radioButtonWoodConst3);

        boxWoodConst1.add(radioButtonWoodConst4);
        boxWoodConst1.add(radioButtonWoodConst5);

        boxWoodConst2.add(radioButtonWoodConst6);
        boxWoodConst2.add(radioButtonWoodConst7);

        boxWoodConst3.add(radioButtonWoodConst8);
        boxWoodConst3.add(radioButtonWoodConst9);
        boxWoodConst3.add(radioButtonWoodConst10);

        card39.add(boxWoodConst);
        card39.add(boxWoodConst1);
        card39.add(boxWoodConst2);
        card39.add(boxWoodConst3);
        card39.add(buttonWoodConst);
        radioButtonWoodConst1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer39 = 1;
            }
        });
        radioButtonWoodConst2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer39 = 2;
            }
        });
        radioButtonWoodConst3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer39 = 3;
            }
        });
        radioButtonWoodConst4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer39 = 1;
            }
        });
        radioButtonWoodConst5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer39 = 2;
            }
        });
        radioButtonWoodConst6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer39 = 1;
            }
        });
        radioButtonWoodConst7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer39 = 2;
            }
        });
        radioButtonWoodConst8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer39 = 1;
            }
        });
        radioButtonWoodConst9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer39 = 2;
            }
        });
        radioButtonWoodConst10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer39 = 3;
            }
        });

        buttonWoodConst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WoodenConstruction34DODELAT(answer39).setVisible(true);
            }
        });

        JPanel card40 = new JPanel();

        Box boxDifDesignDetails = Box.createVerticalBox();
        Box boxDifDesignDetails1 = Box.createVerticalBox();
        Box boxDifDesignDetails2 = Box.createVerticalBox();
        boxDifDesignDetails.setBorder(new TitledBorder("<html><h2>Лестницы со сборными ж/б ступенями</h2></html>"));
        boxDifDesignDetails1.setBorder(new TitledBorder("<html><h2>Лестницы винтовые, деревянные или металлические</h2></html>"));
        boxDifDesignDetails2.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));

        JButton buttonDifDesignDetails = new JButton("Рассчитать");

        final JRadioButton radioButtonDifDesignDetails1 = new JRadioButton("<html>I — двухмаршевые лестницы;</html>");
        final JRadioButton radioButtonDifDesignDetails2 = new JRadioButton("<html>II — трехмаршевые лестницы;</html>");
        final JRadioButton radioButtonDifDesignDetails3 = new JRadioButton("<html>III — лестницы для помещения с косыми углами или<br>" +
                "криволинейного очертания в плане, деревянные лестницы заводского изготовления;</html>");
        final JRadioButton radioButtonDifDesignDetails4 = new JRadioButton("<html>I — винтовые лестницы круглые и квадратные в<br>" +
                "плане;</html>");
        final JRadioButton radioButtonDifDesignDetails5 = new JRadioButton("<html>II — то же, прямоугольные в плане.</html>");

        boxDifDesignDetails.add(radioButtonDifDesignDetails1);
        boxDifDesignDetails.add(radioButtonDifDesignDetails2);
        boxDifDesignDetails.add(radioButtonDifDesignDetails3);
        boxDifDesignDetails1.add(radioButtonDifDesignDetails4);
        boxDifDesignDetails1.add(radioButtonDifDesignDetails5);
        boxDifDesignDetails2.add(checkBox1For40);
        boxDifDesignDetails2.add(checkBox2For40);

        card40.add(boxDifDesignDetails);
        card40.add(boxDifDesignDetails1);
        card40.add(boxDifDesignDetails2);
        card40.add(buttonDifDesignDetails);
        checkBox1For40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For40.isSelected()) {
                    coef1 = 0.8;
                } else coef1 = 1;
            }
        });
        checkBox2For40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For40.isSelected()) {
                    coef2 = 1.2;
                } else coef2 = 1;
            }
        });
        radioButtonDifDesignDetails1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer40first = 1;
            }
        });
        radioButtonDifDesignDetails2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer40first = 2;
            }
        });
        radioButtonDifDesignDetails3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer40first = 3;
            }
        });
        radioButtonDifDesignDetails4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer40second = 1;
            }
        });
        radioButtonDifDesignDetails5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer40second = 2;
            }
        });
        buttonDifDesignDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DifferentDesignsAndDetailsTable35(answer40first, answer40second, coef1, coef2).setVisible(true);
            }
        });

        JPanel card41 = new JPanel();

        Box boxDifDesignDetailsWith = Box.createVerticalBox();
        boxDifDesignDetailsWith.setBorder(new TitledBorder("<html><h2>Разные конструкции и детали при количестве элементов:</h2></html>"));

        JButton buttonDifDesignDetailsWith = new JButton("Рассчитать");

        final JRadioButton radioButtonDifDesignDetailsWith1 = new JRadioButton("<html>I — до 2;</html>");
        final JRadioButton radioButtonDifDesignDetailsWith2 = new JRadioButton("<html>II — от 3 до 5;</html>");
        final JRadioButton radioButtonDifDesignDetailsWith3 = new JRadioButton("<html>III — 6 и более.</html>");

        boxDifDesignDetailsWith.add(radioButtonDifDesignDetailsWith1);
        boxDifDesignDetailsWith.add(radioButtonDifDesignDetailsWith2);
        boxDifDesignDetailsWith.add(radioButtonDifDesignDetailsWith3);
        card41.add(boxDifDesignDetailsWith);
        card41.add(buttonDifDesignDetailsWith);
        radioButtonDifDesignDetailsWith1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer41 = 1;
            }
        });
        radioButtonDifDesignDetailsWith2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer41 = 2;
            }
        });
        radioButtonDifDesignDetailsWith1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer41 = 3;
            }
        });
        buttonDifDesignDetailsWith.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DifferentDesignsAndDetailsWithTheNumberOfElementsTable36(answer41).setVisible(true);
            }
        });

        JPanel card42 = new JPanel();

        Box boxArtAndGraphicWorks = Box.createVerticalBox();
        Box boxArtAndGraphicWorks1 = Box.createVerticalBox();
        boxArtAndGraphicWorks.setBorder(new TitledBorder("<html><h2>Дополнительные факторы</h2></html>"));
        boxArtAndGraphicWorks1.setBorder(new TitledBorder("<html>К нормам № 224—227 при выполнении перспективы на:</html>"));

        JButton buttonArtAndGraphicWorks = new JButton("Рассчитать");

        boxArtAndGraphicWorks.add(checkBox1For42);
        boxArtAndGraphicWorks.add(checkBox2For42);
        boxArtAndGraphicWorks.add(boxArtAndGraphicWorks1);
        boxArtAndGraphicWorks1.add(checkBox3For42);
        boxArtAndGraphicWorks1.add(checkBox4For42);
        boxArtAndGraphicWorks1.add(checkBox5For42);
        boxArtAndGraphicWorks1.add(checkBox6For42);
        boxArtAndGraphicWorks1.add(checkBox7For42);
        boxArtAndGraphicWorks1.add(checkBox8For42);
        boxArtAndGraphicWorks.add(checkBox9For42);
        boxArtAndGraphicWorks.add(checkBox10For42);

        card42.add(boxArtAndGraphicWorks);
        card42.add(buttonArtAndGraphicWorks);
        checkBox1For42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1For42.isSelected()) {
                    coef1 = 1.2;
                } else coef1 = 1;
            }
        });
        checkBox2For42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2For42.isSelected()) {
                    coef2 = 0.6;
                } else coef2 = 1;
            }
        });
        checkBox3For42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3For42.isSelected()) {
                    coef3 = 2;
                } else coef3 = 1;
            }
        });
        checkBox4For42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox4For42.isSelected()) {
                    coef4 = 1.8;
                } else coef4 = 1;
            }
        });
        checkBox5For42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox5For42.isSelected()) {
                    coef5 = 1.4;
                } else coef5 = 1;
            }
        });
        checkBox6For42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox6For42.isSelected()) {
                    coef6 = 0.8;
                } else coef6 = 1;
            }
        });
        checkBox7For42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox7For42.isSelected()) {
                    coef7 = 0.7;
                } else coef7 = 1;
            }
        });
        checkBox8For42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox8For42.isSelected()) {
                    coef8 = 0.6;
                } else coef8 = 1;
            }
        });
        checkBox9For42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox9For42.isSelected()) {
                    coef9 = 0.5;
                } else coef9 = 1;
            }
        });
        checkBox10For42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox10For42.isSelected()) {
                    coef10 = 1.3;
                } else coef10 = 1.3;
            }
        });

        buttonArtAndGraphicWorks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ArtAndGraphicWorksTable21(coef1, coef2, coef3, coef4, coef5, coef6, coef7, coef8, coef9, coef10).setVisible(true);
            }
        });
        //Группа радио кнопок
        buttonGroup.add(radioButtonDistrictLayout1);
        buttonGroup.add(radioButtonDistrictLayout2);
        buttonGroup.add(radioButtonDistrictLayout3);

        buttonGroup.add(radioButtonLocalityMasterPlan1);
        buttonGroup.add(radioButtonLocalityMasterPlan2);
        buttonGroup.add(radioButtonLocalityMasterPlan3);
        buttonGroup.add(radioButtonLocalityMasterPlan4);

        buttonGroup.add(radioButtonDetailedLayoutProject1);
        buttonGroup.add(radioButtonDetailedLayoutProject2);
        buttonGroup.add(radioButtonDetailedLayoutProject3);

        buttonGroup.add(radioButtonFloorsOfTheBuildingTypical1);
        buttonGroup.add(radioButtonFloorsOfTheBuildingTypical2);
        buttonGroup.add(radioButtonFloorsOfTheBuildingTypical3);
        buttonGroup.add(radioButtonFloorsOfTheBuildingTypical4);

        buttonGroup.add(radioButtonHeater1);
        buttonGroup.add(radioButtonHeater2);
        buttonGroup.add(radioButtonHeater3);

        buttonGroup.add(radioButtonFloorsOfTheBuildingIndividual1);
        buttonGroup.add(radioButtonFloorsOfTheBuildingIndividual2);
        buttonGroup.add(radioButtonFloorsOfTheBuildingIndividual3);
        buttonGroup.add(radioButtonFloorsOfTheBuildingIndividual4);

        buttonGroup.add(radioButtonHotWaterSupply1);
        buttonGroup.add(radioButtonHotWaterSupply2);
        buttonGroup.add(radioButtonHotWaterSupply3);
        buttonGroup.add(radioButtonHotWaterSupply4);
        buttonGroup.add(radioButtonHotWaterSupply5);

        buttonGroup.add(radioButtonInternalWaterSupply1);
        buttonGroup.add(radioButtonInternalWaterSupply2);
        buttonGroup.add(radioButtonInternalWaterSupply3);
        buttonGroup.add(radioButtonInternalWaterSupply4);
        buttonGroup.add(radioButtonInternalWaterSupply5);

        buttonGroup.add(radioButtonArchi1);
        buttonGroup.add(radioButtonArchi2);
        buttonGroup.add(radioButtonArchi3);

        buttonGroup.add(radioButtonHeating1);
        buttonGroup.add(radioButtonHeating2);
        buttonGroup.add(radioButtonHeating3);
        buttonGroup.add(radioButtonHeating4);

        buttonGroup.add(radioButtonHeatingVent1);
        buttonGroup.add(radioButtonHeatingVent2);
        buttonGroup.add(radioButtonHeatingVent3);
        buttonGroup.add(radioButtonHeatingVent4);
        buttonGroup.add(radioButtonHeatingVent5);

        buttonGroup.add(radioButtonVertLayFive1);
        buttonGroup.add(radioButtonVertLayFive2);
        buttonGroup.add(radioButtonVertLayFive3);
        buttonGroup.add(radioButtonVertLayFive4);

        buttonGroup.add(radioButtonVertLay1);
        buttonGroup.add(radioButtonVertLay2);
        buttonGroup.add(radioButtonVertLay3);
        buttonGroup.add(radioButtonVertLay4);

        buttonGroup.add(radioButtonLandDevDraws1);
        buttonGroup.add(radioButtonLandDevDraws2);
        buttonGroup.add(radioButtonLandDevDraws3);

        buttonGroup.add(radioButtonLandDevTech1);
        buttonGroup.add(radioButtonLandDevTech2);
        buttonGroup.add(radioButtonLandDevTech3);

        buttonGroup.add(radioButtonTechProjectHousePlansMore1);
        buttonGroup.add(radioButtonTechProjectHousePlansMore2);
        buttonGroup.add(radioButtonTechProjectHousePlansMore3);

        buttonGroup.add(radioButtonTechUpTo1);
        buttonGroup.add(radioButtonTechUpTo2);
        buttonGroup.add(radioButtonTechUpTo3);

        buttonGroup.add(radioButtonWorkDrawsMore1);
        buttonGroup.add(radioButtonWorkDrawsMore2);
        buttonGroup.add(radioButtonWorkDrawsMore3);

        buttonGroup.add(radioButtonWorkDrawsUpTo1);
        buttonGroup.add(radioButtonWorkDrawsUpTo2);
        buttonGroup.add(radioButtonWorkDrawsUpTo3);

        buttonGroup.add(radioButtonTechProjFacadesMore1);
        buttonGroup.add(radioButtonTechProjFacadesMore2);

        buttonGroup.add(radioButtonTechProjFacadesUpTo1);
        buttonGroup.add(radioButtonTechProjFacadesUpTo2);

        buttonGroup.add(radioButtonWorkDrawsFascadesMore1);
        buttonGroup.add(radioButtonWorkDrawsFascadesMore2);

        buttonGroup.add(radioButtonWorkDrawsFascadesUpTo1);
        buttonGroup.add(radioButtonWorkDrawsFascadesUpTo2);

        buttonGroup.add(radioButtonTechSelectionMore1);
        buttonGroup.add(radioButtonTechSelectionMore2);
        buttonGroup.add(radioButtonTechSelectionMore3);

        buttonGroup.add(radioButtonTechSelectionUpTo1);
        buttonGroup.add(radioButtonTechSelectionUpTo2);
        buttonGroup.add(radioButtonTechSelectionUpTo3);

        buttonGroup.add(DrawsSelectionMoreRadioButton1);
        buttonGroup.add(DrawsSelectionMoreRadioButton2);
        buttonGroup.add(DrawsSelectionMoreRadioButton3);

        buttonGroup.add(radioButtonDrawsSelectionUpTo1);
        buttonGroup.add(radioButtonDrawsSelectionUpTo2);
        buttonGroup.add(radioButtonDrawsSelectionUpTo3);

        buttonGroup.add(radioButtonArchiDetPatterns1);
        buttonGroup.add(radioButtonArchiDetPatterns2);
        buttonGroup.add(radioButtonArchiDetPatterns3);

        buttonGroup.add(radioButtonFillingOpenVest1);
        buttonGroup.add(radioButtonFillingOpenVest2);
        buttonGroup.add(radioButtonFillingOpenVest3);

        buttonGroup.add(radioButtonFoundation1);
        buttonGroup.add(radioButtonFoundation2);
        buttonGroup.add(radioButtonFoundation3);

        buttonGroup.add(radioButtonSteelStruc1);
        buttonGroup.add(radioButtonSteelStruc2);
        buttonGroup.add(radioButtonSteelStruc3);

        buttonGroup.add(radioButtonStoneConcStruc1);
        buttonGroup.add(radioButtonStoneConcStruc2);
        buttonGroup.add(radioButtonStoneConcStruc3);

        buttonGroup.add(radioButtonReinConcMonolith1);
        buttonGroup.add(radioButtonReinConcMonolith2);
        buttonGroup.add(radioButtonReinConcMonolith3);

        buttonGroup.add(radioButtonReinConcPrefab1);
        buttonGroup.add(radioButtonReinConcPrefab2);
        buttonGroup.add(radioButtonReinConcPrefab3);

        buttonGroup.add(radioButtonWoodenStruc1);
        buttonGroup.add(radioButtonWoodenStruc2);
        buttonGroup.add(radioButtonWoodenStruc3);

        buttonGroup.add(radioButtonFoundFloorsRaft1);
        buttonGroup.add(radioButtonFoundFloorsRaft2);
        buttonGroup.add(radioButtonFoundFloorsRaft3);
        buttonGroup.add(radioButtonFoundFloorsRaft4);
        buttonGroup.add(radioButtonFoundFloorsRaft5);
        buttonGroup.add(radioButtonFoundFloorsRaft6);
        buttonGroup.add(radioButtonFoundFloorsRaft7);
        buttonGroup.add(radioButtonFoundFloorsRaft8);
        buttonGroup.add(radioButtonFoundFloorsRaft9);

        buttonGroup.add(radioButtonReinConcStruc1);
        buttonGroup.add(radioButtonReinConcStruc2);
        buttonGroup.add(radioButtonReinConcStruc3);
        buttonGroup.add(radioButtonReinConcStruc4);
        buttonGroup.add(radioButtonReinConcStruc5);
        buttonGroup.add(radioButtonReinConcStruc6);

        buttonGroup.add(radioButtonEncMetalStruc1);
        buttonGroup.add(radioButtonEncMetalStruc2);
        buttonGroup.add(radioButtonEncMetalStruc3);

        buttonGroup.add(radioButtonWoodConst1);
        buttonGroup.add(radioButtonWoodConst2);
        buttonGroup.add(radioButtonWoodConst3);
        buttonGroup.add(radioButtonWoodConst4);
        buttonGroup.add(radioButtonWoodConst5);
        buttonGroup.add(radioButtonWoodConst6);
        buttonGroup.add(radioButtonWoodConst7);
        buttonGroup.add(radioButtonWoodConst8);
        buttonGroup.add(radioButtonWoodConst9);
        buttonGroup.add(radioButtonWoodConst10);

        buttonGroup.add(radioButtonDifDesignDetails1);
        buttonGroup.add(radioButtonDifDesignDetails2);
        buttonGroup.add(radioButtonDifDesignDetails3);
        buttonGroup.add(radioButtonDifDesignDetails4);
        buttonGroup.add(radioButtonDifDesignDetails5);

        buttonGroup.add(radioButtonDifDesignDetailsWith1);
        buttonGroup.add(radioButtonDifDesignDetailsWith2);
        buttonGroup.add(radioButtonDifDesignDetailsWith3);

        //Слушатель combobox для обнуления percent, radiobutton,checkbox
        combobox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coef1 = 1;
                coef2 = 1;
                coef3 = 1;
                coef4 = 1;
                coef5 = 1;
                coef6 = 1;
                coef7 = 1;
                coef8 = 1;
                coef9 = 1;
                coef10 = 1;
                coef11 = 1;
                coef12 = 1;
                coef13 = 1;
                coefHeatingFor11 = 1;
                coefVentFor11 = 1;
                coefFor4 = 0;

                percent = 0;
                percent1 = 0;
                percent2 = 0;
                percent3 = 0;
                percent4 = 0;
                percent5 = 0;
                percent6 = 0;
                percent7 = 0;
                percent8 = 0;
                percent9 = 0;
                percent10 = 0;
                percent11 = 0;
                percent12 = 0;
                percent13 = 0;

                percent1ForV = 0;
                percent2ForV = 0;
                percent3ForV = 0;
                percent4ForV = 0;
                percent5ForV = 0;
                percent6ForV = 0;
                percent7ForV = 0;
                percent8ForV = 0;
                percent9ForV = 0;
                percent10ForV = 0;

                percent1ForIV = 0;
                percent2ForIV = 0;
                percent3ForIV = 0;
                percent4ForIV = 0;
                percent5ForIV = 0;
                percent6ForIV = 0;
                percent7ForIV = 0;
                percent8ForIV = 0;
                percent9ForIV = 0;
                percent10ForIV = 0;

                checkBox1For5.setSelected(false);
                checkBox2For5.setSelected(false);
                checkBox1For6.setSelected(false);
                checkBox2For6.setSelected(false);
                checkBox3For6.setSelected(false);
                checkBox4For6.setSelected(false);
                checkBox5For6.setSelected(false);
                checkBox6For6.setSelected(false);
                checkBox1For8.setSelected(false);
                checkBox2For8.setSelected(false);
                checkBox3For8.setSelected(false);
                checkBox4For8.setSelected(false);
                checkBox5For8.setSelected(false);
                checkBox6For8.setSelected(false);
                checkBox7For8.setSelected(false);
                checkBox8For8.setSelected(false);

                checkBox1For9.setSelected(false);

                checkBox1For10.setSelected(false);

                checkBox1For11.setSelected(false);
                checkBox2For11.setSelected(false);
                checkBox3For11.setSelected(false);
                checkBox4For11.setSelected(false);
                checkBox5For11.setSelected(false);
                checkBox6For11.setSelected(false);
                checkBox7For11.setSelected(false);
                checkBox8For11.setSelected(false);
                checkBox9For11.setSelected(false);
                checkBox10For11.setSelected(false);
                checkBox11For11.setSelected(false);

                checkBox1For14.setSelected(false);
                checkBox2For14.setSelected(false);
                checkBox3For14.setSelected(false);

                checkBox1For15.setSelected(false);
                checkBox2For15.setSelected(false);
                checkBox3For15.setSelected(false);

                checkBox1For16.setSelected(false);
                checkBox2For16.setSelected(false);
                checkBox3For16.setSelected(false);
                checkBox4For16.setSelected(false);
                checkBox5For16.setSelected(false);
                checkBox6For16.setSelected(false);

                checkBox1For17.setSelected(false);
                checkBox2For17.setSelected(false);
                checkBox3For17.setSelected(false);
                checkBox4For17.setSelected(false);

                checkBox1For20.setSelected(false);
                checkBox2For20.setSelected(false);
                checkBox3For20.setSelected(false);
                checkBox4For20.setSelected(false);
                checkBox5For20.setSelected(false);
                checkBox6For20.setSelected(false);

                checkBox1For21.setSelected(false);
                checkBox2For21.setSelected(false);

                checkBox1For23.setSelected(false);
                checkBox2For23.setSelected(false);

                checkBox1For24.setSelected(false);
                checkBox2For24.setSelected(false);
                checkBox3For24.setSelected(false);
                checkBox4For24.setSelected(false);
                checkBox5For24.setSelected(false);
                checkBox6For24.setSelected(false);
                checkBox7For24.setSelected(false);
                checkBox8For24.setSelected(false);

                checkBox1For26.setSelected(false);
                checkBox2For26.setSelected(false);
                checkBox3For26.setSelected(false);

                checkBox1For28.setSelected(false);

                checkBox1For29.setSelected(false);
                checkBox2For29.setSelected(false);
                checkBox3For29.setSelected(false);
                checkBox4For29.setSelected(false);

                checkBox1For30.setSelected(false);
                checkBox2For30.setSelected(false);

                checkBox1For32.setSelected(false);

                checkBox1For34.setSelected(false);

                checkBox1For36.setSelected(false);
                checkBox2For36.setSelected(false);
                checkBox3For36.setSelected(false);
                checkBox4For36.setSelected(false);
                checkBox5For36.setSelected(false);
                checkBox6For36.setSelected(false);
                checkBox7For36.setSelected(false);
                checkBox8For36.setSelected(false);
                checkBox9For36.setSelected(false);
                checkBox10For36.setSelected(false);
                checkBox11For36.setSelected(false);
                checkBox12For36.setSelected(false);
                checkBox13For36.setSelected(false);

                checkBox1For37.setSelected(false);

                checkBox1For38.setSelected(false);
                checkBox2For38.setSelected(false);
                checkBox3For38.setSelected(false);

                checkBox1For40.setSelected(false);
                checkBox2For40.setSelected(false);

                checkBox1For42.setSelected(false);
                checkBox2For42.setSelected(false);
                checkBox3For42.setSelected(false);
                checkBox4For42.setSelected(false);
                checkBox5For42.setSelected(false);
                checkBox6For42.setSelected(false);
                checkBox7For42.setSelected(false);
                checkBox8For42.setSelected(false);
                checkBox9For42.setSelected(false);
                checkBox10For42.setSelected(false);

                checkBox1For4.setSelected(false);
                checkBox2For4.setSelected(false);
                checkBox3For4.setSelected(false);
                checkBox4For4.setSelected(false);
                checkBox5For4.setSelected(false);
                checkBox6For4.setSelected(false);
                checkBoxFor4Individual.setSelected(false);
                checkBoxFor4Binding.setSelected(false);

                //Чекбоксы удельного веса

                percCheckBox1For1.setSelected(false);
                percCheckBox2For1.setSelected(false);
                percCheckBox3For1.setSelected(false);
                percCheckBox4For1.setSelected(false);
                percCheckBox5For1.setSelected(false);

                percCheckBox1For2.setSelected(false);
                percCheckBox2For2.setSelected(false);
                percCheckBox3For2.setSelected(false);
                percCheckBox4For2.setSelected(false);
                percCheckBox5For2.setSelected(false);
                percCheckBox1For3.setSelected(false);
                percCheckBox2For3.setSelected(false);
                percCheckBox3For3.setSelected(false);
                percCheckBox4For3.setSelected(false);
                percCheckBox5For3.setSelected(false);

                percCheckBox1For12.setSelected(false);
                percCheckBox2For12.setSelected(false);
                percCheckBox3For12.setSelected(false);
                percCheckBox4For12.setSelected(false);
                percCheckBox5For12.setSelected(false);

                percCheckBox1For15.setSelected(false);
                percCheckBox2For15.setSelected(false);
                percCheckBox3For15.setSelected(false);
                percCheckBox4For15.setSelected(false);

                percCheckBox1For14.setSelected(false);
                percCheckBox2For14.setSelected(false);
                percCheckBox3For14.setSelected(false);
                percCheckBox4For14.setSelected(false);
                percCheckBox5For14.setSelected(false);

                percCheckBox1For11.setSelected(false);
                percCheckBox2For11.setSelected(false);
                percCheckBox3For11.setSelected(false);
                percCheckBox4For11.setSelected(false);
                percCheckBox5For11.setSelected(false);
                percCheckBox6For11.setSelected(false);

                percCheckBox7For11.setSelected(false);
                percCheckBox8For11.setSelected(false);
                percCheckBox9For11.setSelected(false);
                percCheckBox10For11.setSelected(false);

                percCheckBox1For7.setSelected(false);
                percCheckBox2For7.setSelected(false);
                percCheckBox3For7.setSelected(false);
                percCheckBox4For7.setSelected(false);
                percCheckBox5For7.setSelected(false);
                percCheckBox6For7.setSelected(false);
                percCheckBox7For7.setSelected(false);
                percCheckBox8For7.setSelected(false);

                pecrCheckBox1For8.setSelected(false);
                pecrCheckBox2For8.setSelected(false);
                pecrCheckBox3For8.setSelected(false);
                pecrCheckBox4For8.setSelected(false);
                pecrCheckBox5For8.setSelected(false);
                pecrCheckBox6For8.setSelected(false);
                pecrCheckBox7For8.setSelected(false);
                pecrCheckBox8For8.setSelected(false);

                percCheckBox1For4.setSelected(false);
                percCheckBox2For4.setSelected(false);
                percCheckBox3For4.setSelected(false);
                percCheckBox4For4.setSelected(false);
                percCheckBox5For4.setSelected(false);
                percCheckBox6For4.setSelected(false);
                percCheckBox7For4.setSelected(false);
                percCheckBox8For4.setSelected(false);
                percCheckBox9For4.setSelected(false);
                percCheckBox10For4.setSelected(false);
                percCheckBox11For4.setSelected(false);
                percCheckBox12For4.setSelected(false);
                percCheckBox13For4.setSelected(false);

                percCheckBox1For10.setSelected(false);
                percCheckBox2For10.setSelected(false);
                percCheckBox3For10.setSelected(false);

                radioButtonDistrictLayout1.setSelected(false);
                radioButtonDistrictLayout2.setSelected(false);
                radioButtonDistrictLayout3.setSelected(false);

                radioButtonLocalityMasterPlan1.setSelected(false);
                radioButtonLocalityMasterPlan2.setSelected(false);
                radioButtonLocalityMasterPlan3.setSelected(false);
                radioButtonLocalityMasterPlan4.setSelected(false);

                radioButtonDetailedLayoutProject1.setSelected(false);
                radioButtonDetailedLayoutProject2.setSelected(false);
                radioButtonDetailedLayoutProject3.setSelected(false);

                radioButtonFloorsOfTheBuildingTypical1.setSelected(false);
                radioButtonFloorsOfTheBuildingTypical2.setSelected(false);
                radioButtonFloorsOfTheBuildingTypical3.setSelected(false);
                radioButtonFloorsOfTheBuildingTypical4.setSelected(false);

                radioButtonHeater1.setSelected(false);
                radioButtonHeater2.setSelected(false);
                radioButtonHeater3.setSelected(false);

                radioButtonFloorsOfTheBuildingIndividual1.setSelected(false);
                radioButtonFloorsOfTheBuildingIndividual2.setSelected(false);
                radioButtonFloorsOfTheBuildingIndividual3.setSelected(false);
                radioButtonFloorsOfTheBuildingIndividual4.setSelected(false);

                radioButtonHotWaterSupply1.setSelected(false);
                radioButtonHotWaterSupply2.setSelected(false);
                radioButtonHotWaterSupply3.setSelected(false);
                radioButtonHotWaterSupply4.setSelected(false);
                radioButtonHotWaterSupply5.setSelected(false);

                radioButtonInternalWaterSupply1.setSelected(false);
                radioButtonInternalWaterSupply2.setSelected(false);
                radioButtonInternalWaterSupply3.setSelected(false);
                radioButtonInternalWaterSupply4.setSelected(false);
                radioButtonInternalWaterSupply5.setSelected(false);

                radioButtonArchi1.setSelected(false);
                radioButtonArchi2.setSelected(false);
                radioButtonArchi3.setSelected(false);

                radioButtonHeating1.setSelected(false);
                radioButtonHeating2.setSelected(false);
                radioButtonHeating3.setSelected(false);
                radioButtonHeating4.setSelected(false);

                radioButtonHeatingVent1.setSelected(false);
                radioButtonHeatingVent2.setSelected(false);
                radioButtonHeatingVent3.setSelected(false);
                radioButtonHeatingVent4.setSelected(false);
                radioButtonHeatingVent5.setSelected(false);

                radioButtonVertLayFive1.setSelected(false);
                radioButtonVertLayFive2.setSelected(false);
                radioButtonVertLayFive3.setSelected(false);
                radioButtonVertLayFive4.setSelected(false);

                radioButtonVertLay1.setSelected(false);
                radioButtonVertLay2.setSelected(false);
                radioButtonVertLay3.setSelected(false);
                radioButtonVertLay4.setSelected(false);

                radioButtonLandDevDraws1.setSelected(false);
                radioButtonLandDevDraws2.setSelected(false);
                radioButtonLandDevDraws3.setSelected(false);

                radioButtonLandDevTech1.setSelected(false);
                radioButtonLandDevTech2.setSelected(false);
                radioButtonLandDevTech3.setSelected(false);

                radioButtonTechProjectHousePlansMore1.setSelected(false);
                radioButtonTechProjectHousePlansMore2.setSelected(false);
                radioButtonTechProjectHousePlansMore3.setSelected(false);

                radioButtonTechUpTo1.setSelected(false);
                radioButtonTechUpTo2.setSelected(false);
                radioButtonTechUpTo3.setSelected(false);

                radioButtonWorkDrawsMore1.setSelected(false);
                radioButtonWorkDrawsMore2.setSelected(false);
                radioButtonWorkDrawsMore3.setSelected(false);

                radioButtonWorkDrawsUpTo1.setSelected(false);
                radioButtonWorkDrawsUpTo2.setSelected(false);
                radioButtonWorkDrawsUpTo3.setSelected(false);

                radioButtonTechProjFacadesMore1.setSelected(false);
                radioButtonTechProjFacadesMore2.setSelected(false);

                radioButtonTechProjFacadesUpTo1.setSelected(false);
                radioButtonTechProjFacadesUpTo2.setSelected(false);

                radioButtonWorkDrawsFascadesMore1.setSelected(false);
                radioButtonWorkDrawsFascadesMore2.setSelected(false);

                radioButtonWorkDrawsFascadesUpTo1.setSelected(false);
                radioButtonWorkDrawsFascadesUpTo2.setSelected(false);

                radioButtonTechSelectionMore1.setSelected(false);
                radioButtonTechSelectionMore2.setSelected(false);
                radioButtonTechSelectionMore3.setSelected(false);

                radioButtonTechSelectionUpTo1.setSelected(false);
                radioButtonTechSelectionUpTo2.setSelected(false);
                radioButtonTechSelectionUpTo3.setSelected(false);

                DrawsSelectionMoreRadioButton1.setSelected(false);
                DrawsSelectionMoreRadioButton2.setSelected(false);
                DrawsSelectionMoreRadioButton3.setSelected(false);

                radioButtonDrawsSelectionUpTo1.setSelected(false);
                radioButtonDrawsSelectionUpTo2.setSelected(false);
                radioButtonDrawsSelectionUpTo3.setSelected(false);

                radioButtonArchiDetPatterns1.setSelected(false);
                radioButtonArchiDetPatterns2.setSelected(false);
                radioButtonArchiDetPatterns3.setSelected(false);

                radioButtonFillingOpenVest1.setSelected(false);
                radioButtonFillingOpenVest2.setSelected(false);
                radioButtonFillingOpenVest3.setSelected(false);

                radioButtonFoundation1.setSelected(false);
                radioButtonFoundation2.setSelected(false);
                radioButtonFoundation3.setSelected(false);

                radioButtonSteelStruc1.setSelected(false);
                radioButtonSteelStruc2.setSelected(false);
                radioButtonSteelStruc3.setSelected(false);

                radioButtonStoneConcStruc1.setSelected(false);
                radioButtonStoneConcStruc2.setSelected(false);
                radioButtonStoneConcStruc3.setSelected(false);

                radioButtonReinConcMonolith1.setSelected(false);
                radioButtonReinConcMonolith2.setSelected(false);
                radioButtonReinConcMonolith3.setSelected(false);

                radioButtonReinConcPrefab1.setSelected(false);
                radioButtonReinConcPrefab2.setSelected(false);
                radioButtonReinConcPrefab3.setSelected(false);

                radioButtonWoodenStruc1.setSelected(false);
                radioButtonWoodenStruc2.setSelected(false);
                radioButtonWoodenStruc3.setSelected(false);

                radioButtonFoundFloorsRaft1.setSelected(false);
                radioButtonFoundFloorsRaft2.setSelected(false);
                radioButtonFoundFloorsRaft3.setSelected(false);
                radioButtonFoundFloorsRaft4.setSelected(false);
                radioButtonFoundFloorsRaft5.setSelected(false);
                radioButtonFoundFloorsRaft6.setSelected(false);
                radioButtonFoundFloorsRaft7.setSelected(false);
                radioButtonFoundFloorsRaft8.setSelected(false);
                radioButtonFoundFloorsRaft9.setSelected(false);

                radioButtonReinConcStruc1.setSelected(false);
                radioButtonReinConcStruc2.setSelected(false);
                radioButtonReinConcStruc3.setSelected(false);
                radioButtonReinConcStruc4.setSelected(false);
                radioButtonReinConcStruc5.setSelected(false);
                radioButtonReinConcStruc6.setSelected(false);

                radioButtonEncMetalStruc1.setSelected(false);
                radioButtonEncMetalStruc2.setSelected(false);
                radioButtonEncMetalStruc3.setSelected(false);

                radioButtonWoodConst1.setSelected(false);
                radioButtonWoodConst2.setSelected(false);
                radioButtonWoodConst3.setSelected(false);
                radioButtonWoodConst4.setSelected(false);
                radioButtonWoodConst5.setSelected(false);
                radioButtonWoodConst6.setSelected(false);
                radioButtonWoodConst7.setSelected(false);
                radioButtonWoodConst8.setSelected(false);
                radioButtonWoodConst9.setSelected(false);
                radioButtonWoodConst10.setSelected(false);

                radioButtonDifDesignDetails1.setSelected(false);
                radioButtonDifDesignDetails2.setSelected(false);
                radioButtonDifDesignDetails3.setSelected(false);
                radioButtonDifDesignDetails4.setSelected(false);
                radioButtonDifDesignDetails5.setSelected(false);

                radioButtonDifDesignDetailsWith1.setSelected(false);
                radioButtonDifDesignDetailsWith2.setSelected(false);
                radioButtonDifDesignDetailsWith3.setSelected(false);
            }
        });

        //Расположение элементов выпадающего списка
        card1.setLayout(new BoxLayout(card1, BoxLayout.Y_AXIS));
        card2.setLayout(new BoxLayout(card2, BoxLayout.Y_AXIS));
        card3.setLayout(new BoxLayout(card3, BoxLayout.Y_AXIS));
        card4.setLayout(new BoxLayout(card4, BoxLayout.Y_AXIS));
        card5.setLayout(new BoxLayout(card5, BoxLayout.Y_AXIS));
        card6.setLayout(new BoxLayout(card6, BoxLayout.Y_AXIS));
        card7.setLayout(new BoxLayout(card7, BoxLayout.Y_AXIS));
        card8.setLayout(new BoxLayout(card8, BoxLayout.Y_AXIS));
        card9.setLayout(new BoxLayout(card9, BoxLayout.Y_AXIS));
        card10.setLayout(new BoxLayout(card10, BoxLayout.Y_AXIS));
        card11.setLayout(new BoxLayout(card11, BoxLayout.Y_AXIS));
        card12.setLayout(new BoxLayout(card12, BoxLayout.Y_AXIS));
        card13.setLayout(new BoxLayout(card13, BoxLayout.Y_AXIS));
        card14.setLayout(new BoxLayout(card14, BoxLayout.Y_AXIS));
        card15.setLayout(new BoxLayout(card15, BoxLayout.Y_AXIS));
        card16.setLayout(new BoxLayout(card16, BoxLayout.Y_AXIS));
        card17.setLayout(new BoxLayout(card17, BoxLayout.Y_AXIS));
        card18.setLayout(new BoxLayout(card18, BoxLayout.Y_AXIS));
        card19.setLayout(new BoxLayout(card19, BoxLayout.Y_AXIS));
        card20.setLayout(new BoxLayout(card20, BoxLayout.Y_AXIS));
        card21.setLayout(new BoxLayout(card21, BoxLayout.Y_AXIS));
        card22.setLayout(new BoxLayout(card22, BoxLayout.Y_AXIS));
        card23.setLayout(new BoxLayout(card23, BoxLayout.Y_AXIS));
        card24.setLayout(new BoxLayout(card24, BoxLayout.Y_AXIS));
        card25.setLayout(new BoxLayout(card25, BoxLayout.Y_AXIS));
        card26.setLayout(new BoxLayout(card26, BoxLayout.Y_AXIS));
        card27.setLayout(new BoxLayout(card27, BoxLayout.Y_AXIS));
        card28.setLayout(new BoxLayout(card28, BoxLayout.Y_AXIS));
        card29.setLayout(new BoxLayout(card29, BoxLayout.Y_AXIS));
        card30.setLayout(new BoxLayout(card30, BoxLayout.Y_AXIS));
        card31.setLayout(new BoxLayout(card31, BoxLayout.Y_AXIS));
        card32.setLayout(new BoxLayout(card32, BoxLayout.Y_AXIS));
        card33.setLayout(new BoxLayout(card33, BoxLayout.Y_AXIS));
        card34.setLayout(new BoxLayout(card34, BoxLayout.Y_AXIS));
        card35.setLayout(new BoxLayout(card35, BoxLayout.Y_AXIS));
        card36.setLayout(new BoxLayout(card36, BoxLayout.Y_AXIS));
        card37.setLayout(new BoxLayout(card37, BoxLayout.Y_AXIS));
        card38.setLayout(new BoxLayout(card38, BoxLayout.Y_AXIS));
        card39.setLayout(new BoxLayout(card39, BoxLayout.Y_AXIS));
        card40.setLayout(new BoxLayout(card40, BoxLayout.Y_AXIS));
        card41.setLayout(new BoxLayout(card41, BoxLayout.Y_AXIS));
        card42.setLayout(new BoxLayout(card42, BoxLayout.Y_AXIS));


        cards = new JPanel(new CardLayout());
        cards.add(card1, DISTRICT_LAYOUT);
        cards.add(card2, LOCALITY_MASTER_PLAN);
        cards.add(card3, DETAILED_LAYOUT_PROJECT);
        cards.add(new JScrollPane(card4), FLOORS_OF_THE_BUILDING_TYPICAL);
        cards.add(card5, HEATER);
        cards.add(card6, FLOORS_OF_THE_BUILDING_INDIVIDUAL);
        cards.add(card7, HOT_WATER_SUPPLY);
        cards.add(new JScrollPane(card8), INTERNAL_WATER_SUPPLY);
        cards.add(card9, ARCHI_CONST_PART_CIVIL_BUILDS);
        cards.add(card10, HEATING_VENTILATION);
        cards.add(new JScrollPane(card11), HEATING_VENTILATION_WATER_SUPPLY_CIV_BUILDS);
        cards.add(card12, VERTICAL_LAYOUT_FIVE);
        cards.add(card13, VERTICAL_LAYOUT);
        cards.add(new JScrollPane(card14), LAND_DEV_STAGE_WORKING_DRAWS);
        cards.add(new JScrollPane(card15), LAND_DEV_STAGE_TECH_PROJECT);
        cards.add(card16, TECH_PROJ_H_PLANS_MORE);
        cards.add(card17, TECH_PROJ_H_PLANS_UP_TO);
        cards.add(card18, WORK_DRAWS_H_PLANS_MORE);
        cards.add(card19, WORK_DRAWS_H_PLANS_UP_TO);
        cards.add(card20, TECH_PROJ_FACADES_H_MORE);
        cards.add(card21, TECH_PROJ_FACADES_H_UP_TO);
        cards.add(card22, WORK_DRAWS_FACADES_H_MORE);
        cards.add(card23, WORK_DRAWS_FACADES_H_UP_TO);
        cards.add(card24, TECH_PROJ_SELECTION_H_MORE);
        cards.add(card25, TECH_PROJ_SELECTION_H_UP_TO);
        cards.add(card26, WORK_DRAWS_SELECTION_H_MORE);
        cards.add(card27, WORK_DRAWS_SELECTION_H_UP_TO);
        cards.add(card28, ARCHI_DETAILS_PATTERNS);
        cards.add(card29, FILLING_OPENINGS_VESTIBULES);
        cards.add(card30, FOUNDATION);
        cards.add(card31, STEEL_STRUCTURES);
        cards.add(card32, STONE_CONCRETE_STRUCTURES);
        cards.add(card33, REINFORCED_CONCRETE_MONOLITH_STRUC);
        cards.add(card34, REINFORCED_CONCRETE_PREFAB_STRUC);
        cards.add(card35, WOODEN_STRUC);
        cards.add(new JScrollPane(card36), FOUNDATIONS_FLOORS_RAFTERS);
        cards.add(card37, REINFORCED_CONCRETE_STRUC);
        cards.add(card38, ENCLOSING_METAL_STRUC);
        cards.add(card39, WOODEN_CONSTRUCTION);
        cards.add(card40, DIFFERENT_DESIGN_AND_DETAILS);
        cards.add(card41, DIFFERENT_DESIGN_AND_DETAILS_WITH_NUMB_ELEM);
        cards.add(card42, ART_AND_GRAPHIC_WORKS);

        container.add(cbPanel, BorderLayout.PAGE_START);
        container.add(cards, BorderLayout.CENTER);

    }

    @Override
    public void itemStateChanged(ItemEvent event) {
        CardLayout layout = (CardLayout) cards.getLayout();
        layout.show(cards, (String) event.getItem());
    }

}
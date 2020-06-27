package com.example.myfirstapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

class Data {
    private Map<String, Module> allModule = new HashMap<>();
    private final static List<Integer> allWeeks = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
    private final static List<Integer> startWeekThree = Arrays.asList(3,4,5,6,7,8,9,10,11,12,13);
    private final static List<Integer> oddWeeks = Arrays.asList(1,3,5,7,9,11,13);
    private final static List<Integer> evenWeeks = Arrays.asList(2,4,6,8,10,12);
    private final static List<Integer> startWeekTwo = Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13);

    public Data() {
        allModule.put("BT1101", new Module("BT1101",
                new Lecture("BT1101", "1", 1400, 1600, "Thursday", "COM1-VCRM", allWeeks, "Lecture"),
                new Lecture("BT1101", "2", 1600, 1800, "Thursday", "COM1-VCRM", allWeeks, "Lecture"),
                new Tutorial("BT1101", "1", 1300, 1400, "Monday", "COM1-0216", allWeeks, "Tutorial"),
                new Tutorial("BT1101", "2", 1000, 1100, "Wednesday", "COM1-0201", allWeeks, "Tutorial"),
                new Tutorial("BT1101", "3", 1000, 1100, "Friday", "COM1-0217", allWeeks, "Tutorial"),
                new Tutorial("BT1101", "4", 1200, 1300, "Monday", "COM1-0216", allWeeks, "Tutorial"),
                new Tutorial("BT1101", "5", 1100, 1200, "Wednesday", "COM1-0201", allWeeks, "Tutorial"),
                new Tutorial("BT1101", "6", 1100, 1200, "Friday", "COM1-0217", allWeeks, "Tutorial")
        ));
        allModule.put("MA1521", new Module("MA1521",
                new Lecture("MA1521", "1", 1400, 1600, "Monday", "UT-AUD3", allWeeks, "Lecture"),
                new Lecture("MA1521", "1", 1400, 1600, "Thursday", "UT-AUD3", allWeeks, "Lecture"),
                new Lecture("MA1521", "2", 1200, 1400, "Tuesday", "UT-AUD2", allWeeks, "Lecture"),
                new Lecture("MA1521", "2", 1200, 1400, "Friday", "UT-AUD2", allWeeks, "Lecture"),
                new Tutorial("MA1521", "1", 900, 1000, "Monday", "S17-0611", startWeekThree, "Tutorial"),
                new Tutorial("MA1521", "2", 1000, 1100, "Monday", "S17-0611", startWeekThree, "Tutorial"),
                new Tutorial("MA1521", "3", 900, 1000, "Tuesday", "S17-0406", startWeekThree, "Tutorial"),
                new Tutorial("MA1521", "4", 1000, 1100, "Tuesday", "S17-0406", startWeekThree, "Tutorial"),
                new Tutorial("MA1521", "5", 1300, 1400, "Wednesday", "S17-0404", startWeekThree, "Tutorial"),
                new Tutorial("MA1521", "6", 1400, 1500, "Wednesday", "S17-0404", startWeekThree, "Tutorial"),
                new Tutorial("MA1521", "7", 900, 1000, "Thursday", "S17-0406", startWeekThree, "Tutorial"),
                new Tutorial("MA1521", "8", 1000, 1100, "Thursday", "S17-0406", startWeekThree, "Tutorial"),
                new Tutorial("MA1521", "9", 1100, 1200, "Thursday", "S17-0406", startWeekThree, "Tutorial"),
                new Tutorial("MA1521", "10", 1500, 1600, "Friday", "S17-0404", startWeekThree, "Tutorial"),
                new Tutorial("MA1521", "11", 1600, 1700, "Friday", "S17-0404", startWeekThree, "Tutorial")
        ));

        allModule.put("EC1301", new Module("EC1301",
                        new Lecture("EC1301", "1", 1000, 1200, "Tuesday", "LT26", allWeeks, "Lecture"),
                        new Lecture("EC1301", "2", 1600, 1800, "Wednesday", "LT7A", allWeeks, "Lecture"),
                        new Tutorial("EC1301", "1", 1000, 1100, "Monday", "S16-0437", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "2", 1100, 1200, "Monday", "S16-0437", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "3", 1200, 1300, "Monday", "S16-0440", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "4", 1300, 1400, "Monday", "S16-0440", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "7", 1000, 1100, "Monday", "S16-0431", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "5", 1300, 1400, "Tuesday", "S16-0431", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "6", 1400, 1500, "Tuesday", "S16-0431", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "8", 1600, 1700, "Tuesday", "S16-0431", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "9", 900, 1000, "Wednesday", "S16-0435", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "10", 1000, 1100, "Wednesday", "S16-0435", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "11", 1100, 1200, "Wednesday", "S16-0435", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "12", 1200, 1300, "Wednesday", "S16-0435", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "13", 1300, 1400, "Wednesday", "S16-0435", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "14", 1400, 1500, "Wednesday", "S16-0435", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "15", 1500, 1600, "Wednesday", "S16-0435", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "16", 900, 1000, "Thursday", "E3-06-12", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "17", 1000, 1100, "Thursday", "E3-06-13", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "18", 1100, 1200, "Thursday", "E3-06-13", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "20", 1400, 1500, "Thursday", "E3-06-02", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "22", 1500, 1600, "Thursday", "E3-06-04", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "23", 1600, 1700, "Thursday", "E3-06-03", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "26", 1000, 1100, "Friday", "E3-06-04", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "27", 1100, 1200, "Friday", "E3-06-04", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "28", 1200, 1300, "Friday", "E3-06-03", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "29", 1300, 1400, "Friday", "E3-06-03", startWeekThree, "Tutorial"),
                        new Tutorial("EC1301", "30", 1400, 1500, "Friday", "E3-06-04", startWeekThree, "Tutorial")
                )
        );


        allModule.put("CS1010S", new Module("CS1010S",
                        new Lecture("CS1010S", "1", 1600, 1800, "Wednesday", "LT27", allWeeks, "Lecture"),
                        new Recitation("CS1010S", "4", 1300, 1400, "Thursday", "S16-0430", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "14", 1400, 1500, "Thursday", "S16-0307", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "11", 1500, 1600, "Thursday", "COM1-0212", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "9", 1600, 1700, "Thursday", "S16-0436", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "12", 1600, 1700, "Thursday", "S16-0212", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "7", 1000, 1100, "Friday", "S16-0436", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "3", 1100, 1200, "Friday", "S16-0436", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "10", 1200, 1300, "Friday", "COM1-0212", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "13", 1300, 1400, "Friday", "COM1-0212", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "6", 1400, 1500, "Friday", "S16-0436", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "1", 1500, 1600, "Friday", "S16-0430", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "5", 1500, 1600, "Friday", "S16-0436", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "2", 1600, 1700, "Friday", "S16-0430", allWeeks, "Recitation"),
                        new Recitation("CS1010S", "8", 1700, 1800, "Friday", "S16-0430", allWeeks, "Recitation"),
                        new Tutorial("CS1010S", "1", 800, 900, "Monday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "2", 900, 1000, "Monday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "3", 1000, 1100, "Monday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "4", 1100, 1200, "Monday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "5", 1200, 1300, "Monday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "6", 1300, 1400, "Monday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "7", 1400, 1500, "Monday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "8", 1500, 1600, "Monday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "9", 1600, 1700, "Monday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "10", 1700, 1800, "Monday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "11", 800, 900, "Tuesday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "12", 900, 1000, "Tuesday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "13", 1000, 1100, "Tuesday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "14", 1100, 1200, "Tuesday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "15", 1200, 1300, "Tuesday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "16", 1300, 1400, "Tuesday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "17", 1400, 1500, "Tuesday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "18", 1500, 1600, "Tuesday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "19", 1600, 1700, "Tuesday", "AS6-0211", allWeeks, "Tutorial"),
                        new Tutorial("CS1010S", "20", 1700, 1800, "Tuesday", "AS6-0211", allWeeks, "Tutorial")
                )
        );

        allModule.put("GER1000", new Module("GER1000",
                        new Tutorial("GER1000", "E1", 1000, 1200, "Monday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E2", 1200, 1400, "Monday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E3", 1000, 1200, "Monday", "TP-SR4", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E4", 1200, 1400, "Monday", "TP-SR4", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E9", 800, 1000, "Tuesday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D1", 800, 1000, "Tuesday", "TP-SR7", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D5", 1000, 1200, "Tuesday", "TP-SR4", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E10", 1000, 1200, "Tuesday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D2", 1200, 1400, "Tuesday", "TP-SR7", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E11", 1200, 1400, "Tuesday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D3", 1400, 1600, "Tuesday", "TP-SR7", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E12", 1400, 1600, "Tuesday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D4", 1600, 1800, "Tuesday", "TP-SR7", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E13", 1600, 1800, "Tuesday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E30", 800, 1000, "Wednesday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D18", 800, 1000, "Wednesday", "TP-SR7", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D23", 1000, 1200, "Wednesday", "TP-SR4", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E31", 1000, 1200, "Wednesday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D20", 1200, 1400, "Wednesday", "TP-SR7", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E32", 1200, 1400, "Wednesday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D21", 1400, 1600, "Wednesday", "TP-SR7", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E33", 1400, 1600, "Wednesday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D22", 1600, 1800, "Wednesday", "TP-SR7", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E24", 1600, 1800, "Wednesday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E50", 800, 1000, "Thursday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D38", 800, 1000, "Thursday", "TP-SR7", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D39", 1000, 1200, "Thursday", "TP-SR4", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E55", 1000, 1200, "Thursday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D40", 1200, 1400, "Thursday", "TP-SR7", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E52", 1200, 1400, "Thursday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D41", 1400, 1600, "Thursday", "TP-SR7", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E53", 1400, 1600, "Thursday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D42", 1600, 1800, "Thursday", "TP-SR7", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "E54", 1600, 1800, "Thursday", "TP-SR7", evenWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D61", 800, 1000, "Friday", "E4-04-03", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D62", 1000, 1200, "Friday", "E4-04-03", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D63", 1200, 1400, "Friday", "E4-04-03", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D64", 1400, 1600, "Friday", "E4-04-03", oddWeeks, "Tutorial"),
                        new Tutorial("GER1000", "D65", 1600, 1800, "Friday", "E4-04-03", oddWeeks, "Tutorial")
                )
        );

        allModule.put("DAO1704", new Module("DAO1704",
                        new Sectional("DAO1704", "A1", 830, 1130, "Monday", "BIZ1-0303", allWeeks, "Sectional Teaching"),
                        new Sectional("DAO1704", "A11", 830, 1130, "Monday", "BIZ1-0305", allWeeks, "Sectional Teaching"),
                        new Sectional("DAO1704", "A2", 830, 1130, "Monday", "BIZ1-0202", allWeeks, "Sectional Teaching"),
                        new Sectional("DAO1704", "A3", 1500, 1800, "Monday", "BIZ1-0305", allWeeks, "Sectional Teaching"),
                        new Sectional("DAO1704", "A4", 1500, 1800, "Monday", "BIZ1-0204", allWeeks, "Sectional Teaching"),
                        new Sectional("DAO1704", "A5", 1500, 1800, "Monday", "BIZ1-0206", allWeeks, "Sectional Teaching"),
                        new Sectional("DAO1704", "A10", 830, 1130, "Tuesday", "HSSMLCR", allWeeks, "Sectional Teaching"),
                        new Sectional("DAO1704", "A6", 830, 1130, "Tuesday", "BIZ1-0303", allWeeks, "Sectional Teaching"),
                        new Sectional("DAO1704", "A7", 1500, 1800, "Tuesday", "BIZ1-0203", allWeeks, "Sectional Teaching"),
                        new Sectional("DAO1704", "A8", 1500, 1800, "Tuesday", "BIZ1-0301", allWeeks, "Sectional Teaching"),
                        new Sectional("DAO1704", "A9", 1500, 1800, "Tuesday", "BIZ1-0206", allWeeks, "Sectional Teaching")
                )
        );

        allModule.put("ES2002", new Module("ES2002",
                        new Sectional("ES2002", "G04", 830, 1130, "Monday", "BIZ2-0116", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G19", 830, 1130, "Monday", "BIZ2-0115", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G18", 1200, 1500, "Monday", "BIZ2-0116", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G20", 1200, 1500, "Monday", "BIZ2-0115", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G06", 1500, 1800, "Monday", "BIZ2-0116", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G16", 1500, 1800, "Monday", "BIZ2-0115", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G07", 830, 1130, "Tuesday", "BIZ2-0116", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G02", 1200, 1500, "Tuesday", "BIZ2-0116", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G12", 1200, 1500, "Tuesday", "BIZ2-0115", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G10", 830, 1130, "Wednesday", "BIZ2-0116", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G11", 830, 1130, "Wednesday", "BIZ2-0115", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G08", 1200, 1500, "Wednesday", "BIZ2-0116", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G14", 1200, 1500, "Wednesday", "BIZ2-0115", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G05", 830, 1130, "Thursday", "BIZ2-0116", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G13", 830, 1130, "Thursday", "BIZ2-0115", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G03", 1500, 1800, "Thursday", "BIZ2-0115", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G01", 830, 1130, "Friday", "BIZ2-0116", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G09", 830, 1130, "Friday", "BIZ2-0115", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G15", 1200, 1500, "Friday", "BIZ2-0116", allWeeks, "Sectional Teaching"),
                        new Sectional("ES2002", "G23", 1500, 1800, "Friday", "BIZ2-0112", allWeeks, "Sectional Teaching")
                )
        );

        allModule.put("UTW1001S", new Module("UTW1001S",
                        new Sectional("UTW1001S", "1", 1400, 1600, "Monday", "TC-SR5", allWeeks, "Sectional Teaching"),
                        new Sectional("UTW1001S", "2", 1600, 1800, "Monday", "CAPT-SRA", allWeeks, "Sectional Teaching"),
                        new Sectional("UTW1001S", "3", 1000, 1200, "Tuesday", "RC4-SR5", allWeeks, "Sectional Teaching"),
                        new Sectional("UTW1001S", "1", 1400, 1600, "Thursday", "TC-SR5", allWeeks, "Sectional Teaching"),
                        new Sectional("UTW1001S", "2", 1600, 1800, "Thursday", "CAPT-SRA", allWeeks, "Sectional Teaching"),
                        new Sectional("UTW1001S", "3", 1000, 1200, "Friday", "RC4-SR5", allWeeks, "Sectional Teaching")
                )
        );

        allModule.put("MNO1706A", new Module("MNO1706A",
                        new Sectional("MNO1706A", "A1", 830, 1130, "Monday", "BIZ2-0509", allWeeks, "Sectional Teaching"),
                        new Sectional("MNO1706A", "A2", 1500, 1800, "Monday", "BIZ2-0509", allWeeks, "Sectional Teaching"),
                        new Sectional("MNO1706A", "A3", 830, 1130, "Tuesday", "BIZ2-0510", allWeeks, "Sectional Teaching"),
                        new Sectional("MNO1706A", "A4", 1500, 1800, "Tuesday", "BIZ2-0510", allWeeks, "Sectional Teaching")
                )
        );

        allModule.put("BSP1703", new Module("BSP1703",
                        new Lecture("BSP1703", "D1", 1200, 1400, "Tuesday", "LT17", allWeeks, "Lecture"),
                        new Lecture("BSP1703", "D2", 1200, 1400, "Wednesday", "LT17", allWeeks, "Lecture"),
                        new Lecture("BSP1703", "D3", 1400, 1600, "Wednesday", "LT17", allWeeks, "Lecture"),
                        new Tutorial("BSP1703", "D01", 830, 930, "Tuesday", "BIZ2-0118", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D02", 930, 1030, "Tuesday", "BIZ2-0118", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D03", 1030, 1130, "Tuesday", "BIZ2-0118", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D04", 1400, 1600, "Tuesday", "BIZ2-0118", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D05", 930, 1030, "Wednesday", "BIZ2-0118", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D06", 1030, 1130, "Wednesday", "BIZ2-0118", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D07", 830, 930, "Thursday", "BIZ2-0228", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D08", 930, 1030, "Thursday", "BIZ2-0228", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D09", 1030, 1130, "Thursday", "BIZ2-0228", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D10", 1200, 1300, "Thursday", "BIZ2-0228", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D11", 1300, 1400, "Thursday", "BIZ2-0228", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D12", 1400, 1500, "Thursday", "BIZ2-0228", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D13", 1500, 1600, "Thursday", "BIZ2-0228", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D14", 1600, 1700, "Thursday", "BIZ2-0228", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D15", 1700, 1800, "Thursday", "BIZ2-0228", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D16", 830, 930, "Friday", "BIZ2-0301", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D17", 930, 1030, "Friday", "BIZ2-0301", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D18", 1030, 1130, "Friday", "BIZ2-0301", allWeeks, "Tutorial"),
                        new Tutorial("BSP1703", "D19", 1200, 1300, "Friday", "BIZ2-0301", allWeeks, "Tutorial")
                )
        );

        allModule.put("BPM1705", new Module("BSP1705",
                        new Sectional("BPM1705", "A1", 1000, 1200, "Saturday", "LT16", Arrays.asList(2), "Sectional Teaching"),	//shld be week 2
                        new Sectional("BPM1705", "A3", 1000, 1200, "Saturday", "LT17", Arrays.asList(2), "Sectional Teaching"),
                        new Sectional("BPM1705", "A2", 1300, 1500, "Saturday", "LT16", Arrays.asList(2), "Sectional Teaching"),
                        new Sectional("BPM1705", "A4", 1300, 1500, "Saturday", "LT17", Arrays.asList(2), "Sectional Teaching")
                )
        );

        allModule.put("BPM1702", new Module("BPM1702",
                        new Sectional("BPM1702", "A1", 1800, 1830, "Saturday", "LT16", Arrays.asList(1), "Sectional Teaching"),	//shld be week 1
                        new Sectional("BPM1702", "A2", 1830, 1900, "Saturday", "LT16", Arrays.asList(1), "Sectional Teaching")
                )
        );

        allModule.put("BPM1701", new Module("BPM1701",
                        new Sectional("BPM1701", "A1", 2100, 2130, "Saturday", "LT16", Arrays.asList(1), "Sectional Teaching"),	//shld be week1
                        new Sectional("BPM1701", "A2", 2130, 2200, "Saturday", "LT16", Arrays.asList(1), "Sectional Teaching")
                )
        );
        allModule.put("EC2104", new Module("EC2104",
                        new Lecture("EC2104", "1", 1600, 1800, "Friday", "null", allWeeks, "Lecture"),
                        new Tutorial("EC2014", "W01", 1400, 1500, "Monday", "UTSRC-SR7", startWeekThree, "Tutorial"),
                        new Tutorial("EC2014", "W02", 1500, 1600, "Monday", "UTSRC-SR7", startWeekThree, "Tutorial"),
                        new Tutorial("EC2014", "W03", 1100, 1200, "Tuesday", "UTSRC-SR5", startWeekThree, "Tutorial"),
                        new Tutorial("EC2014", "W04", 1200, 1300, "Tuesday", "UTSRC-SR5", startWeekThree, "Tutorial"),
                        new Tutorial("EC2014", "W05", 1300, 1400, "Tuesday", "UTSRC-SR5", startWeekThree, "Tutorial"),
                        new Tutorial("EC2014", "W06", 1200, 1300, "Wednesday", "UTSRC-SR3", startWeekThree, "Tutorial"),
                        new Tutorial("EC2014", "W07", 1300, 1400, "Wednesday", "UTSRC-SR3", startWeekThree, "Tutorial"),
                        new Tutorial("EC2014", "W08", 1400, 1500, "Wednesday", "UTSRC-SR3", startWeekThree, "Tutorial"),
                        new Tutorial("EC2014", "W09", 1500, 1600, "Wednesday", "UTSRC-SR3", startWeekThree, "Tutorial"),
                        new Tutorial("EC2014", "W10", 900, 1000, "Thursday", "UTSRC-SR6", startWeekThree, "Tutorial"),
                        new Tutorial("EC2014", "W11", 1000, 1100, "Thursday", "UTSRC-SR6", startWeekThree, "Tutorial"),
                        new Tutorial("EC2014", "W12", 1400, 1500, "Thursday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2014", "W13", 1500, 1600, "Thursday", "AS7-0101", startWeekThree, "Tutorial")
                )
        );

        allModule.put("EC2101", new Module("EC2101",
                        new Lecture("EC2101", "2", 1400, 1600, "Friday", "null", allWeeks, "Lecture"),
                        new Lecture("EC2101", "1", 1400, 1600, "Thursday", "null", allWeeks, "Lecture"),
                        new Tutorial("EC2101", "W01", 1000, 1100, "Monday", "AS2-0509", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W02", 1100, 1200, "Monday", "AS2-0509", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W03", 1200, 1300, "Monday", "null", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W04", 1300, 1400, "Monday", "null", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W05", 1400, 1500, "Monday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W06", 1500, 1600, "Monday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W07", 1000, 1100, "Tuesday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W08", 1100, 1200, "Tuesday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W09", 1400, 1500, "Tuesday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W10", 1500, 1600, "Tuesday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W11", 1600, 1700, "Tuesday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W12", 1700, 1800, "Tuesday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W13", 900, 1000, "Wednesday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W14", 1000, 1100, "Wednesday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W15", 1200, 1300, "Wednesday", "null", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W16", 1300, 1400, "Wednesday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W17", 1400, 1500, "Wednesday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W18", 1500, 1600, "Wednesday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W19", 900, 1000, "Thursday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W20", 1000, 1100, "Thursday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W21", 1100, 1200, "Thursday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W22", 1200, 1300, "Thursday", "AS7-0101", startWeekThree, "Tutorial"),
                        new Tutorial("EC2101", "W23", 1300, 1400, "Thursday", "null", startWeekThree, "Tutorial")
                )
        );

        allModule.put("ACC1701X", new Module("ACC1701X",
                        new Lecture("ACC1701X", "X2", 1400, 1500, "Wednesday", "LT16", allWeeks, "Lecture"),
                        new Lecture("ACC1701X", "X1", 1000, 1200, "Wednesday", "LT16", allWeeks, "Lecture"),
                        new Tutorial("ACC1701X", "X17", 930, 1030, "Tuesday", "BIZ2-0117", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X18", 1030, 1130, "Tuesday", "BIZ2-0117", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X11", 1200, 1300, "Tuesday", "BIZ2-0302", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X12", 1300, 1400, "Tuesday", "BIZ2-0302", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X20", 1400, 1500, "Tuesday", "BIZ2-0117", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X13", 1200, 1300, "Wednesday", "BIZ2-0302", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X14", 1300, 1400, "Wednesday", "BIZ2-0302", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X01", 830, 930, "Thursday", "BIZ2-0118", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X02", 930, 1030, "Thursday", "BIZ2-0118", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X03", 1030, 1130, "Thursday", "BIZ2-0118", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X04", 1200, 1300, "Thursday", "BIZ2-0118", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X07", 1300, 1400, "Thursday", "BIZ2-0117", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X08", 1400, 1500, "Thursday", "BIZ2-0117", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X09", 1500, 1600, "Thursday", "BIZ2-0117", allWeeks, "Tutorial"),
                        new Tutorial("ACC1701X", "X10", 1600, 1700, "Thursday", "BIZ2-0117", allWeeks, "Tutorial")
                )
        );

        allModule.put("FAS1101", new Module("FAS1101",
                        new Tutorial("FAS1101", "22", 1000, 1200, "Monday", "AS3-0314", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "2", 1200, 1400, "Monday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "3", 1400, 1600, "Monday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "4", 1600, 1800, "Monday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "26", 800, 1000, "Tuesday", "AS3-0314", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "5", 1000, 1200, "Tuesday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "6", 1200, 1400, "Tuesday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "7", 1400, 1600, "Tuesday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "8", 1600, 1800, "Tuesday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "31", 1000, 1200, "Wednesday", "AS3-0314", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "12", 1200, 1400, "Wednesday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "11", 1400, 1600, "Wednesday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "12", 1600, 1800, "Wednesday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "13", 1000, 1200, "Thursday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "14", 1200, 1400, "Thursday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "15", 1400, 1600, "Thursday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "16", 1600, 1800, "Thursday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "17", 800, 1000, "Friday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "18", 1000, 1200, "Friday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "19", 1200, 1400, "Friday", "AS3-0312", startWeekTwo, "Tutorial"),
                        new Tutorial("FAS1101", "20", 1400, 1600, "Friday", "AS3-0312", startWeekTwo, "Tutorial")
                )
        );

        allModule.put("GET1050", new Module("GET1050",
                        new Tutorial("GET1050", "D1", 1000, 1200, "Monday", "TP-SR1", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E1", 1000, 1200, "Monday", "TP-SR1", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D2", 1200, 1400, "Monday", "TP-SR1", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E2", 1200, 1400, "Monday", "TP-SR1", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D3", 1400, 1600, "Monday", "ERC-SR8", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E3", 1400, 1600, "Monday", "TP-SR2", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D4", 1600, 1800, "Monday", "ERC-SR8", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E4", 1600, 1800, "Monday", "TP-SR2", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D5", 800, 1000, "Tuesday", "TP-SR1", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E5", 800, 1000, "Tuesday", "TP-SR1", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D6", 1000, 1200, "Tuesday", "TP-SR1", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E6", 1000, 1200, "Tuesday", "TP-SR1", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D7", 1000, 1200, "Wednesday", "TP-SR1", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E7", 1000, 1200, "Wednesday", "TP-SR1", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D8", 1200, 1400, "Wednesday", "TP-GLR", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E8", 1200, 1400, "Wednesday", "TP-SR1", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E9", 1400, 1600, "Wednesday", "TP-SR1", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D9", 1400, 1600, "Wednesday", "TP-GLR", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E10", 1600, 1800, "Wednesday", "TP-SR1", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D10", 1600, 1800, "Wednesday", "TP-GLR", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D11", 1000, 1200, "Thursday", "TP-GLR", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E11", 1000, 1200, "Thursday", "TP-GLR", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D12", 1200, 1400, "Thursday", "TP-SR1", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E12", 1200, 1400, "Thursday", "TP-SR1", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D13", 1600, 1800, "Thursday", "TP-GLR", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E13", 1600, 1800, "Thursday", "TP-GLR", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D14", 1800, 2000, "Thursday", "TP-SR1", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E14", 1800, 2000, "Thursday", "TP-SR1", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D15", 1000, 1200, "Friday", "TP-SR1", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E15", 1000, 1200, "Friday", "TP-SR1", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D16", 1200, 1400, "Friday", "TP-SR1", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E16", 1200, 1400, "Friday", "TP-SR1", evenWeeks, "Tutorial"),
                        new Tutorial("GET1050", "D17", 1400, 1600, "Friday", "TP-SR1", oddWeeks, "Tutorial"),
                        new Tutorial("GET1050", "E17", 1400, 1600, "Friday", "TP-SR1", evenWeeks, "Tutorial")
                )
        );
    }

    public Map<String, Module> getAll() {
        return allModule;
    }

    public Module get(String code) {
        return allModule.get(code);
    }
}




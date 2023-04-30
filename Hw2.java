/*
 * Дана строка json:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
package Lesson_2.hw;

public class Hw2 {
    public static void doWrongDesidionHW2() {
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        //String newjsonString = jsonString.replaceAll("\"", ",");
        //String[] newstring = newjsonString.split(",");
        String[] newstring = jsonString.replace("\"", "").replace(":", ",").replace("[{", "").replace("}]", "").replace(" {", "").replace("}", "").split(",");
        StringBuilder onlydata = new StringBuilder();
        for (int i=1; i < newstring.length; i+=6) {
            System.out.println("Студент " +  newstring[i] +  " получил " + newstring[i+2] + " по предмету " +  newstring[i+4]);
            onlydata.append("Студент " +  newstring[i] +  " получил " + newstring[i+2] + " по предмету " +  newstring[i+4]);
        }
        System.out.println(onlydata);;
    }
}

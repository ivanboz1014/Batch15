package class31;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo3 {
    public static void main(String[] args) {

        LinkedHashMap<String, String>row1=new LinkedHashMap<>();
        row1.put("name", "Hamid");
        row1.put("age","30");
        row1.put("city","San Ramon");
        row1.put("salary","120000");

        LinkedHashMap<String, String>row2=new LinkedHashMap<>();
        row2.put("name","Sam");
        row2.put("age", "60");
        row2.put("city","Houston");
        row2.put("salary","125000");

        List<Map<String, String>> allRows=new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        System.out.println(allRows);




    }
}

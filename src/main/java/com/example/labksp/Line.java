package com.example.labksp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Line  {
    private String string;
    private  String value;

    public void getvalue(int x1,int x2,int y1,int y2)
    {
        value = (x2 -x1) + "*"+ "(x-" + x1 + ") =" + "(y-" +y1 + ")*" + (y2-y1);
    }

    public void getvalue(List<Double> lst)
    {
        value = (lst.get(1) - lst.get(0)) + "*"+ "(x-" + lst.get(0) + ")=" + "(y-" + lst.get(2)+ ")*" + (lst.get(3)-lst.get(2));
    }
    public String getvalue(String str)
    {
        ArrayList<Double> lst = new ArrayList<Double>();
        Pattern pattern = Pattern.compile("\\d+");

        Matcher matcher = pattern.matcher(str);
        int start = 0;
        while (matcher.find(start)) {
            String value = str.substring(matcher.start(), matcher.end());
            double result = Integer.parseInt(value);
            lst.add(result);
            start = matcher.end();
        }
        value = (lst.get(1) - lst.get(0)) + "*"+ "(x-" + lst.get(0) + ")=" + "(y-" + lst.get(2)+ ")*" + (lst.get(3)-lst.get(2));
        return value;
    }

    public String getResult()
    {
        return value;
    }

}

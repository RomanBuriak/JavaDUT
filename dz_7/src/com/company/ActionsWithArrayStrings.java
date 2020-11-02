package com.company;



public class ActionsWithArrayStrings {
    public String[] reverseArrayStrings(String[] strArr){
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < strArr.length; i++) {
            stringBuffer.append(strArr[i]);
        }
        stringBuffer.reverse();
        int startIndex = 0;
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = stringBuffer.substring(startIndex,startIndex + strArr[i].length());
            startIndex += strArr[i].length();
        }

        return strArr;
    }
}

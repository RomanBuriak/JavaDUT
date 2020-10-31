package com.company;

public class StringCalculator {
    public float calcStr(String str){
        char[] arrCharStr = str.toCharArray();
        float calcStr = 0;
        for (int i = 0; i < arrCharStr.length; i++) {
            if(arrCharStr[i]>='0'&&arrCharStr[i]<='9'){
                calcStr = arrCharStr[i] - '0';
            }
            else if(arrCharStr[i]=='+'||arrCharStr[i]=='-'||arrCharStr[i]=='*'||arrCharStr[i]=='/'){
                switch (arrCharStr[i]){
                    case '+':
                        calcStr += arrCharStr[i+1]-'0';
                        i++;
                        break;
                    case '-':
                        calcStr -= arrCharStr[i+1]-'0';
                        i++;
                        break;
                    case '*':
                        calcStr *= arrCharStr[i+1]-'0';
                        i++;
                        break;
                    case '/':
                        calcStr /= arrCharStr[i+1]-'0';
                        i++;
                        break;
                }
            }
        }
        return calcStr;
    }
}

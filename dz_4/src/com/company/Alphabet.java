package com.company;




public class Alphabet {
    public void RaisingTheLettersFromHToT(String s){
        s.chars().mapToObj(item -> (char) item).map(x->(x>='h' && x<='t')?Character.toUpperCase(x):x).forEach(System.out::print);
        //List<Character> list = s.chars().mapToObj(item -> (char) item).collect(Collectors.toList());
        //Stream stream;
        //List<String> listStrings = Stream.of().map(x->new char).collect(Collectors.toList());
        //List<String> listStrings = Stream.of(s.split(",")).map (String::new).filter(x->(x.charAt(0)>=104&&x.charAt(0)<=116)).map(String::toUpperCase).collect(Collectors.toList());
        //listStrings.stream().filter(x->(x.charAt(0)>='h' && x.charAt(0)<='t')).map(String::toUpperCase).forEach(System.out::println);
        //System.out.println(String.join("", listStrings));

        //return list.stream().filter(x->(x>='h'&&x<='t')).map(x->x=Character.toUpperCase(x)).collect(Collectors.joining());


        /*
        char chOld, chNew;
        String str = "";
        chOld = 'h';


        int difference = 'h'-'H';
        int c = 0;
        for (int i = 0; i <= 12; i++) {
            chOld = (char)( chOld + c);
            chNew = (char)((int)chOld - difference);
            if(c == 0){
                str = s.replace(chOld, chNew);
            }
            else {
                str = str.replace(chOld, chNew);
            }
            c = 1;

            System.out.println(str);

        }

*/

    }
}

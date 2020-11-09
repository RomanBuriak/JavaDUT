package com.company;


import java.util.List;


public class SortC {
    public void sort_c(List<String> myList){

        myList.stream().sorted().filter(x -> x.charAt(0)=='c').forEach(System.out::println);


        /*
        String s;
        String[] arrC = {"c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9"};
        String[] arrbigC = {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9"};
        ArrayList<String> sort = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++){
            if(myList.get(i).equals("c1") || myList.get(i).equals("c2") || myList.get(i).equals("c3") || myList.get(i).equals("c4") || myList.get(i).equals("c5") || myList.get(i).equals("c6") || myList.get(i).equals("c7") || myList.get(i).equals("c8") || myList.get(i).equals("c9")){
                sort.add(myList.get(i));
            }
        }

        //c > C
        for (int i = 0; i < sort.size(); i++){
            for (int j = 0; j < arrC.length; j++) {
                if(sort.get(i).equals(arrC[j])){
                    sort.set(i,arrbigC[j]);

                }
            }
        }

        //sort
        for(int i = sort.size()-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( sort.get(j).charAt(1) > sort.get(j+1).charAt(1) ){
                    String tmp = sort.get(j);
                    sort.set(j, sort.get(j+1));
                    sort.set(j+1, tmp);
                }
            }
        }



        System.out.println(sort);

         */
    }


}

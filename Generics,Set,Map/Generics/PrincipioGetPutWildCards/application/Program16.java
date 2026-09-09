package application;

import java.util.ArrayList;
import java.util.List;

public class Program16 {

    public static void main(String[] args) {

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Cássia");
        myObjs.add("Luiz");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(5);

        Number x = myNums.get(0); //Erro de compilação (contravariância)

    }
}

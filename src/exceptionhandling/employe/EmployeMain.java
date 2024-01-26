package exceptionhandling.employe;

import java.util.Collections;
import java.util.LinkedList;

public class EmployeMain {

    public static void main(String [] args)
    {
        LinkedList list =new LinkedList();
        list.add(new Employes("ABDFGNC",9,15));
        list.add(new Employes("CDGHDFGHJJE",8,2));
        list.add(new Employes("FGSDFGHJKH",5,3));
        list.add(new Employes("IE",4,4));
        list.add(new Employes("LER",7,3));
        list.add(new Employes("OPDFGHJQ",3,4));

        Collections.sort(list,Employes.salaryCompartor);
        System.out.println(list);

        Collections.sort(list,Employes.eidCompartor);
        System.out.println(list);

        Collections.sort(list,Employes.namComparator);
        System.out.println(list);
    }
}

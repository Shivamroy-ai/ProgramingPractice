package exceptionhandling.employe;

import java.util.Comparator;
import java.util.Objects;

public class Employes {
    String name;
    int salary;
    int eid;
    Employes(String name,int salary,int eid)
    {
        this.name=name;
        this.salary=salary;
        this.eid=eid;
    }
    public static Comparator <Employes> namComparator=new Comparator<Employes>() {
        @Override
        public int compare(Employes o1, Employes o2) {
            return  o1.name.length() - o2.name.length();
        }
    };
    public static Comparator <Employes> salaryCompartor=new Comparator<Employes>() {
        @Override
        public int compare(Employes o1, Employes o2) { 
            return o1.salary-o2.salary;
        }
    };
    public static Comparator<Employes> eidCompartor=new Comparator<Employes>() {
        @Override
        public int compare(Employes o1, Employes o2) {
            return o1.eid - o2.eid;
        }
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employes employes = (Employes) o;
        return salary == employes.salary && eid == employes.eid && Objects.equals(name, employes.name);
    }

    @Override
    public String toString() {
        return "Employes{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", eid=" + eid +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, eid);
    }
}

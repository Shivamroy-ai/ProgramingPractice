package typecasting;

public class Main {

    public static void main(String[] args) {
//        Parent parent=new Child();
//        parent.printParent();
//        parent.parent();
//        Child child= (Child) parent;
//         child.printParent();
//         child.child();

        String bigstring="23,685,87,48,897,8,7863,13";
        String stringarr[]=bigstring.split(",");
        int []integers=new int[stringarr.length];
        int cont=0;
        for (String singlestr:stringarr)
        {
            integers[cont]=Integer.valueOf(singlestr);
            cont++;
        }

        System.out.println("Size of Array = "+integers.length);
        int large=integers[0];
        for (int i=0;i<integers.length-1;i++)
        {
            if(i<integers.length-1&&integers[i]<=integers[i+1])
            {
                large=integers[i+1];
            }
        }
        System.out.println("Larger No = "+large);
    }
}

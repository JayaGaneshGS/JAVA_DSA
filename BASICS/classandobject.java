public class classandobject {
    String name = "";
    String proc = "";
    String ram = "";
    String gpu = "";
    int price = 0;
    public static void main(String args[]   ){
        classandobject Lap1 = new classandobject();
        Lap1.name = "Dell";
        Lap1.proc = "i5";
        Lap1.ram = "16GB";
        Lap1.gpu = "NVIDIA RTX 4050";
        Lap1.price = 100000;
        System.out.println(Lap1.name);
        System.out.println(Lap1.proc);
        System.out.println(Lap1.ram);
        System.out.println(Lap1.gpu);
        System.out.println(Lap1.price);

        classandobject Lap2 = new classandobject();
        Lap2.name = "HP";
        Lap2.proc = "i7";
        Lap2.ram = "32GB";
        Lap2.gpu = "NVIDIA RTX 4080";
        Lap2.price = 200000;
        System.out.println(Lap2.name);
        System.out.println(Lap2.proc);
        System.out.println(Lap2.ram);
        System.out.println(Lap2.gpu);
        System.out.println(Lap2.price);

        classandobject Lap3 = new classandobject();
        Lap3.name = "Asus ROG";
        Lap3.proc = "i9";
        Lap3.ram = "64GB";
        Lap3.gpu = "NVIDIA RTX 5090";
        Lap3.price = 300000;
        System.out.println(Lap3.name);
        System.out.println(Lap3.proc);
        System.out.println(Lap3.ram);
        System.out.println(Lap3.gpu);
        System.out.println(Lap3.price);
    }
}

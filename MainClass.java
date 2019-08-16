import java.util.Scanner;

class MainClass {
    public static void main(String[] args) {
        
        InterfaceActivity s = new ScientificStudent("");
        ScientificStudent d = new ScientificStudent(null); 
        Kelas k = new Kelas();
        Teacher b = new Teacher();
        Economic c = new Economic("");
        Math m = new Math("");

        String hasil;
        String hasilname;

        Scanner sc = new Scanner(System.in);
        
        String usr ="";
        String pass ="";
        System.out.print("Username : ");
        usr = sc.nextLine();
        System.out.print("Password : ");
        pass = sc.nextLine();

        if(usr.equals("imam") && pass.equals("b12001823")) {
            
            try{
                System.out.print("Input your activity : ");
                hasil = sc.next();
                System.out.print("Input your name : ");
                hasilname = sc.next();

                if(hasil.equals("exam")) {
                    d.rizky();
                    s.exam();
                    k.setKelas("10");
                    b.setTeacher("Mr.Sandi");
                    c.setEconomic("80");
                    m.setMath("75");
                    
                    System.out.println("Class : " +k.getKelas());
                    System.out.println("Teacher : " +b.getTeacher());
                    System.out.println("Score Economic : " +c.getEconomic());
                    System.out.println("Score Math : " +m.getMath());

                } else if(hasil.equals("exercise")) {
                    d.haris();
                    s.exercise();
                    k.setKelas("12");
                    b.setTeacher("Mr.Rizky");
                    c.setEconomic("80");
                    m.setMath("90");

                    System.out.println("Class : " +k.getKelas());
                    System.out.println("Teacher : " +b.getTeacher());
                    System.out.println("Score Economic : " +c.getEconomic());
                    System.out.println("Score Math : " +m.getMath());

                } else if(hasil.equals("interview")) {
                    d.rezi();
                    s.interview();
                    k.setKelas("11");
                    b.setTeacher("Ms.Febri");
                    c.setEconomic("78");
                    m.setMath("75");

                    System.out.println("Class : " +k.getKelas());
                    System.out.println("Teacher : " +b.getTeacher());
                    System.out.println("Score Economic : " +c.getEconomic());
                    System.out.println("Score Math : " +m.getMath());

                } else if(hasil.equals("presentation")) {
                    d.gina();
                    s.presentation();
                    k.setKelas("12");
                    b.setTeacher("Ms.Dina");
                    c.setEconomic("78");
                    m.setMath("80");

                    System.out.println("Class : " +k.getKelas());
                    System.out.println("Teacher : " +b.getTeacher());
                    System.out.println("Score Economic : " +c.getEconomic());
                    System.out.println("Score Math : " +m.getMath());
                
                }
            } catch (Exception e) {System.out.println(e);}
        }
    }
}
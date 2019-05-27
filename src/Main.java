public class Main {



    public static void main(String args[]){

        Voiture  v1 = new Voiture();
        Moto  m1 = new Moto();

        System.out.println(v1.toString());

        System.out.println(m1.toString());

        v1.setModele("BMW");

        System.out.println(v1.toString());

        m1.setModele("Honda");
        System.out.println(m1.toString());
        System.out.println(v1.toString());

    }
}

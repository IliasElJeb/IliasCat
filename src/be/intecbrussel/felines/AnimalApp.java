package be.intecbrussel.felines;


public class AnimalApp{
    public static void main(String[] args) {


        Felis[] cats = {new PersianCat(), new SiameseCat(), new TurkishVanCat(), new AndeanMountainCat(), new NorwegianForestCat()};

        Felis pc = cats[0];

        pc.setBadgeNo(34);
        pc.setShelterNo(538);


        Felis sc = cats[1];
        sc.setBadgeNo(35);
        sc.setShelterNo(543);


        Felis tc = cats[2];
        tc.setBadgeNo(36);
        tc.setShelterNo(374);


        Felis ac = cats[3];
        ac.setBadgeNo(38);
        ac.setShelterNo(832);


        Felis nc = cats[4];
        nc.setBadgeNo(39);
        nc.setShelterNo(822);



        System.out.println(nc.equals(ac));
    }

}




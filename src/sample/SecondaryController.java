package sample;

public class SecondaryController {

    public void run() {
        Cat merlin = new Cat(
                "Merlin",
                "biało-czarny",
                "Miauuu");

        System.out.println(merlin.meow());

        merlin.setServant(new Volunteer("Gaba", 22));
        System.out.println(merlin.ownerInfo());

        Schronisko zielonki = new Schronisko();
        Transporter transporter1 = new Transporter();
        transporter1.open();
        transporter1.putCatIn(merlin);
        zielonki.admitPet(transporter1);

        Cat cat = (Cat) zielonki.getPets().get(0);
        System.out.println(cat == merlin);

        cat.setName("Melrin");
        System.out.println(merlin.getName());

        System.out.println(((Cat) zielonki.getPets().get(0)).getServant().getName());
    }
}

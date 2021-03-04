package sample;

public class MainController {

    public void run(){
        Cat pierwszy = new Cat("Lucy", "Biało-czarny", "Meow!");
        Cat drugi = new Cat("Bohun", "czarny", "мяу!");
        Cat trzeci = new Cat("rudy");

        introduceCats(pierwszy, drugi, trzeci);


        Transporter transporter1 = new Transporter();
        Transporter transporter2 = new Transporter();

        transporter1.checkContent();
        transporter2.checkContent();
        transporter1.open();
        transporter2.open();

        transporter1.putCatIn(pierwszy);

        Schronisko zielonki = new Schronisko();
        zielonki.admitPet(transporter1);
        zielonki.admitPet(transporter2);
        zielonki.checkCats();
    }


    private void introduceCats(Cat pierwszy, Cat drugi, Cat trzeci){
        introduceCat(pierwszy);
        introduceCat(drugi);
        introduceCat(trzeci);
    }

    private void introduceCat(Cat cat){
        System.out.println(cat.getName() + " robi " + cat.meow());
    }
}

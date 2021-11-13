package com.bilgeadam.hayvanatbahcesi;
//İnheritance
//süperclass'ın özelliklerini subclass alıyor.
//extends ile sağlanır.
public class Kopek extends Hayvan{
    private String kopekCins;

    public String getKopekCins() {
        return kopekCins;
    }

    public void setKopekCins(String kopekCins) {
        this.kopekCins = kopekCins;
    }

    //Method overriding
    //süperclass methodunu kendine özgü tekrar yazıyoruz.
    public void sesCikar(){
        System.out.println("Hav Hav Hav");
    }

    @Override
    public String toString() {
        return "Ad: "+getAd()+"\n"+
                "Ağırlık: "+getAgirlik()+"\n"+
                "Uzunluk: "+getUzunluk()+"\n"+
                "Cins: "+getKopekCins();
    }
}

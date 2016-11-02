package hello;

public class Greeting {

    private String imie;
    private String nazwisko;
    private String mail;
    private String wiadomosc;

    public boolean isEmpty(String var){
        if (var == ""){
            return true;
        } else {
            return false;
        }
    }

    public boolean validate(String var){
        for (char c:var.toCharArray()){
            switch (c){
                case '<':return false;
                case '>':return false;
                case '{':return false;
                case '}':return false;
            }
        }
        return true;
    }

    public String getValue(String var){
        if (isEmpty(var)){
            return  "error;Prosze podac jakos wartosc";
        } else if (!validate(var)){
            return  "error;Prosze nie dodawac znaków HTML!";
        } else {
            return var;
        }
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) { this.imie = getValue(imie); }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = getValue(nazwisko);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = getValue(mail);
    }

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = getValue(wiadomosc);
    }

}

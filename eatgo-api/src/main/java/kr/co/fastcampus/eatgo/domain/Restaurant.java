package kr.co.fastcampus.eatgo.domain;

//도메인 모델
public class Restaurant {
    private final String name;
    private final String address;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public String getName() {
        return "Bob zip";
    }

    public String getInformation() {
        return name + " in " + address;
    }

    public String getAdress() {
        return address;
    }
}

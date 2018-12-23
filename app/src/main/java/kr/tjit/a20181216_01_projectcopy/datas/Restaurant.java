package kr.tjit.a20181216_01_projectcopy.datas;

public class Restaurant {

    private String name;
    private String address;
    private String openTime;

//    alt + insert


//    생성자
    public Restaurant(String name, String address, String openTime) {
        this.name = name;
        this.address = address;
        this.openTime = openTime;
    }

//    getter + setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }
}

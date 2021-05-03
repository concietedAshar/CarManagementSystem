package com.example.carmanagementsystem;

public class Information {
    String name;
    String phoneNo;
    String carName;
    int imageId;

    public Information() {
    }

    public Information( int imageId, String name, String phoneNo, String carName) {
          this.imageId = imageId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.carName = carName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", carName='" + carName + '\'' +
                '}';
    }
}

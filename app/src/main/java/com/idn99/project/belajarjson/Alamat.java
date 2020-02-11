package com.idn99.project.belajarjson;

class Alamat {

    private String namaAddress;
    private String detailAddress;
    private String city;

    public Alamat(String namaAddress, String detailAddress, String city) {
        this.namaAddress = namaAddress;
        this.detailAddress = detailAddress;
        this.city = city;
    }

    public String getNamaAddress() {
        return namaAddress;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public String getCity() {
        return city;
    }
}

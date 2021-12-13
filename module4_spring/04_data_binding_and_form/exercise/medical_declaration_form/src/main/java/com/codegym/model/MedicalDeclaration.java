package com.codegym.model;

public class MedicalDeclaration {
    private String name;
    private String birthday;
    private boolean gender;
    private String nationality;
    private String idCard;
    private String vehicle;
    private String vehicleNumber;
    private int seats;
    private String departureDay;
    private String departureMonth;
    private String departureYear;
    private String arrivalDay;
    private String arrivalMonth;
    private String arrivalYear;
    private String passedCity;
    private String province;
    private String district;
    private String wards;
    private String detailAddress;
    private String phoneNumber;
    private String email;
    private boolean isFever;
    private boolean isCough;
    private boolean isStuffy;
    private boolean isSoreThroat;
    private boolean isNausea;
    private boolean isDiarrhea;
    private boolean isHemorrhage;
    private boolean isRash;
    private boolean isSickAnimal;
    private boolean isSickPeople;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(String name, String birthday, boolean gender, String nationality, String idCard, String vehicle, String vehicleNumber, int seats, String departureDay, String departureMonth, String departureYear, String arrivalDay, String arrivalMonth, String arrivalYear, String passedCity, String province, String district, String wards, String detailAddress, String phoneNumber, String email, boolean isFever, boolean isCough, boolean isStuffy, boolean isSoreThroat, boolean isNausea, boolean isDiarrhea, boolean isHemorrhage, boolean isRash, boolean isSickAnimal, boolean isSickPeople) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.nationality = nationality;
        this.idCard = idCard;
        this.vehicle = vehicle;
        this.vehicleNumber = vehicleNumber;
        this.seats = seats;
        this.departureDay = departureDay;
        this.departureMonth = departureMonth;
        this.departureYear = departureYear;
        this.arrivalDay = arrivalDay;
        this.arrivalMonth = arrivalMonth;
        this.arrivalYear = arrivalYear;
        this.passedCity = passedCity;
        this.province = province;
        this.district = district;
        this.wards = wards;
        this.detailAddress = detailAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.isFever = isFever;
        this.isCough = isCough;
        this.isStuffy = isStuffy;
        this.isSoreThroat = isSoreThroat;
        this.isNausea = isNausea;
        this.isDiarrhea = isDiarrhea;
        this.isHemorrhage = isHemorrhage;
        this.isRash = isRash;
        this.isSickAnimal = isSickAnimal;
        this.isSickPeople = isSickPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(String departureDay) {
        this.departureDay = departureDay;
    }

    public String getDepartureMonth() {
        return departureMonth;
    }

    public void setDepartureMonth(String departureMonth) {
        this.departureMonth = departureMonth;
    }

    public String getDepartureYear() {
        return departureYear;
    }

    public void setDepartureYear(String departureYear) {
        this.departureYear = departureYear;
    }

    public String getArrivalDay() {
        return arrivalDay;
    }

    public void setArrivalDay(String arrivalDay) {
        this.arrivalDay = arrivalDay;
    }

    public String getArrivalMonth() {
        return arrivalMonth;
    }

    public void setArrivalMonth(String arrivalMonth) {
        this.arrivalMonth = arrivalMonth;
    }

    public String getArrivalYear() {
        return arrivalYear;
    }

    public void setArrivalYear(String arrivalYear) {
        this.arrivalYear = arrivalYear;
    }

    public String getPassedCity() {
        return passedCity;
    }

    public void setPassedCity(String passedCity) {
        this.passedCity = passedCity;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWards() {
        return wards;
    }

    public void setWards(String wards) {
        this.wards = wards;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isFever() {
        return isFever;
    }

    public void setFever(boolean fever) {
        isFever = fever;
    }

    public boolean isCough() {
        return isCough;
    }

    public void setCough(boolean cough) {
        isCough = cough;
    }

    public boolean isStuffy() {
        return isStuffy;
    }

    public void setStuffy(boolean stuffy) {
        isStuffy = stuffy;
    }

    public boolean isSoreThroat() {
        return isSoreThroat;
    }

    public void setSoreThroat(boolean soreThroat) {
        isSoreThroat = soreThroat;
    }

    public boolean isNausea() {
        return isNausea;
    }

    public void setNausea(boolean nausea) {
        isNausea = nausea;
    }

    public boolean isDiarrhea() {
        return isDiarrhea;
    }

    public void setDiarrhea(boolean diarrhea) {
        isDiarrhea = diarrhea;
    }

    public boolean isHemorrhage() {
        return isHemorrhage;
    }

    public void setHemorrhage(boolean hemorrhage) {
        isHemorrhage = hemorrhage;
    }

    public boolean isRash() {
        return isRash;
    }

    public void setRash(boolean rash) {
        isRash = rash;
    }

    public boolean isSickAnimal() {
        return isSickAnimal;
    }

    public void setSickAnimal(boolean sickAnimal) {
        isSickAnimal = sickAnimal;
    }

    public boolean isSickPeople() {
        return isSickPeople;
    }

    public void setSickPeople(boolean sickPeople) {
        isSickPeople = sickPeople;
    }
}

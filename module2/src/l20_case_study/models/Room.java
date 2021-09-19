package l20_case_study.models;

public class Room extends Facility{
    private boolean furniture;

    public Room() {
    }

    public Room(boolean furniture) {
        this.furniture = furniture;
    }

    public Room(String idFacility, String nameService, double areaUse, int rentalPrice, int peopleMax, String styleRental, boolean furniture) {
        super(idFacility, nameService, areaUse, rentalPrice, peopleMax, styleRental);
        this.furniture = furniture;
    }

    public boolean isFurniture() {
        return furniture;
    }

    public void setFurniture(boolean furniture) {
        this.furniture = furniture;
    }

    @Override
    public String toString() {
        return "Room{" +
                "furniture=" + furniture +
                "} " + super.toString();
    }
}

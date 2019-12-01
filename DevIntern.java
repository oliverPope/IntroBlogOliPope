import java.util.List;

public abstract class DevIntern {
    private String team = "Observability";
    private String building = "341";
    private String floor = "3";

    public String getTeam() {
        return team;
    }

    public String getBuilding() {
        return building;
    }

    public String getFloor(){
        return floor;
    }

    public abstract String getName();
    public abstract int getAge();
    public abstract String getHometown();
    public abstract List<String> getFactList();
    public abstract List<String> getInterestList();
    public abstract String getLocationInDepth();



}

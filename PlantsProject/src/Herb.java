public class Herb extends Plant {
    private boolean isMedicinal;
    private String season;

    public Herb(){
        this.isMedicinal=true;
        this.season=null;
    }

    public Herb(boolean isMedicinal, String season) {
        this.isMedicinal = isMedicinal;
        this.season = season;
    }

    public Herb(String name, String color, boolean isMedicinal, String season) {
        super(name, color);
        this.isMedicinal = isMedicinal;
        this.season = season;
    }

    public boolean isMedicinal() {
        return isMedicinal;
    }

    public void setMedicinal(boolean medicinal) {
        isMedicinal = medicinal;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Herb{" +
                "isMedicinal=" + isMedicinal +
                ", season='" + season + '\'' +
                '}';
    }
}

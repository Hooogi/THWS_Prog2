package lect_16.ex_4;

public enum Dangerzone {

    GEFAHR_LINKS(Actions.RECHTS),GEFAHR_RECHTS(Actions.LINKS),GEFAHR_VORNE(Actions.ABBREMSEN);

    public final Actions action;

    private Dangerzone(Actions action){
        this.action = action;
    }
}
package models;

public enum MenuOptions {
    DISPLAYINFORMATIONABOUTRANDOMMOVIE(1),
    DISPLAYACTORSFROMMOVIE(2),
    EXITAPPLICATION(3);
    int action;

    MenuOptions(int action) {
        this.action = action;
    }
}

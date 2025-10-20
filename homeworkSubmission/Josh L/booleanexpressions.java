public boolean cigarParty(int cigars, boolean isWeekend) {
    return cigars >= 40 && (isWeekend || cigars <= 60);
}

public int dateFashion(int you, int date) {
    int bad = Boolean.compare((you <= 2 || date <= 2), false);
    int good = Boolean.compare((you >= 8 || date >= 8), false);
    return 1 + good - 2 * bad;
}

public boolean squirrelPlay(int temp, boolean isSummer) {
    return (temp >= 60 && temp <= 90) || (isSummer && temp >= 60 && temp <= 100);
}

public int caughtSpeeding(int speed, boolean isBirthday) {
    int allowance = Boolean.compare(isBirthday, false) * 5;
    return Boolean.compare(speed > 60 + allowance, false)
         + Boolean.compare(speed > 80 + allowance, false);
}

public boolean makeBricks(int small, int big, int goal) {
    return goal - Math.min(goal / 5, big) * 5 <= small;
}

package tests;

public enum GettingStartedPage {
    FIRST("The Free Encyclopedia …in over 300 languages", "We’ve found the following on your device:"),
    SECOND("New ways to explore", "Dive down the Wikipedia rabbit hole with a constantly updating " +
            "Explore feed. Customize the feed to your interests – whether it’s learning about historical events " +
            "On this day, or rolling the dice with Random."),
    THIRD("Reading lists with sync", "You can make reading lists from articles you want to read later, even " +
            "when you’re offline. Login to your Wikipedia account to sync your reading lists. Join Wikipedia"),
    FOURTH("Send anonymous data", "Help make the app better by letting us know how you use it. Data collected " +
            "is anonymous. Learn more");

    private final String title;
    private final String subtitle;

    GettingStartedPage(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }
}

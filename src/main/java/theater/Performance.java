package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    private final String playID;
    private final int audience;

    /**
     * Creates a new performance.
     *
     * @param playID the ID of the play
     * @param audience number of audience members attending
     */
    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Returns the play ID.
     *
     * @return the play ID
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * Returns the audience size.
     *
     * @return number of audience members
     */
    public int getAudience() {
        return audience;
    }
}

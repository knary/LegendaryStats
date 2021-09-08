package games.lmdbg.rules.model

/** The possible game outcomes */
enum class Outcome {
    /** Players won by defeating the mastermind */
    WIN,

    /** Players lost due to the scheme */
    LOSS,

    /** Game was a draw (hero or villain deck ran out) */
    DRAW,

    /** Players did not finish playing */
    INCOMPLETE
}

/** Possible player counts */
enum class PlayerCount {
    SOLO,
    ADVANCED,
    TWO,
    THREE,
    FOUR,
    FIVE
}

/** All of the data about a play that can be validated */
data class Play(
    /** How did the game end? */
    val outcome: Outcome,
    /** How many players where there? */
    val players: PlayerCount,
    /** Which scheme was used? */
    val scheme: Int,
    /** What was the mastermind faced? */
    val mastermind: Int,
    /** What heroes made up the hero deck? */
    val heroes: Set<Int>,
    /** What villain groups where in the villain deck? */
    val villains: Set<Int>,
    /** What henchmen villain groups where in the villain deck? */
    val henchmen: Set<Int>,
    /** Which hero was used for a special purpose (i.e. not in the hero deck)? */
    val misc_hero: Int? = null
)


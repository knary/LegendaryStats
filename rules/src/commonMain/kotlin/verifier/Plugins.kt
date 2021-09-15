package games.lmdbg.rules.verifier

import kon.foo.model.Play

/** A list of all the release rules engine plugins */
val plugins: MutableSet<ReleaseRulesPlugin> = mutableSetOf()

/** Data about each release that the rules engine needs to validate sets including that release */
interface ReleaseRulesPlugin {
    /** The range of valid ID numbers for hero sets */
    val heroesRange: IntRange

    /** The range of valid ID numbers for villain sets */
    val villainsRange: IntRange

    /** The range of valid ID numbers for henchman villain sets */
    val henchmenRange: IntRange

    /** The range of valid ID numbers for schemes */
    val schemesRange: IntRange

    /** The range of valid ID numbers for masterminds */
    val mastermindRange: IntRange

    /**
     * Update count of card sets required based on the
     *
     * @param scheme The scheme
     */
    fun updateSetCountsFromScheme(scheme: Int, setCounts: SetCounts)
}
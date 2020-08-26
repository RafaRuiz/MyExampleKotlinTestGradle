package com.mypinpad

import org.junit.Test

class MyPinpadTests {

    @Test
    fun `true when it's a word starting with (A-Z)`() {
        val subjectWord = "Mypinpad"

        val isInRange = isInRange(subjectWord)

        assert(isInRange)
    }

    @Test
    fun `false when it's a word starting with (a-z)`() {
        val subjectWord = "mypinpad"

        val isInRange = isInRange(subjectWord)

        assert(!isInRange)
    }

    @Test
    fun `true when it's a mixed uppercase & lowercase word starting with (A-Z)`() {
        val subjectWord = "MyPiNpAd"

        val isInRange = isInRange(subjectWord)

        assert(isInRange)
    }

    @Test
    fun `false when it's a mixed uppercase & lowercase word starting with (a-z)`() {
        val subjectWord = "myPiNpAd"

        val isInRange = isInRange(subjectWord)

        assert(!isInRange)
    }

    @Test
    fun `false when it's a word starting with (A-Z) but it has a space as prefix`() {
        val subjectWord = " MyPiNpAd"

        val isInRange = isInRange(subjectWord)

        assert(!isInRange)
    }

    @Test
    fun `true when it's just a letter between (A-Z)`() {
        val subjectWord = "K"

        val isInRange = isInRange(subjectWord)

        assert(isInRange)
    }

    @Test
    fun `false when it's just a letter between (A-Z)`() {
        val subjectWord = "o"

        val isInRange = isInRange(subjectWord)

        assert(!isInRange)
    }

    @Test
    fun `false when it's just a number`() {
        val subjectWord = "3"

        val isInRange = isInRange(subjectWord)

        assert(!isInRange)
    }

    @Test
    fun `false when it's just a weird character - 1`() {
        val subjectWord = "˘"

        val isInRange = isInRange(subjectWord)

        assert(!isInRange)
    }

    @Test
    fun `false when it's just a weird character - 2`() {
        val subjectWord = "ñ"

        val isInRange = isInRange(subjectWord)

        assert(!isInRange)
    }

    @Test
    fun `false when it's just a weird character - 3`() {
        val subjectWord = "!"

        val isInRange = isInRange(subjectWord)

        assert(!isInRange)
    }

    @Test
    fun `false when it's just a weird character - 4`() {
        val subjectWord = "🤔"

        val isInRange = isInRange(subjectWord)

        assert(!isInRange)
    }

    @Test
    fun `false when it's null`() {
        val subjectWord: String? = null

        val isInRange = isInRange(subjectWord)

        assert(!isInRange)
    }

    @Test
    fun `false when it's empty`() {
        val subjectWord = ""

        val isInRange = isInRange(subjectWord)

        assert(!isInRange)
    }

    /**
     * An extended character is an ASCII character which is not in the standard ASCII character set,
     * which uses 7-bit characters and thus has values 0 to 127,
     * this means that letters like "Ñ", "È", "Ł" aren't in range [A-Z]
     */
    @Test
    fun `false when it's an extended character`() {
        val subjectWord = "Ñ"

        val isInRange = isInRange(subjectWord)

        assert(!isInRange)
    }
}
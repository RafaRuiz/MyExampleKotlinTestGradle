package com.example

/**
 * function isInRange takes a:
 * @param subject which is an optional String (nullable) and
 * @return true if the first letter is between the range [A-Z] or
 * @return false otherwise
 *
 * The function is optimized so it doesn't take as long as other similar
 * solutions (creating ranges such as ('A'..'Z'), using `.contains()`, etc)
 */
fun isInRange(subject: String?): Boolean {
    return subject
        ?.getOrNull(0)
        ?.toString()
        ?.matches(Regex("[A-Z]"))
        ?: false
}
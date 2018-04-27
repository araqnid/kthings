package org.araqnid.kthings

import kotlinx.html.*
import kotlinx.html.stream.appendHTML
import org.araqnid.kthings.common.Emotion
import java.net.URI
import java.time.LocalDate

class HtmlEmailGenerator(private val serverUri: URI) {
    fun emailFor(email: String, date: LocalDate): String {
        return buildString {
            appendHTML(false).div {
                div { +"Tell us your feeling for today:" }
                ul {
                    Emotion.values().forEach { emotion ->
                        li {
                            +emotion.toString()
                        }
                    }
                }
            }
        }
    }
}

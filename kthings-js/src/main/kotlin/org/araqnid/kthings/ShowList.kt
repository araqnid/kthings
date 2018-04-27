package org.araqnid.kthings

import kotlinx.html.*
import kotlinx.html.dom.append
import org.araqnid.kthings.common.Emotion
import kotlin.browser.document

fun main(args: Array<String>) {
    document.body!!.append {
        div {
            div { +"Tell us your feeling for today" }
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

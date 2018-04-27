package org.araqnid.kthings.common

import java.security.SecureRandom

private val randomNumberGenerator = SecureRandom()

actual fun randomNumber() = randomNumberGenerator.nextDouble()

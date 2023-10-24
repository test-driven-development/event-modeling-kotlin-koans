package io.confluent.examples.autonomo.transfer

import com.google.protobuf.Timestamp
import com.google.protobuf.timestamp
import java.time.Instant

fun Timestamp.toInstant(): Instant =
    Instant.ofEpochSecond(seconds, nanos.toLong())

fun Instant.toTimestamp(): Timestamp =
    timestamp { seconds = epochSecond; nanos = nano }

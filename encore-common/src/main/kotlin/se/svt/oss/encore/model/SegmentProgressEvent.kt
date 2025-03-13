// SPDX-FileCopyrightText: 2020 Sveriges Television AB
//
// SPDX-License-Identifier: EUPL-1.2

package se.svt.oss.encore.model

import java.util.UUID

data class SegmentProgressEvent(
    val jobId: UUID,
    val segment: Int,
    val success: Boolean,
) : RedisEvent

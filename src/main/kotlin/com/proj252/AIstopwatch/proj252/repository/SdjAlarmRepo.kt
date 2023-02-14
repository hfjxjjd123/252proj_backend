package com.proj252.AIstopwatch.proj252.repository

import com.proj252.AIstopwatch.proj252.domain.Alarm
import com.proj252.AIstopwatch.proj252.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface SdjAlarmRepo: JpaRepository<Alarm,User> {
    @Override
    override fun findById(id: User): Optional<Alarm>
}
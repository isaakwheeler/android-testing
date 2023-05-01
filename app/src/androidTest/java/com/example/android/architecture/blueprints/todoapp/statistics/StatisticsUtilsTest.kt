package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*

class StatisticsUtilsTest {


        fun getActiveAndCompletedStats_noCompleted_returnsHundredZero() {
            // Create an active task
            val tasks = listOf<Task>(
                Task("title", "desc", isCompleted = false)
            )
            // Call your function
            val result = getActiveAndCompletedStats(tasks)
            // Check the result
            assertThat(result.activeTasksPercent, `is`(100f))
            assertThat(result.completedTasksPercent, `is`(0f))

        }

}
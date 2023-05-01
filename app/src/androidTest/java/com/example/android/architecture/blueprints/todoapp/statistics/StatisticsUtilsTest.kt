package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import org.junit.Assert.*

class StatisticsUtilsTest {
    class StatisticsUtilsTest {

        fun getActiveAndCompletedStats_noCompleted_returnsHundredZero() {
            // Create an active task
            val tasks = listOf<Task>(
                Task("title", "desc", isCompleted = false)
            )
            // Call your function
            val result = getActiveAndCompletedStats(tasks)
            // Check the result
            assertEquals(result.completedTasksPercent, 0f)
            assertEquals(result.activeTasksPercent, 100f) //first test
        }
    }
}
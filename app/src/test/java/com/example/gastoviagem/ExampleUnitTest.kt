package com.example.gastoviagem

import android.content.Context
import android.provider.Settings.Global.getString
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

private const val FAKE_STRING = "R$ 0"

@RunWith(MockitoJUnitRunner::class)
class ExampleUnitTest {

    @Mock
    private lateinit var mockContext: Context

    @Test
    fun readStringFromContex_LocalizedString() {
        val mockContext = mock<Context> {
            on { getString(R.string.total_value) } doReturn "R$ 0"
        }

        val myObjectUnderTest = ContextWrapper(mockContext)

        val result: String = myObjectUnderTest.getValue()

        assertEquals(result, FAKE_STRING)
    }
}
package dev.cancio.magicmath

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.cancio.magicmath.ui.components.MMScaffold
import dev.cancio.magicmath.ui.screen.LoadScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MMScaffold{
                LoadScreen()
            }
        }
    }
}
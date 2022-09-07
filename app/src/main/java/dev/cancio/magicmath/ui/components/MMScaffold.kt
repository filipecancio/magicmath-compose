package dev.cancio.magicmath.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.cancio.magicmath.ui.theme.ColorTheme
import dev.cancio.magicmath.ui.theme.MagicMathTheme

@Composable
fun MMScaffold() {
    MagicMathTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = ColorTheme.BACKGROUND_PRIMARY.color()
        ) {
            Text("Android")
        }
    }
}
@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package dev.cancio.magicmath.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.cancio.magicmath.ui.theme.ColorTheme
import dev.cancio.magicmath.ui.theme.MagicMathTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MMScaffold(
    content: @Composable () -> Unit
) {
    MagicMathTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = ColorTheme.BACKGROUND_PRIMARY.color(),
        ){
            Scaffold {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(it),
                    contentAlignment = Alignment.Center,
                ) {
                    content()
                }
            }
        }
    }
}
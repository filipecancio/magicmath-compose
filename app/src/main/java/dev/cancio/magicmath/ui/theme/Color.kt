package dev.cancio.magicmath.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

enum class ColorTheme(
    val darkColor: Color,
    val lightColor: Color
){
    BACKGROUND_PRIMARY(Color(0xFF410C54),Color(0xFFEEBEFF)),
    BACKGROUND_SECONDARY(Color(0xFFD869FF),Color(0xFFC625FF)),
    BUTTON_PRIMARY(Color(0xFF56116F),Color(0xFFC43AF4)),
    BUTTON_SECONDARY(Color(0xFFFFFFFF),Color(0xFF31113D)),
    ATC(Color(0xFF2B6D41),Color(0xFF4AE37D)),
    NEGATIVE(Color(0xFFD02828),Color(0xFFFF6D6D)),
    ATTENTION(Color(0xFF16031D),Color(0xFFFF005C));

    @Composable
    fun color() = if (isSystemInDarkTheme()) this.darkColor else this.lightColor
}
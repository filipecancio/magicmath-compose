package dev.cancio.magicmath.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

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

    companion object {
        fun getDarkScheme() = darkColorScheme(
            primary = BACKGROUND_PRIMARY.darkColor,
            secondary = BUTTON_SECONDARY.lightColor,
            tertiary = BACKGROUND_PRIMARY.darkColor
        )

        fun getLightScheme() = lightColorScheme(
            primary = BACKGROUND_PRIMARY.lightColor,
            secondary = BACKGROUND_SECONDARY.lightColor,
            tertiary = BACKGROUND_SECONDARY.darkColor

            /* Other default colors to override
            background = Color(0xFFFFFBFE),
            surface = Color(0xFFFFFBFE),
            onPrimary = Color.White,
            onSecondary = Color.White,
            onTertiary = Color.White,
            onBackground = Color(0xFF1C1B1F),
            onSurface = Color(0xFF1C1B1F),
            */
        )
    }
}
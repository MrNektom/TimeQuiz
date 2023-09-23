package com.github.mkoshikov.timequiz.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import com.github.mkoshikov.timequiz.ui.theme.ButtonGradient

@Composable
fun QuizButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = ButtonDefaults.shape,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        shape = shape,
        modifier = modifier
            .background(ButtonGradient, shape),
        content = content
    )
}

@Preview
@Composable
fun QuizButtonPreview() {
    QuizButton(
        onClick = {},
        ) {
        Text(text = "Button")
    }
}
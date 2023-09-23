package com.github.mkoshikov.timequiz.ui.screen.start

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.mkoshikov.timequiz.R
import com.github.mkoshikov.timequiz.ui.component.BaseScreenLayout
import com.github.mkoshikov.timequiz.ui.component.QuizButton

const val START_DESTINATION = "START"

@Composable
fun StartScreen(
    onStart: () -> Unit
) {
    BaseScreenLayout {
        Column(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .padding(bottom = 68.dp)
        ) {
            Text(
                text = stringResource(R.string.start_screen_title)
                    .uppercase(),
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.onPrimary,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W700
            )

            Spacer(modifier = Modifier.requiredHeight(62.dp))

            QuizButton(
                onClick = onStart,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(text = stringResource(id = R.string.start_screen_play))
            }
        }
    }
}

@Preview
@Composable
fun StartScreenPreview() {
    StartScreen(
        onStart = {},
    )
}
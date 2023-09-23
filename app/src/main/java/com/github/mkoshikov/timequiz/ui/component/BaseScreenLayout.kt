package com.github.mkoshikov.timequiz.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.github.mkoshikov.timequiz.R
import com.github.mkoshikov.timequiz.ui.theme.BackgroundColor

@Composable
fun BaseScreenLayout(
    modifier: Modifier = Modifier,
    showClock: Boolean = true,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(BackgroundColor),
        contentAlignment = Alignment.BottomCenter
    ) {
        if(showClock) Image(
            painter = painterResource(id = R.mipmap.clock_mask),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        content()
    }
}
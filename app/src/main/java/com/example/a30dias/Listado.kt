package com.example.a30dias

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.Spring.DampingRatioLowBouncy
import androidx.compose.animation.core.Spring.StiffnessVeryLow
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30dias.model.Sugerencia

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun DiasLIST(dias: List<Sugerencia>, modifier: Modifier = Modifier, ) {
    val visibleState = remember {
        MutableTransitionState(false).apply {
            targetState = true
        }
    }

    AnimatedVisibility(
        visibleState = visibleState,
        modifier = modifier
    ) {
        LazyColumn {
            itemsIndexed(dias) { index, sugerencia ->
                ListaDia(
                    sugerencia = sugerencia,
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 8.dp)

                )
            }
        }
    }
}


@Composable
fun ListaDia(sugerencia: Sugerencia, modifier: Modifier = Modifier) {
    Card(modifier = modifier,) {
        Box(modifier = Modifier) {
            Image(
                painter = painterResource(sugerencia.imageRes),
                contentDescription = null,
                contentScale = ContentScale.None
            )

        }
        Column() {
            Text(
                text = stringResource(sugerencia.nameRes),
                style = MaterialTheme.typography.displaySmall
            )
            Text(
                text = stringResource(sugerencia.descriptionRes),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}





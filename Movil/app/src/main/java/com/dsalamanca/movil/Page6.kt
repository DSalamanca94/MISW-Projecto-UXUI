package com.dsalamanca.movil

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun MovilPage6DavidFelipeSalamanca(modifier: Modifier = Modifier) {
    Surface(
        color = Color(0xffc2bfbf),
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 800.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp,
                        y = 336.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 128.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.White))
            Text(
                text = "¿Esta seguro que deseea eliminar el elemento?",
                color = Color(0xff49454f),
                textAlign = TextAlign.Center,
                lineHeight = 1.em,
                style = TextStyle(
                    fontSize = 13.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 366.dp)
                    .fillMaxWidth()
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Button(
                onClick = { },
                shape = RoundedCornerShape(100.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff014ba0)),
                contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 185.dp,
                        y = 414.dp)
                    .requiredWidth(width = 145.dp)
                    .requiredHeight(height = 40.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .requiredWidth(width = 145.dp)
                        .requiredHeight(height = 40.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Text(
                            text = "Confirmar",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            lineHeight = 1.43.em,
                            style = MaterialTheme.typography.labelLarge,
                            modifier = Modifier
                                .wrapContentHeight(align = Alignment.CenterVertically))
                    }
                }
            }
            Button(
                onClick = { },
                shape = RoundedCornerShape(100.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xffb92f43)),
                contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 30.dp,
                        y = 414.dp)
                    .requiredWidth(width = 145.dp)
                    .requiredHeight(height = 40.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .requiredWidth(width = 145.dp)
                        .requiredHeight(height = 40.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Text(
                            text = "Cancelar",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            lineHeight = 1.43.em,
                            style = MaterialTheme.typography.labelLarge,
                            modifier = Modifier
                                .wrapContentHeight(align = Alignment.CenterVertically))
                    }
                }
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun MovilPage6DavidFelipeSalamancaPreview() {
    MovilPage6DavidFelipeSalamanca(Modifier)
}
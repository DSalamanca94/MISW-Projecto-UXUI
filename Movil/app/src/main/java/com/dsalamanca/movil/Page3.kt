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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
@Composable
fun MovilPage5DavidFelipeSalamanca(modifier: Modifier = Modifier) {
    Surface(
        color = Color(0xff2174d4),
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
                        y = 111.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 649.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.White))
            Button(
                onClick = { },
                shape = RoundedCornerShape(100.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff014ba0)),
                contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 102.dp,
                        y = 632.dp)
                    .requiredWidth(width = 155.dp)
                    .requiredHeight(height = 40.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .requiredWidth(width = 155.dp)
                        .requiredHeight(height = 40.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Text(
                            text = "Guardar",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            lineHeight = 1.43.em,
                            style = MaterialTheme.typography.labelLarge,
                            modifier = Modifier
                                .wrapContentHeight(align = Alignment.CenterVertically))
                    }
                }
            }
            TextField(
                textLabel = "Nombre:",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 60.dp,
                        y = 365.dp))
            TextField(
                textLabel = "Correo:",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 60.dp,
                        y = 445.dp))

            TextField(
                textLabel = "Contraseña:",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 60.dp,
                        y = 525.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 118.dp,
                        y = 165.dp)
                    .requiredWidth(width = 124.dp)
                    .requiredHeight(height = 171.dp)
                    .padding(all = 4.dp)
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.styleavatar),
                    contentDescription = "User images/User Images",
                    tint = Color.White,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(300.dp))
                        .background(color = Color(0xff0a5cb8))
                        .size(300.dp) // Ajusta el tamaño del icono aquí
                )

            }
            ConfigurationsmallElevationflat(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 40.dp))
        }
    }
}


@Composable
fun ConfigurationsmallElevationflat(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 50.dp)
            .padding(horizontal = 4.dp,
                vertical = 8.dp)
    ) {
        IconButton(
            onClick = { }
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .requiredSize(size = 48.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(100.dp))
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(all = 8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.arrow_back_24px),
                            contentDescription = "Icons/arrow_back_24px",
                            tint = Color(0xff1d1b20))
                    }
                }
            }
        }
        Text(
            text = "Informacion del Usuario",
            color = Color.White,
            lineHeight = 0.67.em,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(align = Alignment.CenterVertically))
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun MovilPage5DavidFelipeSalamancaPreview() {
    MovilPage5DavidFelipeSalamanca(Modifier)
}
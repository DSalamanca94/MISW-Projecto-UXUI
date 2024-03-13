package com.dsalamanca.movil

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextField(textLabel: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 240.dp)
            .requiredHeight(height = 76.dp) // Ajusta la altura para acomodar el espacio del texto
            .clip(shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
    ) {
        Text(
            text = textLabel,
            color = Color(0xff1d1b20),
            lineHeight = 1.33.em,
            style = TextStyle(
                fontSize = 12.sp
            ),
            modifier = Modifier
                .align(Alignment.TopStart) // Alinea el texto en la parte superior izquierda
                .padding(start = 16.dp, top = 8.dp) // Ajusta el espaciado del texto
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            textStyle = MaterialTheme.typography.bodyLarge,
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color(0xff1d1b20),
                containerColor = Color.Transparent
            ),
            modifier = Modifier
                .fillMaxWidth() // Llena el ancho disponible
                .align(Alignment.BottomStart) // Alinea la caja de texto en la parte inferior izquierda
                .padding(top = 24.dp) // Ajusta el espacio entre el texto y la caja de texto
        )
    }
}


@Preview(widthDp = 240, heightDp = 56)
@Composable
private fun TextFieldPreview() {
    TextField("Gato",Modifier)


}
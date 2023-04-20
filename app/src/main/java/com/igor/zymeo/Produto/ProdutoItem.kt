package com.igor.zymeo.Produto

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.igor.zymeo.R

@Composable
fun Produto() {
    Surface(shape = RoundedCornerShape(20.dp), elevation = 6.dp) {
        Column(
            Modifier
                .heightIn(172.dp, 200.dp)
                .widthIn(132.dp, 150.dp)
                .background(color = Color.White)
        ) {
            Image(
                painter = painterResource(id = R.drawable.test),
                contentDescription = "Imagem do produto",
                Modifier
                    .padding(start = 30.dp, end = 30.dp, top = 19.dp)
                    .size(72.dp)
                    .align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Inside
            )

            Column(Modifier.padding(start = 9.dp, end = 9.dp, top = 12.dp, bottom = 16.dp)) {
                Text(
                    text = "Smartwatch Chronos\n" +
                            "(40mm)",
                    Modifier.fillMaxWidth(),
                    fontSize = 12.sp,
                    maxLines = 2,
                    fontWeight = FontWeight(600),
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.SansSerif
                )
                Text(
                    text = "R$399,00 à vista.",
                    Modifier
                        .padding(top = 5.dp)
                        .fillMaxWidth(),
                    fontSize = 12.sp,
                    fontWeight = FontWeight(700),
                    textAlign = TextAlign.Center,
                    color = Color.Blue
                )
            }
        }
    }
}

@Preview
@Composable
fun ProdutoView() {
    Produto()
}
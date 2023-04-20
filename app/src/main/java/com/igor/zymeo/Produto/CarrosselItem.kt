package com.igor.zymeo.Produto

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.igor.zymeo.R

@Composable
fun CarrosselItem() {
    Surface(shape = RoundedCornerShape(16.dp)) {
        Box(
            modifier = Modifier
                .width(349.dp)
                .height(137.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.maskgroup),
                contentDescription = "backGround",
                Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Row(Modifier.fillMaxSize()) {
                Column(
                    Modifier
                        .padding(start = 22.dp, top = 14.dp)
                        .width(203.dp)
                        .height(137.dp)
                )
                {
                    Text(
                        text = "ZColors",
                        fontSize = 25.sp,
                        fontWeight = FontWeight(600),
                        lineHeight = 25.sp,
                        color = Color.White,
                    )
                    Text(
                        text = "Alta performance em todas as cores.\n" +
                                "Câmera de 64MP\n" +
                                "Resistente a água e poeira\n" +
                                "Bateria de 4.500 mAh",
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(700),
                        lineHeight = 16.sp,
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "Por R$5.499,00 à vista",
                        modifier = Modifier.fillMaxSize().padding(top = 4.dp),
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight(700),
                        lineHeight = 16.sp,
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.relogio),
                    contentDescription = "Img carrossel",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(end = 11.dp, top = 11.dp, bottom = 11.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun CarrosselItemPreview() {
    CarrosselItem()
}
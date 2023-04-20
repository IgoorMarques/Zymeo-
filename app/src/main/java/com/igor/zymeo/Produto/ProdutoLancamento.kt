package com.igor.zymeo.Produto

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.igor.zymeo.R

@Composable
fun ProdutoLancamento() {
    Column(
        Modifier
            .widthIn(132.dp, 136.dp)
            .heightIn(172.dp, 180.dp)
    ) {
        Surface(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(16.dp),
            elevation = 6.dp
        ) {
            Box(
                modifier = Modifier
                    .height(132.dp)
                    .fillMaxWidth()
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.maskgroup),
                    contentDescription = "sdsds",
                    Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

                Image(
                    painter = painterResource(id = R.drawable.relogio),
                    contentDescription = "img lançamentos",
                    Modifier
                        .size(92.dp)
                        .align(Alignment.Center),
                    contentScale = ContentScale.Crop
                )
            }
        }

        Text(
            text = "Linha Chronos",
            Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            fontSize = 15.sp,
            fontWeight = FontWeight(600),
            textAlign = TextAlign.Center
        )
    }

}

@Preview()
@Composable
fun ProdutoLancamentoPreview() {
    ProdutoLancamento()
}
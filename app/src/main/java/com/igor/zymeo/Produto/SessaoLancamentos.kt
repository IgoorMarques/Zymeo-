package com.igor.zymeo.Produto

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SessaoLancamentos(){
    Column(Modifier
        .fillMaxWidth()) {
        Text(text = "Lançamentos",
            modifier = Modifier.padding(start = 20.dp, bottom = 20.dp),
            fontSize = 24.sp,
            fontWeight = FontWeight(600),
            lineHeight = 24.sp
        )

        Row(
            Modifier.horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            Spacer(modifier = Modifier.padding(start = 8.dp))
            ProdutoLancamento()
            ProdutoLancamento()
            ProdutoLancamento()
            ProdutoLancamento()
            ProdutoLancamento()
            ProdutoLancamento()
            ProdutoLancamento()
            Spacer(modifier = Modifier.padding(end = 8.dp))
        }
    }
}


@Preview
@Composable
fun SessaoLancamentosPreview() {
    SessaoLancamentos()
}
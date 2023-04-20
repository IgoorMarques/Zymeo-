package com.igor.zymeo.Produto

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SessaoMaisVendidos() {
    Column() {
        Text(text = "Mais vendidos",
            modifier = Modifier.padding(start = 20.dp, bottom = 20.dp),
            fontStyle = FontStyle.Normal,
            fontSize = 24.sp,
            fontWeight = FontWeight(600),
            lineHeight = 24.sp)
        Row(
            Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Spacer(modifier = Modifier)
            Produto()
            Produto()
            Produto()
            Produto()
            Produto()
            Produto()
            Produto()
            Spacer(modifier = Modifier)
        }
    }
}
@Preview
@Composable
fun SessaoMaisVendidosPreview() {
    SessaoMaisVendidos()
}



@Composable
fun App(){

}

@Preview
@Composable
fun AppPreview(){
    App()
}
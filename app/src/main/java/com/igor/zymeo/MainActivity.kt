package com.igor.zymeo


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.igor.zymeo.Produto.CarrosselItem
import com.igor.zymeo.Produto.SessaoLancamentos
import com.igor.zymeo.Produto.SessaoMaisVendidos
import com.igor.zymeo.ui.theme.ZymeoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            ZymeoTheme {
                App()
            }
        }
    }
}



@Composable
fun App(){
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
    verticalArrangement = Arrangement.spacedBy(20.dp)) {
        Spacer(modifier = Modifier)
        Surface(Modifier.align(CenterHorizontally)) {
            CarrosselItem()
        }
        SessaoMaisVendidos()
        SessaoLancamentos()
        SessaoMaisVendidos()
        SessaoLancamentos()
        SessaoMaisVendidos()
        Spacer(modifier = Modifier)
    }
}


@Preview
@Composable
fun AppPreview() {
    App()
}




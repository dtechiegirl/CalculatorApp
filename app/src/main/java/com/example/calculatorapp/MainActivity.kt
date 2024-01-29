package com.example.calculatorapp

//import CalculatorViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewmodel.compose.viewModel


import com.example.calculatorapp.ui.theme.CalculatorAppTheme
import com.example.calculatorapp.ui.theme.PurpleGrey40
import com.examplexample.calculatorapp.CalculatorViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorAppTheme {
                val viewModel: CalculatorViewModel = viewModel()
             val state = viewModel.state
                val buttonSpacing = 8.dp
                Calculator(
                    state = state,
                    onAction =viewModel::onAction,
                    buttonSpacing = buttonSpacing,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Gray)
                        .padding(16.dp)
                    )
            }
        }
    }
}


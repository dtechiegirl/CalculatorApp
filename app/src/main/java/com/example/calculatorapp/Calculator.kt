package com.example.calculatorapp

import CalBtn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorapp.ui.theme.Pink40
import com.example.calculatorapp.ui.theme.Purple40

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing : Dp = 8.dp,
    modifier: Modifier = Modifier,
    onAction: (CalculatorAction) -> Unit
) {
    Box(modifier= modifier){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement =  Arrangement.spacedBy(buttonSpacing)
        ){
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 30.sp,
                color = Color.White,
                maxLines = 2

            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){

                CalBtn(
                    symbol = "AC",
                    modifier = Modifier
                        .background(Purple40)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorAction.Clear)

                    }
                )

                IconButton(onClick = {
                    onAction(CalculatorAction.Delete)
                }) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Delete Icon"
                    )
                }
//
//                CalBtn(
//                    symbol = "AC",
//                    modifier = Modifier
//                        .background(Purple40)
//                        .aspectRatio(2f)
//                        .weight(2f),
//                    onClick = {
//                        (CalculatorAction.Delete)
//                    }
//                )


                CalBtn(
                    symbol = "/",
                    modifier = Modifier
                        .background(Pink40)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                    }
                )
            }



            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){

                CalBtn(
                    symbol = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }
                )
                CalBtn(
                    symbol = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    }
                )


                CalBtn(
                    symbol = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    }
                )


                CalBtn(
                    symbol = "x",
                    modifier = Modifier
                        .background(Pink40)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    }
                )
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){

                CalBtn(
                    symbol = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    }
                )
                CalBtn(
                    symbol = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    }
                )


                CalBtn(
                    symbol = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    }
                )


                CalBtn(
                    symbol = "-",
                    modifier = Modifier
                        .background(Pink40)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){

                CalBtn(
                    symbol = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }
                )
                CalBtn(
                    symbol = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    }
                )


                CalBtn(
                    symbol = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    }
                )


                CalBtn(
                    symbol = "+",
                    modifier = Modifier
                        .background(Pink40)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){

                CalBtn(
                    symbol = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorAction.Number(0))
                    }
                )
                CalBtn(
                    symbol = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )


                CalBtn(
                    symbol = "=",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    }
                )

            }
        }
    }
}
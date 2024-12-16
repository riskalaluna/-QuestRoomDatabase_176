package com.example.praktikum8.ui.view.mahasiswa

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
private fun DeleteConfirmationDialog(
    onDeleteConfirm: () -> Unit, onDeleteCancle: () -> Unit, 
    modifier: Modifier = Modifier
) {
    AlertDialog( onDismissRequest = { /* Do nothing*/ }, 
        title = { Text("Delete Data")},
        text = { Text("Apakah anda yakin ingin menghapus data?")},
        modifier = modifier,
        dismissButton = {
                        TextButton(onClick = onDeleteCancle) {
                            Text(text = "Cancel")
                        }
        },
        confirmButton = { 
            TextButton(onClick = onDeleteConfirm) {
                Text(text = "Yes")
            }
        }
    )
    
}
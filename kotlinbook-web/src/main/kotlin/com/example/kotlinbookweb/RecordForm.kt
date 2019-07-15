package com.example.kotlinbookweb

import lombok.Data
import java.util.Date

@Data
class RecordForm{
    var recordTime : Date = Date()
    var isConsume : Boolean = false
    var price : Int = 0
}

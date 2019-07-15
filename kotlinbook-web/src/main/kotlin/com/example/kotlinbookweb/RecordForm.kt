package com.example.kotlinbookweb

import javafx.beans.property.IntegerPropertyBase
import lombok.Data
import lombok.ToString
import java.util.Date
import javax.validation.constraints.Null

@Data
class RecordForm{
    var recordTime : Date = Date()
    var isConsume : Boolean = false
    var price : Int = 0
}
